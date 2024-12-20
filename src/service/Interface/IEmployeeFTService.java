package service.Interface;

import model.entity.DTO.EmployeeFullTimeDTO;
import model.entity.EmployeeFulltime;

public interface IEmployeeFTService extends IService<EmployeeFulltime> {
    void updateEmployeeById(long id, EmployeeFullTimeDTO employeeFullTimeDTO);

    String getDateContract(long id);
}