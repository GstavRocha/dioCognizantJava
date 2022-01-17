import java.util.Scanner;
public class Desafio2 {
    public static void main(String [] args){
        Scanner  entra = new Scanner(System.in);
        System.out.println(" Digite um ddd");
        int ddd = entra.nextInt();

        switch(ddd){
            case 61:
            System.out.println("brasilia");
            break;
            default:
            System.out.println("Opção Invalida");
            break;
        }
        entra.close();
    }   
}
