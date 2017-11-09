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
import java.util.Arrays;

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

        ArrayList<Receta> recetaArrayList = new ArrayList<Receta>();
        Receta receta1 = new Receta(1,"Ensalada de Lechuga", "Una exquisita ensalada con ingredientes", "abrazo",new ArrayList<>(Arrays.asList("Lechuga", "Aceite","Sal","Limón")),new ArrayList<>(Arrays.asList("Lavar la lechuga", "Cortar la lechuga","Volver a lavar la lechuga","Poner lechuga picada en el recipiente","Poner una cucharada de aceite","Poner media cucharada de sal","Exprimir medio limón sobre la lechuga","Servir")));
        Receta receta2 = new Receta(2,"Panqueques con manjar", "Esta receta es muy facil de hacer y se hace facil", "abrazo",new ArrayList<>(Arrays.asList("xyz", "abc")),new ArrayList<>(Arrays.asList("xyz", "abc")));
        Receta receta3 = new Receta(3,"Cazuela de pollo", "Se hace con pollo primero se calienta el agua", "abrazo",new ArrayList<>(Arrays.asList("xyz", "abc")),new ArrayList<>(Arrays.asList("xyz", "abc")));
        Receta receta4 = new Receta(4,"Lasagna", "Se calienta la comida en el microondas y se sirve", "abrazo",new ArrayList<>(Arrays.asList("xyz", "abc")),new ArrayList<>(Arrays.asList("xyz", "abc")));
        Receta receta5 = new Receta(4,"Ramen", "Se calienta el agua se le echa y se sirve", "abrazo",new ArrayList<>(Arrays.asList("xyz", "abc")),new ArrayList<>(Arrays.asList("xyz", "abc")));
        Receta receta6 = new Receta(4,"Zapallo italiano relleno", "Se toma el zapallo y despues se hace", "abrazo",new ArrayList<>(Arrays.asList("xyz", "abc")),new ArrayList<>(Arrays.asList("xyz", "abc")));
        Receta receta7 = new Receta(4,"Tallarines con salsa", "Se preparan los tallarines y la salsa", "abrazo",new ArrayList<>(Arrays.asList("xyz", "abc")),new ArrayList<>(Arrays.asList("xyz", "abc")));
        Receta receta8 = new Receta(4,"Zanahoria pelada", "Se pela la zanahoria", "abrazo",new ArrayList<>(Arrays.asList("xyz", "abc")),new ArrayList<>(Arrays.asList("xyz", "abc")));
        recetaArrayList.add(receta1);
        recetaArrayList.add(receta2);
        recetaArrayList.add(receta3);
        recetaArrayList.add(receta4);
        recetaArrayList.add(receta5);
        recetaArrayList.add(receta6);
        recetaArrayList.add(receta7);
        recetaArrayList.add(receta8);
        RecetaArrayAdapter adapter = new RecetaArrayAdapter(this, recetaArrayList);
        ListView listView = (ListView) findViewById(R.id.lvRecetas);
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
