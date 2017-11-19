package quecomo.cl.sample;

import java.util.ArrayList;

/**
 * Created by Yoyi-PC on 18-11-2017.
 */

public class ListaIngredientes
{

    ArrayList<Ingrediente> listaDeIngredientes;

    public ListaIngredientes(ArrayList<Ingrediente> listaDeIngredientes)
    {
        this.listaDeIngredientes = listaDeIngredientes;
    }

    public ArrayList<Ingrediente> getListaDeIngredientes()
    {
        return listaDeIngredientes;
    }
}
