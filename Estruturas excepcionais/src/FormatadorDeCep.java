public class FormatadorDeCep {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23.765-064");
        } catch (CepException e) {
           System.out.println("O cep não corresponde a regras de negócio"); 
           
        }
    }
    static String formatarCep(String cep) throws CepException {
        if(cep.length() != 8)
        throw new CepException();

        return "23.765-064";
    }
}