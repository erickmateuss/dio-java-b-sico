public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São Paulo", 35), 
    RIO_JANEIRO ("RJ","Rio de Janeiro", 33 ),
    PIAUI ("PI", "Piaui", 22),
    MARANHAO ("MA", "Maranhão", 21),
    PERNAMBUCO ("PE", "Pernambuco", 26)
    ;

    private String nome;
    private String sigla;
    private int ibge;
    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }
    public String getSigla() {
        return sigla;
    }
    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
    public String getNome() {
        return nome;
    }
    public int getIbge() {
        return ibge;
    }
}
