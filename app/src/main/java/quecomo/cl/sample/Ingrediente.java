package quecomo.cl.sample;

import java.util.ArrayList;

/**
 * Created by Belly on 09-11-2017.
 */

public class Ingrediente {
    private int id;
    private String nombre;
    private String imagen;


    public Ingrediente(int id, String nombre, String imagen)
    {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
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

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setImagen(String imagen)
    {
        this.imagen = imagen;
    }

}
