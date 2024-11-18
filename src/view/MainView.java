package view;

import controller.EmployeeFTController;
import exception.GlobalException;
import model.entity.DTO.EmployeeFullTimeDTO;
import model.entity.EmployeeFulltime;
import model.entity.EmployeePartime;
import ultils.LaborContract;
import ultils.ValidateDate;
import ultils.ValidateEmail;

import java.util.List;
import java.util.Scanner;


public class MainView {

    private static EmployeeFTController employeeFTController;
    private static boolean isExistCode = true;
    private static ValidateEmail validateEmail;
    private static ValidateDate validateDate;
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
         employeeFTController = new EmployeeFTController();

        int choice;
        while (true) {
            System.out.println("MENU QUẢN LÝ NHÂN VIÊN");
            System.out.println("1. Hiển thị danh sách nhân viên");
            System.out.println("2. Thêm mới nhân viên");
            System.out.println("3. Sửa thông tin nhân viên");
            System.out.println("4. Xóa nhân viên");
            System.out.println("5. Tìm kiếm nhân viên theo tên");
            System.out.println("6. Kiểm tra thời hạn hợp đồng nhân viên");
            System.out.println("7. Kiểm tra số ngày phép/năm của nhân viên");
            System.out.println("8. Quay lại");
            System.out.print("Nhập lựa chọn: ");
            Scanner scanner = new Scanner(System.in);
            choice = inputChoice();
            switch (choice) {
                case 1:
                    List<EmployeeFulltime> employeeFT = employeeFTController.getAll();
                    displayEmployeeFT(employeeFT);

                    break;
                case 2:
                    EmployeeFulltime employee = inputEmployeeFulltime();
                    employeeFTController.save(employee);
                    System.out.println("Thêm mới thành công 1 nhân viên Fulltime");
                    break;
                case 3:
                    System.out.println("Cập nhật thông tin nhân viên ");
                    System.out.println("NOTE: Một thông tin bạn không muốn update: Hãy để trống hoặc nhấn Enter");
                    updateEmployeeFT();
                    break;
                case 4:
                    System.out.println("Xóa nhân viên khỏi hệ thống");
                    deleteEmployeeFulltime();
                    break;
                case 5:
                    System.out.println("Tìm kiếm nhân viên theo tên");
                    String name = scanner.nextLine();
                    employeeFT = employeeFTController.searchByName(name);
                    System.out.println("Thông tin của vân viên: " + employeeFT);
                    break;
                case 6:
                    System.out.println("Vui lòng nhập id nhân viên muốn kiểm tra thời hạn hợp đồng:");
                    long id = Long.parseLong(scanner.nextLine());
                    employee = employeeFTController.getEmployeeById(id);
                    int date = calDateContract(id);
                    System.out.println("Nhân viên: " + employee.getName() + " - còn thời hạn hợp đồng là: " + date + " tháng. " );
                    break;
                case 7:
                    System.out.println("Vui lòng nhập id nhân viên muốn kiểm tra ngày phép:");
                    long code = Long.parseLong(scanner.nextLine());
                    employee = employeeFTController.getEmployeeById(code);
                    int dateRemaining = calDayOfLeave(code);
                    System.out.println("Nhân viên: " + employee.getName() + " - tổng số ngày phép là: " + dateRemaining + " ngày.");
                    break;
                case 8:
                    return;
            }
        }

    }

    private static EmployeeFulltime inputEmployeeFulltime() {
        employeeFTController = new EmployeeFTController();
        validateEmail = new ValidateEmail();
        validateDate = new ValidateDate();
        Scanner scanner = new Scanner(System.in);
        boolean isExistCode = true;
        int id = 0;
        while (isExistCode) {
            try {
                System.out.print("Mời bạn nhập id: ");
                id = Integer.parseInt(scanner.nextLine());
                EmployeeFulltime employeeFT = employeeFTController.getEmployeeById(id);
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
                System.out.print("Mời bạn nhập tên: ");
                name = scanner.nextLine();
                GlobalException.checkEmptyString(name);
                break;
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }

        String age;
        while (true) {
            try {
                System.out.print("Mời bạn nhập tuổi: ");
                age = scanner.nextLine();
                break;
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }

        String address;
        while (true) {
            try {
                System.out.print("Mời bạn nhập địa chỉ: ");
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
                System.out.print("Mời bạn nhập giới tính: ");
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
                System.out.print("Mời bạn nhập tình trạng hôn nhân: ");
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
                System.out.print("Mời bạn nhập số điện thoại: ");
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
                System.out.print("Mời bạn nhập email: ");
                email = scanner.nextLine();
                boolean isValid = validateEmail.matches(email);
                if(!isValid) {
                    System.out.println("Email: " + email + " không hợp lệ, Vui lòng nhập lại! ");
                    continue;
                }
                GlobalException.checkEmptyString(email);
                break;
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }

        String dayOfBirth;
        while (true) {
            try {
                System.out.print("Mời bạn nhập ngày sinh: ");
                dayOfBirth = scanner.nextLine();
                boolean isValid = validateDate.matches(dayOfBirth);
                if(!isValid) {
                    System.out.println("Ngày sinh: " + dayOfBirth + " không hợp lệ, Vui lòng nhập lại đúng định dạng YYYY-MM-DD.! ");
                    continue;
                }
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
                System.out.print("Mời bạn nhập id vị trí làm việc: ");
                position = scanner.nextLine();
                GlobalException.checkEmptyString(position);
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
                boolean isValid = validateDate.matches(dateSignContract);
                if(!isValid) {
                    System.out.println("Ngày kí hợp đồng: " + dateSignContract + " không hợp lệ, Vui lòng nhập lại đúng định dạng YYYY-MM-DD.! ");
                    continue;
                }
                GlobalException.checkEmptyString(dateSignContract);
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
                boolean isValid = validateDate.matches(dateExpireContract);
                if(!isValid) {
                    System.out.println("Ngày hết hạn hợp đồng: " + dateExpireContract + " không hợp lệ, Vui lòng nhập lại đúng định dạng YYYY-MM-DD.! ");
                    continue;
                }
                GlobalException.checkEmptyString(dateExpireContract);
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
                System.out.print("Mời bạn nhập ngày phép: ");
                dateOfLeave = Integer.parseInt(scanner.nextLine());
                if(dateOfLeave > 14){
                    System.out.println("Số ngày phép nhập quá số ngày cho phép. Vui lòng nhập lại!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }
        return new EmployeeFulltime(id, name, age, gender, maritalStatus, address, phone, email, dayOfBirth, type, statusWork, salary, position, dateSignContract,dateExpireContract, departmentId, dateOfLeave);
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
        employeeFTController = new EmployeeFTController();
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
        employeeFTController = new EmployeeFTController();
        validateEmail = new ValidateEmail();
        Scanner scanner = new Scanner(System.in);
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

        String name;
        while (true) {
            System.out.print("Mời bạn nhập tên: ");
            name = scanner.nextLine();
            break;
        }
        String age;
        while (true) {
            System.out.print("Mời bạn nhập tuổi: ");
            age = scanner.nextLine();
            break;
        }

        String address;
        while (true) {
            System.out.print("Mời bạn nhập địa chỉ: ");
            address = scanner.nextLine();
            break;

        }
        String gender;
        while (true) {
            System.out.print("Mời bạn nhập giới tính: ");
            gender = scanner.nextLine();
            break;
        }

        String maritalStatus;
        while (true) {
            System.out.print("Mời bạn nhập tình trạng hôn nhân của nhân viên: ");
            maritalStatus = scanner.nextLine();
            break;
        }


        String phone;
        while (true) {
            System.out.print("Mời bạn nhập số điện thoại nhân viên: ");
            phone = scanner.nextLine();
            break;
        }

        String email;
        while (true) {
            try {
                System.out.print("Mời bạn nhập email: ");
                email = scanner.nextLine();
                if (email.equals("")) {
                    break;
                }
                boolean isValid = validateEmail.matches(email);
                if(!isValid) {
                    System.out.println("Email: " + email + " không hợp lệ, Vui lòng nhập lại! ");
                    continue;
                }
                GlobalException.checkEmptyString(email);
                break;
            } catch (NumberFormatException e) {
                GlobalException.numberFormatException(e);
            }
        }

        String dayOfBirth;
        while (true) {
            System.out.print("Mời bạn nhập ngày sinh: ");
            dayOfBirth = scanner.nextLine();
            if (dayOfBirth.equals("")) {
                break;
            }
            boolean isValid = validateDate.matches(dayOfBirth);
            if (!isValid) {
                System.out.println("Ngày sinh: " + dayOfBirth + " không hợp lệ, Vui lòng nhập lại đúng định dạng YYYY-MM-DD.! ");
                continue;
            }
            break;
        }

        String statusWork;
        while (true) {
            System.out.print("Mời bạn nhập tình trạng làm việc 'Đang làm việc/Nghỉ việc' : ");
            statusWork = scanner.nextLine();
            break;
        }

        double salary1 = 0;
        while (true) {
            System.out.print("Mời bạn nhập lương nhân viên: ");
            String salary = scanner.nextLine();
            if (salary.equals("")) {
                break;
            } else {
                salary1 = Double.parseDouble(salary);
            }

            break;
        }

        EmployeeFullTimeDTO employeeDTO = new EmployeeFullTimeDTO(name, age, gender, maritalStatus, address, phone, email, dayOfBirth, statusWork, salary1);
        employeeFTController.updateEmployeeById(id, employeeDTO);
        System.out.println("Update Student Success");
    }

    public static int calDateContract(long id){
        String date = employeeFTController.getDateContract(id);
        LaborContract laborContract = new LaborContract();
        return  laborContract.termContract(date);
    }

    public static int calDayOfLeave(long id){
        String date = employeeFTController.getDateContract(id);
        LaborContract laborContract = new LaborContract();
        return  laborContract.updateDayOfLeave(date);
    }
}
