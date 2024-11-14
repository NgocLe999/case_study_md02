package service.impl;

import model.entity.EmployeeFulltime;
import service.Interface.IEmployeeFTService;

import java.util.List;

public class EmployeeFTService implements IEmployeeFTService {
    @Override
    public List<EmployeeFulltime> getAll() {
        return List.of();
    }

    @Override
    public void save(EmployeeFulltime s) {

    }

    @Override
    public void update(int id, EmployeeFulltime s) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public EmployeeFulltime findById(int id) {
        return null;
    }

    @Override
    public List<EmployeeFulltime> findByName(String name) {
        return List.of();
    }
}
