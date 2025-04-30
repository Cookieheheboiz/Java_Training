package com.vti.frontend;

import com.vti.backend.DepartmentDao;
import com.vti.entity.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        try {
            DepartmentDao departmentDao = new DepartmentDao();
            Scanner scanner = new Scanner(System.in);

            List<Department> list = departmentDao.getDepartment();
            for (Department d : list) {
                System.out.println(d);
            }


            departmentDao.getDepartmentByID(scanner.nextInt());



            System.out.println("Enter department name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println(departmentDao.isDepartmentNameExists(name));


            System.out.println("Enter department name to create: ");
            String name1 = scanner.nextLine();
            departmentDao.createDepartment(name1);


            System.out.println("Enter department ID to update: ");
            int id = scanner.nextInt();
            System.out.println("Enter new department name: ");
            scanner.nextLine();
            String name2 = scanner.nextLine();
            departmentDao.updateDepartment(id, name2);

            System.out.println("Enter department ID to delete: ");
            int id1 = scanner.nextInt();
            departmentDao.deleteDepartment(id1);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
