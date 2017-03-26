package com.aaron.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Created by yangwj5 on 2017/3/26 at 22:32.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    Employee findByFirstName(String firstName);

    List<Employee> findByLastName(String lastName);

}