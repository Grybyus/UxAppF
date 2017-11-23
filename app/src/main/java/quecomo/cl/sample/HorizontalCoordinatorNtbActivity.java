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
    private OtrosFragment fragmentOtros;
    private ViewPager viewPager;
    private TabLayout allTabs;
    Button botonBuscar;
    public static ListView listView;

    public static ArrayList<Ingrediente> canasta = new ArrayList<Ingrediente>();
    public static ArrayList<Ingrediente> listaDeTodosLosIngredientes;
    public static ArrayList<Ingrediente> listaDeFrutas= new ArrayList<Ingrediente>();
    public static ArrayList<Ingrediente> listaDeLacteos = new ArrayList<Ingrediente>();
    public static ArrayList<Ingrediente> listaDeCarnes = new ArrayList<Ingrediente>();
    public static ArrayList<Ingrediente> listaDeVegetales = new ArrayList<Ingrediente>();
    public static ArrayList<Ingrediente> listaDeOtros= new ArrayList<Ingrediente>();


    //PARA AGREGAR ALGUN INGREDIENTE NUEVO TIENES QUE SEGUIR EL ORDEN DE IDS DE EL TIPO AL QUE PERTENECE, ADEMAS AGREGARLO EN VALUES -> STRINGS A LA CATEGORIA QUE PERTENECE

    //Frutas
    public static final Ingrediente ing5 = new Ingrediente(0,"Manzana", "apple", 1,1);
    public static final Ingrediente ing29 = new Ingrediente(1,"Banana", "banana", 1,2);
    public static final Ingrediente ing11 = new Ingrediente(2,"Pera", "pear", 1,3);
    public static final Ingrediente ing12 = new Ingrediente(3,"Durazno", "peach", 1,4);
    public static final Ingrediente ing13 = new Ingrediente(4,"Cereza", "cherry", 1,5);
    public static final Ingrediente ing15 = new Ingrediente(5,"Maiz", "corn", 1,6);
    public static final Ingrediente ing22 = new Ingrediente(6,"Maní", "peanut", 1,7);
    public static final Ingrediente ing23 = new Ingrediente(7,"Uvas", "grapes", 1,8);
    public static final Ingrediente ing27 = new Ingrediente(8,"Limón", "lemon",1,9);
    public static final Ingrediente ing28 = new Ingrediente(9,"Tomate", "tomato", 1,10);
    public static final Ingrediente ing30 = new Ingrediente(10,"Fresa", "strawberry", 1,11);
    public static final Ingrediente ing36 = new Ingrediente(11,"Nuez", "nut", 1,12);
    public static final Ingrediente ing10 = new Ingrediente(12,"Palta", "avocado", 1,13);
    public static final Ingrediente ing9 = new Ingrediente(13,"Piña", "pineapple", 1,14);
    public static final Ingrediente ing21 = new Ingrediente(14,"Naranja", "orange", 1,15);
    //Verduras
    public static final Ingrediente ing4 = new Ingrediente(0,"Zanahoria", "carrot", 2,16);
    public static final Ingrediente ing6 = new Ingrediente(1,"Lechuga", "latuce", 2,17);
    public static final Ingrediente ing7 = new Ingrediente(2,"Papas", "potatoes", 2,18);
    public static final Ingrediente ing8 = new Ingrediente(3,"Zapallo", "pumpkin", 2,19);
    public static final Ingrediente ing16 = new Ingrediente(4,"Pepino", "cucumber", 2,20);
    public static final Ingrediente ing17 = new Ingrediente(5,"Ají", "chili", 2,21);
    public static final Ingrediente ing18 = new Ingrediente(6,"Sandía", "watermelon", 2,22);
    public static final Ingrediente ing24 = new Ingrediente(7,"Berenjena", "eggplant",2,23);
    public static final Ingrediente ing44 = new Ingrediente(8,"Ajo", "garlic", 2,24);
    public static final Ingrediente ing45 = new Ingrediente(9,"Cebollin", "onionin", 2,25);
    public static final Ingrediente ing46 = new Ingrediente(10,"Cebolla", "onion", 2,26);
    public static final Ingrediente ing47 = new Ingrediente(11,"Brócoli", "broccoli", 2,27);
    public static final Ingrediente ing48 = new Ingrediente(12,"Quinoa", "quinoa", Ingrediente.VERDURA,28);
    public static final Ingrediente ing55 = new Ingrediente(13,"Zapallo italiano", "zapallito", Ingrediente.VERDURA,29);
    public static final Ingrediente ing58 = new Ingrediente(14,"Arvejas", "arvejas", Ingrediente.VERDURA,30);
    public static final Ingrediente ing61 = new Ingrediente(15,"Primavera", "primavera", Ingrediente.VERDURA,31);
    //Carnes
    public static final Ingrediente ing20 = new Ingrediente(0,"Camarón", "shrimp", 3,32);
    public static final Ingrediente ing25 = new Ingrediente(1,"Tocino", "bacon", 3,33);
    public static final Ingrediente ing26 = new Ingrediente(2,"Huevos", "egg", 3,34);
    public static final Ingrediente ing39 = new Ingrediente(3,"Pollo", "chiken",3,35);
    public static final Ingrediente ing40 = new Ingrediente(4,"Salchicha", "sausage", 3,36);
    public static final Ingrediente ing41 = new Ingrediente(5,"Bistec", "steak", 3,37);
    public static final Ingrediente ing42 = new Ingrediente(6,"Pescado", "fish", 3,38);
    public static final Ingrediente ing43 = new Ingrediente(7,"Salami", "salami", 3,39);
    public static final Ingrediente ing52 = new Ingrediente(8,"Carne molida", "carnemolida", Ingrediente.CARNE,40);
    public static final Ingrediente ing66 = new Ingrediente(9,"Jamón", "jamon", Ingrediente.CARNE,41);
    //Lacteos?
    public static final Ingrediente ing1 = new Ingrediente(0,"Leche", "milk",  4,42);
    public static final Ingrediente ing19 = new Ingrediente(1,"Queso", "cheese", 4,46);
    public static final Ingrediente ing33 = new Ingrediente(2,"Mantequilla", "butter", 4,49);
    public static final Ingrediente ing38 = new Ingrediente(3,"Helado", "icecream", 4,53);
    public static final Ingrediente ing51 = new Ingrediente(4,"Manjar", "manjar", Ingrediente.LACTEO,54);
    public static final Ingrediente ing57 = new Ingrediente(5,"Manteca", "manteca", Ingrediente.LACTEO,55);
    public static final Ingrediente ing60 = new Ingrediente(6,"Queso rallado", "quesorallado", Ingrediente.LACTEO,56);

    //otros
    public static final Ingrediente ing2 = new Ingrediente(0,"Café", "coffee",  5,43);
    public static final Ingrediente ing3 = new Ingrediente(1,"Pan", "bread", 5,44);
    public static final Ingrediente ing14 = new Ingrediente(2,"Azucar", "sugar", 5,45);
    public static final Ingrediente ing31 = new Ingrediente(3,"Champiñon", "mushroom", 5,47);
    public static final Ingrediente ing32 = new Ingrediente(4,"Levadura", "yeast", 5,48);
    public static final Ingrediente ing34 = new Ingrediente(5,"Nutella", "nutela", 5,50);
    public static final Ingrediente ing35 = new Ingrediente(6,"Aceite", "oil", 5,51);
    public static final Ingrediente ing37 = new Ingrediente(7,"Harina", "flour", 5,52);
    public static final Ingrediente ing49 = new Ingrediente(8,"Dextrosa", "dextrosa", Ingrediente.OTRO,57);
    public static final Ingrediente ing50 = new Ingrediente(9,"Sal", "sal", Ingrediente.OTRO,58);
    public static final Ingrediente ing53 = new Ingrediente(10,"Salsa de tomate", "tomate", Ingrediente.OTRO,59);
    public static final Ingrediente ing54 = new Ingrediente(11,"Ramen", "ramen", Ingrediente.OTRO,60);
    public static final Ingrediente ing56 = new Ingrediente(12,"Tallarines", "pasta", Ingrediente.OTRO,61);
    public static final Ingrediente ing59 = new Ingrediente(13,"Pimentón", "pimiento", Ingrediente.OTRO,62);
    public static final Ingrediente ing62 = new Ingrediente(14,"Agua con gas", "aguagas", Ingrediente.OTRO,63);
    public static final Ingrediente ing63 = new Ingrediente(15,"Pasta", "pasta", Ingrediente.OTRO,64);
    public static final Ingrediente ing64 = new Ingrediente(16,"Polvo de hornear", "yeast", Ingrediente.OTRO,65);
    public static final Ingrediente ing65 = new Ingrediente(17,"Agua", "agua", Ingrediente.OTRO,66);

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

                if(HorizontalCoordinatorNtbActivity.canasta.size()<1){
                    extras.putInt("tipo", HorizontalCoordinatorNtbActivity.TODOS);
                }else{
                    extras.putInt("tipo", HorizontalCoordinatorNtbActivity.PORINGREDIENTE);
                    ArrayList<Integer> pks = new ArrayList<>();
                    for(Ingrediente ingred:HorizontalCoordinatorNtbActivity.canasta){
                        pks.add(ingred.getPk());
                    }
                    extras.putIntegerArrayList("pks",pks);
                }
                intent.putExtras(extras);
                startActivity(intent);
            }
        });

        initIngredientes();
        initUI();
    }

    private void initIngredientes(){

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
        listaDeTodosLosIngredientes.add(ing46);
        listaDeTodosLosIngredientes.add(ing47);
        listaDeTodosLosIngredientes.add(ing48);
        listaDeTodosLosIngredientes.add(ing49);
        listaDeTodosLosIngredientes.add(ing50);
        listaDeTodosLosIngredientes.add(ing51);
        listaDeTodosLosIngredientes.add(ing52);
        listaDeTodosLosIngredientes.add(ing53);
        listaDeTodosLosIngredientes.add(ing54);
        listaDeTodosLosIngredientes.add(ing55);
        listaDeTodosLosIngredientes.add(ing56);
        listaDeTodosLosIngredientes.add(ing57);
        listaDeTodosLosIngredientes.add(ing58);
        listaDeTodosLosIngredientes.add(ing59);
        listaDeTodosLosIngredientes.add(ing60);
        listaDeTodosLosIngredientes.add(ing61);
        listaDeTodosLosIngredientes.add(ing62);
        listaDeTodosLosIngredientes.add(ing63);
        listaDeTodosLosIngredientes.add(ing64);
        listaDeTodosLosIngredientes.add(ing65);

        for(Ingrediente ing: listaDeTodosLosIngredientes){
            switch (ing.getTipo()){
                case Ingrediente.CARNE:
                    listaDeCarnes.add(ing);
                    break;
                case Ingrediente.FRUTA:
                    listaDeFrutas.add(ing);
                    break;
                case Ingrediente.LACTEO:
                    listaDeLacteos.add(ing);
                    break;
                case Ingrediente.OTRO:
                    listaDeOtros.add(ing);
                    break;
                case Ingrediente.VERDURA:
                    listaDeVegetales.add(ing);
                    break;
            }
        }

    }

    public static HorizontalCoordinatorNtbActivity getInstance() {
        return instance;
    }

    private void getAllWidgets() {
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        allTabs = (TabLayout) findViewById(R.id.tabs);
    }

    private void setupViewPager() {
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        fragmentFruta = new FrutasFragment();
        fragmentVerdura= new VerduraFragment();
        fragmentLacteos = new LacteosFragment();
        fragmentCarne = new CarnesFragment();
        fragmentOtros = new OtrosFragment();
        adapter.addFragment(fragmentFruta, "Frutas");
        adapter.addFragment(fragmentLacteos, "Lacteos");
        adapter.addFragment(fragmentVerdura, "Verdura");
        adapter.addFragment(fragmentCarne, "Carnes");
        adapter.addFragment(fragmentOtros, "Otros");
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
