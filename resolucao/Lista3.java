import java.util.Scanner;
public class Lista3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o denominador: ");
        int denominador = scan.nextInt();
        for( int i = 1; i <= 10; i++){
            int multi = i*denominador;
            System.out.println(denominador+" X "+i+" = "+multi);
        }

        scan.close();
        
        
    }
}
