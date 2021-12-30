import java.util.Scanner;
public class DioExer6 {
    
    public static void main(String[] args){
        // faça um programa que calcule o fatorial de um número interio forcido pelo usuário.
        Scanner scan = new Scanner(System.in);
            int fator = 0;
            System.out.println(" Digite um fatorial: ");
            
            fator = scan.nextInt();
            int multiplica = 1;

            System.out.print(fator+"! = ");
            for ( int i = fator; i >= 1; i--){
                multiplica = multiplica * i;
                System.out.print(i+ " . "+i);
            }
            scan.close();
            System.out.print(" = "+multiplica);

    

    }    
}
