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
    
        //Faça um Programa que calcule a área de um quadrado, 
        //em seguida mostre o dobro desta área para o usuário.

        System.out.println("Area do Quadrado");
        int lado1 = entrada.nextInt();
        int lado2 = entrada.nextInt();
        int areaQuad = lado1 * lado2;

        System.out.println("A Área do quadrado é "+areaQuad);
        System.out.println("O dobro da Área do quadro é "+areaQuad*2);
        
        //Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
        //Calcule e mostre o total do seu salário no referido mês.
        System.out.println("Quanto você ganha por hora? ");
        float horaValor = entrada.nextFloat();
        System.out.println("Quantas horas você trabalha por semana? ");
        int horasTrabalhadas = entrada.nextInt();
        int valorSemana = (int)horaValor * horasTrabalhadas;
        int valorPmes = valorSemana*4;
        System.out.println("Você ganha "+valorSemana+" por semana e "+valorPmes+" por mês.");
        
        //Faça um Programa que peça a temperatura em graus Fahrenheit,
        //transforme e mostre a temperatura em graus Celsius.
        //C = 5 * ((F-32) / 9).
        System.out.println("informe a temperatura em Fahrenheit");
        int fahrenheit = entrada.nextInt();
        int celsius = ((fahrenheit-32)*5)/9;
        double celsiusflo = (double)celsius;
        System.out.println("A temperatura de "+fahrenheit+" é igual a "+celsiusflo+" em celsuis.");
        //Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
        System.out.println("informe a temperatura em celsius");
        double cels = entrada.nextDouble();
        double fahren = ((cels * 9)/5)+32;
        System.out.println("A temperatura de "+cels+"em celsius é igual a "+fahren+" em fahrenheit.");
        */

        /*Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:

            a) O produto do dobro do primeiro com metade do segundo.

            formula;
            2x + number1 = number / 2
            x = produto. 

            b) A soma do triplo do primeiro com o terceiro.

            formula:
            3* number1 + real = resultado 
            
            c) O terceiro elevado ao cubo.
            real ** 3
        */
        System.out.println("Digite o primeiro número inteiro ");
        int number1 = entrada.nextInt();
        System.out.println("Digite o segundo número inteiro");
        int number2 = entrada.nextInt();
        System.out.println("Digite o numero real ");
        double  real = entrada.nextDouble();
        int metade = number2/2;
        int produto = number1*2*metade;
        System.out.println("O primeiro numero foi "+number1);
        System.out.println("O segundo numero foi "+number2);
        System.out.println("O terceiro numero foi "+real);
        System.out.println("a) O produto do dobro do primeiro com metade do segundo. Resposta "+produto);
        int somaB = (number1 * 3)+ (int)real;
        System.out.println("b) A soma do triplo do primeiro com o terceiro. Resposta "+somaB);
        double triplo = Math.pow(real, 3);
        System.out.println("c) O terceiro elevado ao cubo. Resposta "+triplo);
        entrada.close();
    }


}
