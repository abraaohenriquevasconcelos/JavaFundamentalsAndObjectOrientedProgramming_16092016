package br.edu.fatecsjc;

public class Produto implements Comparable<Produto>{
	private String serial;
	private String nome;
	private Double preco;
	
	
	
	public Produto(String serial, String nome, double preco) {
		this.serial = serial;
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public boolean equals(Object o){
		if(this == o)return true;
		if(o == null || getClass() != o.getClass())return false;
		
		Produto produto = (Produto) o;
		
		return serial != null ? serial.equals(produto.getSerial()) : produto.serial == null;
	}
	
	@Override
	public String toString(){
		return "Prouduto("+"serial='"+serial+", nome='"+nome+", preco='"+preco+"')";
	}
	
	@Override
	public int compareTo(Produto o){
		//O método compareTo só recebe um parâmetro porque o outro parâmetro já é o próprio objeto -> "this"
		//negativo se "this" < outro 
		//0 se "this" = outro
		//positivo se "this" > outro
		//return this.nome.compareTo(o.nome);
		return this.preco.compareTo(o.preco); //o parametro (o.preco) pode ser primitivo mesmo 
	}
	
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
