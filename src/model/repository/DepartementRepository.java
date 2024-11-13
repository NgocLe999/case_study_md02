package model.repository;

import model.entity.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartementRepository {
    public static List<Department> departments = new ArrayList<>();

    static {

    departments.add(new Department(1, "Cardiology", "2nd Floor"));
    departments.add(new Department(2, "Pediatrics", "3rd Floor"));
    departments.add(new Department(3, "Surgery", "1st Floor"));
    departments.add(new Department(4, "Radiology", "4th Floor"));
    departments.add(new Department(5, "Pharmacy", "Ground Floor"));
    departments.add(new Department(6, "Oncology", "5th Floor"));
    departments.add(new Department(7, "Emergency", "Ground Floor"));
    departments.add(new Department(8, "Gynecology", "3rd Floor"));
    departments.add(new Department(9, "Orthopedics", "2nd Floor"));
    departments.add(new Department(10, "Administration", "Ground Floor"));
    departments.add(new Department(11, "Dermatology", "2nd Floor"));
    departments.add(new Department(12, "Neurology", "4th Floor"));
    departments.add(new Department(13, "Urology", "5th Floor"));
    departments.add(new Department(14, "Gastroenterology", "2nd Floor"));
    departments.add(new Department(15, "Ophthalmology", "3rd Floor"));
    departments.add(new Department(16, "ENT (Ear, Nose, Throat)", "4th Floor"));
    departments.add(new Department(17, "Nephrology", "5th Floor"));
    departments.add(new Department(18, "Laboratory", "Ground Floor"));
    departments.add(new Department(19, "Rehabilitation", "1st Floor"));
    departments.add(new Department(20, "Dental", "3rd Floor"));}
}
