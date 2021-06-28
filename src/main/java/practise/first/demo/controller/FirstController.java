package practise.first.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import practise.first.demo.dto.EmployeeDto;
import practise.first.demo.service.FirstService;

@RestController
@RequestMapping("/first")
public class FirstController {


	@Autowired
	private RestTemplate restTemplate ;

	@Autowired
	
	private FirstService service;


	@Value("${Service..url}")
	private String ul;

	@GetMapping("/getOne")
	public ResponseEntity<EmployeeDto> getEmployee(@RequestParam String id) {

		// restTemplate.exchange(ul, null, null, null);

		return new ResponseEntity<>(service.getEmployee(id), HttpStatus.OK);
	}

}
