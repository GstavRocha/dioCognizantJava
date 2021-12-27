import java.util.Scanner;
public class DioExerc2loops {
    public static void main(String[] args){
        /* 
        Faça um programa que peça uma nota entre zero e dez.
        Mostre uma mensagem caso o número seja invalido e 
        continue pedindo até que o usuário informe um valor válido.
        */
        Scanner scan = new Scanner (System.in);
        
        
        System.out.println("Digite sua nota.");
        int nota = scan.nextInt();
        while(nota < 0 || nota > 10){
            System.out.println("Nota Inválida! Digite outra vez.");
            nota = scan.nextInt();
        }

        System.out.println(nota + " é uma nota válida");
        
        scan.close();

        
    }
}
