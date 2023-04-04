package phuctong.jpatutorial.test;

import phuctong.jpatutorial.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        List<Employee> arr = new ArrayList<>();
        arr.add(e1);
        arr.add(e2);
        arr.add(e3);
        arr.add(e4);
        arr.forEach( e -> {
            System.out.println(e);

        } );

    }
}
