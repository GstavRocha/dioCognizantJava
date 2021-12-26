import java.util.Scanner;
public class DioExer1loops{
    public static void main(String[] args){
        /*Faça um programa que leia um conjuto de dois valores.
        o primeiro representando o nome do aluno e o segundo representando a sua idade.
        (Pare o programa inserindo o valor 0 no campo nome);
        */

        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;

        while(true){
            System.out.println("Nome: ");
            nome = entrada.next();
            if(nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = entrada.nextInt();
        
        }
        entrada.close();
    }

}