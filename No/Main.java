public class Main {
    public static void main(String[] args) {

        Fila testefila = new Fila();
        testefila.enqueue(new No("Primeiro"));
        testefila.enqueue(new No("segundo"));
        testefila.enqueue(new No("terceiro"));
        testefila.enqueue(new No("quarto"));
        testefila.enqueue(new No("quinto"));

        System.out.println(testefila);
    }
}
