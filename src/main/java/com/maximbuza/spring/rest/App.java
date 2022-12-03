package com.maximbuza.spring.rest;

import com.maximbuza.spring.rest.configuration.MyConfig;
import com.maximbuza.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;


public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication =context.getBean("communication",Communication.class);



//        List<Employee> employeeList =communication.getAllEmployees();  // просмотр всех
//        System.out.println(employeeList);
//
//        Employee employee = communication.getEmployee(6); // получить конкретного по id
//        System.out.println(employee);

//        Employee employee = new Employee("Artem", "Antipov","HR",1300);  // добавить нового
//        communication.saveEmployee(employee);

//        communication.deleteEmployee(15); // удалить работника

        Employee employee = new Employee("Artem", "Antipov", "HR", 1200); // update
        employee.setId(14);
        communication.saveEmployee(employee);

    }
}
