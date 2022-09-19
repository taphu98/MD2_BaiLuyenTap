import java.util.Scanner;

public class Employee implements IEmployee {
    private String empId;
    private String empName;
    private float rate;
    private float salary;
    private String address;
    private String sex;

    public Employee() {
    }

    public Employee(String empId, String empName, float rate, float salary, String address, String sex) {
        this.empId = empId;
        this.empName = empName;
        this.rate = rate;
        this.salary = salary;
        this.address = address;
        this.sex = sex;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin nhân viên");
        while (true) {
            System.out.println("Nhập mã nhân viên:");
            this.empId = scanner.nextLine();
            if (this.empId.matches("[E][a-zA-Z\\d]{1,5}")) {
                break;
            } else {
                System.err.println("Không đúng định dạng! Hãy nhập lại!");
            }
        }
        while (true) {
            System.out.println("Nhập tên nhân viên:");
            this.empName = scanner.nextLine();
                if (this.empName.matches("[a-zA-Z]{6,30}")) {
                    break;
                }
                    System.err.println("Không đúng định dạng! Hãy nhập lại!");

        }
        while (true) {
            System.out.println("Nhập hệ số lương: ");
            this.rate = Float.parseFloat(scanner.nextLine());
            if (this.rate < 0.65F) {
                System.err.println("Tỉ lệ không được thấp hơn 0.65 !");
            } else {
                break;
            }
        }
        System.out.println("Nhập địa chỉ:");
        this.address = scanner.nextLine();
        while (true) {
            System.out.println("Nhập giới tính: nam / nữ");
            this.sex = scanner.nextLine();
            if (this.sex.equals("nam") || this.sex.equals("nữ")) {
                break;
            } else {
                System.err.println("Giới tính chỉ có thể là nam hoặc nữ !");
            }
        }
    }

    @Override
    public void displayData() {
        System.out.printf("Ma nhan vien: %s, Ten nhan vien: %s, He so luong: %.2f, Luong nhan vien: %.2f, Dia chi: %s, Gioi tinh: %s\n", this.empId, this.empName, this.rate, this.salary, this.address, this.sex);

    }

    public float calSalary() {
        return this.salary = BASIC_SALARY * this.rate;
    }
}
