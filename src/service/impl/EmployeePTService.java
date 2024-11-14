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
    public void update(int id, EmployeePartime s) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public EmployeePartime findById(int id) {
        return null;
    }

    @Override
    public List<EmployeePartime> findByName(String name) {
        return List.of();
    }
}
