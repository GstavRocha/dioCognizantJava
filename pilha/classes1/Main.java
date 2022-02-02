package classes1;

public class Main {
    public static void main(String[] args) {
        Pilha testePilha = new Pilha();
        testePilha.push(new No(1));
        testePilha.push(new No(2));
        testePilha.push(new No(3));
        testePilha.push(new No(4));
        testePilha.push(new No(5));
        testePilha.push(new No(6));
        testePilha.push(new No(7));
        testePilha.push(new No(8));
        
        System.out.println(testePilha);

        System.out.println(testePilha.pop()); // deu erro no pop
        System.out.println(testePilha);

        testePilha.push(new No(99));
        System.out.println(testePilha);
    }
}
