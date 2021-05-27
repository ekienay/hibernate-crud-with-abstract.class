import dao.DAO;
import model.Car;
import model.Mustang;
import model.Tundra;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import service.CarService;


public class Run  {
  public static final SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public static void main(String[] args) {
        DAO<Car,Long> carLongDAO = new CarService(factory);
        Mustang mustang = new Mustang();
        Tundra tundra = new Tundra();
        mustang.setId((long) 1);
        mustang.setMark("Ford!");
        mustang.setModel("Must!");
        carLongDAO.update(mustang);
    }
}
