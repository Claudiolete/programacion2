import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Taximetro taxi;
        int kilometros,tiempo;

        taxi = new Taximetro(500,0,0,0);

        System.out.println("ingrese los kilometros recorridos ");
        Scanner scannerkilo = new Scanner(System.in);
        kilometros = scannerkilo.nextInt();
        taxi.setKilometros(kilometros);

        System.out.println("ingrese el tiempo transcurrido ");
        Scanner scannertiempo = new Scanner(System.in);
        tiempo = scannertiempo.nextInt();
        taxi.setTiempo(tiempo);

        System.out.println("El total a pagar es: " + total());
    }
}
