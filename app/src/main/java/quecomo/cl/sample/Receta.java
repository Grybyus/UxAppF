package quecomo.cl.sample;


public class Receta
{
    private int id;
    private String nombre;
    private String descripcion;
    private String nombreImagen;

    public Receta(int id, String nombre, String descripcion, String nombreImagen)
    {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nombreImagen = nombreImagen;
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
