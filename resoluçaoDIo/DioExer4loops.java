import java.util.Scanner;
public class DioExer4loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Faça um programa que peça N números inteiros,
        calcule e mostre a quandide de números pares 
        e a quantidade de números impares.
        */
        
        System.out.println("Quantidade de números: ");
        int quantiNumeros = scanner.nextInt();
        int contador = 0;
        int numero; 
        int numPares = 0;
        int numImpares = 0;
          
        while(contador < quantiNumeros){
            System.out.println("número: ");
            numero = scanner.nextInt();
            if( contador % 2 == 0) numPares++;
            else numImpares++;
            contador++;
        }
        scanner.close();
        System.out.println("Quantidade pares "+numPares);
        System.out.println("Quantidade impares "+numImpares);
    }
}
