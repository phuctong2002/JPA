package phuctong.jpatutorial.repository;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import phuctong.jpatutorial.JpatutorialApplication;
import phuctong.jpatutorial.entity.Employee;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith( SpringExtension.class )
@Transactional
@SpringBootTest( classes =  JpatutorialApplication.class)
public class EmployRepositoryTest {
    @Autowired
    private IEmployeeRepository employeeRepository;

    @Test
    public void testFindById(){
        Employee employee = new Employee();
        employeeRepository.save( employee );
        Employee result = employeeRepository.findById( employee.getId()).get();
        assertEquals(employee.getId(), result.getId());// dung de xac minh gia tri mong doi va gia tri thuc te co bang nhau khong
    }
    @Test
    public void testFindByName(){
        Employee employee = new Employee();
        employeeRepository.save(employee);
        List<Employee> result = employeeRepository.findByName( employee.getName());
        assertEquals(employee.getId(), result.get(0).getId());
    }



}
