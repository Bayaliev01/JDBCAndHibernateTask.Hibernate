package peaksoft.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import peaksoft.model.User;

import java.util.Properties;

public class Util {
    // реализуйте настройку соеденения с БД

    //    public static SessionFactory getSessionFactory() {
//        Properties settings = new Properties();
//        settings.put(Environment.DRIVER, "org.postgresql.Driver");
//        settings.put(Environment.URL, "jdbc:postgresql://localhost:5432/jdbc");
//        settings.put(Environment.USER, "postgres");
//        settings.put(Environment.PASS, "bayaliev01");
//        settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL9Dialect");
//        settings.put(Environment.SHOW_SQL, "true");
//        settings.put(Environment.HBM2DDL_AUTO, "create");//validate //create
//
//
//        Configuration configuration = new Configuration();
//        configuration.addProperties(settings);
//        configuration.addAnnotatedClass(User.class);
//
//        return configuration.buildSessionFactory();
//    }
//
//    public static EntityManagerFactory entityManagerFactory() {
//        return Persistence.createEntityManagerFactory("peaksoft");
//    }
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        Properties prop = new Properties();

        prop.setProperty("connection.driver_class", "com.postgresql.Driver");
        prop.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/jdbc");
        prop.setProperty("hibernate.connection.username", "postgres");
        prop.setProperty("hibernate.connection.password", "bayaliev01");
        prop.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL9Dialect");
        prop.setProperty("hibernate.show_sql", "true");
        prop.setProperty("hibernate.hbm2ddl.auto", "update");
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(User.class);
        cfg.setProperties(prop);
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
        System.out.println("Connected to hibernate");
        return cfg.buildSessionFactory(serviceRegistry);
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
