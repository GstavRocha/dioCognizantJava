public class Fila {
    private No refNoEntradaFila;

    public Fila(){
        this.refNoEntradaFila = null;

    }

    //Método enqueue ( Enfileirar);
    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }
    //Método First = Primeiro que entra é o primeiro que sai.

    public No first(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();

                }else{
                    break;

                }
            }
        }
        return null;
    }
    //Método Desenfileirar = Ele é uma variação do método First;
    public No dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();

                }else{
                    noAuxiliar.setRefNo(null);
                    break;

                }
                return primeiroNo;
            }
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null? true : false;
    }

@Override
public String toString(){
    String stringRetorno = "";
    No noAuxiliar = refNoEntradaFila;

    if(refNoEntradaFila != null){
        while(true){
            stringRetorno += "[no{obejto"+noAuxiliar.getObjeto() +"}] ---->";           
            if(refNoEntradaFila != null){
                noAuxiliar = noAuxiliar.getRefNo();
                
            }else{
                stringRetorno += "null";
                break;
            }
        }
    }else{
        stringRetorno = "null";
    }
    return stringRetorno;
}
}
