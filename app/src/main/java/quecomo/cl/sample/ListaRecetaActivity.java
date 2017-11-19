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
        Receta receta1 = new Receta(1,"Ensalada de Lechuga", "Una exquisita ensalada para refrescar", "receta1",new ArrayList<>(Arrays.asList("Lechuga", "Aceite","Sal","Limón")),new ArrayList<>(Arrays.asList("Lavar la lechuga", "Cortar la lechuga","Volver a lavar la lechuga","Poner lechuga picada en el recipiente","Poner una cucharada de aceite","Poner media cucharada de sal","Exprimir medio limón sobre la lechuga","Servir")));
        Receta receta2 = new Receta(2,"Panqueques con manjar", "Un postre clásico para saborear", "receta2",new ArrayList<>(Arrays.asList("Huevos","Harina","Sal","Leche","Manjar","Aceite")),new ArrayList<>(Arrays.asList("Preparar mezcla de harina y leche","Poner huevos en la mezcla","Agregar sal","Vaciar porciones en sarten con aceite","Sacar porciones cuando esten listos","Poner manjar y enrollar")));
        Receta receta3 = new Receta(3,"Cazuela de pollo", "Deliciosa preparación tradicional", "receta3",new ArrayList<>(Arrays.asList("Pollo","Papas","Verduras")),new ArrayList<>(Arrays.asList("Calentar el agua", "Poner pollo y verduras","Dejar cocer por 1 hora","Servir")));
        Receta receta4 = new Receta(4,"Lasagna", "Pasta con carne y salsa", "receta4",new ArrayList<>(Arrays.asList("Pasta lista","Salsa","Carne molida")),new ArrayList<>(Arrays.asList("Poner primera capa de pasta en bandeja","Poner salsa y carne","Poner otra capa de pasta","Poner en el horno por 1 hora","Servir")));
        Receta receta5 = new Receta(5,"Ramen", "Preparación de fideos japoneses", "receta5",new ArrayList<>(Arrays.asList("Ramen instantáneo", "Agua")),new ArrayList<>(Arrays.asList("Calentar agua", "Verter sobre el ramen","Servir")));
        Receta receta6 = new Receta(6,"Zapallo italiano relleno", "Opción económica y deliciosa", "receta6",new ArrayList<>(Arrays.asList("Zapallo italiano", "Queso","Carne molida")),new ArrayList<>(Arrays.asList("Vaciar contenido del zapallo", "Mezclar contenido dentro del zapallo con carne molida","Poner laminas de queso sobre el zapallo","Ponerlo en el horno por 1 hora","Servir")));
        Receta receta7 = new Receta(7,"Tallarines con salsa", "La preparación básica de pasta", "receta7",new ArrayList<>(Arrays.asList("Tallarines","Salsa","Carne molida")),new ArrayList<>(Arrays.asList("Preparar tallarines", "Calentar salsa con carne molida","Servir tallarines y verter salsa sobre estos")));
        Receta receta8 = new Receta(8,"Empanadas fritas de pino", "Comida tradicional chilena", "receta8",new ArrayList<>(Arrays.asList("Carne molida", "Cebolla","Harina con polvo de hornear","Manteca","Huevos")),new ArrayList<>(Arrays.asList("Cortar cebolla y poner en sarten con aceite", "Agregar carne molida minetras se huerve agua para cocer huevos","Cortar huevos duros sin cascara","Preparar masa de empanadas","Llenar con carne y huevo","Poner en aceite a freir","Servir")));
        Receta receta9 = new Receta(9,"Cremoso de quínoa", "Comida sana y sabrosa", "receta9",new ArrayList<>(Arrays.asList("Quinoa","Sofrito con ajo","Pimentones","Arvejas","Salsa de tomates")),new ArrayList<>(Arrays.asList("Cocinar en agua con aceite y sal la quinoa por 8 minutos","Temperar ssarten con aceita y agregar sofrito y pimentones, salsa de tomate y arvejas","Colocar quinoa en la mezcla y calentar por 3 minutos","Dejar reposar por 3 minutos y servir")));
        Receta receta10 = new Receta(10,"Buñuelos de zanahoria", "Cocina sano y económico", "receta10",new ArrayList<>(Arrays.asList("Zanahoria","Huevos","Queso rallado","Papas","Agua con gas")),new ArrayList<>(Arrays.asList("Pelar papas y cortar antes de cocer","Rallar zanahorias","Moler papas y juntar con zanahorias","Echar queso y agua con gas y huevos","Servir")));
        Receta receta11 = new Receta(11,"Muffins de verduras", "Otra forma de preparar verduras", "receta11",new ArrayList<>(Arrays.asList("Primavera congelada", "Pimentones","Jamón","Queso rallado","Huevos")),new ArrayList<>(Arrays.asList("Cortar el jamon","Calentarlo con aceite en una sartén","Agregar surtido de verduras","Enmantequillar bandeja","Depositar mezcla","Poner en el horno a 160º por 15 min","Servir")));
        Receta receta12 = new Receta(12,"Panqueques con manjar", "Un postre clásico para saborear", "receta2",new ArrayList<>(Arrays.asList("Huevos","Harina","Sal","Leche","Manjar","Aceite")),new ArrayList<>(Arrays.asList("Preparar mezcla de harina y leche","Poner huevos en la mezcla","Agregar sal","Vaciar porciones en sarten con aceite","Sacar porciones cuando esten listos","Poner manjar y enrollar")));
        Receta receta13 = new Receta(13,"Cazuela de pollo", "Deliciosa preparación tradicional", "receta3",new ArrayList<>(Arrays.asList("Pollo","Papas","Verduras")),new ArrayList<>(Arrays.asList("Calentar el agua", "Poner pollo y verduras","Dejar cocer por 1 hora","Servir")));
        Receta receta14 = new Receta(14,"Lasagna", "Pasta con carne y salsa", "receta4",new ArrayList<>(Arrays.asList("Pasta lista","Salsa","Carne molida")),new ArrayList<>(Arrays.asList("Poner primera capa de pasta en bandeja","Poner salsa y carne","Poner otra capa de pasta","Poner en el horno por 1 hora","Servir")));
        Receta receta15 = new Receta(15,"Ramen", "Preparación de fideos japoneses", "receta5",new ArrayList<>(Arrays.asList("Ramen instantáneo", "Agua")),new ArrayList<>(Arrays.asList("Calentar agua", "Verter sobre el ramen","Servir")));
        Receta receta16 = new Receta(16,"Zapallo italiano relleno", "Opción económica y deliciosa", "receta6",new ArrayList<>(Arrays.asList("Zapallo italiano", "Queso","Carne molida")),new ArrayList<>(Arrays.asList("Vaciar contenido del zapallo", "Mezclar contenido dentro del zapallo con carne molida","Poner laminas de queso sobre el zapallo","Ponerlo en el horno por 1 hora","Servir")));
        Receta receta17 = new Receta(17,"Tallarines con salsa", "La preparación básica de pasta", "receta7",new ArrayList<>(Arrays.asList("Tallarines","Salsa","Carne molida")),new ArrayList<>(Arrays.asList("Preparar tallarines", "Calentar salsa con carne molida","Servir tallarines y verter salsa sobre estos")));
        Receta receta18 = new Receta(18,"Empanadas fritas de pino", "Comida tradicional chilena", "receta8",new ArrayList<>(Arrays.asList("Carne molida", "Cebolla","Harina con polvo de hornear","Manteca","Huevos")),new ArrayList<>(Arrays.asList("Cortar cebolla y poner en sarten con aceite", "Agregar carne molida minetras se huerve agua para cocer huevos","Cortar huevos duros sin cascara","Preparar masa de empanadas","Llenar con carne y huevo","Poner en aceite a freir","Servir")));
        Receta receta19 = new Receta(19,"Cremoso de quínoa", "Comida sana y sabrosa", "receta9",new ArrayList<>(Arrays.asList("Quinoa","Sofrito con ajo","Pimentones","Arvejas","Salsa de tomates")),new ArrayList<>(Arrays.asList("Cocinar en agua con aceite y sal la quinoa por 8 minutos","Temperar ssarten con aceita y agregar sofrito y pimentones, salsa de tomate y arvejas","Colocar quinoa en la mezcla y calentar por 3 minutos","Dejar reposar por 3 minutos y servir")));
        Receta receta20 = new Receta(20,"Buñuelos de zanahoria", "Cocina sano y económico", "receta10",new ArrayList<>(Arrays.asList("Zanahoria","Huevos","Queso rallado","Papas","Agua con gas")),new ArrayList<>(Arrays.asList("Pelar papas y cortar antes de cocer","Rallar zanahorias","Moler papas y juntar con zanahorias","Echar queso y agua con gas y huevos","Servir")));

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

        for(Receta r: recetaArrayList){
            String[] palabras = r.getNombre().split("\\s+");
            for(String p: palabras){
                if(indice.get(p.toLowerCase()) == null){
                    indice.put(p.toLowerCase(),new ArrayList<Receta>());
                }
                indice.get(p.toLowerCase()).add(r);
            }
        }

        String consulta = "con";
        String[] aconsulta = consulta.toLowerCase().split("\\s+");
        ArrayList<Receta> consultaResult = new ArrayList<Receta>();

        Log.d("UXAPP","keys ="+Arrays.toString(indice.keySet().toArray()));

        final HashMap<Receta,Integer> puntaje = new HashMap<>();

        for(String key:indice.keySet()){
            for(String c:aconsulta){
                if(key.contains(c)){
                    for(Receta re:indice.get(key)){
                        if(!consultaResult.contains(re)){
                            consultaResult.add(re);
                            puntaje.put(re,1);
                        }else{
                            puntaje.put(re, puntaje.get(re)+1);
                        }
                    }
                }
            }
        }

        Collections.sort(consultaResult,new RecetaSort(puntaje));

        RecetaArrayAdapter adapter = new RecetaArrayAdapter(this, consultaResult);
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
