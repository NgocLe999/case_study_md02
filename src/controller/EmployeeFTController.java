package controller;

import model.entity.DTO.EmployeeFullTimeDTO;
import model.entity.EmployeeFulltime;
import service.impl.EmployeeFTService;

import java.util.List;

public class EmployeeFTController {
    private static EmployeeFTService employeeFullTimeService = new EmployeeFTService();

    public List<EmployeeFulltime> getAll() {
        List<EmployeeFulltime> listEmployeeFullTime = employeeFullTimeService.getAll();
        return listEmployeeFullTime;
    }

    public List<EmployeeFulltime> searchByName(String name) {
        return employeeFullTimeService.findByName(name);
    }

    public void save(EmployeeFulltime employeeFullTime) {
        employeeFullTimeService.save(employeeFullTime);
    }

    public EmployeeFulltime getEmployeeById(int id) {
        EmployeeFulltime employeeFullTime = employeeFullTimeService.findById(id);
        if (employeeFullTime == null) {
            return null;
        }
        return employeeFullTime;
    }

    public void deleteEmployeeById(int id) {
        employeeFullTimeService.remove(id);
    }

    public boolean isExistsEmployee(int id) {
        if( employeeFullTimeService.findById(id) != null) {
            return true;
        }
        return false;
    }
    public void updateEmployeeById(int id, EmployeeFullTimeDTO employeeDTO) {
        employeeFullTimeService.updateEmployeeById(id, employeeDTO);
    }
}
