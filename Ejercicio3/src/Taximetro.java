public class Taximetro
{
    private int bajadebandera;
    private int kilometros;
    private int tiempo;
    public int total;

    public Taximetro(int bajadebandera , int kilometros , int tiempo , int total)
    {
        this.bajadebandera = bajadebandera;
        this.kilometros = kilometros;
        this.tiempo = tiempo;
        this.total = total;
    }

    public int getBajadebandera()
    {
        return bajadebandera;
    }

    public void setBajadebandera(int bajadebandera)
    {
        this.bajadebandera = bajadebandera;
    }

    public int getKilometros()
    {
        return kilometros;
    }

    public void setKilometros(int kilometros)
    {
        this.kilometros = kilometros;
    }

    public int getTiempo()
    {
        return tiempo;
    }

    public void setTiempo(int tiempo)
    {
        this.tiempo = tiempo;
    }

    public int getTotal()
    {
        return total;
    }

    public void setTotal(int total)
    {
        this.total = total;
    }

    void total()
    {
        this.total = bajadebandera + (kilometros * 150) + (tiempo*60);


    }
}
