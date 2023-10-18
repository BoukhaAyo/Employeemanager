package tech.club.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.club.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
