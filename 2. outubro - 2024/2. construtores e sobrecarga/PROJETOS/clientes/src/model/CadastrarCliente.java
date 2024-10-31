/* Elabore um programa para cadastro de clientes com métodos sobrecarregados
“cadastrarCliente()” que permitam a criação de perfis com: i) nome e idade; 
ii) nome, idade e e-mail. */

package model;

public class CadastrarCliente {
    private String nome;
    private String email;
    private int idade;

    public CadastrarCliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public CadastrarCliente(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        nome = nome;
    }

    public void setEmail(String email) {
        email = email;
    }

    public void setIdade(int idade) {
        idade = idade;
    }

}
