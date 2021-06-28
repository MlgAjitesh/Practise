package practise.first.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import practise.first.demo.dto.EmployeeDto;

@Entity
@Table
public class Employee {

	@Column
	private String name;
	
	@Id
	@Column
	private String id;
	
	@Column
	private String password;
	
	
	public Employee() {
	}


	public Employee(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}


	public EmployeeDto getDto() {
		EmployeeDto dto = new EmployeeDto();
		dto.setId(this.id);
		dto.setName(this.name);
		return dto;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
}
