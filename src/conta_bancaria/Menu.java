package conta_bancaria;
import java.util.*;

import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		while(true) {
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
				
				opcao = leia.nextInt();
				
				if (opcao == 0) {
					System.out.println("\nBanco Brat - O seu Futuro começa aqui!");
					sobre();
	                 leia.close();
					System.exit(0);
				}
				
				switch (opcao) {
					case 1:
						System.out.println(Cores.ANSI_GREEN_BACKGROUND + Cores.TEXT_BLACK_BOLD+"                    Criar Conta                      \n");
						break;
					
					case 2:
						System.out.println(Cores.ANSI_GREEN_BACKGROUND + Cores.TEXT_BLACK_BOLD+"              Listar todas as Contas                 \n");
						break;
					
					case 3:
						System.out.println(Cores.ANSI_GREEN_BACKGROUND + Cores.TEXT_BLACK_BOLD+"        Consultar dados da Conta - por número        \n");
						break;
					
					case 4:
						System.out.println(Cores.ANSI_GREEN_BACKGROUND + Cores.TEXT_BLACK_BOLD+"             Atualizar dados da Conta                \n");
						break;
					
					case 5:
						System.out.println(Cores.ANSI_GREEN_BACKGROUND + Cores.TEXT_BLACK_BOLD+"                 Apagar a Conta                      \n");
						break;
					
					case 6:
						System.out.println(Cores.ANSI_GREEN_BACKGROUND + Cores.TEXT_BLACK_BOLD+"                    Saque                            \n");
						break;
					
					case 7:
						System.out.println(Cores.ANSI_GREEN_BACKGROUND + Cores.TEXT_BLACK_BOLD+"                   Depósito                         \n");
						break;
					
					case 8:
						System.out.println(Cores.ANSI_GREEN_BACKGROUND + Cores.TEXT_BLACK_BOLD+"         Transferência entre Contas                 \n");
						break;
					
					default:
						System.out.println(Cores.ANSI_GREEN_BACKGROUND + Cores.TEXT_BLACK_BOLD+"             \nOpção Inválida!                      \n");
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

}
