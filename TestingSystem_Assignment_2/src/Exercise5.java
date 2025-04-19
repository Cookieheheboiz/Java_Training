import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Exercise5 {
    Scanner input = new Scanner(System.in);
    private List<Account> accounts = new ArrayList<>();
    private List<Department> departments = new ArrayList<>();
    private List<Group> groups = new ArrayList<>();
    private List<GroupAccount> groupAccounts = new ArrayList<>();
    public void question1() {
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }

    public void question2() {
        float a = input.nextFloat();
        float b = input.nextFloat();
        System.out.println("a = " + a + ", b = " + b);
    }

    public void question3() {
        System.out.print("Nhập họ: ");
        String firstName = input.nextLine();
        System.out.print("Nhập tên: ");
        String lastName = input.nextLine();
        String fullName = firstName + " " + lastName;
        System.out.println("Họ và tên: " + fullName);
    }

    public void question4() {
        System.out.print("Nhập ngày sinh: ");
        int day = input.nextInt();
        System.out.print("Nhập tháng sinh: ");
        int month = input.nextInt();
        System.out.print("Nhập năm sinh: ");
        int year = input.nextInt();
        LocalDate birthDate = LocalDate.of(year, month, day);
        System.out.println("Ngày tháng năm sinh: " + birthDate);
    }

    public Account question5() {
        System.out.print("Nhập ID: ");
        int id = input.nextInt();
        System.out.print("Nhập mail: ");
        String email = input.nextLine();
        System.out.print("Nhập username: ");
        String username = input.nextLine();
        System.out.print("Nhập họ tên: ");
        String fullName = input.nextLine();
        System.out.print("Nhập ID phòng ban: ");
        int departmentID = input.nextInt();
        System.out.print("Nhập ID vị trí: ");
        int positionID = input.nextInt();
        Position position = new Position();
        switch (positionID) {
            case 1:
                position.setPositionName("Dev");
                break;
            case 2:
                position.setPositionName("Test");
                break;
            case 3:
                position.setPositionName("Scrum Master");
                break;
            case 4:
                position.setPositionName("PM");
                break;
            case 5:
                position.setPositionName(".....");
                break;
        }
        Account account = new Account();
        account.setAccountID(id);
        account.setEmail(email);
        account.setUsername(username);
        account.setFullname(fullName);
        account.setDepartmentID(new Department(departmentID, "Department " + departmentID));
        account.setPositionID(position);
        account.setCreateDate(LocalDate.now());
        accounts.add(account);
        return account;
    }

    public Department question6() {
        System.out.print("Nhập ID phòng ban: ");
        int id = input.nextInt();
        System.out.print("Nhập tên phòng ban: ");
        String name = input.nextLine();
        Department department = new Department();
        department.setDepartmentID(id);
        department.setDepartmentName(name);
        departments.add(department);
        return department;
    }

    public void question7() {
        System.out.print("Nhập số chẵn: ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println(number);
        } else {
            System.out.println("Không phải số chẵn");
        }
    }

    public void question8() {
        System.out.print("Mời bạn nhập vào chức năng muốn sử dụng");
        boolean check = true;
        while (check) {
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    question5();
                    check = false;
                    break;
                case 2:
                    question6();
                    check = false;
                    break;
                default:
                    System.out.println("Mời bạn nhập lại!");

            }
        }
    }

    public void question9() {
        System.out.print("Các username: ");
        for (Account account : accounts) {
            System.out.println(account.getUsername());
        }
        System.out.print("Nhập username: ");
        String username = input.nextLine();
        System.out.print("Các group: ");
        for (Group group : groups) {
            System.out.println(group.getGroupName());
        }
        System.out.print("Nhập group: ");
        String groupName = input.nextLine();

        for (Account account : accounts) {
            if (account.getUsername().equals(username)) {
                for (Group group : groups) {
                    if (group.getGroupName().equals(groupName)) {
                        GroupAccount groupAccount = new GroupAccount();
                        groupAccount.setGroupID(group);
                        groupAccount.setAccountID(account);
                        groupAccount.setJoinDate(LocalDate.now());
                        groupAccounts.add(groupAccount);
                        return;
                    }
                }
            }
        }
    }

    public void question10() {
        System.out.print("Mời bạn nhập vào chức năng muốn sử dụng");
        while (true) {
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    question5();
                    break;
                case 2:
                    question6();
                    break;
                case 3:
                    question9();
                    break;
                default:
                    System.out.println("Mời bạn nhập lại!");

            }
            System.out.print("Bạn có muốn thực hiện chức năng khác không?:");
            String choice2 = input.nextLine();
            if (!choice2.equalsIgnoreCase("Có")) {
                return;
            }
        }
    }

    public void addRandomAccountToGroup() {
        System.out.print("Các username: ");
        for (Account account : accounts) {
            System.out.println(account.getUsername());
        }
        System.out.print("Nhập username: ");
        String username = input.nextLine();
        System.out.print("Các group: ");
        for (Group group : groups) {
            System.out.println(group.getGroupName());
        }
        Random random = new Random();
        int randomIndex = random.nextInt(groups.size());
        Group randomGroup = groups.get(randomIndex);
        for (Account account : accounts) {
            if (account.getUsername().equals(username)) {
                for (Group group : groups) {
                    if (group.getGroupName().equals(randomGroup.getGroupName())) {
                        GroupAccount groupAccount = new GroupAccount();
                        groupAccount.setGroupID(group);
                        groupAccount.setAccountID(account);
                        groupAccount.setJoinDate(LocalDate.now());
                        groupAccounts.add(groupAccount);
                        return;
                    }
                }
            }
        }
    }

    public void question11() {
        System.out.print("Mời bạn nhập vào chức năng muốn sử dụng");
        while (true) {
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    question5();
                    break;
                case 2:
                    question6();
                    break;
                case 3:
                    question9();
                    break;
                case 4:
                    addRandomAccountToGroup();
                    break;
                default:
                    System.out.println("Mời bạn nhập lại!");

            }
            System.out.print("Bạn có muốn thực hiện chức năng khác không?:");
            String choice2 = input.nextLine();
            if (!choice2.equalsIgnoreCase("Có")) {
                return;
            }
        }
    }


}
