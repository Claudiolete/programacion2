import java.util.ArrayList;

public class Preguntas
{

    private ArrayList <String> preguntas;

    public Preguntas()
    {
        preguntas = new ArrayList<String>();
    }

    public ArrayList<String> getPreguntas()
    {
        return preguntas;
    }

    public void setPreguntas(String[] preguntas)
    {
        this.preguntas.add("¿Cuánto mide x ?");
        this.preguntas.add("¿Qué se obtiene al hacer reaccionar sodio más cloro?");
        this.preguntas.add("¿Cuál es el mamifero más grande de la Tierra? ");
        this.preguntas.add("¿Cómo es el aire en marte? ");
        this.preguntas.add("¿Cómo se obtiene la masa a partir del volumen y la densidad?");
        this.preguntas.add("¿Qué le pasó a Napoleon");
        this.preguntas.add("¿Cuantas horas tiene un día?");
    }
}


