public class ResultadoEscolar {
  public static void main(String[] args) {
    int nota = 6;
    int nota2 = 6;
    int nota3 = 6;
    int nota4 = 6;
    int resultadoo = (nota + nota2 + nota3 + nota4) / 4 ;

    String resultado = resultadoo >=7 ? "Aprovado " : resultadoo == 6 ? "Recuperação " : "Reprovado ";
    System.out.println(resultado + resultadoo);
  }
}
