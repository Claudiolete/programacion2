import java.util.Scanner;
public class Hertz
{
    Auto auto;
    Scanner scanner = new Scanner(System.in);
    Estacionamiento lugar = new Estacionamiento();
    Historial historial = new Historial();



    public void crearAutos()
    {
        int i=0;
        while(i<10)
        {
            int indice = 0;
            indice = (int) (Math.random() * 3);
            int kilometros = 0;
            kilometros = (int) (Math.random() * 2000);

            switch (indice)
            {
                case 0: auto = new Auto("Peugeot 207 ",40,kilometros); break;
                case 1: auto = new Auto("Mazda 2 ",20,kilometros); break;
                case 2: auto = new Auto("JeepFull ", 60,kilometros); break;
            }
            this.lugar.agregar_al_Estacionamiento(auto);
            i++;
        }

    }

    public void mostrarAutos()
    {
        int j=1;
        for (Auto i : lugar.getEstacionamiento() )
        {
            System.out.println("Estacionamiento " + j);
            System.out.println("Auto : " + i.getModelo());
            System.out.println("Kilometraje " + i.getKilometraje() + " KM");
            System.out.println("Capacidad de estanque " + i.getCapacidadBencina()+" Lts");
            System.out.println("..................................................");
            j++;

        }
    }

    public void elegirAuto()
    {

        int numero_estacionamiento;
        String usuario,fecha;
        System.out.println("¿Cual auto desea arrendar?(ingrese numero de lugar)");
        numero_estacionamiento = scanner.nextInt();
        System.out.println("Ingrese la fecha de arriendo( en palabras ) ");
        scanner.nextLine();
        fecha = scanner.nextLine();
        System.out.println("Ingrese su nombre");
        usuario = scanner.nextLine();


        while(numero_estacionamiento > 10 || numero_estacionamiento < 0)
        {
            System.out.println("¿Cual auto desea arrendar?(ingrese numero de lugar)");
            numero_estacionamiento = scanner.nextInt();

        }



        numero_estacionamiento = numero_estacionamiento -1;

        System.out.println("El auto que usted escogio es : " + lugar.getEstacionamiento().get(numero_estacionamiento).getModelo());
        System.out.println("Con kilometraje " + lugar.getEstacionamiento().get(numero_estacionamiento).getKilometraje()+ " KM");
        System.out.println("y capacidad de estanque  " + lugar.getEstacionamiento().get(numero_estacionamiento).getCapacidadBencina()+" Lts");

        lugar.getEstacionamiento().get(numero_estacionamiento).setFecha(fecha);
        lugar.getEstacionamiento().get(numero_estacionamiento).setNombre(usuario);



    }







}
