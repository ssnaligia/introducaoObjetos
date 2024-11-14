package com.anali.sistema.model;

public class Senha {
    private String senha = "";
    private Login login;

    public Senha(Login login) {
        this.login = login;
        this.senha = letraA(login);
        this.senha = this.senha.concat(letraB(login));
        this.senha = this.senha.concat(letraC(login));
    }

    public String letraA(Login login) {
        String primeira = login.getNomeUm().substring(0, 1);
        String ultima = login.getNomeUm().substring(login.getNomeUm().length() - 1);
        return primeira + ultima;
    }

    public String letraB(Login login) {
        String nome = login.getNomeDois();
        int metade = nome.length() / 2;

        if (nome.length() % 2 == 0) {
            return nome.substring(0, metade);
        } else {
            return nome.substring(0, metade + 1);
        }
    }

    public String letraC(Login login) {
        String nome = login.getNomeTres();
        StringBuilder maiuscula = new StringBuilder();

        for (int i = 0; i < nome.length(); i++) {
            if (i % 2 != 0) {
                maiuscula.append(Character.toUpperCase(nome.charAt(i)));
            }
        }
        return maiuscula.toString();
    }

    public String getSenha() {
        return senha;
    }

    public Login getLogin() {
        return login;
    }
}
