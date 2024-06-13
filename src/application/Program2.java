package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entitties.Department;


public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== TEST 1 insert =====");
        Department newDepartment = new Department(null, "Arts");
        departmentDao.insert(newDepartment);
        System.out.println(" Inserted new id: " + newDepartment.getId());

        System.out.println();

        System.out.println("===== TEST 2 findById =====");
        Department department = departmentDao.findById(2);
        System.out.println(department);

        System.out.println();

        System.out.println("===== TEST 3 update =====");
        Department dep = departmentDao.findById(2);
        dep.setName("ADM");
        departmentDao.update(dep);
        System.out.println("update completed");

        System.out.println();

        System.out.println("===== TEST 4 deleteById =====");
        System.out.println("Enter id for delete");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Id deleted");

        System.out.println();

        System.out.println("===== TEST 5 findAll =====");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}

        sc.close();

    }
}
