import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);

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

    */

        System.out.println("=== TESTE 1 INSERT ===");
        DepartmentDao depjdbc = DaoFactory.crateDepartmentDao();
        depjdbc.insert(new Department(5, "Departamento"));

        System.out.println("=== TESTE 2 GET BY ID ===");
        System.out.println(depjdbc.getById(1));

        System.out.println("=== TESTE 3 DELETE BY ID ===");
        depjdbc.deleteById(8);

        System.out.println("=== TESTE 4 UPDATE ===");
        depjdbc.update(new Department(5, "Gustavo Lyra department"));

        System.out.println("=== TESTE 5 FINDALL ===");
        List<Department> dep_list = depjdbc.findAll();
        dep_list.forEach(System.out::println);
    }
}