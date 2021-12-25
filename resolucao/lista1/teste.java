import java.util.Scanner;
public class teste {
    public static void main(String[] args){
        Scanner digi = new Scanner(System.in);
        String apurar = digi.next();
        String letraA = "a";
        String letraB = "b";

        System.out.println(letraA+letraB.getClass().getSimpleName());
        digi.close();
        
    }
}
