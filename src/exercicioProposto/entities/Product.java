package exercicioProposto.entities;

public class Product {
	
	private String nome;
	private Double preco;
	private Integer quantidade;
	
	public Product() {
		
	}

	public Product(String nome, Double preco, Integer quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getTotal() {
		return this.preco * this.quantidade;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.nome);
		sb.append(", ");
		sb.append(String.format("$ %.2f", this.preco));
		sb.append(", ");
		sb.append(this.quantidade);
		return sb.toString();
	}
}
