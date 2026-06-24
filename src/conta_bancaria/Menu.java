package conta_bancaria;

import java.util.*;

import conta_bancaria.controller.ContaController;
import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {
	private static final Scanner leia = new Scanner(System.in);
	private static final ContaController contaController = new ContaController();

	public static void main(String[] args) {

		int opcao;

		criarContasTeste();

		while (true) {
			System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_GREEN_BACKGROUND);
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                    BANCO BRAT                       ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			System.out.print(Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
				leia.nextLine();
			} catch (InputMismatchException e) {
				opcao = -1;
				System.err.println("Digite um número inteiro entre 0 e 8");
			}

			if (opcao == 0) {
				System.out.println("\nBanco Brat - O seu Futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.ANSI_GREEN_BACKGROUND + Cores.TEXT_BLACK_BOLD
						+ "                    Criar Conta                      \n");
				cadastrarConta();
				keyPress();
				break;

			case 2:
				System.out.println(Cores.ANSI_GREEN_BACKGROUND + Cores.TEXT_BLACK_BOLD
						+ "              Listar todas as Contas                 \n");
				listarContas();
				keyPress();
				break;

			case 3:
				System.out.println(Cores.ANSI_GREEN_BACKGROUND + Cores.TEXT_BLACK_BOLD
						+ "        Consultar dados da Conta - por número        \n");
				keyPress();
				break;

			case 4:
				System.out.println(Cores.ANSI_GREEN_BACKGROUND + Cores.TEXT_BLACK_BOLD
						+ "             Atualizar dados da Conta                \n");
				keyPress();
				break;

			case 5:
				System.out.println(Cores.ANSI_GREEN_BACKGROUND + Cores.TEXT_BLACK_BOLD
						+ "                 Apagar a Conta                      \n");
				keyPress();
				break;

			case 6:
				System.out.println(Cores.ANSI_GREEN_BACKGROUND + Cores.TEXT_BLACK_BOLD
						+ "                    Saque                            \n");
				keyPress();
				break;

			case 7:
				System.out.println(Cores.ANSI_GREEN_BACKGROUND + Cores.TEXT_BLACK_BOLD
						+ "                   Depósito                         \n");
				keyPress();
				break;

			case 8:
				System.out.println(Cores.ANSI_GREEN_BACKGROUND + Cores.TEXT_BLACK_BOLD
						+ "         Transferência entre Contas                 \n");
				keyPress();
				break;

			default:
				System.out.println(Cores.ANSI_GREEN_BACKGROUND + Cores.TEXT_BLACK_BOLD
						+ "             \nOpção Inválida!                      \n");
				keyPress();
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Nayara");
		System.out.println("Nayara Porto - bastosnayara24@gmail.com");
		System.out.println("github.com/nayarabastos           ");
		System.out.println("*********************************************************");

	}

	public static void keyPress() {
		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
		leia.nextLine();
	}

	public static void criarContasTeste() {
		contaController.cadastrar(
				new ContaCorrente(contaController.gerarNumero(), 456, 1, "Thuany Silva", 1000000.00f, 100000.00f));
		contaController.cadastrar(
				new ContaPoupanca(contaController.gerarNumero(), 456, 2, "Marcia Condarco", 1000000.00f, 10));
	}

	public static void listarContas() {
		contaController.listarTodas();
	}

	public static void cadastrarConta() {
		System.out.println("Digite o número da agência: ");
		int agencia = leia.nextInt();

		System.out.println("Digite o nome do Titular da Conta: ");
		leia.skip("\\R");
		String titular = leia.nextLine();

		System.out.println("Digite o tipo da conta: ");
		int tipo = leia.nextInt();

		System.out.println("Digite saldo da conta: ");
		float saldo = leia.nextFloat();

		switch (tipo) {
		case 1 -> {
			System.out.println("Digite o limite da conta: ");
			float limite = leia.nextFloat();

			contaController
					.cadastrar(new ContaCorrente(contaController.gerarNumero(), agencia, tipo, titular, saldo, limite));
		}
		case 2 -> {
			System.out.println("Digite o dia do aníversário da conta: ");
			int aniversario = leia.nextInt();

			contaController.cadastrar(
					new ContaPoupanca(contaController.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
		}
		default -> System.out.println(Cores.TEXT_RED + "Tipo de conta inválida " + Cores.TEXT_RESET);
		}

	}

}
