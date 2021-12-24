import java.lang.Math;
import java.util.Scanner;
public class Lista1{

    // todas as atividades da lista 1 aqui.
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        /*
        //Faça um Programa que mostre a mensagem "Alo mundo" na tela. - RESOLVIDO
        
        System.out.println("Olá mundo");
        //Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número]. - RESOLVIDO

        System.out.println("Escolha o numero!");
        int numero1=  entrada.nextInt();
        System.out.println(" Seu numero é "+numero1);
        
        //Faça um Programa que peça dois números e imprima a soma.
        System.out.println(" Escolha dois números: ");
        System.out.println(" número1: ");
        int num1 = entrada.nextInt();
        System.out.println(" número2: ");
        int num2 = entrada.nextInt();
        int soma = num1+num2;
        System.out.print("A soma de num1 e num2 é "+soma); 

        //Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        System.out.println("Digite quatro notas ");
        System.out.println("Digite a 1° nota ");
        float bim1 = entrada.nextFloat();
        System.out.println("Digite a 2° nota ");
        float bim2 = entrada.nextFloat();
        System.out.println("Digite a 3° nota ");
        float bim3 = entrada.nextFloat();
        System.out.println("Digite a 4° nota ");
        float bim4 = entrada.nextFloat();
        float media = (bim1 + bim2 + bim3 + bim4)/4;

        System.out.println(" A média anual foi: "+media); 

        //Faça um Programa que converta metros para centímetros.

        System.out.println("Digite quantos metros você quer converter: ");
        int metros = entrada.nextInt();
        int centimetros = metros * 100;
        System.out.println(metros+ " metros têm "+centimetros+" centrimetros");
        
        //Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

        System.out.println("digite o raio do circulo ");
        double raio = entrada.nextDouble();
        double potencia = Math.pow(raio, 2);
        float potenciaResumida = (float) potencia; 
        float pi = 3.14f;
        float area = pi * potenciaResumida;
        System.out.println(" A Area do circulo é de "+area);
        */
        //Faça um Programa que calcule a área de um quadrado, 
        //em seguida mostre o dobro desta área para o usuário.

        System.out.println("Area do Quadrado");
        int lado1 = entrada.nextInt();
        int lado2 = entrada.nextInt();
        int areaQuad = lado1 * lado2;

        System.out.println("A Área do quadrado é "+areaQuad);
        System.out.println("O dobro da Área do quadro é "+areaQuad*2);
        entrada.close();
    }


}
