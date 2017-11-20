package quecomo.cl.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;

public class HorizontalCoordinatorNtbActivity extends AppCompatActivity {
    private Toolbar toolbar;
    public static HorizontalCoordinatorNtbActivity instance;
    private ViewPagerAdapter adapter;
    private FrutasFragment fragmentFruta;
    private LacteosFragment fragmentLacteos;
    private VerduraFragment fragmentVerdura;
    private CarnesFragment fragmentCarne;
    private ViewPager viewPager;
    private TabLayout allTabs;
    Button botonBuscar;
    public static ListView listView;

    public static ArrayList<Ingrediente> canasta= new ArrayList<Ingrediente>();
    public static ArrayList<Ingrediente> listaDeTodosLosIngredientes;
    public static ArrayList<Ingrediente> listaDeFrutas= new ArrayList<Ingrediente>();
    public static ArrayList<Ingrediente> listaDeLacteos = new ArrayList<Ingrediente>();
    public static ArrayList<Ingrediente> listaDeCarnes = new ArrayList<Ingrediente>();
    public static ArrayList<Ingrediente> listaDeVegetales = new ArrayList<Ingrediente>();


    //PARA AGREGAR ALGUN INGREDIENTE NUEVO TIENES QUE SEGUIR EL ORDEN DE IDS DE EL TIPO AL QUE PERTENECE, ADEMAS AGREGARLO EN VALUES -> STRINGS A LA CATEGORIA QUE PERTENECE

