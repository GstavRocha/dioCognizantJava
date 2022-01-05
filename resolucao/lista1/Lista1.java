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
    

        Tendo como dados de entrada a altura de uma pessoa,
        construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

        System.out.println(" Informe sua altura: ");
        double altura = entrada.nextDouble();
        double pesoIdeal = (72.7 * altura)-58;
        System.out.println(" Seu peso ideal é "+(float)pesoIdeal);
        */
        /*Tendo como dado de entrada a altura (h) de uma pessoa, 
        construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
        Para homens: (72.7*h) - 58
        Para mulheres: (62.1*h) - 44.7
        
        System.out.println(" Informe sua altura: ");
        double tamanho = entrada.nextDouble();
        System.out.println(" Informe sua sexo( letras minusculas.): ");
        char sexo = entrada.next().charAt(0);
        char homem = 'h';
        char mulher = 'm';
        
        if( mulher == sexo){
            double imcIdealmulher = (62.1 * tamanho) - 44.7;
            System.out.println(" sexo é M");
            System.out.println(" Seu peso ideal é "+imcIdealmulher);
        } else if( homem == sexo){
            double imcIdealhomem = (72.7 * tamanho) - 58;
            System.out.println(" sexo é H");
            System.out.println(" Seu peso ideal é "+imcIdealhomem);
        }else{
            System.out.println("Você digitou "+sexo+" Porém, escolha apenas entre H para Homem e M para mulheres.");
        }
        */
        /*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o 
        rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior 
        que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos)
        deve pagar uma multa de R$ 4,00 por quilo excedente.
        João precisa que você faça um programa que leia a variável peso (peso de peixes) 
        e calcule o excesso.
        Gravar na variável excesso a quantidade de quilos além
        do limite e na variável multa o valor da multa que João deverá pagar.
        Imprima os dados do programa com as mensagens adequadas. 
        
        ANALISE: 
        Condição se peixes < 50 kilos então peixes * 4,00 R$
        Variáveis:
        pesoPeixes = Kilos dos peixes pescados;
        excesso = Quantidade de kilos além do 50 kilos ( preferêncialmente imprimir a diferença);
        Saida: João pescou pesoPeixes se pesoPeixes < 50 kilos = pesoPeixes * 4 printar excesso - 50kilos; Senão = 
        printar = pesoPeixe e a mensagem: Não utrapassou o limite permitido. 
        
        System.out.println(" Digite peso total dos peixes em kilos");
        int pesoPeixes = entrada.nextInt();
        int limite = 50;
        int excesso = pesoPeixes - limite;
        if(pesoPeixes > limite){
            System.out.println("Você excedeu o limite tolerável de 50 kilos");
            double multa = (float) excesso * 4.00;
            System.out.println("Utrpassando "+excesso+" kilos, será adicionado R$ 4,00 para cada kilo deverá pagar: R$"+multa+" no Total"); 
        }else{
            System.out.println("Você não excedeu o limite tolerável de 50 kilos");
            System.out.println("Com o total de "+pesoPeixes+" Kilos");
        }
        */
        /*
        Faça um Programa que pergunte quanto você ganha por hora 
        e o número de horas trabalhadas no mês. Calcule e mostre o 
        total do seu salário no referido mês, sabendo-se que são 
        descontados 11% para o Imposto de Renda, 8% para o INSS 
        e 5% para o sindicato, faça um programa que nos dê:
        salário bruto.
        
        quanto pagou ao INSS.
        quanto pagou ao sindicato.
        o salário líquido.
        calcule os descontos e o salário líquido, conforme a tabela abaixo:
        + Salário Bruto : R$
        - IR (11%) : R$
        - INSS (8%) : R$
        - Sindicato ( 5%) : R$
        = Salário Liquido : R$
        Obs.: Salário Bruto - Descontos = Salário Líquido.


        System.out.println("Quanto você ganha por hora? ");
        float hora_Valor = entrada.nextFloat();
        System.out.println("Quantas horas você trabalha por semana? ");
        int horas_Trabalhadas = entrada.nextInt();
        int valor_Semana = (int)hora_Valor * horas_Trabalhadas;
        double valor_Pmes = valor_Semana*4;

        //impostos
        double impostoDrenda = (11 * valor_Pmes)/100;
        double inss = (8 * valor_Pmes)/100;
        double sindicato = (5 * valor_Pmes)/100;
        double medidor = valor_Pmes *12;
        double condicao = 30.000;
        double descontos = valor_Pmes - inss - sindicato;
        float rendaLiquida= (float)descontos;
        if (medidor > condicao){
            float rendaLiquidaCdescont = (float)descontos - (float)impostoDrenda;
            System.out.println("_________________________________________________________");
            System.out.println("| Sálario bruto:            "+valor_Pmes+"              ");
            System.out.println("| Imposto de Renda:        -"+impostoDrenda+"           ");
            System.out.println("| Sindicato:               -"+sindicato+"               ");
            System.out.println("| INSS                     -"+inss+"                    ");
            System.out.println("| Salário Liquído          -"+rendaLiquidaCdescont+"    ");
            System.out.println("|_______________________________________________________");
        }else{
            System.out.println("_________________________________________________________");
            System.out.println("| Sálario bruto:            "+valor_Pmes+"              ");
            System.out.println("| Sindicato:               -"+sindicato+"               ");
            System.out.println("| INSS                     -"+inss+"                    ");
            System.out.println("| Salário Liquído          -"+rendaLiquida+"            ");
            System.out.println("|_______________________________________________________");

        }
        */
        /*
        Faça um programa para uma loja de tintas. 
        O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 1°ENTRADA;
        Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados CONDIÇÃO.
        e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. PREÇO TINTA LATA;
         
        Informe ao usuário
        a quantidades de latas de tinta a serem compradas e o preço total. SAIDA

        
        Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
        SAIDA: comprar apenas latas de 18 litros;
        SAIDA: comprar apenas galões de 3,6 litros;
        SAIDA: misturar latas e galões, de forma que o desperdício de tinta seja menor. 
        
        CONDICIONAL: Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
         */

        /*
        Condições: 1 litro de tinta pinta 3 metros quadrados;
        Uma lata de tem 18 litros então pinta 54 metros. Pois 18 X 3 =  54.
        lata de tinta = 80 reaiss
        */

        System.out.println(" Informe o tamanho da  Área que você deseja pintar: ");
        int area = entrada.nextInt();
        int tintaArea= 1 * 3;
        int resultTintaArea = tintaArea * area;
        System.out.println(" Area a ser pintada: "+resultTintaArea+" Metros Quadrados.");
        
        entrada.close();
    }

}
