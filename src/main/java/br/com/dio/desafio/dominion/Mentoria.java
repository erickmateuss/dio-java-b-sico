package br.com.dio.desafio.dominion;

import java.time.LocalDate;

public  class Mentoria extends  Conteudo {

    LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 15d;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data + "h" +
                '}';
    }
}
