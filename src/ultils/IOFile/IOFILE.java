package ultils.IOFile;

import model.entity.EmployeeFulltime;
import service.Interface.IReadWriteFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFILE <T> {


    //    public static final String SRC_DATA_EMPLOYEE = "src/data/EmployeeFullTime.dat";
    private List<T> dataArray = new ArrayList<>();

    public void writeFileBinary( List<T> data, String SRC_DATA) {

        File file = new File(SRC_DATA);
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(data);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }


    public List<T> readFileBinary(String SRC_DATA) {
        File file = new File(SRC_DATA);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            dataArray = (List<T>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e) {
            if (dataArray == null || dataArray.isEmpty()) {
                    return dataArray;
            }
            System.out.println("Lỗi đọc file");
        } catch (ClassNotFoundException e) {
            System.out.println("Lỗi không tìm thấy class");
        }
        return dataArray;
    }

}
