package classes1;
// Estrutura da dados Dinamica.
public class Pilha {
    private No refnNoEntradaPilha;

    public Pilha(){
        this.refnNoEntradaPilha = null;

    }

    public void push(No novoNo){
        No refAuxiliar = refnNoEntradaPilha;
        refnNoEntradaPilha = novoNo;
        refnNoEntradaPilha.setRefNo(refAuxiliar);
    }
    public No pop(){
        if(this.isEmpty()){
            No noPoped = refnNoEntradaPilha.getRefNo();
            refnNoEntradaPilha = refnNoEntradaPilha.getRefNo();
            return noPoped;

        }
        return null;
    }
    public No top(){
        return refnNoEntradaPilha;
    }
    public boolean isEmpty(){   
        return refnNoEntradaPilha == null? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno ="-------------\n";
        stringRetorno += "  Pilha     \n";
        stringRetorno +="-------------\n";

        No noAuxliar = refnNoEntradaPilha;
        while(true){
            if(noAuxliar != null){
                stringRetorno +="[No{dado="+noAuxliar.getDado()+"}]\n";
                noAuxliar = noAuxliar.getRefNo();

            }else{
                break;
            }
        }
        stringRetorno += "==============\n";
        return stringRetorno;
    }

}

