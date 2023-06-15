package com.example.CardProjectSpring.tools;


import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.hibernate.HibernateException;
import org.hibernate.Session;




@Service
public class ServiceHibernate {

    private Session _session;

    public ServiceHibernate() {
        try {
            _session = HibernateUtil.getSessionFactory().openSession();
        }catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

    public Session getSession() {return HibernateUtil.getSessionFactory().openSession();}

}
