package quecomo.cl.sample;


import java.util.ArrayList;

public class Receta
{
    private int id;
    private String nombre;
    private String descripcion;
    private String nombreImagen;
    private ArrayList<String> pasos;
    private ListaIngredientes ingredientes;

    public ArrayList<String> getPasos() {
        return pasos;
    }

    public ArrayList<String> getIngredientes() {

        ArrayList<String> ing = new ArrayList<>();

        for(Ingrediente ingrediente:ingredientes.getListaDeIngredientes()){
            ing.add(ingrediente.toString());
        }
        return ing;
    }

    public Receta(int id, String nombre, String descripcion, String nombreImagen, ListaIngredientes ingredientes, ArrayList<String> pasos)
    {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nombreImagen = nombreImagen;
        this.ingredientes = ingredientes;
        this.pasos = pasos;
    }

    public int getId()
    {
        return this.id;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDescripcion()
    {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public String getNombreImagen() {return this.nombreImagen;}

    public void setNombreImagen(String nombreImagen)
    {
        this.nombreImagen = nombreImagen;
    }
}
