package quecomo.cl.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;



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

        HashMap<String,ArrayList<Receta>> indice = new HashMap<String, ArrayList<Receta>>();

        ArrayList<Receta> recetaArrayList = new ArrayList<Receta>();

        ArrayList<Ingrediente> ingredientes1 = new ArrayList<>();
        ingredientes1.add(HorizontalCoordinatorNtbActivity.ing6);
        ingredientes1.add(HorizontalCoordinatorNtbActivity.ing35);
        ingredientes1.add(HorizontalCoordinatorNtbActivity.ing50);
        ingredientes1.add(HorizontalCoordinatorNtbActivity.ing27);
        Receta receta1 = new Receta(1,"Ensalada de Lechuga", "Una exquisita ensalada para refrescar", "receta1",new ListaIngredientes(ingredientes1),new ArrayList<>(Arrays.asList("Lavar la lechuga", "Cortar la lechuga","Volver a lavar la lechuga","Poner lechuga picada en el recipiente","Poner una cucharada de aceite","Poner media cucharada de sal","Exprimir medio limón sobre la lechuga","Servir")));
        ArrayList<Ingrediente> ingredientes2 = new ArrayList<>();
        ingredientes2.add(HorizontalCoordinatorNtbActivity.ing26);
        ingredientes2.add(HorizontalCoordinatorNtbActivity.ing37);
        ingredientes2.add(HorizontalCoordinatorNtbActivity.ing50);
        ingredientes2.add(HorizontalCoordinatorNtbActivity.ing1);
        ingredientes2.add(HorizontalCoordinatorNtbActivity.ing51);
        ingredientes2.add(HorizontalCoordinatorNtbActivity.ing35);
        Receta receta2 = new Receta(2,"Panqueques con manjar", "Un postre clásico para saborear", "receta2",new ListaIngredientes(ingredientes2),new ArrayList<>(Arrays.asList("Preparar mezcla de harina y leche","Poner huevos en la mezcla","Agregar sal","Vaciar porciones en sarten con aceite","Sacar porciones cuando esten listos","Poner manjar y enrollar")));
        ArrayList<Ingrediente> ingredientes3 = new ArrayList<>();
        ingredientes3.add(HorizontalCoordinatorNtbActivity.ing39);
        ingredientes3.add(HorizontalCoordinatorNtbActivity.ing7);
        ingredientes3.add(HorizontalCoordinatorNtbActivity.ing34);
        Receta receta3 = new Receta(3,"Cazuela de pollo", "Deliciosa preparación tradicional", "receta3",new ListaIngredientes(ingredientes3),new ArrayList<>(Arrays.asList("Calentar el agua", "Poner pollo y verduras","Dejar cocer por 1 hora","Servir")));
        ArrayList<Ingrediente> ingredientes4 = new ArrayList<>();
        ingredientes4.add(HorizontalCoordinatorNtbActivity.ing63);
        ingredientes4.add(HorizontalCoordinatorNtbActivity.ing53);
        ingredientes4.add(HorizontalCoordinatorNtbActivity.ing52);
        Receta receta4 = new Receta(4,"Lasagna", "Pasta con carne y salsa", "receta4",new ListaIngredientes(ingredientes4),new ArrayList<>(Arrays.asList("Poner primera capa de pasta en bandeja","Poner salsa y carne","Poner otra capa de pasta","Poner en el horno por 1 hora","Servir")));
        ArrayList<Ingrediente> ingredientes5 = new ArrayList<>();
        ingredientes5.add(HorizontalCoordinatorNtbActivity.ing54);
        ingredientes5.add(HorizontalCoordinatorNtbActivity.ing65);
        Receta receta5 = new Receta(5,"Ramen", "Preparación de fideos japoneses", "receta5",new ListaIngredientes(ingredientes5),new ArrayList<>(Arrays.asList("Calentar agua", "Verter sobre el ramen","Servir")));
        ArrayList<Ingrediente> ingredientes6 = new ArrayList<>();
        ingredientes6.add(HorizontalCoordinatorNtbActivity.ing55);
        ingredientes6.add(HorizontalCoordinatorNtbActivity.ing19);
        ingredientes6.add(HorizontalCoordinatorNtbActivity.ing52);
        Receta receta6 = new Receta(6,"Zapallo italiano relleno", "Opción económica y deliciosa", "receta6",new ListaIngredientes(ingredientes6),new ArrayList<>(Arrays.asList("Vaciar contenido del zapallo", "Mezclar contenido dentro del zapallo con carne molida","Poner laminas de queso sobre el zapallo","Ponerlo en el horno por 1 hora","Servir")));
        ArrayList<Ingrediente> ingredientes7 = new ArrayList<>();
        ingredientes7.add(HorizontalCoordinatorNtbActivity.ing56);
        ingredientes7.add(HorizontalCoordinatorNtbActivity.ing53);
        ingredientes7.add(HorizontalCoordinatorNtbActivity.ing52);
        Receta receta7 = new Receta(7,"Tallarines con salsa", "La preparación básica de pasta", "receta7",new ListaIngredientes(ingredientes7),new ArrayList<>(Arrays.asList("Preparar tallarines", "Calentar salsa con carne molida","Servir tallarines y verter salsa sobre estos")));
        ArrayList<Ingrediente> ingredientes8 = new ArrayList<>();
        ingredientes8.add(HorizontalCoordinatorNtbActivity.ing52);
        ingredientes8.add(HorizontalCoordinatorNtbActivity.ing46);
        ingredientes8.add(HorizontalCoordinatorNtbActivity.ing37);
        ingredientes8.add(HorizontalCoordinatorNtbActivity.ing64);
        ingredientes8.add(HorizontalCoordinatorNtbActivity.ing57);
        ingredientes8.add(HorizontalCoordinatorNtbActivity.ing26);
        Receta receta8 = new Receta(8,"Empanadas fritas de pino", "Comida tradicional chilena", "receta8",new ListaIngredientes(ingredientes8),new ArrayList<>(Arrays.asList("Cortar cebolla y poner en sarten con aceite", "Agregar carne molida minetras se huerve agua para cocer huevos","Cortar huevos duros sin cascara","Preparar masa de empanadas","Llenar con carne y huevo","Poner en aceite a freir","Servir")));
        ArrayList<Ingrediente> ingredientes9 = new ArrayList<>();
        ingredientes9.add(HorizontalCoordinatorNtbActivity.ing48);
        ingredientes9.add(HorizontalCoordinatorNtbActivity.ing44);
        ingredientes9.add(HorizontalCoordinatorNtbActivity.ing59);
        ingredientes9.add(HorizontalCoordinatorNtbActivity.ing58);
        ingredientes9.add(HorizontalCoordinatorNtbActivity.ing53);
        Receta receta9 = new Receta(9,"Cremoso de quínoa", "Comida sana y sabrosa", "receta9",new ListaIngredientes(ingredientes9),new ArrayList<>(Arrays.asList("Cocinar en agua con aceite y sal la quinoa por 8 minutos","Temperar ssarten con aceita y agregar sofrito y pimentones, salsa de tomate y arvejas","Colocar quinoa en la mezcla y calentar por 3 minutos","Dejar reposar por 3 minutos y servir")));
        ArrayList<Ingrediente> ingredientes10 = new ArrayList<>();
        ingredientes10.add(HorizontalCoordinatorNtbActivity.ing4);
        ingredientes10.add(HorizontalCoordinatorNtbActivity.ing26);
        ingredientes10.add(HorizontalCoordinatorNtbActivity.ing60);
        ingredientes10.add(HorizontalCoordinatorNtbActivity.ing7);
        ingredientes10.add(HorizontalCoordinatorNtbActivity.ing62);
        Receta receta10 = new Receta(10,"Buñuelos de zanahoria", "Cocina sano y económico", "receta10",new ListaIngredientes(ingredientes10),new ArrayList<>(Arrays.asList("Pelar papas y cortar antes de cocer","Rallar zanahorias","Moler papas y juntar con zanahorias","Echar queso y agua con gas y huevos","Servir")));
        ArrayList<Ingrediente> ingredientes11 = new ArrayList<>();
        ingredientes11.add(HorizontalCoordinatorNtbActivity.ing61);
        ingredientes11.add(HorizontalCoordinatorNtbActivity.ing59);
        ingredientes11.add(HorizontalCoordinatorNtbActivity.ing60);
        ingredientes11.add(HorizontalCoordinatorNtbActivity.ing66);
        ingredientes11.add(HorizontalCoordinatorNtbActivity.ing26);
        Receta receta11 = new Receta(11,"Muffins de verduras", "Otra forma de preparar verduras", "receta11",new ListaIngredientes(ingredientes11),new ArrayList<>(Arrays.asList("Cortar el jamon","Calentarlo con aceite en una sartén","Agregar surtido de verduras","Enmantequillar bandeja","Depositar mezcla","Poner en el horno a 160º por 15 min","Servir")));
        ArrayList<Ingrediente> ingredientes12 = new ArrayList<>();
        ingredientes12.add(HorizontalCoordinatorNtbActivity.ing26);
        ingredientes12.add(HorizontalCoordinatorNtbActivity.ing37);
        ingredientes12.add(HorizontalCoordinatorNtbActivity.ing50);
        ingredientes12.add(HorizontalCoordinatorNtbActivity.ing1);
        ingredientes12.add(HorizontalCoordinatorNtbActivity.ing51);
        ingredientes12.add(HorizontalCoordinatorNtbActivity.ing35);
        ingredientes12.add(HorizontalCoordinatorNtbActivity.ing49);
        Receta receta12 = new Receta(12,"Panqueques con manjar a la italiana", "Un postre clásico para saborear con dextrosa", "receta2",new ListaIngredientes(ingredientes12),new ArrayList<>(Arrays.asList("Preparar mezcla de harina y leche","Poner huevos en la mezcla","Agregar sal","Vaciar porciones en sarten con aceite","Sacar porciones cuando esten listos","Poner manjar y enrollar")));
        ArrayList<Ingrediente> ingredientes13 = new ArrayList<>();
        ingredientes13.add(HorizontalCoordinatorNtbActivity.ing39);
        ingredientes13.add(HorizontalCoordinatorNtbActivity.ing7);
        ingredientes13.add(HorizontalCoordinatorNtbActivity.ing34);
        ingredientes13.add(HorizontalCoordinatorNtbActivity.ing49);
        Receta receta13 = new Receta(13,"Cazuela de pollo a la italiana", "Deliciosa preparación tradicional con dextrosa", "receta3",new ListaIngredientes(ingredientes13),new ArrayList<>(Arrays.asList("Calentar el agua", "Poner pollo y verduras","Dejar cocer por 1 hora","Servir")));
        ArrayList<Ingrediente> ingredientes14 = new ArrayList<>();
        ingredientes14.add(HorizontalCoordinatorNtbActivity.ing63);
        ingredientes14.add(HorizontalCoordinatorNtbActivity.ing53);
        ingredientes14.add(HorizontalCoordinatorNtbActivity.ing52);
        ingredientes14.add(HorizontalCoordinatorNtbActivity.ing49);
        Receta receta14 = new Receta(14,"Lasagna a la italiana", "Pasta con carne y salsa con dextrosa", "receta4",new ListaIngredientes(ingredientes14),new ArrayList<>(Arrays.asList("Poner primera capa de pasta en bandeja","Poner salsa y carne","Poner otra capa de pasta","Poner en el horno por 1 hora","Servir")));
        ArrayList<Ingrediente> ingredientes15 = new ArrayList<>();
        ingredientes15.add(HorizontalCoordinatorNtbActivity.ing54);
        ingredientes15.add(HorizontalCoordinatorNtbActivity.ing65);
        ingredientes15.add(HorizontalCoordinatorNtbActivity.ing49);
        Receta receta15 = new Receta(15,"Ramen a la italiana", "Preparación de fideos japoneses con dextrosa", "receta5",new ListaIngredientes(ingredientes15),new ArrayList<>(Arrays.asList("Calentar agua", "Verter sobre el ramen","Servir")));
        ArrayList<Ingrediente> ingredientes16 = new ArrayList<>();
        ingredientes16.add(HorizontalCoordinatorNtbActivity.ing55);
        ingredientes16.add(HorizontalCoordinatorNtbActivity.ing19);
        ingredientes16.add(HorizontalCoordinatorNtbActivity.ing52);
        ingredientes16.add(HorizontalCoordinatorNtbActivity.ing49);
        Receta receta16 = new Receta(16,"Zapallo italiano relleno a la italiana", "Opción económica y deliciosa con dextrosa", "receta6",new ListaIngredientes(ingredientes16),new ArrayList<>(Arrays.asList("Vaciar contenido del zapallo", "Mezclar contenido dentro del zapallo con carne molida","Poner laminas de queso sobre el zapallo","Ponerlo en el horno por 1 hora","Servir")));
        ArrayList<Ingrediente> ingredientes17 = new ArrayList<>();
        ingredientes17.add(HorizontalCoordinatorNtbActivity.ing56);
        ingredientes17.add(HorizontalCoordinatorNtbActivity.ing53);
        ingredientes17.add(HorizontalCoordinatorNtbActivity.ing52);
        ingredientes17.add(HorizontalCoordinatorNtbActivity.ing49);
        Receta receta17 = new Receta(17,"Tallarines con salsa a la italiana", "La preparación básica de pasta con dextrosa", "receta7",new ListaIngredientes(ingredientes17),new ArrayList<>(Arrays.asList("Preparar tallarines", "Calentar salsa con carne molida","Servir tallarines y verter salsa sobre estos")));
        ArrayList<Ingrediente> ingredientes18 = new ArrayList<>();
        ingredientes18.add(HorizontalCoordinatorNtbActivity.ing52);
        ingredientes18.add(HorizontalCoordinatorNtbActivity.ing46);
        ingredientes18.add(HorizontalCoordinatorNtbActivity.ing37);
        ingredientes18.add(HorizontalCoordinatorNtbActivity.ing64);
        ingredientes18.add(HorizontalCoordinatorNtbActivity.ing57);
        ingredientes18.add(HorizontalCoordinatorNtbActivity.ing26);
        ingredientes18.add(HorizontalCoordinatorNtbActivity.ing49);
        Receta receta18 = new Receta(18,"Empanadas fritas de pino a la italiana", "Comida tradicional chilena con dextrosa", "receta8",new ListaIngredientes(ingredientes18),new ArrayList<>(Arrays.asList("Cortar cebolla y poner en sarten con aceite", "Agregar carne molida minetras se huerve agua para cocer huevos","Cortar huevos duros sin cascara","Preparar masa de empanadas","Llenar con carne y huevo","Poner en aceite a freir","Servir")));
        ArrayList<Ingrediente> ingredientes19 = new ArrayList<>();
        ingredientes19.add(HorizontalCoordinatorNtbActivity.ing48);
        ingredientes19.add(HorizontalCoordinatorNtbActivity.ing44);
        ingredientes19.add(HorizontalCoordinatorNtbActivity.ing59);
        ingredientes19.add(HorizontalCoordinatorNtbActivity.ing58);
        ingredientes19.add(HorizontalCoordinatorNtbActivity.ing53);
        ingredientes19.add(HorizontalCoordinatorNtbActivity.ing49);
        Receta receta19 = new Receta(19,"Cremoso de quínoa a la italiana", "Comida sana y sabrosa con dextrosa", "receta9",new ListaIngredientes(ingredientes19),new ArrayList<>(Arrays.asList("Cocinar en agua con aceite y sal la quinoa por 8 minutos","Temperar ssarten con aceita y agregar sofrito y pimentones, salsa de tomate y arvejas","Colocar quinoa en la mezcla y calentar por 3 minutos","Dejar reposar por 3 minutos y servir")));
        ArrayList<Ingrediente> ingredientes20 = new ArrayList<>();
        ingredientes20.add(HorizontalCoordinatorNtbActivity.ing4);
        ingredientes20.add(HorizontalCoordinatorNtbActivity.ing26);
        ingredientes20.add(HorizontalCoordinatorNtbActivity.ing60);
        ingredientes20.add(HorizontalCoordinatorNtbActivity.ing7);
        ingredientes20.add(HorizontalCoordinatorNtbActivity.ing62);
        ingredientes20.add(HorizontalCoordinatorNtbActivity.ing49);
        Receta receta20 = new Receta(20,"Buñuelos de zanahoria a la italiana", "Cocina sano y económico con dextrosa", "receta10",new ListaIngredientes(ingredientes20),new ArrayList<>(Arrays.asList("Pelar papas y cortar antes de cocer","Rallar zanahorias","Moler papas y juntar con zanahorias","Echar queso y agua con gas y huevos","Servir")));

        recetaArrayList.add(receta1);
        recetaArrayList.add(receta2);
        recetaArrayList.add(receta3);
        recetaArrayList.add(receta4);
        recetaArrayList.add(receta5);
        recetaArrayList.add(receta6);
        recetaArrayList.add(receta7);
        recetaArrayList.add(receta8);
        recetaArrayList.add(receta9);
        recetaArrayList.add(receta10);
        recetaArrayList.add(receta11);
        recetaArrayList.add(receta12);
        recetaArrayList.add(receta13);
        recetaArrayList.add(receta14);
        recetaArrayList.add(receta15);
        recetaArrayList.add(receta16);
        recetaArrayList.add(receta17);
        recetaArrayList.add(receta18);
        recetaArrayList.add(receta19);
        recetaArrayList.add(receta20);

        Intent intentLista = getIntent();
        Bundle extras = intentLista.getExtras();
        int tipoBusqueda = extras.getInt("tipo");
        RecetaArrayAdapter adapter = new RecetaArrayAdapter(this, recetaArrayList);

        if(tipoBusqueda>HorizontalCoordinatorNtbActivity.TODOS) {

            if(tipoBusqueda==HorizontalCoordinatorNtbActivity.PORINGREDIENTE){
                ArrayList<Receta> consultaResult = new ArrayList<Receta>();
                HashMap<Receta, Integer> puntaje = new HashMap<>();

                for(Receta r : recetaArrayList){
                    for(Ingrediente ingr : r.getIngredientesObj() ){
                        if(HorizontalCoordinatorNtbActivity.canasta.contains(ingr)){
                            if(!consultaResult.contains(r)){
                                consultaResult.add(r);
                                puntaje.put(r,1);
                            }else{
                                puntaje.put(r,puntaje.get(r)+1);
                            }
                        }
                    }
                }

                Collections.sort(consultaResult, new RecetaSort(puntaje));

                adapter = new RecetaArrayAdapter(this, consultaResult);

            }

            if(tipoBusqueda==HorizontalCoordinatorNtbActivity.PORNOMBRE){
                for (Receta r : recetaArrayList) {
                    String[] palabras = r.getNombre().split("\\s+");
                    for (String p : palabras) {
                        if (indice.get(p.toLowerCase()) == null) {
                            indice.put(p.toLowerCase(), new ArrayList<Receta>());
                        }
                        indice.get(p.toLowerCase()).add(r);
                    }
                }

                String consulta = extras.getString("consulta");
                String[] aconsulta = consulta.toLowerCase().split("\\s+");
                ArrayList<Receta> consultaResult = new ArrayList<Receta>();

                Log.d("UXAPP", "keys =" + Arrays.toString(indice.keySet().toArray()));

                HashMap<Receta, Integer> puntaje = new HashMap<>();

                for (String key : indice.keySet()) {
                    for (String c : aconsulta) {
                        if (key.contains(c)) {
                            for (Receta re : indice.get(key)) {
                                if (!consultaResult.contains(re)) {
                                    consultaResult.add(re);
                                    puntaje.put(re, 1);
                                } else {
                                    puntaje.put(re, puntaje.get(re) + 1);
                                }
                            }
                        }
                    }
                }

                Collections.sort(consultaResult, new RecetaSort(puntaje));

                adapter = new RecetaArrayAdapter(this, consultaResult);
            }
        }


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
