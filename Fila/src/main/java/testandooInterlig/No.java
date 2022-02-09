package testandooInterlig;

public class No {
    private Object objeto; // na linguagem java.lang esse atributo aborda todos os objetos.
    private No refNo;

    public No() {
    }

    public No(Object objeto) {
        this.refNo = null;
        this.objeto = objeto;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "objeto=" + objeto +
                '}';
    }
}

