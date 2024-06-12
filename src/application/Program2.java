package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entitties.Department;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        
        System.out.println("===== TEST 1 =====");
        Department newDepartment = new Department(null, "João Bobo");
        departmentDao.insert(newDepartment);
        System.out.println(" Inserted new id: " + newDepartment.getId());
    }
}