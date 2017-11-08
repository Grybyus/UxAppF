package quecomo.cl.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaRecetaActivity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviewrecetas_layout);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.chef_home);

        ArrayList<Receta> arrayOfUsers = new ArrayList<Receta>();
        Receta receta1 = new Receta(1,"Ensalada de Lechuga", "Una exquisita...", "abrazo");
        Receta receta2 = new Receta(2,"Adolfito", "Falto el abrazo de hoy", "abrazo");
        Receta receta3 = new Receta(3,"Deivid", "De carton deivid", "abrazo");
        Receta receta4 = new Receta(4,"Moniquita", "God Tier Waifu <3", "abrazo");
        arrayOfUsers.add(receta1);
        arrayOfUsers.add(receta2);
        arrayOfUsers.add(receta3);
        arrayOfUsers.add(receta4);
        RecetaArrayAdapter adapter = new RecetaArrayAdapter(this, arrayOfUsers);
        ListView listView = (ListView) findViewById(R.id.lvUsers);
        listView.setAdapter(adapter);

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
                Toast.makeText(this,"Has pulsado en salir",Toast.LENGTH_SHORT).show(); //ACA SE CAMBIA LO QUE HACE EL BOTON BORRAR
                //finish();
                //System.exit(0);
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                break;
            case R.id.editar:
                Toast.makeText(this,"Has pulsado en editar",Toast.LENGTH_SHORT).show();
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
