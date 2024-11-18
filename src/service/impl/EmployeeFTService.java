package service.impl;

import model.entity.DTO.EmployeeFullTimeDTO;
import model.entity.EmployeeFulltime;
import model.repository.EmployeeFTRepository;
import service.Interface.IEmployeeFTService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFTService implements IEmployeeFTService {

    private static EmployeeFTRepository employeeFTRepository = new EmployeeFTRepository();

    @Override
    public List<EmployeeFulltime> getAll() {
        List<EmployeeFulltime> employeeFulltimes = employeeFTRepository.getAll();
        return employeeFulltimes;
    }

    @Override
    public void save(EmployeeFulltime employee) {
       employeeFTRepository.save(employee);
    }

    @Override
    public void update(long id, EmployeeFulltime s) {

    }

    @Override
    public void remove(long id) {
        employeeFTRepository.deleteEmployeeFulltime(id);
    }

    @Override
    public EmployeeFulltime findById(long id) {
        return employeeFTRepository.findEmployeeFulltime(id);
    }

    @Override
    public List<EmployeeFulltime> findByName(String name) {
       return employeeFTRepository.searchByName(name);
    }

    @Override
    public void updateEmployeeById(long id, EmployeeFullTimeDTO employeeDTO) {
        employeeFTRepository.updateEmployeeFT(id, employeeDTO);
    }

    @Override
    public String getDateContract(long id) {
        return employeeFTRepository.getDateContract(id);
    }


}
