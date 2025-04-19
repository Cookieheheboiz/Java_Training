import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise5 {
    private List<Department> departments = new ArrayList<>();

    public void question1() {
        Department department1 = new Department(1, "Admin");
        System.out.println("ID: " + department1.getDepartmentID() + ", Name: " + department1.getDepartmentName().toString());
    }

    public void question2() {
        for (Department department : departments) {
            System.out.println("ID: " + department.getDepartmentID() + ", Name: " + department.getDepartmentName());
        }
    }

    public void question3() {
        Department department1 = new Department(1, "Admin");
        System.out.println(department1);
        System.out.println(department1.hashCode());
    }

    public void question4() {
        if (departments.get(0).getDepartmentName().equals("Phong A")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public void question5() {
        if (departments.get(0).getDepartmentName().equals(departments.get(1).getDepartmentName())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public void question6() {
        departments.add(new Department(1, "Delivery"));
        departments.add(new Department(2, "Admin"));
        departments.add(new Department(3, "IT"));
        departments.add(new Department(4, "HR"));
        departments.add(new Department(5, "Marketing"));

        Collections.sort(departments, new Comparator<Department>() {
            @Override
            public int compare(Department d1, Department d2) {
                return d1.getDepartmentName().compareTo(d2.getDepartmentName());
            }
        });

        for (Department department : departments) {
            System.out.println("ID: " + department.getDepartmentID() + ", Name: " + department.getDepartmentName());
        }
    }


    public void question7() {
        departments.add(new Department(6, "Accounting"));
        departments.add(new Department(7, "Boss of director"));
        departments.add(new Department(8, "Marketing"));
        departments.add(new Department(9, "Waiting room"));
        departments.add(new Department(10, "Sale"));

        Collections.sort(departments, new Comparator<Department>() {
            @Override
            public int compare(Department d1, Department d2) {
                String[] words1 = d1.getDepartmentName().trim().split("\\s+");
                String lastWord1 = words1[words1.length - 1];
                String[] words2 = d2.getDepartmentName().trim().split("\\s+");
                String lastWord2 = words2[words2.length - 1];
                return Character.compare(Character.toLowerCase(lastWord1.charAt(0)), Character.toLowerCase(lastWord2.charAt(0)));
            }
        });

        for (Department department : departments) {
            System.out.println("ID: " + department.getDepartmentID() + ", Name: " + department.getDepartmentName());
        }
    }

}
