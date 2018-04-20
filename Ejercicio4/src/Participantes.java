public class Participantes
{
    private String nombre;
    private int numero;

    public Participantes(String nombre ,int numero)//constructor de las variables nombre y numero
    {
        this.numero = numero;
        this.nombre = nombre;
    }

    public String getNombre()//getter del nombre
    {
        return nombre;
    }

    public void setNombre(String nombre)//setter del nombre
    {
        this.nombre = nombre;
    }

    public int getNumero()//getter del numero
    {
        return numero;
    }

    public void setNumero(int numero)//setter del numero
    {
        this.numero = numero;
    }


}
