public class Termometro
{

    private int temperatura;//Atributo donde se almacenan las temperaturas


    void termometro()//constructor principal
    {
    }

    //getters and setters de los atributos

    public int getTemperatura()
    {
        return temperatura;
    }

    public void setTemperatura(int t)
    {
        this.temperatura = this.temperatura + t;
    }


}
