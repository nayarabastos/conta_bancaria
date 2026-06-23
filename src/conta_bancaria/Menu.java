package conta_bancaria;
import java.util.*;

import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		//Instaciar objs da classe conta
		
		/*Conta c1 = new Conta(1,123,1,"Isabella",200000.00f);
		c1.visualizar();
		
		Conta c2 = new Conta(2,123,2,"Tiago",100000.00f);
		c2.visualizar();
		
		//Alteração do Saldo
		c1.setSaldo(300000.00f);
		c1.setTitular("Isabella Brunoo");
		c1.visualizar();
		
		System.out.println("\nSacar R$ 300.000,00 da conta C2: " +(c2.sacar(300000.00f)?
				"Saque efetuado com sucesso!" : "Saldo Insulficiente"));
		c2.visualizar();
		System.out.println("\nSacar R$ 1.000,00 da conta C2: " +(c2.sacar(1000.00f)?
				"Saque efetuado com sucesso!" : "Saldo Insulficiente"));
		c2.visualizar();
		
		c2.depositar(50000.00f);
		c2.visualizar();
		
		//Inctanciar Objetos da Classe ContaCorrente
		ContaCorrente cc1 = new ContaCorrente(3,789,1,"Raquel",200000.00f,2000.00f);
		cc1.visualizar();
		
		System.out.println("\nSacar R$ 300.000,00 da conta C2: " +(cc1.sacar(203000.00f)?
				"Saque efetuado com sucesso!" : "Saldo Insulficiente"));
		
		System.out.println("\nSacar R$ 300.000,00 da conta C2: " +(cc1.sacar(202000.00f)?
				"Saque efetuado com sucesso! | Saldo: " +cc1.getSaldo() : "Saldo Insulficiente"));
		
		
		cc1.depositar(2000.00f);
		cc1.visualizar();*/
		
		ContaPoupanca cp1 = new ContaPoupanca(4, 666, 2, "Nayara",1000000.00f,23);
		cp1.visualizar();
		
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
