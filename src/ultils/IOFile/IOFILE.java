package ultils.IOFile;

import model.entity.EmployeeFulltime;
import service.Interface.IReadWriteFile;

import java.io.*;
import java.util.List;

public class IOFILE implements IReadWriteFile <EmployeeFulltime>{

    public static final String SRC_DATA_EMPLOYEE = "src/data/EmployeeFullTime.dat";

    @Override
    public void writeFileBinary(List<EmployeeFulltime> students) {
        File file = new File(SRC_DATA_EMPLOYEE);
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }

    @Override
    public List<EmployeeFulltime> readFileBinary(List<EmployeeFulltime> employeeFulltimes) {
        File file = new File(SRC_DATA_EMPLOYEE);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            employeeFulltimes = (List<EmployeeFulltime>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e) {
            if(employeeFulltimes == null || employeeFulltimes.isEmpty()){
                return employeeFulltimes;
            }
            System.out.println("Lỗi đọc file");
        } catch (ClassNotFoundException e) {
            System.out.println("Lỗi không tìm thấy class");
        }
        return employeeFulltimes;
    }

}
