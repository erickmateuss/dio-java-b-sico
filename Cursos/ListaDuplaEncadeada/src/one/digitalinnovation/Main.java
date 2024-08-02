package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {
        

        ListaDuplaEncadeada<String> mListaDuplaEncadeada = new ListaDuplaEncadeada<>();

        mListaDuplaEncadeada.add("c1");
        mListaDuplaEncadeada.add("c2");
        mListaDuplaEncadeada.add("c3");
        mListaDuplaEncadeada.add("c4");
        mListaDuplaEncadeada.add("c5");
        mListaDuplaEncadeada.add("c6");
        mListaDuplaEncadeada.add("c7");
        mListaDuplaEncadeada.add("c8");

        System.out.println(mListaDuplaEncadeada);

        mListaDuplaEncadeada.remove(3);
        mListaDuplaEncadeada.add(3, "c99");

        System.out.println(mListaDuplaEncadeada);
        System.out.println(mListaDuplaEncadeada.get(3));
    }
}
