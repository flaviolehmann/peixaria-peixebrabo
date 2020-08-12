/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author flavi
 */
public class HibernateConfig {
    
    private static SessionFactory sessionFactory;
    
    private HibernateConfig() {
    }
    
    public static synchronized SessionFactory getInstance() {
        if (sessionFactory == null) {
            try {
                sessionFactory = new AnnotationConfiguration().configure("/config/hibernate.cfg.xml").buildSessionFactory();
            }
            catch(Exception err) {
                System.out.println(err);
            }
        }
        
        return sessionFactory;
    }
}
