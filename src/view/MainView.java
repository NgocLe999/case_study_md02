package view;

import model.entity.EmployeeFulltime;
import model.entity.EmployeePartime;

import java.util.List;
import java.util.Scanner;

public class MainView {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(">>>>>>>> Quản lý nhân viên <<<<<<<<");
            System.out.println("1. Quản lý nhân viên Fulltime");
            System.out.println("2. Quản lý nhân viên Partime");
            System.out.println("3. Thoát");
            System.out.println("Mời bạn nhập lựa chọn");
            int choice = inputChoice();
            switch (choice) {
                case 1:
                        menu();
                    break;
                case 2:
                    System.out.println("Quản lý nhân viên Fulltime");
                    break;
                case 3:
                    return;
            }
        }

    }

        public static void menu() {
//            StudentController studentController = new StudentController();
            int choice;
            List<EmployeeFulltime> employeeFulltimes;
            List<EmployeePartime> employeePartimes;
            while (true) {
                System.out.println("MENU QUẢN LÝ NHÂN VIÊN");
                System.out.println("1. Hiển thị danh sách nhân viên");
                System.out.println("2. Thêm mới nhân viên");
                System.out.println("3. Sửa thông tin nhân viên");
                System.out.println("4. Xóa nhân viên");
                System.out.println("5. Tìm kiếm nhân viên theo tên");
                System.out.println("6. Quay lại");
                System.out.print("Nhập lựa chọn: ");
                Scanner scanner = new Scanner(System.in);
                choice = inputChoice();
                switch (choice) {
                    case 1:
//                        students = studentController.getAll();
//                        display(students);
                        System.out.println("Hello");
                        break;
                    case 2:
//                        student = inputStudent();
//                        studentController.save(student);
                        System.out.println("Thêm mới thành công");
                        break;
                    case 3:
                        System.out.println("Sửa thông tin học sinh");
//                        updateStudent();
                        break;
                    case 4:
                        System.out.println("Xóa học sinh");
//                        deleteStudent();
                        break;
                    case 5:
                        System.out.println("Tìm kiếm học sinh theo tên");
                        String name = scanner.nextLine();
//                        students = studentController.searchByName(name);
//                        display(students);
                        break;
                    case 6:
                        return;
                }
            }

        }

//        private static Student inputStudent() {
////        CustomException exceptionHandler = new CustomException();
//            StudentController studentController = new StudentController();
//            Scanner scanner = new Scanner(System.in);
//            boolean isExistCode = true;
//            int code = 0;
//            while (isExistCode) {
//                try {
//                    System.out.print("Mời bạn nhập code: ");
//                    code = Integer.parseInt(scanner.nextLine());
//                    Student student = studentController.getStudentById(code);
//                    if (student == null) {
//                        isExistCode = false;
//                        break;
//                    } else {
//                        System.out.println("Code đã tồn tại, vui lòng chọn lại! ");
//                    }
//                } catch (NumberFormatException e) {
//                    CustomException.numberFormatException(e);
//                }
//            }
//
//            String name;
//            while (true) {
//                try {
//                    System.out.print("Mời bạn nhập tên: ");
//                    name = scanner.nextLine();
//                    CustomException.checkEmptyString(name);
//                    break;
//                } catch (NumberFormatException e) {
//                    CustomException.numberFormatException(e);
//                }
//            }
//
//            String address;
//            while (true) {
//                try {
//                    System.out.print("Mời bạn nhập địa chỉ: ");
//                    address = scanner.nextLine();
//                    CustomException.checkEmptyString(address);
//                    break;
//                } catch (NumberFormatException e) {
//                    CustomException.numberFormatException(e);
//                }
//            }
//
//            double point;
//            while (true) {
//                try {
//                    System.out.print("Mời bạn nhập điểm: ");
//                    point = Double.parseDouble(scanner.nextLine());
//                    break;
//                } catch (NumberFormatException e) {
//                    CustomException.numberFormatException(e);
//                }
//            }
//
//            String className;
//            while (true) {
//                try {
//                    System.out.print("Mời bạn nhập lớp: ");
//                    className = scanner.nextLine();
//                    CustomException.checkEmptyString(className);
//                    break;
//                } catch (NumberFormatException e) {
//                    CustomException.numberFormatException(e);
//                }
//            }
//
//            return new Student(code, name, address, point, className);
//
//        }

//        public static void display(List<Student> students) {
//            System.out.println("Hiển thị danh sách học sinh");
//            for (Student student : students) {
//                System.out.println(student);
//            }
//        }

    private static int inputChoice() {
        Scanner scanner = new Scanner(System.in);
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            return choice;
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai lựa chọn. Mời bạn nhập lại! ");
        } catch (Exception e) {
            System.out.println(" Có lỗi xảy ra! ");
        }
        return 0;
    }

}
