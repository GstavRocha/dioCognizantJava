public class No{
    private Object objeto;
    private No refNo;


    //construtor.

    public No(){

    }
    public No (Object objeto){
        this.objeto = objeto;
        this.refNo = null;
    }

    //Gets e Sets

    public void setObjeto(Object objeto){
        this.objeto = objeto;
    }

    public Object getObjeto(){
        return objeto;
    }

    public No getRefNo() {
        return refNo;
    }
    public void setRefNo(No refNo){
        this.refNo = refNo;
    }

    public No getNo(){
        return refNo;
    }

    @Override
    public String toString(){
        return "No{"+"objeto="+objeto+"}";
    }
}