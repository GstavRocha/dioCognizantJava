package testandooInterlig;

public class Fila {
    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }
    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }
    public No first(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while( true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();

                }else{
                    break;
                }
            }
        }
        return  null;
    }
    public No Dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while( true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
        }
        return  null;
    }
    public boolean isEmpty(){
        return  refNoEntradaFila == null? true: false;
    }

    @Override
    public String toString() {
       String stringretorno = "";
       No noAuxiliar = refNoEntradaFila;
       if(refNoEntradaFila != null){
           while(true){
               stringretorno += "[No{objeto="+noAuxiliar.getObjeto() + "}]---->";
               if(noAuxiliar.getRefNo() != null){
                   noAuxiliar = noAuxiliar.getRefNo();
               }else{
                   stringretorno += "null";
                   break;
               }
           }
       }else{
           stringretorno = "null";
       }

       return stringretorno;
    }
}
