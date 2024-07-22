package model.entities;

import java.io.Serializable;
import java.util.Objects;

//"implements Serializable", para o objeto ser gravado em arquivo, trafegado em rede e etc
public class Department implements Serializable { 

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	
	// Construtor padrão
	public Department() {
	}

	// Construtor com argumentos
	public Department(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	// Getters e Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Método hashCode
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	// Método equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id);
	}

	// Método toString
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}	
}
