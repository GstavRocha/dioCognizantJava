package projeto_no;

public class Main {
    public static void main(String[] args){
        DioNo<String> no1 = new DioNo<>(" Conteudo no1");

        DioNo<String> no2 = new DioNo<>("conteudo No2");

        no1.setProximoNo(no2);

        DioNo<String> no3 = new DioNo<>("Conteudo no3");

        no2.setProximoNo(no3);

        DioNo<String> no4 = new DioNo<>("conteudo No4");

        no3.setProximoNo(no4);

        // Achei irado, mas preciso ver um tipo prático.

        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
        
    }
    
}
