package service;

import dao.DAO;
import model.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public  class CarService implements DAO<Car,Long> {

    private  final SessionFactory factory;

    public CarService(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(Car car) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.save(car);
            session.getTransaction().commit();
        }
    }

    @Override
    public void update(Car car) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.update(car);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Car car) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.delete(car);
            session.getTransaction().commit();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Car> findAll() {
        try(Session session = factory.openSession()) {
            Query<Car> query = session.createQuery("From car");
            return query.list();
        }
    }
}
