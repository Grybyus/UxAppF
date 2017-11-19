package quecomo.cl.sample;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
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

        Ingrediente vegetal1 = new Ingrediente(1,"Brocoli", "milk");
        Ingrediente vegetal2 = new Ingrediente(2,"Lechuga", "milk");
        Ingrediente vegetal3 = new Ingrediente(3,"Apio", "milk");
        Ingrediente vegetal4 = new Ingrediente(4,"Repollo", "milk");
        Ingrediente vegetal5 = new Ingrediente(5,"Pimenton", "milk");
        Ingrediente vegetal6 = new Ingrediente(6,"Zanahoria", "milk");

        Ingrediente fruta1 = new Ingrediente(7,"Manzana", "milk");
        Ingrediente fruta2 = new Ingrediente(8,"Tomate", "milk");
        Ingrediente fruta3 = new Ingrediente(9,"Platanito", "milk");
        Ingrediente fruta4 = new Ingrediente(10,"Durazno", "milk");
        Ingrediente fruta5 = new Ingrediente(11,"Pera", "milk");
        Ingrediente fruta6 = new Ingrediente(12,"Kiwi", "milk");

        Ingrediente carne1 = new Ingrediente(13,"Pollo", "milk");
        Ingrediente carne2 = new Ingrediente(14,"Vaquita", "milk");
        Ingrediente carne3 = new Ingrediente(15,"Pollo Ganso", "milk");
        Ingrediente carne4 = new Ingrediente(16,"Paleta", "milk");
        Ingrediente carne5 = new Ingrediente(17,"Guaren", "milk");
        Ingrediente carne6 = new Ingrediente(18,"Perro", "milk");

        Ingrediente lacteo1 = new Ingrediente(19,"Leche", "milk");
        Ingrediente lacteo2 = new Ingrediente(20,"Queso", "milk");
        Ingrediente lacteo3 = new Ingrediente(21,"Yogurt1", "milk");
        Ingrediente lacteo4 = new Ingrediente(22,"Yogurt2", "milk");
        Ingrediente lacteo5 = new Ingrediente(23,"Yogurt3", "milk");
        Ingrediente lacteo6 = new Ingrediente(24,"Yogurt4", "milk");

        ArrayList<Ingrediente> listaDeVegetales = new ArrayList<Ingrediente>();
        listaDeVegetales.add(vegetal1);
        listaDeVegetales.add(vegetal2);
        listaDeVegetales.add(vegetal3);
        listaDeVegetales.add(vegetal4);
        listaDeVegetales.add(vegetal5);
        listaDeVegetales.add(vegetal6);
        ListaIngredientes objetoListaDeVerduras = new ListaIngredientes(listaDeVegetales);

        ArrayList<Ingrediente> listaDeFrutas = new ArrayList<Ingrediente>();
        listaDeFrutas.add(fruta1);
        listaDeFrutas.add(fruta2);
        listaDeFrutas.add(fruta3);
        listaDeFrutas.add(fruta4);
        listaDeFrutas.add(fruta5);
        listaDeFrutas.add(fruta6);
        ListaIngredientes objetoListaDeFrutas = new ListaIngredientes(listaDeFrutas);

        final ArrayList<Ingrediente> listaDeCarnes = new ArrayList<Ingrediente>();
        listaDeCarnes.add(carne1);
        listaDeCarnes.add(carne2);
        listaDeCarnes.add(carne3);
        listaDeCarnes.add(carne4);
        listaDeCarnes.add(carne5);
        listaDeCarnes.add(carne6);
        ListaIngredientes objetoListaDeCarnes = new ListaIngredientes(listaDeCarnes);

        ArrayList<Ingrediente> listaDeLacteos = new ArrayList<Ingrediente>();
        listaDeLacteos.add(lacteo1);
        listaDeLacteos.add(lacteo2);
        listaDeLacteos.add(lacteo3);
        listaDeLacteos.add(lacteo4);
        listaDeLacteos.add(lacteo5);
        listaDeLacteos.add(lacteo6);
        ListaIngredientes objetoListaDeLacteos = new ListaIngredientes(listaDeLacteos);

        listas = new ArrayList<ListaIngredientes>();
        listas.add(objetoListaDeFrutas);
        listas.add(objetoListaDeVerduras);
        listas.add(objetoListaDeCarnes);
        listas.add(objetoListaDeLacteos);
        initUI();
        Button botonFrutas = (Button) findViewById(R.id.botonFrutas);
        botonFrutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView elemento1DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list);
                TextView elemento2DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list1);
                TextView elemento3DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list2);
                TextView elemento1DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list3);
                TextView elemento2DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list4);
                TextView elemento3DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list5);
                elemento1DeLaFila1.setText(listas.get(0).getListaDeIngredientes().get(0).getNombre());
                elemento2DeLaFila1.setText(listas.get(0).getListaDeIngredientes().get(1).getNombre());
                elemento3DeLaFila1.setText(listas.get(0).getListaDeIngredientes().get(2).getNombre());
                elemento1DeLaFila2.setText(listas.get(0).getListaDeIngredientes().get(3).getNombre());
                elemento2DeLaFila2.setText(listas.get(0).getListaDeIngredientes().get(4).getNombre());
                elemento3DeLaFila2.setText(listas.get(0).getListaDeIngredientes().get(5).getNombre());
            }
        });

        Button botonVerduras = (Button) findViewById(R.id.botonVerduras);
        botonVerduras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView elemento1DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list);
                TextView elemento2DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list1);
                TextView elemento3DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list2);
                TextView elemento1DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list3);
                TextView elemento2DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list4);
                TextView elemento3DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list5);
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
            @Override
            public void onClick(View v) {
                TextView elemento1DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list);
                TextView elemento2DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list1);
                TextView elemento3DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list2);
                TextView elemento1DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list3);
                TextView elemento2DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list4);
                TextView elemento3DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list5);
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
            @Override
            public void onClick(View v) {
                TextView elemento1DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list);
                TextView elemento2DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list1);
                TextView elemento3DeLaFila1 = (TextView) findViewById(R.id.txt_vp_item_list2);
                TextView elemento1DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list3);
                TextView elemento2DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list4);
                TextView elemento3DeLaFila2 = (TextView) findViewById(R.id.txt_vp_item_list5);
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