    //Frutas
    public static final Ingrediente ing5 = new Ingrediente(0,"Manzana", "apple", 1);
    public static final Ingrediente ing29 = new Ingrediente(1,"Banana", "banana", 1);
    public static final Ingrediente ing11 = new Ingrediente(2,"Pera", "pear", 1);
    public static final Ingrediente ing12 = new Ingrediente(3,"Durazno", "peach", 1);
    public static final Ingrediente ing13 = new Ingrediente(4,"Cereza", "cherry", 1);
    public static final Ingrediente ing15 = new Ingrediente(5,"Maiz", "corn", 1);
    public static final Ingrediente ing22 = new Ingrediente(6,"Maní", "peanut", 1);
    public static final Ingrediente ing23 = new Ingrediente(7,"Uvas", "grapes", 1);
    public static final Ingrediente ing27 = new Ingrediente(8,"Limón", "lemon",1);
    public static final Ingrediente ing28 = new Ingrediente(9,"Tomate", "tomato", 1);
    public static final Ingrediente ing30 = new Ingrediente(10,"Fresa", "strawberry", 1);
    public static final Ingrediente ing36 = new Ingrediente(11,"Nuez", "nut", 1);
    public static final Ingrediente ing10 = new Ingrediente(12,"Palta", "avocado", 1);
    public static final Ingrediente ing9 = new Ingrediente(13,"Piña", "pineapple", 1);
    public static final Ingrediente ing21 = new Ingrediente(14,"Naranja", "orange", 1);
    //Verduras
    public static final Ingrediente ing4 = new Ingrediente(0,"Zanahoria", "carrot", 2);
    public static final Ingrediente ing6 = new Ingrediente(1,"Lechuga", "latuce", 2);
    public static final Ingrediente ing7 = new Ingrediente(2,"Papas", "potatoes", 2);
    public static final Ingrediente ing8 = new Ingrediente(3,"Zapallo", "pumpkin", 2);
    public static final Ingrediente ing16 = new Ingrediente(4,"Pepino", "cucumber", 2);
    public static final Ingrediente ing17 = new Ingrediente(5,"Ají", "chili", 2);
    public static final Ingrediente ing18 = new Ingrediente(6,"Sandía", "watermelon", 2);
    public static final Ingrediente ing24 = new Ingrediente(7,"Berenjena", "eggplant",2);
    public static final Ingrediente ing44 = new Ingrediente(8,"Ajo", "garlic", 2);
    public static final Ingrediente ing45 = new Ingrediente(9,"Cebollin", "onionin", 2);
    public static final Ingrediente ing46 = new Ingrediente(10,"Cebolla", "onion", 2);
    public static final Ingrediente ing47 = new Ingrediente(11,"Brócoli", "broccoli", 2);
    public static final Ingrediente ing48 = new Ingrediente(12,"Quinoa", "quinoa", Ingrediente.VERDURA);
    public static final Ingrediente ing55 = new Ingrediente(13,"Zapallo italiano", "zapallito", Ingrediente.VERDURA);
    public static final Ingrediente ing58 = new Ingrediente(14,"Arvejas", "arvejas", Ingrediente.VERDURA);
    public static final Ingrediente ing61 = new Ingrediente(15,"Primavera", "primavera", Ingrediente.VERDURA);
    //Carnes
    public static final Ingrediente ing20 = new Ingrediente(0,"Camarón", "shrimp", 3);
    public static final Ingrediente ing25 = new Ingrediente(1,"Tocino", "bacon", 3);
    public static final Ingrediente ing26 = new Ingrediente(2,"Huevos", "egg", 3);
    public static final Ingrediente ing39 = new Ingrediente(3,"Pollo", "chiken",3);
    public static final Ingrediente ing40 = new Ingrediente(4,"Salchicha", "sausage", 3);
    public static final Ingrediente ing41 = new Ingrediente(5,"Bistec", "steak", 3);
    public static final Ingrediente ing42 = new Ingrediente(6,"Pescado", "fish", 3);
    public static final Ingrediente ing43 = new Ingrediente(7,"Salami", "salami", 3);
    public static final Ingrediente ing52 = new Ingrediente(8,"Carne molida", "carnemolida", Ingrediente.CARNE);
    public static final Ingrediente ing66 = new Ingrediente(9,"Jamón", "jamon", Ingrediente.CARNE);
    //Lacteos?
    public static final Ingrediente ing1 = new Ingrediente(0,"Leche", "milk",  4);
    public static final Ingrediente ing2 = new Ingrediente(1,"Café", "coffee",  5);
    public static final Ingrediente ing3 = new Ingrediente(2,"Pan", "bread", 5);
    public static final Ingrediente ing14 = new Ingrediente(3,"Azucar", "sugar", 5);
    public static final Ingrediente ing19 = new Ingrediente(4,"Queso", "cheese", 4);
    public static final Ingrediente ing31 = new Ingrediente(5,"Champiñon", "mushroom", 5);
    public static final Ingrediente ing32 = new Ingrediente(6,"Levadura", "yeast", 5);
    public static final Ingrediente ing33 = new Ingrediente(7,"Mantequilla", "butter", 4);
    public static final Ingrediente ing34 = new Ingrediente(8,"Nutella", "nutela", 5);
    public static final Ingrediente ing35 = new Ingrediente(9,"Aceite", "oil", 5);
    public static final Ingrediente ing37 = new Ingrediente(10,"Harina", "flour", 5);
    public static final Ingrediente ing38 = new Ingrediente(11,"Helado", "icecream", 4);
    public static final Ingrediente ing51 = new Ingrediente(12,"Manjar", "manjar", Ingrediente.LACTEO);
    public static final Ingrediente ing57 = new Ingrediente(13,"Manteca", "manteca", Ingrediente.LACTEO);
    public static final Ingrediente ing60 = new Ingrediente(14,"Queso rallado", "quesorallado", Ingrediente.LACTEO);

