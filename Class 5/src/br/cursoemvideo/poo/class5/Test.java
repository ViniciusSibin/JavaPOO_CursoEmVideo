package br.cursoemvideo.poo.class5;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean exit = false;
		int menu;
		System.out.println("Para abrir uma conta no banco NILBA digite o nome do respons�vel");
		String responsavel = scan.nextLine();
		Bank conta = new Bank(responsavel);
		
		do {
			System.out.println("\n\n*****Seja bem vindo ao menu do banco Nilba Sr.(�) "+ responsavel + "*****");
			System.out.println("Aqui voc� pode:\n"
					+ "1 - Ativar sua conta\n"
					+ "2 - Encerrar sua conta\n"
					+ "3 - Depositar Dinheiro\n"
					+ "4 - Sacar Dinheiro\n"
					+ "5 - Pagar Mensalidade\n"
					+ "6 - Verificar Status atual da conta\n"
					+ "7 - Encerrar processo\n\n");
			
			System.out.println("Escolha uma op��o do menu digitando o numero do item desejado");
			menu = scan.nextInt();
			switch (menu) {
			case 1: //Ativar a conta
				System.out.println("Para ativar a conta digite um dos seguintes tipos:\n"
						+ "CC - Conta Conrrente\n"
						+ "CP - Conta Poupan�a");
				conta.abrirConta(scan.next());
				break;
			case 2: //Encerrar a conta
				System.out.println("Voc� tem certeza que deseja encerrar a conta de respons�vel: " + conta.getResponsavel());
				String encerrar = scan.nextLine();
				if(encerrar == "sim" || encerrar == "SIM" || encerrar == "S" || encerrar == "s") 
					conta.fecharConta(conta.getNumConta());
				break;
			case 3: //Depositar
				System.out.println("Digite o valor que deseja depositar");
				conta.depositar(scan.nextFloat());
				break;
			case 4: //Sacar
				System.out.println("Digite o valor que deseja sacar");
				conta.sacar(scan.nextFloat());
				break;
			case 5: //Pagar mensalidade
				conta.cobrarMensalidade();
				break;
			case 6:
				conta.statusAtual();
				break;
			case 7:
				System.out.println("Encerrando processo...");
				exit = true;
				break;

			default:
				System.out.println("****Op��o n�o reconhecida****\nSelecione uma op��o que esteja no menu!!!");
				break;
			}
		}while(!exit);
	}
}
