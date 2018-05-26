import java.util.ArrayList;

public class Estacionamiento
{
    private ArrayList <Auto> estacionamiento = new ArrayList<Auto>();

    public ArrayList<Auto> getEstacionamiento()
    {
        return estacionamiento;
    }

    public void setEstacionamiento(ArrayList<Auto> estacionamiento)
    {
        this.estacionamiento = estacionamiento;
    }

    public void agregar_al_Estacionamiento(Auto auto)
    {
        this.estacionamiento.add(auto);

    }

}
