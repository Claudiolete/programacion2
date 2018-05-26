import java.util.ArrayList;

public class Historial
{
    private ArrayList <Auto> autos_arrendados = new ArrayList<Auto>();

    public ArrayList<Auto> getAutos_arrendados()
    {
        return autos_arrendados;
    }

    public void setAutos_arrendados(ArrayList<Auto> autos_arrendados)
    {
        this.autos_arrendados = autos_arrendados;
    }

    public void Agregar_autos(Auto auto)
    {
        this.autos_arrendados.add(auto);
    }
}
