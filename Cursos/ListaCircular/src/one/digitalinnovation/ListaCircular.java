package one.digitalinnovation;

public class ListaCircular<T> {


    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular(){
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;

    }

    public void add(T conteudo){
        No<T> novNo = new No<>(conteudo);
        if (this.tamanhoLista == 0) {
            this.cabeca = novNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(cauda);
        }else{
            novNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novNo);
            this.cauda = novNo;
        }
        this.tamanhoLista++;
    }


    public void remove(int index){
        if(index >= this.tamanhoLista)
        throw new IndexOutOfBoundsException("O índice é maior que a Lista!!");
        No<T> noAuxiliar = this.cauda;
        if (index == 0 ) {
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda);
        }else if (index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        }else{
            for(int i = 0; i < index; i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        if(this.isEmpty())
        throw new IndexOutOfBoundsException("A lista está vazia!!");
        if (index == 0) {
            return this.cauda;
        }
        No<T> noAuxiliar = this.cauda;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }
    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String  strRetorno = "";

        No<T> noAuxiliar = this.cauda;
        for(int i = 0; i < this.size(); i++){
            strRetorno += "[No { Conteudo = " + noAuxiliar.getConteudo() + "]}--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno +=  this.size() != 0 ? "(Retorna ao início)" : "[]";
        
        
        return strRetorno; 


    }
}
