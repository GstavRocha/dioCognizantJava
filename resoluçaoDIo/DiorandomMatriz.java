import java.util.Random;
public class DiorandomMatriz {
    public static void main(String[] args) {
        Random roda = new Random();

        int [][] matrix = new int [4][4];

        for( int i = 0; i < matrix.length; i++){
            for(int j = 0; j<matrix[i].length;j++){
                matrix[i][j] = roda.nextInt(9);
            }

        }
        System.out.println(" Matriz: ");
        for (int[]linha : matrix) {
            for (int coluna : linha) {
                System.out.print(coluna+ " ");
                
            }
            System.out.println();
            
        }
    }
    
}
