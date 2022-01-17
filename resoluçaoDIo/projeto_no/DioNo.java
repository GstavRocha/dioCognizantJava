package projeto_no;

public class DioNo {
    private String conteudo;
    private DioNo proximoNo;

    public DioNo(String conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }
    
    public String getConteudo(){
        return conteudo;
    }
    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }

    public DioNo getProximoNo(){
        return proximoNo;
    }
    public void setProximoNo(DioNo proxiNo){
        this.proximoNo = proxiNo;
    }

    @Override
    public String toString(){
        return "No{" + "conteudo"+ conteudo+ '\'' + '}' ;
    }
}
