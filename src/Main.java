import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.crateSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

    }
}