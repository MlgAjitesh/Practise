package practise.first.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practise.first.demo.dto.EmployeeDto;
import practise.first.demo.entity.Employee;
import practise.first.demo.repo.FirstRepository;

@Service
public class FirstService {

	private List<Employee> list = List.of(new Employee("101", "Ajitesh", "1234"), new Employee("102", "Misra", "1234"),
			new Employee("103", "Baniya", "1234"), new Employee("104", "Chintu", "1234"));

	
	@Autowired
	private FirstRepository repo;
	
	public EmployeeDto getEmployee(String id) {
		Optional<EmployeeDto> emp = list.stream().filter(i -> i.getId().equals(id)).map(i -> i.getDto()).findAny();
		return emp.isPresent()? emp.get():null;
	}
}


