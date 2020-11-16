package br.cursoemvideo.poo.class5;

public class Bank {
	public int numConta;
	protected String tipoConta;
	private String responsavel;
	private float saldo;
	private boolean status;
	
	public Bank(String responsavel) {
		setResponsavel(responsavel);
		setNumConta(getNumConta() + 1);
		setSaldo(0f);
		setStatus(false);
		System.out.println("\nParab�ns " + responsavel + " Voc� acaba de abrir uma conta no banco NILBA!!!");
		System.out.println("_____________________________________");
		
	}
	
	public void abrirConta(String tipo) {
			if ((tipo.intern() == "CC" || tipo.intern() == "cc") && !isStatus()) {
				setSaldo(getSaldo() + 50f);
				setStatus(true);
				setTipoConta("Conta Corrente");
				System.out.println("\nConta Corrente aberta com sucesso!!");
			} else if ((tipo.intern() == "CP" || tipo.intern() == "cp") && !isStatus()) {
				setSaldo(getSaldo() + 150f);
				setStatus(true);
				setTipoConta("Conta Poupan�a");
				System.out.println("\nConta Poupan�a aberta com sucesso!!");
			} else {
				System.out.println("****Tipo de conta incorreto!!!****\nPor gentileza escolha entre:\n CC - Conta Corrente\nCP - Conta Poupan�a");
			}
	}
	
	public void fecharConta(int numConta) {
		if(getSaldo() == 0f) {
			setStatus(false);
			System.out.println("Sua conta foi encerrada com sucesso!!!");
		} else if (getSaldo() > 0f) {
			System.out.println("Sua conta est� com saldo positivo!!!\nSaldo atual: " + getSaldo() + "\nFavor sacar restante do saldo anter de encerrar conta!");
		} else {
			System.out.println("Sua conta est� com saldo negativo!!!\nSaldo atual: " + getSaldo() + "\nFavor acertar saldo anter de encerrar conta!");
		}
	}
	
	public void depositar(float valor) {
		if (isStatus()) {
			setSaldo(getSaldo() + valor);
			System.out.println("Foi depositado: " + valor + "\nSaldo atual: " + getSaldo());
		} else {
			System.out.println("***Sua conta se encontra com sutua��o encerrada***\nN�o � poss�vel depositar!");
		}
	}
	
	public void sacar(float valor) {
		if (isStatus() && getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			System.out.println("Voc� est� sacando: " + valor + "\nValor atual em conta: " + getSaldo());
		} else {
			System.out.println("Voc� est� com saldo insuficiente para saque!!!");
		}
	}
	
	public void cobrarMensalidade() {
		if(isStatus() && getTipoConta() == "CC") {
			setSaldo(getSaldo() - 12f);
			System.out.println("Foi cobrado a mensalidade da conta no valor de: R$12,00\nValor total: " + getSaldo());
		} else if (isStatus() && getTipoConta() == "CP") {
			setSaldo(getSaldo() - 20f);
			System.out.println("Foi cobrado a mensalidade da conta no valor de: R$20,00\nValor total: " + getSaldo());
		}
		
	}
	
	public void statusAtual() {
		System.out.println("********Status atual da conta********");
		System.out.println("Respons�vel: " + getResponsavel());
		System.out.println("Numero da conta: " + getNumConta());
		if(getTipoConta() == null) {
			System.out.println("Tipo de conta: Sem tipo");
		} else {
			System.out.println("Tipo de conta: " + getTipoConta());
		}
		System.out.println("Saldo: R$" + getSaldo());
		if (isStatus()) {
			System.out.println("Status: Aberta");
		} else {
			System.out.println("Status: Fechada");
		}
		
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
