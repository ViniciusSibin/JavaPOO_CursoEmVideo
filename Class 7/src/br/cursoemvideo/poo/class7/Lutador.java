package br.cursoemvideo.poo.class7;

public class Lutador implements Controlador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitoria;
	private int empate;
	private int derrota;
	
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso) {
		setNome(nome);
		setNacionalidade(nacionalidade);
		setIdade(idade);
		setAltura(altura);
		setPeso(peso);
		if (peso < 80) {
			setCategoria("Leve");
		} else if (peso < 100) {
			setCategoria("Médio");
		} else {
			setCategoria("Pesado");
		}
	}
	
	@Override
	public void apresentar() {
		System.out.println("Nome: " + getNome().toUpperCase());
		System.out.println("Nacionalidade: " + getNacionalidade());
		System.out.println("Idade: " + getIdade());
		System.out.println("Altura: " + getAltura());
		System.out.println("Peso: " + getPeso());
		System.out.println("Categoria: " + getCategoria());
		System.out.println("Vitorias: " + getVitoria());
		System.out.println("Empates: " + getEmpate());
		System.out.println("Derrotas: " + getDerrota());
	}




	@Override
	public void status() {
		
		
	}




	@Override
	public void ganharLuta() {
		
		
	}




	@Override
	public void perderLuta() {
	
		
	}




	@Override
	public void empatarLuta() {
		
		
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getVitoria() {
		return vitoria;
	}

	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}

	public int getEmpate() {
		return empate;
	}

	public void setEmpate(int empate) {
		this.empate = empate;
	}

	public int getDerrota() {
		return derrota;
	}

	public void setDerrota(int derrota) {
		this.derrota = derrota;
	}
}
