package phuctong.jpatutorial.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import phuctong.jpatutorial.entity.Employee;
import phuctong.jpatutorial.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping( path= "/emp")
public class EmployController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @GetMapping("/employees-age")
    public List<Employee> getAllEmployeesByAge( @RequestParam int age){
        return employeeService.getEmployeesByAge( age);
    }


    @GetMapping( "/employee/{id}")
    public Employee getEmployee(@PathVariable("id") int id){
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee( @PathVariable("id") int id){
        employeeService.deleteEmployeeById(id);
    }
    @PostMapping("/employee")
    public void addEmployee( @RequestBody Employee employee){
        System.out.println("Added " + employee);
        employeeService.saveOrUpdate( employee);
    }
    @PutMapping("/employee")
    public void updateEmployee( @RequestBody Employee employee){
        employeeService.saveOrUpdate( employee);
    }


}
