package quecomo.cl.sample;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import quecomo.cl.library.ntb.NavigationTabBar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;



public class HorizontalCoordinatorNtbActivity extends AppCompatActivity {
    private Toolbar toolbar;
    Integer posicionEnLista = 0;
    Integer listaActual = 2;
    Button botonBuscar;
    ArrayList<ListaIngredientes> listas;
    NavigationTabBar navigationTabBar;
    ViewPager viewPager;
    RecyclerView recyclerView;

    public static final Ingrediente ing1 = new Ingrediente(1,"Leche", "milk",  4);
    public static final Ingrediente ing2 = new Ingrediente(2,"Café", "coffee",  5);
    public static final Ingrediente ing3 = new Ingrediente(3,"Pan", "bread", 5);
    public static final Ingrediente ing4 = new Ingrediente(4,"Zanahoria", "carrot", 2);
    public static final Ingrediente ing5 = new Ingrediente(5,"Manzana", "apple", 1);
    public static final Ingrediente ing6 = new Ingrediente(6,"Lechuga", "letuce", 2);
    public static final Ingrediente ing7 = new Ingrediente(7,"Papas", "potatoes", 2);
    public static final Ingrediente ing8 = new Ingrediente(8,"Zapallo", "pumpkin", 2);
    public static final Ingrediente ing9 = new Ingrediente(9,"Piña", "pineapple", 1);
    public static final Ingrediente ing10 = new Ingrediente(10,"Palta", "avocado", 1);
    public static final Ingrediente ing11 = new Ingrediente(11,"Pera", "pear", 1);
    public static final Ingrediente ing12 = new Ingrediente(12,"Durazno", "peach", 1);
    public static final Ingrediente ing13 = new Ingrediente(13,"Cereza", "cherry", 1);
    public static final Ingrediente ing14 = new Ingrediente(14,"Azucar", "sugar", 5);
    public static final Ingrediente ing15 = new Ingrediente(15,"Maiz", "corn", 1);
    public static final Ingrediente ing16 = new Ingrediente(16,"Pepino", "cucumber", 2);
    public static final Ingrediente ing17 = new Ingrediente(17,"Ají", "chili", 2);
    public static final Ingrediente ing18 = new Ingrediente(18,"Sandía", "watermelon", 2);
    public static final Ingrediente ing19 = new Ingrediente(19,"Queso", "cheese", 4);
    public static final Ingrediente ing20 = new Ingrediente(20,"Camarón", "shrimp", 3);
    public static final Ingrediente ing21 = new Ingrediente(21,"Naranja", "orange", 1);
    public static final Ingrediente ing22 = new Ingrediente(22,"Maní", "peanut", 1);
    public static final Ingrediente ing23 = new Ingrediente(23,"Uvas", "grapes", 1);
    public static final Ingrediente ing24 = new Ingrediente(24,"Berenjena", "eggplant",2);
    public static final Ingrediente ing25 = new Ingrediente(25,"Tocino", "bacon", 3);
    public static final Ingrediente ing26 = new Ingrediente(26,"Huevos", "egg", 3);
    public static final Ingrediente ing27 = new Ingrediente(27,"Limón", "lemon",1);
    public static final Ingrediente ing28 = new Ingrediente(28,"Tomate", "tomato", 1);
    public static final Ingrediente ing29 = new Ingrediente(29,"Banana", "banana", 1);
    public static final Ingrediente ing30 = new Ingrediente(30,"Fresa", "strawberry", 1);
    public static final Ingrediente ing31 = new Ingrediente(31,"Champiñon", "mushroom", 5);
    public static final Ingrediente ing32 = new Ingrediente(32,"Levadura", "yeast", 5);
    public static final Ingrediente ing33 = new Ingrediente(33,"Mantequilla", "butter", 4);
    public static final Ingrediente ing34 = new Ingrediente(34,"Nutella", "nutela", 5);
    public static final Ingrediente ing35 = new Ingrediente(35,"Aceite", "oil", 5);
    public static final Ingrediente ing36 = new Ingrediente(36,"Nuez", "nut", 1);
    public static final Ingrediente ing37 = new Ingrediente(37,"Harina", "flour", 5);
    public static final Ingrediente ing38 = new Ingrediente(38,"Helado", "icecream", 4);
    public static final Ingrediente ing39 = new Ingrediente(39,"Pollo", "chiken",3);
    public static final Ingrediente ing40 = new Ingrediente(40,"Salchicha", "sausage", 3);
    public static final Ingrediente ing41 = new Ingrediente(41,"Bistec", "steak", 3);
    public static final Ingrediente ing42 = new Ingrediente(42,"Pescado", "fish", 3);
    public static final Ingrediente ing43 = new Ingrediente(43,"Salami", "salami", 3);
    public static final Ingrediente ing44 = new Ingrediente(44,"Ajo", "garlic", 2);
    public static final Ingrediente ing45 = new Ingrediente(45,"Cebollin", "onionin", 2);
    public static final Ingrediente ing46 = new Ingrediente(46,"Cebolla", "onion", 2);
    public static final Ingrediente ing47 = new Ingrediente(47,"Brócoli", "broccoli", 2);
    public static final Ingrediente ing48 = new Ingrediente(48,"Quinoa", "broccoli", Ingrediente.VERDURA);
    public static final Ingrediente ing49 = new Ingrediente(49,"Dextrosa", "sugar", Ingrediente.OTRO);
    public static final Ingrediente ing50 = new Ingrediente(50,"Sal", "broccoli", Ingrediente.OTRO);
    public static final Ingrediente ing51 = new Ingrediente(51,"Manjar", "broccoli", Ingrediente.LACTEO);
    public static final Ingrediente ing52 = new Ingrediente(52,"Carne molida", "broccoli", Ingrediente.CARNE);
    public static final Ingrediente ing53 = new Ingrediente(53,"Salsa de tomate", "broccoli", Ingrediente.OTRO);
    public static final Ingrediente ing54 = new Ingrediente(54,"Ramen", "broccoli", Ingrediente.OTRO);
    public static final Ingrediente ing55 = new Ingrediente(55,"Zapallo italiano", "broccoli", Ingrediente.VERDURA);
    public static final Ingrediente ing56 = new Ingrediente(56,"Tallarines", "broccoli", Ingrediente.OTRO);
    public static final Ingrediente ing57 = new Ingrediente(57,"Manteca", "broccoli", Ingrediente.OTRO);
    public static final Ingrediente ing58 = new Ingrediente(58,"Arvejas", "broccoli", Ingrediente.OTRO);
    public static final Ingrediente ing59 = new Ingrediente(59,"Pimentón", "broccoli", Ingrediente.OTRO);
    public static final Ingrediente ing60 = new Ingrediente(60,"Queso rallado", "broccoli", Ingrediente.OTRO);
    public static final Ingrediente ing61 = new Ingrediente(61,"Primavera", "broccoli", Ingrediente.OTRO);
    public static final Ingrediente ing62 = new Ingrediente(62,"Agua con gas", "broccoli", Ingrediente.OTRO);
    public static final Ingrediente ing63 = new Ingrediente(63,"Pasta", "broccoli", Ingrediente.OTRO);
    public static final Ingrediente ing64 = new Ingrediente(64,"Polvo de hornear", "broccoli", Ingrediente.OTRO);
    public static final Ingrediente ing65 = new Ingrediente(65,"Agua", "broccoli", Ingrediente.OTRO);
    public static final Ingrediente ing66 = new Ingrediente(66,"Jamón", "broccoli", Ingrediente.OTRO);

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_coordinator_ntb);

        botonBuscar = (Button) findViewById(R.id.botonBuscarRecetas);

        botonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HorizontalCoordinatorNtbActivity.this, ListaRecetaActivity.class);
                startActivity(intent);
            }
        });


        ArrayList<Ingrediente> listaDeVegetales = new ArrayList<Ingrediente>();
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

        ListaIngredientes objetoListaDeVerduras = new ListaIngredientes(listaDeVegetales);

        ArrayList<Ingrediente> listaDeFrutas = new ArrayList<Ingrediente>();
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


        ListaIngredientes objetoListaDeFrutas = new ListaIngredientes(listaDeFrutas);

        final ArrayList<Ingrediente> listaDeCarnes = new ArrayList<Ingrediente>();
        listaDeCarnes.add(ing20);
        listaDeCarnes.add(ing25);
        listaDeCarnes.add(ing26);
        listaDeCarnes.add(ing39);
        listaDeCarnes.add(ing40);
        listaDeCarnes.add(ing41);
        listaDeCarnes.add(ing42);
        listaDeCarnes.add(ing43);
        ListaIngredientes objetoListaDeCarnes = new ListaIngredientes(listaDeCarnes);

        ArrayList<Ingrediente> listaDeLacteos = new ArrayList<Ingrediente>();
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

        ListaIngredientes objetoListaDeLacteos = new ListaIngredientes(listaDeLacteos);





        listas = new ArrayList<ListaIngredientes>();
        listas.add(objetoListaDeFrutas);
        listas.add(objetoListaDeVerduras);
        listas.add(objetoListaDeCarnes);
        listas.add(objetoListaDeLacteos);
        initUI();
        Button botonFrutas = (Button) findViewById(R.id.botonFrutas);
        botonFrutas.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                TextView elemento1DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list);
                TextView elemento2DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list1);
                TextView elemento3DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list2);
                TextView elemento1DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list3);
                TextView elemento2DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list4);
                TextView elemento3DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list5);
                elemento1DeLaFila1.setText(listas.get(0).getListaDeIngredientes().get(0).getNombre());

                Drawable imagen1= getResources().getDrawable( R.drawable.apple );
                Drawable imagen2= getResources().getDrawable( R.drawable.pineapple );
                Drawable imagen3= getResources().getDrawable( R.drawable.avocado );
                Drawable imagen4= getResources().getDrawable( R.drawable.pear );
                Drawable imagen5= getResources().getDrawable( R.drawable.peach );
                Drawable imagen6= getResources().getDrawable( R.drawable.cherry );

                elemento1DeLaFila1.setBackground(imagen1);
                elemento2DeLaFila1.setBackground(imagen2);
                elemento3DeLaFila1.setBackground(imagen3);
                elemento1DeLaFila2.setBackground(imagen4);
                elemento2DeLaFila2.setBackground(imagen5);
                elemento3DeLaFila2.setBackground(imagen6);

                elemento2DeLaFila1.setText(listas.get(0).getListaDeIngredientes().get(1).getNombre());
                elemento3DeLaFila1.setText(listas.get(0).getListaDeIngredientes().get(2).getNombre());
                elemento1DeLaFila2.setText(listas.get(0).getListaDeIngredientes().get(3).getNombre());
                elemento2DeLaFila2.setText(listas.get(0).getListaDeIngredientes().get(4).getNombre());
                elemento3DeLaFila2.setText(listas.get(0).getListaDeIngredientes().get(5).getNombre());
            }
        });

        Button botonVerduras = (Button) findViewById(R.id.botonVerduras);
        botonVerduras.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                TextView elemento1DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list);
                TextView elemento2DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list1);
                TextView elemento3DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list2);
                TextView elemento1DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list3);
                TextView elemento2DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list4);
                TextView elemento3DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list5);

                Drawable imagen1= getResources().getDrawable( R.drawable.carrot );
                Drawable imagen2= getResources().getDrawable( R.drawable.latuce );
                Drawable imagen3= getResources().getDrawable( R.drawable.potatoes );
                Drawable imagen4= getResources().getDrawable( R.drawable.pumpkin );
                Drawable imagen5= getResources().getDrawable( R.drawable.cucumber );
                Drawable imagen6= getResources().getDrawable( R.drawable.chili );

                elemento1DeLaFila1.setBackground(imagen1);
                elemento2DeLaFila1.setBackground(imagen2);
                elemento3DeLaFila1.setBackground(imagen3);
                elemento1DeLaFila2.setBackground(imagen4);
                elemento2DeLaFila2.setBackground(imagen5);
                elemento3DeLaFila2.setBackground(imagen6);


                elemento1DeLaFila1.setText(listas.get(1).getListaDeIngredientes().get(0).getNombre());
                elemento2DeLaFila1.setText(listas.get(1).getListaDeIngredientes().get(1).getNombre());
                elemento3DeLaFila1.setText(listas.get(1).getListaDeIngredientes().get(2).getNombre());
                elemento1DeLaFila2.setText(listas.get(1).getListaDeIngredientes().get(3).getNombre());
                elemento2DeLaFila2.setText(listas.get(1).getListaDeIngredientes().get(4).getNombre());
                elemento3DeLaFila2.setText(listas.get(1).getListaDeIngredientes().get(5).getNombre());
            }
        });

        Button botonCarne = (Button) findViewById(R.id.botonCarne);
        botonCarne.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                TextView elemento1DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list);
                TextView elemento2DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list1);
                TextView elemento3DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list2);
                TextView elemento1DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list3);
                TextView elemento2DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list4);
                TextView elemento3DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list5);

                Drawable imagen1= getResources().getDrawable( R.drawable.shrimp );
                Drawable imagen2= getResources().getDrawable( R.drawable.bacon );
                Drawable imagen3= getResources().getDrawable( R.drawable.egg );
                Drawable imagen4= getResources().getDrawable( R.drawable.chiken );
                Drawable imagen5= getResources().getDrawable( R.drawable.sausage );
                Drawable imagen6= getResources().getDrawable( R.drawable.steak );

                elemento1DeLaFila1.setBackground(imagen1);
                elemento2DeLaFila1.setBackground(imagen2);
                elemento3DeLaFila1.setBackground(imagen3);
                elemento1DeLaFila2.setBackground(imagen4);
                elemento2DeLaFila2.setBackground(imagen5);
                elemento3DeLaFila2.setBackground(imagen6);

                elemento1DeLaFila1.setText(listas.get(2).getListaDeIngredientes().get(0).getNombre());
                elemento2DeLaFila1.setText(listas.get(2).getListaDeIngredientes().get(1).getNombre());
                elemento3DeLaFila1.setText(listas.get(2).getListaDeIngredientes().get(2).getNombre());
                elemento1DeLaFila2.setText(listas.get(2).getListaDeIngredientes().get(3).getNombre());
                elemento2DeLaFila2.setText(listas.get(2).getListaDeIngredientes().get(4).getNombre());
                elemento3DeLaFila2.setText(listas.get(2).getListaDeIngredientes().get(5).getNombre());
            }
        });

        Button botonLacteos = (Button) findViewById(R.id.botonLacteos);
        botonLacteos.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                TextView elemento1DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list);
                TextView elemento2DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list1);
                TextView elemento3DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list2);
                TextView elemento1DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list3);
                TextView elemento2DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list4);
                TextView elemento3DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list5);

                Drawable imagen1= getResources().getDrawable( R.drawable.milk );
                Drawable imagen2= getResources().getDrawable( R.drawable.coffee);
                Drawable imagen3= getResources().getDrawable( R.drawable.bread );
                Drawable imagen4= getResources().getDrawable( R.drawable.sugar );
                Drawable imagen5= getResources().getDrawable( R.drawable.cheese );
                Drawable imagen6= getResources().getDrawable( R.drawable.mushroom );

                elemento1DeLaFila1.setBackground(imagen1);
                elemento2DeLaFila1.setBackground(imagen2);
                elemento3DeLaFila1.setBackground(imagen3);
                elemento1DeLaFila2.setBackground(imagen4);
                elemento2DeLaFila2.setBackground(imagen5);
                elemento3DeLaFila2.setBackground(imagen6);

                elemento1DeLaFila1.setText(listas.get(3).getListaDeIngredientes().get(0).getNombre());
                elemento2DeLaFila1.setText(listas.get(3).getListaDeIngredientes().get(1).getNombre());
                elemento3DeLaFila1.setText(listas.get(3).getListaDeIngredientes().get(2).getNombre());
                elemento1DeLaFila2.setText(listas.get(3).getListaDeIngredientes().get(3).getNombre());
                elemento2DeLaFila2.setText(listas.get(3).getListaDeIngredientes().get(4).getNombre());
                elemento3DeLaFila2.setText(listas.get(3).getListaDeIngredientes().get(5).getNombre());
            }
        });


    }

    private void initUI()
    {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setNavigationIcon(R.drawable.chef_home);}
        viewPager = (ViewPager) findViewById(R.id.vp_horizontal_ntb);
        viewPager.setAdapter(new PagerAdapter()
        {
            @Override
            public int getCount() {
                return 4;
            }

            @Override
            public boolean isViewFromObject(final View view, final Object object) {
                return view.equals(object);
            }

            @Override
            public void destroyItem(final View container, final int position, final Object object) {
                ((ViewPager) container).removeView((View) object);
            }

            @Override
            public Object instantiateItem(final ViewGroup container, final int position)
            {
                final View view = LayoutInflater.from(getBaseContext()).inflate(R.layout.item_vp_list, null, false);
                recyclerView = (RecyclerView) view.findViewById(R.id.rv);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext(), LinearLayoutManager.VERTICAL, false));
                recyclerView.setAdapter(new RecycleAdapter());
                container.addView(view);
                return view;
            }
        });
        final String[] colors = getResources().getStringArray(R.array.default_preview);
        navigationTabBar = (NavigationTabBar) findViewById(R.id.ntb_horizontal);
        final ArrayList<NavigationTabBar.Model> models = new ArrayList<>();
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.fruits),
                        Color.parseColor(colors[0]))
                        .title("Frutas")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.vegetables),
                        Color.parseColor(colors[1]))
                        .title("Vegetales")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.meat),
                        Color.parseColor(colors[2]))
                        .title("Carnes")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.lacteos),
                        Color.parseColor(colors[3]))
                        .title("Lacteos")
                        .build()
        );
        navigationTabBar.setModels(models);
        final CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.parent);
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


    public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
            final View view = LayoutInflater.from(getBaseContext()).inflate(R.layout.item_list, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position)
        {
        }

        @Override
        public int getItemCount() {
            return 2;
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

            public TextView txt;
            public TextView elemento2DeLaFila;
            public TextView elemento3DeLaFila;

            public ViewHolder(final View itemView) {
                super(itemView);
//                txt = (TextView) itemView.findViewById(R.id.txt_vp_item_list);
//                elemento2DeLaFila = (TextView) itemView.findViewById(R.id.txt_vp_item_list1);
//                elemento3DeLaFila = (TextView) itemView.findViewById(R.id.txt_vp_item_list2);
//                txt.setText(listas.get(listaActual).getListaDeIngredientes().get(posicionEnLista).getNombre());
//                elemento2DeLaFila.setText(listas.get(listaActual).getListaDeIngredientes().get(posicionEnLista+1).getNombre());
//                elemento3DeLaFila.setText(listas.get(listaActual).getListaDeIngredientes().get(posicionEnLista+2).getNombre());
//                txt.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v)
//                {
//                    TextView editable = (TextView) findViewById(R.id.backdrop);
//                    String mayo =  txt.getId() + "";
//
//                    editable.setText(mayo);
//                }
//            });
//                elemento2DeLaFila.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v)
//                    {
//                        TextView editable = (TextView) findViewById(R.id.backdrop);
//                        String mayo = elemento2DeLaFila.getId() + "";
//                        editable.setText(mayo);
//                    }
//                });
//                elemento3DeLaFila.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v)
//                    {
//                        TextView editable = (TextView) findViewById(R.id.backdrop);
//                        String mayo = elemento3DeLaFila.getId() + "";
//                        editable.setText(mayo);
//                    }
//                });
//                posicionEnLista = posicionEnLista+3;
                if(posicionEnLista >= 5)
                {
                    posicionEnLista = 0;
                }

            }
        }


    }
}
