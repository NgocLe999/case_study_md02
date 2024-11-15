package service.Interface;

import model.entity.DTO.EmployeeFullTimeDTO;
import model.entity.EmployeeFulltime;

public interface IEmployeeFTService extends IService<EmployeeFulltime> {
    void updateEmployeeById(int id, EmployeeFullTimeDTO employeeFullTimeDTO);
}