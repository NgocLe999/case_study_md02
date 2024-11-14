package controller;

import model.entity.EmployeeFulltime;

import model.entity.EmployeePartime;
import service.impl.EmployeePTService;


import java.util.List;

public class EmployeePTController {

    private static EmployeePTService employeePartimeService = new EmployeePTService();

    public List<EmployeePartime> getAll() {
        List<EmployeePartime> listEmployeePartime = employeePartimeService.getAll();
        return listEmployeePartime;
    }

    public List<EmployeePartime> searchByName(String name) {
        return employeePartimeService.findByName(name);
    }

    public void save(EmployeePartime employeePartime) {
        employeePartimeService.save(employeePartime);
    }

    public EmployeePartime getEmployeeById(int id) {
        EmployeePartime employeePartime = employeePartimeService.findById(id);
        if (employeePartime == null) {
            return null;
        }
        return employeePartime;
    }

    public void deleteEmployeeById(int id) {
        employeePartimeService.remove(id);
    }

//    public void updateEmployeeById(int id, StudentDTO studentDto) {
//        studentService.updateStudentById(id, studentDto);
//    }
}
