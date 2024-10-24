package view;

//import model.Calculadora;
import model.Estudante;

public class TestCalculadora {
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante("Ana Ligia", "AQ3029212", 19);
        System.out.println(aluno1.getNome());
    }
}

/*public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora soma = new Calculadora();

        System.out.println(soma.somar(9, 15));
        System.out.println(soma.somar(7.5, 27));
    }
}*/