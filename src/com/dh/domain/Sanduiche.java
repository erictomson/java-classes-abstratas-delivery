package com.dh.domain;

import java.util.ArrayList;
import java.util.List;

public class Sanduiche extends Lanche {

    // private String[] ingredientes = new String[10];
    // Usando ArrayList para maior flexibilidade
    private List<String> ingredientes = new ArrayList<>();

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
