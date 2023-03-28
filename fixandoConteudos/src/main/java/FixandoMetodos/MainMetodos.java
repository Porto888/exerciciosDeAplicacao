package FixandoMetodos;

public class MainMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Executando calculadora");
		System.out.println(" ");

		Calculadora.soma(3700, 3700);
		Calculadora.subtracao(-2, -2);
		Calculadora.multiplicação(1500, 365);
		Calculadora.divisao(5480, 45);

		System.out.println(" ");

		System.out.println("Os metodos abaixo retornam a mensagen, de acordo com o horário informado");

		Mensagem.obterMensagem(10);

		System.out.println(" ");

		System.out.println("Execução do método emprestimo");
		System.out.println(" ");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(6000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(5000, 10);

	}

}
