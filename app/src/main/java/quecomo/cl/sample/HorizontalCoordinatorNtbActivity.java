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


        Ingrediente ing1 = new Ingrediente(1,"Leche", "milk",  4);
        Ingrediente ing2 = new Ingrediente(2,"Café", "coffee",  5);
        Ingrediente ing3 = new Ingrediente(3,"Pan", "bread", 5);
        Ingrediente ing4 = new Ingrediente(4,"zanahoria", "carrot", 2);
        Ingrediente ing5 = new Ingrediente(5,"manzana", "apple", 1);
        Ingrediente ing6 = new Ingrediente(6,"lechuga", "letuce", 2);
        Ingrediente ing7 = new Ingrediente(7,"papa", "potatoes", 2);
        Ingrediente ing8 = new Ingrediente(8,"zapallo", "pumpkin", 2);
        Ingrediente ing9 = new Ingrediente(9,"piña", "pineapple", 1);
        Ingrediente ing10 = new Ingrediente(10,"palta", "avocado", 1);
        Ingrediente ing11 = new Ingrediente(11,"pera", "pear", 1);
        Ingrediente ing12 = new Ingrediente(12,"durazno", "peach", 1);
        Ingrediente ing13 = new Ingrediente(13,"cereza", "cherry", 1);
        Ingrediente ing14 = new Ingrediente(14,"azucar", "sugar", 5);
        Ingrediente ing15 = new Ingrediente(15,"maiz", "corn", 1);
        Ingrediente ing16 = new Ingrediente(16,"pepino", "cucumber", 2);
        Ingrediente ing17 = new Ingrediente(17,"ají", "chili", 2);
        Ingrediente ing18 = new Ingrediente(18,"sandía", "watermelon", 2);
        Ingrediente ing19 = new Ingrediente(19,"queso", "cheese", 4);
        Ingrediente ing20 = new Ingrediente(20,"camarón", "shrimp", 3);
        Ingrediente ing21 = new Ingrediente(21,"naranja", "orange", 1);
        Ingrediente ing22 = new Ingrediente(22,"maní", "peanut", 1);
        Ingrediente ing23 = new Ingrediente(23,"uvas", "grapes", 1);
        Ingrediente ing24 = new Ingrediente(24,"berenjena", "eggplant",2);
        Ingrediente ing25 = new Ingrediente(25,"tocino", "bacon", 3);
        Ingrediente ing26 = new Ingrediente(26,"huevo", "egg", 3);
        Ingrediente ing27 = new Ingrediente(27,"limón", "lemon",1);
        Ingrediente ing28 = new Ingrediente(28,"tomate", "tomato", 1);
        Ingrediente ing29 = new Ingrediente(29,"banana", "banana", 1);
        Ingrediente ing30 = new Ingrediente(30,"fresa", "strawberry", 1);
        Ingrediente ing31 = new Ingrediente(31,"champiñon", "mushroom", 5);
        Ingrediente ing32 = new Ingrediente(32,"levadura", "yeast", 5);
        Ingrediente ing33 = new Ingrediente(33,"mantequilla", "butter", 4);
        Ingrediente ing34 = new Ingrediente(34,"nutella", "nutela", 5);
        Ingrediente ing35 = new Ingrediente(35,"aceite", "oil", 5);
        Ingrediente ing36 = new Ingrediente(36,"nuez", "nut", 1);
        Ingrediente ing37 = new Ingrediente(37,"harina", "flour", 5);
        Ingrediente ing38 = new Ingrediente(38,"helado", "icecream", 4);
        Ingrediente ing39 = new Ingrediente(39,"pollo", "chiken",3);
        Ingrediente ing40 = new Ingrediente(40,"salchicha", "sausage", 3);
        Ingrediente ing41 = new Ingrediente(41,"bistec", "steak", 3);
        Ingrediente ing42 = new Ingrediente(42,"pescado", "fish", 3);
        Ingrediente ing43 = new Ingrediente(43,"salami", "salami", 3);
        Ingrediente ing44 = new Ingrediente(44,"ajo", "garlic", 2);
        Ingrediente ing45 = new Ingrediente(45,"cebollin", "onionin", 2);
        Ingrediente ing46 = new Ingrediente(46,"cebolla", "onion", 2);
        Ingrediente ing47 = new Ingrediente(47,"brócoli", "broccoli", 2);




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
