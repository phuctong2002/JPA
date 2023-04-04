package phuctong.jpatutorial.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import phuctong.jpatutorial.entity.Employee;

import java.util.List;

@Repository
public interface IEmployeeRepository extends CrudRepository<Employee, Integer> {
    public List<Employee> getByName( String name);
    public List<Employee> getByAge( int age);

}