    //otros
    public static final Ingrediente ing49 = new Ingrediente(0,"Dextrosa", "dextrosa", Ingrediente.OTRO);
    public static final Ingrediente ing50 = new Ingrediente(1,"Sal", "sal", Ingrediente.OTRO);
    public static final Ingrediente ing53 = new Ingrediente(2,"Salsa de tomate", "tomate", Ingrediente.OTRO);
    public static final Ingrediente ing54 = new Ingrediente(3,"Ramen", "ramen", Ingrediente.OTRO);
    public static final Ingrediente ing56 = new Ingrediente(4,"Tallarines", "pasta", Ingrediente.OTRO);
    public static final Ingrediente ing59 = new Ingrediente(5,"Pimentón", "pimiento", Ingrediente.OTRO);
    public static final Ingrediente ing62 = new Ingrediente(6,"Agua con gas", "aguagas", Ingrediente.OTRO);
    public static final Ingrediente ing63 = new Ingrediente(7,"Pasta", "pasta", Ingrediente.OTRO);
    public static final Ingrediente ing64 = new Ingrediente(8,"Polvo de hornear", "yeast", Ingrediente.OTRO);
    public static final Ingrediente ing65 = new Ingrediente(9,"Agua", "agua", Ingrediente.OTRO);

    public static final int TODOS = 0;
    public static final int PORINGREDIENTE = 1;
    public static final int PORNOMBRE = 2;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_coordinator_ntb);
        instance=this;
        getAllWidgets();
        setupViewPager();
        botonBuscar = (Button) findViewById(R.id.botonBuscarRecetas);

        botonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HorizontalCoordinatorNtbActivity.this, ListaRecetaActivity.class);
                Bundle extras = new Bundle();

                if(canasta.size()<1){
                    extras.putInt("tipo", HorizontalCoordinatorNtbActivity.TODOS);
                }else{
                    extras.putInt("tipo", HorizontalCoordinatorNtbActivity.PORINGREDIENTE);
                    ArrayList<Integer> ids = new ArrayList<>();
                    for(Ingrediente ingred:canasta){
                        ids.add(ingred.getId());
                    }
                    extras.putIntegerArrayList("ids",ids);
                }
                intent.putExtras(extras);
                startActivity(intent);
            }
        });

        initIngredientes();
        initUI();
    }

    private void initIngredientes(){

        listaDeVegetales.add(ing4);
        listaDeVegetales.add(ing6);
        listaDeVegetales.add(ing7);
        listaDeVegetales.add(ing8);
        listaDeVegetales.add(ing16);
        listaDeVegetales.add(ing17);
        listaDeVegetales.add(ing18);
        listaDeVegetales.add(ing24);
        listaDeVegetales.add(ing44);
        listaDeVegetales.add(ing45);
        listaDeVegetales.add(ing46);
        listaDeVegetales.add(ing47);


        listaDeFrutas.add(ing5);
        listaDeFrutas.add(ing9);
        listaDeFrutas.add(ing10);
        listaDeFrutas.add(ing11);
        listaDeFrutas.add(ing12);
        listaDeFrutas.add(ing13);
        listaDeFrutas.add(ing15);
        listaDeFrutas.add(ing21);
        listaDeFrutas.add(ing22);
        listaDeFrutas.add(ing23);
        listaDeFrutas.add(ing27);
        listaDeFrutas.add(ing28);
        listaDeFrutas.add(ing29);
        listaDeFrutas.add(ing30);
        listaDeFrutas.add(ing36);


        listaDeCarnes.add(ing20);
        listaDeCarnes.add(ing25);
        listaDeCarnes.add(ing26);
        listaDeCarnes.add(ing39);
        listaDeCarnes.add(ing40);
        listaDeCarnes.add(ing41);
        listaDeCarnes.add(ing42);
        listaDeCarnes.add(ing43);

        listaDeLacteos.add(ing1);
        listaDeLacteos.add(ing2);
        listaDeLacteos.add(ing3);
        listaDeLacteos.add(ing14);
        listaDeLacteos.add(ing19);
        listaDeLacteos.add(ing31);
        listaDeLacteos.add(ing32);
        listaDeLacteos.add(ing33);
        listaDeLacteos.add(ing34);
        listaDeLacteos.add(ing35);
        listaDeLacteos.add(ing37);
        listaDeLacteos.add(ing38);


        listaDeTodosLosIngredientes = new ArrayList<Ingrediente>();
        listaDeTodosLosIngredientes.add(ing1);
        listaDeTodosLosIngredientes.add(ing2);
        listaDeTodosLosIngredientes.add(ing3);
        listaDeTodosLosIngredientes.add(ing4);
        listaDeTodosLosIngredientes.add(ing5);
        listaDeTodosLosIngredientes.add(ing6);
        listaDeTodosLosIngredientes.add(ing7);
        listaDeTodosLosIngredientes.add(ing8);
        listaDeTodosLosIngredientes.add(ing9);
        listaDeTodosLosIngredientes.add(ing10);
        listaDeTodosLosIngredientes.add(ing11);
        listaDeTodosLosIngredientes.add(ing12);
        listaDeTodosLosIngredientes.add(ing13);
        listaDeTodosLosIngredientes.add(ing14);
        listaDeTodosLosIngredientes.add(ing15);
        listaDeTodosLosIngredientes.add(ing16);
        listaDeTodosLosIngredientes.add(ing17);
        listaDeTodosLosIngredientes.add(ing18);
        listaDeTodosLosIngredientes.add(ing19);
        listaDeTodosLosIngredientes.add(ing20);
        listaDeTodosLosIngredientes.add(ing21);
        listaDeTodosLosIngredientes.add(ing22);
        listaDeTodosLosIngredientes.add(ing23);
        listaDeTodosLosIngredientes.add(ing24);
        listaDeTodosLosIngredientes.add(ing25);
        listaDeTodosLosIngredientes.add(ing27);
        listaDeTodosLosIngredientes.add(ing28);
        listaDeTodosLosIngredientes.add(ing29);
        listaDeTodosLosIngredientes.add(ing30);
        listaDeTodosLosIngredientes.add(ing31);
        listaDeTodosLosIngredientes.add(ing32);
        listaDeTodosLosIngredientes.add(ing33);
        listaDeTodosLosIngredientes.add(ing34);
        listaDeTodosLosIngredientes.add(ing35);
        listaDeTodosLosIngredientes.add(ing36);
        listaDeTodosLosIngredientes.add(ing37);
        listaDeTodosLosIngredientes.add(ing38);
        listaDeTodosLosIngredientes.add(ing39);
        listaDeTodosLosIngredientes.add(ing40);
        listaDeTodosLosIngredientes.add(ing41);
        listaDeTodosLosIngredientes.add(ing42);
        listaDeTodosLosIngredientes.add(ing43);
        listaDeTodosLosIngredientes.add(ing44);
        listaDeTodosLosIngredientes.add(ing45);
        listaDeTodosLosIngredientes.add(ing47);


    }

    public static HorizontalCoordinatorNtbActivity getInstance() {
        return instance;
    }

    private void getAllWidgets() {
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        allTabs = (TabLayout) findViewById(R.id.tabs);
        allTabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                System.out.println("asdfasdfasfdfsasdfasdfsdaf"+position);
                if(canasta.isEmpty())
                {
                }
                else{
                    System.out.println("CANASTA:"+canasta.size());
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }

    private void setupViewPager() {
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        fragmentFruta = new FrutasFragment();
        fragmentVerdura= new VerduraFragment();
        fragmentLacteos = new LacteosFragment();
        fragmentCarne = new CarnesFragment();
        adapter.addFragment(fragmentFruta, "Frutas");
        adapter.addFragment(fragmentLacteos, "Lacteos");
        adapter.addFragment(fragmentVerdura, "Verduras");
        adapter.addFragment(fragmentCarne, "Carnes");
        setViewPageAdapter();
    }

    private void setViewPageAdapter() {
        viewPager.setAdapter(adapter);
        allTabs.setupWithViewPager(viewPager);
    }

    private void initUI()
    {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setNavigationIcon(R.drawable.chef_home);}

        IngredienteArrayAdapter adapter = new IngredienteArrayAdapter(this, canasta);
        listView = (ListView) findViewById(R.id.lvIngredientes);
        listView.setAdapter(adapter);

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsToolbar);
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.transparent));

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
