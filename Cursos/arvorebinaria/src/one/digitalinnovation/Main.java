package one.digitalinnovation;

import one.digitalinnovation.model.Obj;

public class Main {


    public static void main(String[] args) {
        
        ArvoreBinaria<Obj> minhArvoreBinaria = new ArvoreBinaria<>();

        minhArvoreBinaria.inserir(new Obj(13));
        minhArvoreBinaria.inserir(new Obj(10));
        minhArvoreBinaria.inserir(new Obj(5));
        minhArvoreBinaria.inserir(new Obj(2));
        minhArvoreBinaria.inserir(new Obj(12));
        minhArvoreBinaria.inserir(new Obj(20));
        minhArvoreBinaria.inserir(new Obj(31));
        minhArvoreBinaria.inserir(new Obj(29));

        minhArvoreBinaria.exibirInOrdem();
        minhArvoreBinaria.exibirPreOrdem();
        minhArvoreBinaria.exibirPosOrdem();
    }
}
