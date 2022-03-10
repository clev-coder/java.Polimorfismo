package generation.com;

public class Preguiça {
	private String nome;
	private int idade;
	
	void deveEmitir() {
		System.out.println("Faz algum Som");
	}
	void Correr() {
		System.out.println("Correndo");
	}
	void Subir() { 
		System.out.println("Sobindo");
	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}


