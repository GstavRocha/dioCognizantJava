public class DioExer1Arrai {
    public static void main(String[] args){
        /*
        Crie um vetor de 4 numeros inteiros e mostre-os na ordem inversa.
        */
        int[] vetor ={1,3,4,5,7,8,6};

        System.out.print("vetor: ");
        int count = 0;
        while(count <= vetor.length-1){
            System.out.print(vetor[count] + " ");
            count ++;
        }
        for(int i = (vetor.length-1); i >= 0; i--){
            System.out.print(vetor[i]+ " ");
        }
    }

    
}
