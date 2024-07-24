package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department obj); // Inseri no banco de dados o objeto passado por parâmetro
	Department findById(Integer id);// Consulta recebendo um objeto id como argumento
	List<Department> findAll(); // Consulta retornado uma lista completa do "Department" 
	void update(Department obj); // Atualiza recebendo um objeto como argumento
	void deleteById(Integer id); // Deleta recebendo um objeto como argumento
}
