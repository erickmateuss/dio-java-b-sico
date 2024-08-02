package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minListaCircular = new ListaCircular<>();

        minListaCircular.add("C0");
        System.out.println(minListaCircular);

        minListaCircular.remove(0);
        System.out.println(minListaCircular);

        minListaCircular.add("C1");
        minListaCircular.add("C2");
        minListaCircular.add("C3");
        minListaCircular.add("C4");

        System.out.println(minListaCircular);

        System.out.println(minListaCircular.get(0));

        for(int i = 0; i < 10; i++){
            System.out.println(minListaCircular.get(i));
        }
    }
}
