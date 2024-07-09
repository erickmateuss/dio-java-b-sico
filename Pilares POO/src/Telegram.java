public class Telegram extends ServicoMensagemInstantanea {
    private void validarConectadoInternet() {        
        System.out.println("Validando se está conectado a internet");
    }
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Telegram Messenger");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram Messenger");
    }
    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }

}
