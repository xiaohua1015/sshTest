package cn.isdev.ssh.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Created by lsh134667 on 2018/7/24.
 */
public class HibernateUtils {

    private static SessionFactory sessionFactory;
    private static ThreadLocal<Session> threadLocal;

    static {
        Configuration configuration = new Configuration();
        Configuration configure = configuration.configure();
        sessionFactory = configure.buildSessionFactory();
        threadLocal = new ThreadLocal<>();
    }

    public static Session getSession(){
        Session session = threadLocal.get();
        if(session == null || !session.isOpen()){
            session = sessionFactory.openSession();
            threadLocal.set(session);
        }
        return session;
    }

    public static void closeSession() {
        Session session = threadLocal.get();
        if (session != null) {
            session.close();
        }
    }
}
