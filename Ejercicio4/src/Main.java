import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        Participantes p1,p2,p3;
        int p4,p5,p6,numero;//variables para guardar los numeros ingresados por teclado

        //Instanciacion de los objetos, uno para cada participante
        //el "numero" es cero para que se inicie "vacio"
        p1 = new Participantes("Jibo",0);
        p2 = new Participantes("Martin",0);
        p3 = new Participantes("Arturo",0);


        System.out.println("THINKING GAME");
        System.out.println("Los numeros deben ser de 1 a 10 \n");


        System.out.println("ingrese el numero para " + p1.getNombre());
        Scanner scannerp1 = new Scanner(System.in);
        p4 = scannerp1.nextInt();//variable que almacena el valor ingresado por teclado
        p1.setNumero(p4);//set del numero del participante 1 en el objeto p1
        System.out.println("el numero de " + p1.getNombre() + " es: " + p1.getNumero() + "\n");

        System.out.println("ingrese el numero para " + p2.getNombre());
        Scanner scannerp2 = new Scanner(System.in);
        p5 = scannerp2.nextInt();//variable que almacena el valor ingresado por teclado
        p2.setNumero(p5);//set del numero del participante 2 en el objeto p2
        System.out.println("el numero de " + p2.getNombre() + " es: " + p2.getNumero() + "\n");

        System.out.println("ingrese el numero para " + p3.getNombre());
        Scanner scanner = new Scanner(System.in);
        p6 = scanner.nextInt();//variable que almacena el valor ingresado por teclado
        p3.setNumero(p6);//set del numero del participante 3 en el objeto p3
        System.out.println("el numero de " + p3.getNombre() + " es: " + p3.getNumero() + "\n");

        numero = (int) (Math.random() * 10) + 1;//codigo sacado de internet de la pagina stackoverflow.com



        if(p1.getNumero() == numero)
        {
            System.out.println("El ganador es: " + p1.getNombre());//comparacion del numero del participante 1
        }

        if(p2.getNumero() == numero)
        {
            System.out.println("El ganador es: " + p2.getNombre());//comparacion del numero del participante 2
        }

        if(p3.getNumero() == numero)
        {
            System.out.println("El ganador es: " + p3.getNombre());//comparacion del numero del participante 3
        }

            else
            {
                System.out.println("No hay ganador");
            }

        System.out.println("El numero del computador fue " + numero);

    }
}
