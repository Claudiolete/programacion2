import java.util.ArrayList;

public class Prueba
{
    private Preguntas pregunta;
    private ArrayList <Preguntas> preguntas;
    private ArrayList<String> prueba;

    public Prueba ()
    {
        preguntas = new ArrayList<Preguntas>();
        pregunta = new Preguntas();
    }

    public ArrayList<Preguntas> getPreguntas()
    {
        return preguntas;

    }

    public void setPreguntas(ArrayList<Preguntas> preguntas)
    {
        this.preguntas = preguntas;
    }

    public void agregarPreguntas()
    {
        int indice = 0;
        String algo ;
        for(int i = 0 ; i<5 ; i++)
        {
            indice = (int) (Math.random() * 7) + 1;
            algo = pregunta.getPreguntas().get(indice);
            this.prueba.add(algo);
        }

    }

    public void mostrarArreglo()
    {
        for ( String j : prueba )
        {
            System.out.println(j);
        }

    }




}
