package view;

import controller.EmployeeFTController;
import exception.GlobalException;
import model.entity.DTO.EmployeeFullTimeDTO;
import model.entity.EmployeeFulltime;
import model.entity.EmployeePartime;

import java.util.List;
import java.util.Scanner;


public class MainView {

    private static EmployeeFTController employeeFTController = new EmployeeFTController();
    private static boolean isExistCode = true;

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
        EmployeeFTController employeeController = new EmployeeFTController();
        int choice;
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
                    List<EmployeeFulltime> employeeFT = employeeController.getAll();
                    displayEmployeeFT(employeeFT);
                    break;
                case 2:
                    EmployeeFulltime employee = inputEmployeeFulltime();
                    employeeController.save(employee);
                    System.out.println("Thêm mới thành công 1 nhân viên Fulltime:");
                    break;
                case 3:
                    System.out.println("Cập nhật thông tin nhân viên ");
                    updateEmployeeFT();
                    break;
                case 4:
                    System.out.println("Vui lòng nhập ID nhân viên cần xóa:");
                    deleteEmployeeFulltime();
                    break;
                case 5:
                    System.out.println("Tìm kiếm nhân viên theo tên:");
                    String name = scanner.nextLine();
                    employeeFT = employeeController.searchByName(name);
                    System.out.println("Thông tin của vân viên: " + employeeFT);
                    break;
                case 6:
                    return;
            }
        }

    }

    private static EmployeeFulltime inputEmployeeFulltime() {
//        CustomException exceptionHandler = new CustomException();
        EmployeeFTController employeeController = new EmployeeFTController();
        Scanner scanner = new Scanner(System.in);
        boolean isExistCode = true;
        int id = 0;
        while (isExistCode) {
            try {
                System.out.print("Mời bạn nhập id: ");
                id = Integer.parseInt(scanner.nextLine());
                EmployeeFulltime employeeFT = employeeController.getEmployeeById(id);
                if (employeeFT == null) {
                    isExistCode = false;
                    break;
                } else {
                    System.out.println("Id đã tồn tại, vui lòng chọn lại! ");
                }
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }

        String name;
        while (true) {
            try {
                System.out.print("Mời bạn nhập tên nhân viên: ");
                name = scanner.nextLine();
                GlobalException.checkEmptyString(name);
                break;
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }

        int age;
        while (true) {
            try {
                System.out.print("Mời bạn nhập tuổi nhân viên: ");
                age = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }

        String address;
        while (true) {
            try {
                System.out.print("Mời bạn nhập địa chỉ nhân viên: ");
                address = scanner.nextLine();
                GlobalException.checkEmptyString(address);
                break;
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }

        String gender;
        while (true) {
            try {
                System.out.print("Mời bạn nhập giới tính nhân viên: ");
                gender = scanner.nextLine();
                GlobalException.checkEmptyString(gender);
                break;
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }

        String maritalStatus;
        while (true) {
            try {
                System.out.print("Mời bạn nhập tình trạng hôn nhân của nhân viên: ");
                maritalStatus = scanner.nextLine();
                GlobalException.checkEmptyString(maritalStatus);
                break;
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }


        String phone;
        while (true) {
            try {
                System.out.print("Mời bạn nhập số điện thoại nhân viên: ");
                phone = scanner.nextLine();
                GlobalException.checkEmptyString(phone);
                break;
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }

        String email;
        while (true) {
            try {
                System.out.print("Mời bạn nhập email của nhân viên: ");
                email = scanner.nextLine();
                GlobalException.checkEmptyString(email);
                break;
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }

        String dayOfBirth;
        while (true) {
            try {
                System.out.print("Mời bạn nhập ngày sinh của nhân viên: ");
                dayOfBirth = scanner.nextLine();
                GlobalException.checkEmptyString(dayOfBirth);
                break;
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }

        String type;
        while (true) {
            try {
                System.out.print("Mời bạn nhập hình thức làm việc fulltime/partime: ");
                type = scanner.nextLine();
                GlobalException.checkEmptyString(type);
                break;
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }

        String statusWork;
        while (true) {
            try {
                System.out.print("Mời bạn nhập tình trạng làm việc 'Đang làm việc/Nghỉ việc' : ");
                statusWork = scanner.nextLine();
                GlobalException.checkEmptyString(statusWork);
                break;
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }

        double salary;
        while (true) {
            try {
                System.out.print("Mời bạn nhập lương nhân viên: ");
                salary = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }

        String position;
        while (true) {
            try {
                System.out.print("Mời bạn nhập vị trí làm việc: ");
                position = scanner.nextLine();
                GlobalException.checkEmptyString(position);
                break;
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }

        String dateExpireContract;
        while (true) {
            try {
                System.out.print("Mời bạn nhập ngày hết hạn hợp đồng lao động: ");
                dateExpireContract = scanner.nextLine();
                GlobalException.checkEmptyString(dateExpireContract);
                break;
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }

        String dateSignContract;
        while (true) {
            try {
                System.out.print("Mời bạn nhập ngày kí hợp đồng lao động: ");
                dateSignContract = scanner.nextLine();
                GlobalException.checkEmptyString(dateSignContract);
                break;
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }

        int departmentId;
        while (true) {
            try {
                System.out.print("Mời bạn nhập id phòng ban phân công làm việc: ");
                departmentId = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }

        int dateOfLeave;
        while (true) {
            try {
                System.out.print("Mời bạn nhập ngày phép của nhân viên: ");
                dateOfLeave = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }

        return new EmployeeFulltime(id, name, age, gender, maritalStatus, address, phone, email, dayOfBirth, type, statusWork, salary, position, dateExpireContract, dateSignContract, departmentId, dateOfLeave);
    }

    public static void displayEmployeeFT(List<EmployeeFulltime> employeeFulltimes) {
        System.out.println("Hiển thị danh sách nhân viên Fulltime");
        for (EmployeeFulltime employeeFulltime : employeeFulltimes) {
            System.out.println(employeeFulltime);
        }

    }

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

    public static void deleteEmployeeFulltime() {
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        boolean isFind = employeeFTController.isExistsEmployee(id);
        if (!isFind) {
            System.out.println("Không tìm thấy nhân viên có id là " + id);
        } else {
            System.out.println("Bạn có chắc muốn xóa hay không?. Nhấn 'Y' nếu đồng ý hoặc 'N' nếu không?");
            String isConfirm = scanner.nextLine();
            if (isConfirm.equalsIgnoreCase("y")) {
                employeeFTController.deleteEmployeeById(id);
                System.out.println("Xóa nhân viên thành công");
            }
        }
    }


    public static void updateEmployeeFT() {
        Scanner scanner = new Scanner(System.in);
        String name;
        int id = 0;
            while (isExistCode) {
            try {
                System.out.print("Mời bạn nhập id: ");
                id = Integer.parseInt(scanner.nextLine());
                EmployeeFulltime employeeFT = employeeFTController.getEmployeeById(id);
                if (employeeFT == null) {
                    System.out.println("Id đã không tồn tại, không thể update, vui lòng chọn lại! ");
                } else {
                    isExistCode = false;
                    break;
                }
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }
            while (true) {
                try {
                    System.out.print("Mời bạn nhập tên nhân viên: ");
                    name = scanner.nextLine();
                    GlobalException.checkEmptyString(name);
                    break;
                } catch (NumberFormatException e) {
                    GlobalException.numberFormatException(e);
                }
            }

            int age;
            while (true) {
                try {
                    System.out.print("Mời bạn nhập tuổi nhân viên: ");
                    age = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    GlobalException.numberFormatException(e);
                }
            }

            String address;
            while (true) {
                try {
                    System.out.print("Mời bạn nhập địa chỉ nhân viên: ");
                    address = scanner.nextLine();
                    GlobalException.checkEmptyString(address);
                    break;
                } catch (NumberFormatException e) {
                    GlobalException.numberFormatException(e);
                }
            }

            String gender;
            while (true) {
                try {
                    System.out.print("Mời bạn nhập giới tính nhân viên: ");
                    gender = scanner.nextLine();
                    GlobalException.checkEmptyString(gender);
                    break;
                } catch (NumberFormatException e) {
                    GlobalException.numberFormatException(e);
                }
            }

            String maritalStatus;
            while (true) {
                try {
                    System.out.print("Mời bạn nhập tình trạng hôn nhân của nhân viên: ");
                    maritalStatus = scanner.nextLine();
                    GlobalException.checkEmptyString(maritalStatus);
                    break;
                } catch (NumberFormatException e) {
                    GlobalException.numberFormatException(e);
                }
            }


            String phone;
            while (true) {
                try {
                    System.out.print("Mời bạn nhập số điện thoại nhân viên: ");
                    phone = scanner.nextLine();
                    GlobalException.checkEmptyString(phone);
                    break;
                } catch (NumberFormatException e) {
                    GlobalException.numberFormatException(e);
                }
            }

            String email;
            while (true) {
                try {
                    System.out.print("Mời bạn nhập email của nhân viên: ");
                    email = scanner.nextLine();
                    GlobalException.checkEmptyString(email);
                    break;
                } catch (NumberFormatException e) {
                    GlobalException.numberFormatException(e);
                }
            }

            String dayOfBirth;
            while (true) {
                try {
                    System.out.print("Mời bạn nhập ngày sinh của nhân viên: ");
                    dayOfBirth = scanner.nextLine();
                    GlobalException.checkEmptyString(dayOfBirth);
                    break;
                } catch (NumberFormatException e) {
                    GlobalException.numberFormatException(e);
                }
            }


            String statusWork;
            while (true) {
                try {
                    System.out.print("Mời bạn nhập tình trạng làm việc 'Đang làm việc/Nghỉ việc' : ");
                    statusWork = scanner.nextLine();
                    GlobalException.checkEmptyString(statusWork);
                    break;
                } catch (NumberFormatException e) {
                    GlobalException.numberFormatException(e);
                }
            }

            double salary;
            while (true) {
                try {
                    System.out.print("Mời bạn nhập lương nhân viên: ");
                    salary = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    GlobalException.numberFormatException(e);
                }
            }

        EmployeeFullTimeDTO employeeDTO =  new EmployeeFullTimeDTO(name, age, gender, maritalStatus, address, phone, email, dayOfBirth, statusWork, salary);
        employeeFTController.updateEmployeeById(id, employeeDTO);
        System.out.println("Update Student Success");
    }




}
