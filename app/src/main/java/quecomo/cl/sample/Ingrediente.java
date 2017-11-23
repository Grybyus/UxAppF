package quecomo.cl.sample;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Belly on 09-11-2017.
 */

public class Ingrediente {
    private int id;
    public static final int FRUTA = 1;
    public static final int VERDURA = 2;
    public static final int CARNE = 3;
    public static final int LACTEO = 4;
    public static final int OTRO = 5;
    private int tipo; //1: fruta, 2: verdura, 3: carnes y pescados y marinos, 4: lacteos, 5: otros.
    private String nombre;
    private String imagen;
    private int pk;


    public int getPk() {
        return pk;
    }

    public Ingrediente(int id, String nombre, String imagen, int tipo, int pk)
    {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.tipo= tipo;
        this.pk = pk;
    }

    public int getId()
    {
        return this.id;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public String getImagen()
    {
        return this.imagen;
    }

    public int getTipo()
    {
        return this.tipo;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setImagen(String imagen)
    {
        this.imagen = imagen;
    }

    public void setTipo(String imagen)
    {
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return this.nombre;
    }


    static public Ingrediente buscarIngredientePorID(int ID, ArrayList<Ingrediente> listaDeIngredientes)
    {
        for (Ingrediente ingrediente : listaDeIngredientes)
        {
            if(ingrediente.getId() == ID)
            {
                return ingrediente;
            }
        }
        Log.e("ERROR DE BUSQUEDA", "El elemento no ha sido encontrado");
        Ingrediente ingredienteVacio = new Ingrediente(-1, "","",-1, -1);
        return ingredienteVacio;
    }
}
