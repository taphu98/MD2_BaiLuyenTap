import java.util.Scanner;

public class Main {
    static int index = 0;
    static  Employee[] arrEmp = new Employee[10];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------ MENU ------");
            System.out.println("1. Nhập thông tin các nhân viên");
            System.out.println("2. Tính lương các nhân viên");
            System.out.println("3. Hiển thị thông tin nhân viên");
            System.out.println("4. Tìm kiếm nhân viên theo ký tự bắt đầu của tên nhân viên");
            System.out.println("5. Sắp xếp theo lương giảm dần");
            System.out.println("6. Thoat");
            System.out.println("Nhập lựa chọn của bạn:");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    insertData(sc);
                    break;
                case 2:
                    calculateSalary();
                    break;
                case 3:
                    showData();
                    break;
                case 4:
                    searchByFirstChar(sc);
                    break;
                case 5:
                    sortBySalary();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }

        }while (true);
    }

    private static void searchByFirstChar(Scanner sc) {
        System.out.println("Nhập chữ cái đầu tiên của nhân viên muốn tìm:");
        String char1 = sc.nextLine();
        for (int i = 0; i < index; i++) {
            if (char1.equals(arrEmp[i].getEmpName().charAt(0))){
                arrEmp[i].displayData();
            }else {
                System.out.println("Không có");
            }
        }
    }


    private static void sortBySalary() {
        for (int i = 0; i < index; i++) {
            for (int j = i + 1; j <= index; j++)
                if (arrEmp[i].getSalary() < arrEmp[j].getSalary()) {
                    Employee temp = arrEmp[i];
                    arrEmp[i] = arrEmp[j];
                    arrEmp[j] = temp;
                }
        }
    }



    private static void showData() {
        for (int i = 0; i < index ; i++) {
            arrEmp[i].displayData();
        }
    }

    private static void calculateSalary() {
        for (int i = 0; i < index ; i++) {
            arrEmp[i].calSalary();
        }
    }

    private static void insertData(Scanner sc) {

        System.out.println("Nhập số lượng nhân viên muốn thêm");
        int num = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < num; i++) {
            Employee employee = new Employee();
            employee.inputData();
            index++;
            arrEmp[i] = employee;

            System.out.println("Success");
        }
    }}
