import java.util.Scanner;
public class ConsoantesDio {
    /*
    Faça um programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. 
    Imprima as consoantes.

     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] consoantes = new String[6];
        
        int quantidadeConsoa = 0;
        int count = 0;
        do{
            System.out.println(" Letra: ");
            String letra = scanner.next();
            if (!(letra.equalsIgnoreCase("a") | 
                    letra.equalsIgnoreCase( "e")| 
                    letra.equalsIgnoreCase( "i") | 
                    letra.equalsIgnoreCase( "o") | 
                    letra.equalsIgnoreCase( "u"))){

                    consoantes[count] = letra;
                    quantidadeConsoa++;
                };
            count++;
            
        }while(count < consoantes.length);

        System.out.println("Consoantes : ");
        for(String consoant: consoantes ){

            if( consoant != null){
            System.out.print(consoant + " ");
            }
        }
        System.out.println(" Quantidade de consoantes: "+ quantidadeConsoa);
        scanner.close();
        
    }
}
