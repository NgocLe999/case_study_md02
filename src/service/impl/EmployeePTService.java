package service.impl;

import model.entity.EmployeePartime;
import service.Interface.IEmployeePTService;

import java.util.List;

public class EmployeePTService implements IEmployeePTService {
    @Override
    public List<EmployeePartime> getAll() {
        return List.of();
    }

    @Override
    public void save(EmployeePartime s) {

    }

    @Override
    public void update(long id, EmployeePartime s) {

    }

    @Override
    public void remove(long id) {

    }

    @Override
    public EmployeePartime findById(long id) {
        return null;
    }

    @Override
    public List<EmployeePartime> findByName(String name) {
        return List.of();
    }
}
