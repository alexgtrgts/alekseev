package Util;

import DAOExercise.pojos.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;




public class SessionUtil {
    private SessionFactory sessionFactory=null;

    public SessionUtil() {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
//            Configuration configure = new Configuration().configure();
//            configure.addAnnotatedClass(People.class);
//            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configure.getProperties());
//            sessionFactory = configure.buildSessionFactory(builder.build());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }

    public void stopSessionFactory() {
        sessionFactory.close();
    }

}
