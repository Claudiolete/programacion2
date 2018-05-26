public class Auto
{
    private String modelo;
    private int kilometraje;
    private int capacidadBencina;
    private String nombre;
    private String fecha;
    private boolean estado = true;

    public Auto (String modelo, int capacidadBencina, int kilometraje)
    {
        this.modelo = modelo;
        this.capacidadBencina = capacidadBencina;
        this.kilometraje = kilometraje;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public int getKilometraje()
    {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje)
    {
        this.kilometraje = kilometraje;
    }

    public int getCapacidadBencina()
    {
        return capacidadBencina;
    }

    public void setCapacidadBencina(int capacidadBencina)
    {
        this.capacidadBencina = capacidadBencina;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getFecha()
    {
        return fecha;
    }

    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }

    public boolean isEstado()
    {
        return estado;
    }

    public void setEstado(boolean estado)
    {
        this.estado = estado;
    }
}
