package org.serratec.doces;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

@Entity
public class Doces {
	@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
  @NotBlank
  @Past(message ="O nome do doce não pode ficar em branco")
 private String nome;
  @NotNull
  @Past(message ="O sabor não pode ficar em branco")
 private String sabor;
  @NotNull
  @Past(message ="O preço não pode ficar em branco")
 private double preco;
  @NotNull
  @Past(message ="A validade não pode ficar em branco")
 private LocalDate validade;
  @NotBlank
  @Past(message ="A quantidade do doce não pode ficar em branco")
 private int quantidade;
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getSabor() {
	return sabor;
}
public void setSabor(String sabor) {
	this.sabor = sabor;
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}
public LocalDate getValidade() {
	return validade;
}
public void setValidade(LocalDate validade) {
	this.validade = validade;
}
public int getQuantidade() {
	return quantidade;
}
public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}
 public Long getId() {
		return id;
}
public void setId(Long id) {
			this.id = id;
}
}
