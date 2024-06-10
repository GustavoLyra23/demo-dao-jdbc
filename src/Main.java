import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== TEST 1 ===");
        SellerDao sellerDao = DaoFactory.crateSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("=== TEST 2 By Department ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller s : list) {
            System.out.println(s);
        }
        System.out.println("=== TEST 3 By FindAll ===");
        List<Seller> listaa = sellerDao.findAll();
        for (Seller s : listaa) {
            System.out.println(s);
        }
        System.out.println("=== TEST 4 Insert ===");
        sellerDao.insert(seller);

        System.out.println("=== TEST 5 Update ===");
        seller = sellerDao.findById(1);
        seller.setName("Marta Wayne");
        sellerDao.update(seller);
        System.out.println("\n=== TEST 6 Delete ===");
        System.out.print("Enter id for delete test");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete Completed");


    }
}