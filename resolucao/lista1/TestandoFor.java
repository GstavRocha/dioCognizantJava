import java.util.Scanner;
public class TestandoFor {
    public static void main(String[] args) {
        System.out.println("testando o for ");
        Scanner  scan = new Scanner(System.in);
        int num  = scan.nextInt();

        for( int i = 0 ; i < num ; i++){
            System.out.println(" Numero: "+i);
        
        }
        
    }
}
