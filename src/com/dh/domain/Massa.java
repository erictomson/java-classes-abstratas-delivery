package com.dh.domain;

import java.util.Arrays;
import java.util.List;

public class Massa extends Lanche {

    private final static int TEMPO_PREPARO = 30;

    public final static List<String> CARDAPIO_DE_MASSAS = Arrays.asList("MACARRÃO","PIZZA","LASANHA");

    private String molho;
    private String tipo;

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
