package com.mayur.DemoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Alien mayur= new Alien();
       mayur.setAid(101);
       mayur.setAname("mayur");
       mayur.setColor("green");
       
       Configuration con= new Configuration();
       SessionFactory sf = con.buildSessionFactory();
       Session session = sf.openSession();
       session.save(mayur);
       
       
    }
}
