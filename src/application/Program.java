package application;

import java.util.Date;

import model.entitties.Department;
import model.entitties.Seller;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");
        System.out.println(obj);
        
        Seller seller = new Seller(2, "Pedro", "pedro2gmail.com", new Date(), 3000.0, obj);
        System.out.println(seller);
    }
}
