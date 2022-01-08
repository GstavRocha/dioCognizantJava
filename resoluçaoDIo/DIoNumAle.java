import java.util.Scanner;
import java.util.Random;

public class DIoNumAle{
    public static void main(String[] args) {
        Scanner  entrada = new Scanner(System.in);
        Random roda = new Random();

        int[] numAle = new int[20];

        for( int i = 0; i < numAle.length; i++){
            int numero = roda.nextInt(100);
            numAle[i] = numero;
        }
        System.out.println("\n Numeros Aleatórios.");
        for (int numero : numAle) {
            System.out.print(numero+" ");
            
        }
        System.out.println("\n Sucessores.");
        for (int numero : numAle) {
            System.out.print(numero+1+" ");
            
        }
        System.out.println("\n Antecessores");
        for (int numero : numAle) {
            System.out.print(numero-1+" ");
            
        }
    }
}