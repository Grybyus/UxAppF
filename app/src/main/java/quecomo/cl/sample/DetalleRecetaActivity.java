package quecomo.cl.sample;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DetalleRecetaActivity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_receta);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.chef_home);

        Intent intentDetalle = getIntent();
        Bundle extras = intentDetalle.getExtras();

        String nombreReceta = extras.getString("nombre");
        String descripcionReceta = extras.getString("descripcion");
        String nombreImagen = extras.getString("imagen");
        ArrayList<String> ingredientesReceta = extras.getStringArrayList("ingredientes");
        ArrayList<String> pasosReceta = extras.getStringArrayList("pasos");
        TextView nombre = (TextView) findViewById(R.id.nombrereceta);
        nombre.setText(nombreReceta);
        TextView descripcion = (TextView) findViewById(R.id.descripcionreceta);
        descripcion.setText(descripcionReceta);
        ImageView imagen = (ImageView) findViewById(R.id.imagenreceta);
        int resId = this.getResources().getIdentifier(nombreImagen,"drawable",this.getPackageName());
        imagen.setImageResource(resId);

        ListView listaIngredientes = (ListView) findViewById(R.id.ingredientesreceta);
        ArrayAdapter adapterIngredientes = new ArrayAdapter<String>(this,android.R.layout.test_list_item,ingredientesReceta);
        listaIngredientes.setAdapter(adapterIngredientes);

        ListView listaPasos = (ListView) findViewById(R.id.pasosreceta);
        ArrayAdapter adapterPasos = new ArrayAdapter<String>(this,android.R.layout.test_list_item,pasosReceta);
        listaPasos.setAdapter(adapterPasos);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.salir:
                Toast.makeText(this,"Has pulsado en salir",Toast.LENGTH_SHORT).show(); //ACA SE CAMBIA LO QUE HACE EL BOTON SALIR
                //finish();
                //System.exit(0);
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                break;
            case R.id.editar:
                Toast.makeText(this,"Disculpe, estamos trabajando para usted",Toast.LENGTH_SHORT).show();
                break;
            case android.R.id.home:
                Toast.makeText(this,"Iniciemos otra búsqueda",Toast.LENGTH_SHORT).show();
                Intent homeIntent = new Intent(this, MainActivity.class);
                homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
                return (super.onOptionsItemSelected(item));
        }
        return true;
    }
}
