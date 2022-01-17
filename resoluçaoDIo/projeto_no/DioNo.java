package projeto_no;
// Criamos uma class nó do tipo generica.
public class DioNo<T> {
    private T conteudo;
    private DioNo<T> proximoNo;

    public DioNo(T conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }
    
    public T getConteudo(){
        return conteudo;
    }
    public void setConteudo(T conteudo){
        this.conteudo = conteudo;
    }

    public DioNo<T> getProximoNo(){
        return proximoNo;
    }
    public void setProximoNo(DioNo<T>proxiNo){
        this.proximoNo = proxiNo;
    }

    @Override
    public String toString(){
        return "No{" + "conteudo"+ conteudo+ '\'' + '}' ;
    }
}
