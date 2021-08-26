package viewControllers;

public class habilidades {

    /**
     * Instance variable
     */
    private String nombre;
    private int daño;


    /**
     * constructor 1
     */
    public habilidades(String nombre, int daño)
    {
        this.nombre = nombre;
        this.daño = daño;
    }

    public habilidades()
    {

    }


    public String getNombre() {
        return nombre;
    }

    public int getDaño() {
        return daño;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setDaño(int daño)
    {
        this.daño = daño;
    }
}
