public class AtribuicaoReferencia{

    public static void main(String[] args) {
        int a = 1;
        int b = a;

        MeuObj A = new MeuObj(1);
        MeuObj B = A;
        System.out.println("int b = "+A+" int b = "+B);
        a = 3;
        System.out.println("int a = "+a+" int b = "+b);
        System.out.println("obj a = "+A+" obj b = "+B);
        A.setNum(2);
    }

}
