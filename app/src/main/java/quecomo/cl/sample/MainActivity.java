package quecomo.cl.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Toolbar toolbar;
    Button botonBuscarNombre;
    SearchView buscar_ini;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
//        super.onCreate(savedInstanceState);
//        Intent newIntent = new Intent(this, ListaRecetaActivity.class);
//        startActivity(newIntent);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();

        botonBuscarNombre = (Button) findViewById(R.id.btn_search);

        botonBuscarNombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListaRecetaActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("tipo", HorizontalCoordinatorNtbActivity.PORNOMBRE);

                buscar_ini = (SearchView) findViewById(R.id.buscar_ini);

                extras.putString("consulta",buscar_ini.getQuery().toString());

                intent.putExtras(extras);
                startActivity(intent);
            }
        });
    }

    private void initUI()
    {
        final View btnHorizontalCoordinatorNtb = findViewById(R.id.btn_horizontal_coordinator_ntb);
        btnHorizontalCoordinatorNtb.setOnClickListener(this);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.chef_home);

    }

    @Override
    public void onClick(final View v)
    {
        startActivity(new Intent(MainActivity.this, HorizontalCoordinatorNtbActivity.class));
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
                Toast.makeText(this,"Has pulsado en salir",Toast.LENGTH_SHORT).show();
                finish();
                System.exit(0);
                break;
            case R.id.editar:
                Toast.makeText(this,"Disculpe, estamos trabajando para usted",Toast.LENGTH_SHORT).show();
                break;
            case android.R.id.home:
                Toast.makeText(this,"¿Qué vamos a cocinar hoy!?",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}

