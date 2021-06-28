package practise.first.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import practise.first.demo.entity.Employee;

@Component
public interface FirstRepository extends JpaRepository<Employee, String>{

}
