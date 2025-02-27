package com.example.passandodadosactivities;

import java.io.Serializable;

//este interface serializable permite que o objeto possa ser convertido em bytes
//sendo possível armazenar e transmitir entre activities
public class Usuario implements Serializable {

    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
