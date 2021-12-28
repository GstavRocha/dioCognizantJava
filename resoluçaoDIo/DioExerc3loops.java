import java.util.Scanner;
public class DioExerc3loops {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
        Faça um programa que leia 5 numeros;
        * Informe o maior numero;
        * Informe a média desses números;
        */
        int numero;
        int maior = 0;
        
        int soma = 0;

        int conta = 0;
        do{
            System.out.println("Numero: ");
            numero = entrada.nextInt();
            soma = soma + numero;
            if( numero > maior) maior = numero;
            conta = conta +1;
        }while(conta < 5);

        entrada.close();
        System.out.println("Maior numero "+maior);
        System.out.println("Media "+soma/5);
    }
}
