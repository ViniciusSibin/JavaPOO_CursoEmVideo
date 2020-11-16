package br.cursoemvideo.poo.class6;

public class ControleRemoto implements Controlador{
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		setVolume(50);
		setLigado(false);
		setTocando(false);
	}
	

	@Override
	public void ligar() {
		setLigado(true);
	}


	@Override
	public void desligar() {
		setLigado(false);
	}



	@Override
	public void abrirMenu() {
		if(isLigado()) {
			System.out.println("Ligado: " + isLigado());
			System.out.println("Tocando: " + isTocando());
			volumeFormatado();
		} else {
			System.out.println("Aparelho está desligado!");
		}
	}


	@Override
	public void fecharMenu() {
		if(isLigado()) {
			System.out.println("Fechando menu....");
		} else {
			System.out.println("Aparelho está desligado!");
		}
		
	}


	@Override
	public void maisVolume() {
		if(isLigado()) {
			System.out.println("Aumentando volume !!!");
			setVolume(getVolume() + 5);
			System.out.println("Volume atual");
			volumeFormatado();
		} else {
			System.out.println("Aparelho está desligado!");
		}
		
	}


	@Override
	public void menosVolume() {
		if(isLigado()) {
			System.out.println("Diminuindo volume !!!");
			setVolume(getVolume() - 5);
			System.out.println("Volume atual");
			volumeFormatado();
		} else {
			System.out.println("Aparelho está desligado!");
		}
		
	}


	@Override
	public void ligarMudo() {
		if (isLigado() && getVolume() > 0) {
			setVolume(0);
		} else if (getVolume() == 0) {
			System.out.println("Volume já está no 0");
		} else {
			System.out.println("Seu aparelho está desligado");
		}
		
	}


	@Override
	public void desligarMudo() {
		if(isLigado() && getVolume() == 0) {
			setVolume(50);
			System.out.println("Volume atual");
			volumeFormatado();
		} else if (getVolume() > 0 ) {
			System.out.println("Aparelho não está mudo!!!");
		} else {
			System.out.println("Seu aparelho está desligado");
		}
	}


	@Override
	public void play() {
		if(isLigado()) {
			setTocando(true);
		} else {
		System.out.println("Seu aparelho está desligado");
		}
	}


	@Override
	public void pause() {
		if(isLigado()) {
			setTocando(false);
		} else {
		System.out.println("Seu aparelho está desligado");
		}
	}
	
	private void volumeFormatado() {
		for(int i=0; i<getVolume(); i+=10) {
			System.out.println("|");
		} 
	}
	
	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean isLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean isTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	
}
