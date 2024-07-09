package apps;
public abstract class ServicoMensagemInstantanea  {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    public abstract void salvarHistoricoMensagem();
   
    // filhos e classe do mesmo pacote conhecem o método
    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
}
