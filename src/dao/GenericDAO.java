/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.HibernateConfig;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author flavi
 */
public class GenericDAO<E> {
    
    public void save(E entity) {
        Session session = HibernateConfig.getInstance().openSession();
        
        session.getTransaction().begin();
        session.save(entity);
        session.getTransaction().commit();
        session.close();
    }
    
    public List<E> findAll(Class classe) {
        Session session = HibernateConfig.getInstance().openSession();
        session.getTransaction().begin();
        
        List<E> list = session.createQuery("SELECT a FROM " + classe.getName() + " a").list();
        session.close();
        
        return list;
    }
}
