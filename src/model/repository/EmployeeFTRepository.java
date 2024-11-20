package model.repository;


import model.entity.DTO.EmployeeFullTimeDTO;
import model.entity.EmployeeFulltime;
import model.entity.EmployeePartime;
import ultils.IOFile.IOFILE;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFTRepository {

    private static final String COMPANY_NAME = "HOSPITAL A";
    private static  List<EmployeeFulltime> employeeFulltime = new ArrayList<>();
    private static IOFILE ioFile = new IOFILE();

    public static List<EmployeeFulltime> getAll() {
        List<EmployeeFulltime> employeeFulltimes = ioFile.readFileBinary(employeeFulltime);
        if(employeeFulltimes == null || employeeFulltimes.isEmpty()) {
            return null;
        }
        return employeeFulltimes;
    }

    public static void save(EmployeeFulltime employee) {
        employeeFulltime.add(employee);
        ioFile.writeFileBinary(employeeFulltime);
    }

    public static EmployeeFulltime findEmployeeFulltime(long id) {
        List<EmployeeFulltime> employees = getAll();
        if(employees != null && !employees.isEmpty()) {
            for (EmployeeFulltime employee : employees) {
                if (id == employee.getId()) {
                    return employee;
                }
            }
        }
        return null;
    }

    public static void deleteEmployeeFulltime(long id) {
        List<EmployeeFulltime> employees = getAll();
        if(employees == null && employees.isEmpty()) {
            return;
        }

        for (EmployeeFulltime employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                break;
            }
            System.out.println("EMPLOYEE NOT FOUND!");
        }
        ioFile.writeFileBinary(employees);
    }

    public static List<EmployeeFulltime>  searchByName (String name){
        List<EmployeeFulltime> employees = getAll();
        List<EmployeeFulltime> temp = new ArrayList<>();
        for (EmployeeFulltime employee : employees) {
                String nameInput = name.toLowerCase();
                String nameEmployee = employee.getName().toLowerCase();
               if (nameEmployee.contains(nameInput)) {
                   temp.add(employee);
               }
        }
        return temp;
    }


    public static void updateEmployeeFT(long id, EmployeeFullTimeDTO employeeFullTimeDTO)
    {
        List<EmployeeFulltime> employees = getAll();
        if(employees != null && !employees.isEmpty()) {
            for (EmployeeFulltime employee : employees) {
                if (id == employee.getId()) {
                    if (employee == null) {
                        System.out.println("Emplpoyee" + employee.getName() + " đã bị xóa trước đó!)");
                    }
                    if(employeeFullTimeDTO.getName().equals("")){
                        employee.setName(employee.getName());
                    }else {
                        employee.setName(employeeFullTimeDTO.getName());
                    }

                    if(employeeFullTimeDTO.getAge().equals("")){
                        employee.setAge(employee.getAge());
                    }else {
                        employee.setAge(employeeFullTimeDTO.getAge());
                    }

                    if(employeeFullTimeDTO.getGender().equals("")){
                        employee.setGender(employee.getGender());
                    }else {
                        employee.setGender(employeeFullTimeDTO.getGender());
                    }

                    if(employeeFullTimeDTO.getAddress().equals("")){
                        employee.setAddress(employee.getAddress());
                    }else {
                        employee.setAddress(employeeFullTimeDTO.getAddress());
                    }

                    if(employeeFullTimeDTO.getPhone().equals("")){
                        employee.setPhone(employee.getPhone());
                    }else {
                        employee.setPhone(employeeFullTimeDTO.getPhone());
                    }

                    if(employeeFullTimeDTO.getEmail().equals("")){
                        employee.setEmail(employee.getEmail());
                    }else {
                        employee.setEmail(employeeFullTimeDTO.getEmail());
                    }

                    if(employeeFullTimeDTO.getDayOfBirth().equals("")){
                        employee.setDayOfBirth(employee.getDayOfBirth());
                    }else {
                        employee.setDayOfBirth(employeeFullTimeDTO.getDayOfBirth());
                    }

                    if(employeeFullTimeDTO.getStatusWork().equals("")){
                        employee.setStatusWork(employee.getStatusWork());
                    }else{
                        employee.setStatusWork(employeeFullTimeDTO.getStatusWork());
                    }

                    if (employeeFullTimeDTO.getMaritalStatus().equals("")){
                        employee.setMaritalStatus(employee.getMaritalStatus());
                    }else {
                        employee.setMaritalStatus(employeeFullTimeDTO.getMaritalStatus());
                    }

                    if(employeeFullTimeDTO.getSalary() == 0){
                        employee.setSalary(employee.getSalary());
                    }else {
                        employee.setSalary(employeeFullTimeDTO.getSalary());
                    }
                }
            }
        }
        ioFile.writeFileBinary(employees);
    }

    public static String getDateContract(long id ){
        EmployeeFulltime employeeFulltime = findEmployeeFulltime(id);
        return employeeFulltime.getDateExpireContract();
    }

}


