import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        Termometro t1,t2;
        int x,y,agitaciones,n, total;


        agitaciones = 2;//comienza en dos porque hay que agitar dos veces el termometro
        n = 0;
        total = 0;

        t1 = new Termometro();
        t2 = new Termometro();

        System.out.println("La temperatura debe estar entre 35 y 40");

        System.out.println("ingrese la temperatura  ");
        Scanner scannert1 = new Scanner(System.in);//Scan de la primera temperatura
        x = scannert1.nextInt();
        t1.setTemperatura(x);//Lo almaceno en el objeto t1 en el atributo temperatura

        for(int i = 0 ; i<2 ; i++)//ciclo que va hasta 2 porque son el numero de agitadas
        {
            System.out.println("ingrese 0 para agitar el termometro");
            Scanner scanneragitadas = new Scanner(System.in);
            n = scanneragitadas.nextInt();

            agitaciones = agitaciones -1;//resto 1 cada vez que ingresa 0

            if (agitaciones == 0)//si las agitadas son iguales a 0 se pueden medir de nuevo
            {
                System.out.println("Ingrese la segunda medida");
                Scanner scannert2 = new Scanner(System.in);
                y = scannert1.nextInt();
                t2.setTemperatura(y);//Lo almaceno en el objeto t2 en el atributo temperatura
            }


        }

        total =( t1.getTemperatura()+t2.getTemperatura())/2;//Hago el calculo de la media
        System.out.println("La media de las temperaturas es : " + total);//Hago una impresion del total



    }
}
