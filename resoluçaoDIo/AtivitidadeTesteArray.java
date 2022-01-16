import java.util.Scanner;
public class AtivitidadeTesteArray {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        // Pecorrendo o Array;
        int [] teste = new int [4];
        System.out.println("Insira um novo número");
        int num = 0;
        int i = 0;
        /*
        while(i <= teste.length-1){
            num= entrada.nextInt();
            teste[i]= num;
            System.out.println(teste[i]+" Aqui "+i++);
            System.out.println(teste[i]);
        }
        */
        for( i = 1 ; i < teste.length; i++){
            System.out.println("Teste" +i);
            num = entrada.nextInt();
        }
        i++;
        System.out.println(" Print Resultado"+ teste[i]);
        System.out.println(" Print Resultado"+ teste[i]);
        System.out.println(" Print Resultado"+ teste[i]);


        
        entrada.close();
    }
    
}
