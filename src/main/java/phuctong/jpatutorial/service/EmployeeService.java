package phuctong.jpatutorial.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phuctong.jpatutorial.entity.Employee;
import phuctong.jpatutorial.repository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepository repository;

    public Employee getEmployeeById( int id){
        return repository.findById(id).get();
    }

    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<>();
        repository.findAll().forEach( employee -> employees.add( employee));
        return employees;
    }
    public void saveOrUpdate( Employee employee){
        repository.save( employee);
    }
    public void deleteEmployeeById( int id){
         repository.deleteById( id);
    }

    public List<Employee> getEmployeesByAge( int age){
        List<Employee> result = repository.getByAge( age);
        return result;
    }
}
