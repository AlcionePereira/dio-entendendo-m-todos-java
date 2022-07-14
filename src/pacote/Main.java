package pacote;

public class Main {

    public static void main(String[] args) {
        //Calculadora

        Calculadora2.soma(3,6);
        Calculadora2.subtracao(9, 1.8);
        Calculadora2.multitplicacao(7,8);
        Calculadora2.divisao(5, 2.5);

        //Mensagens
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Emprestimo
        System.out.println("Exercício emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(100, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
