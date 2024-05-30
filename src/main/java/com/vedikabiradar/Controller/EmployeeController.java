package com.vedikabiradar.Controller;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class EmployeeController {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();


        factory.close();
        session.close();


//        EmployeeControllermethods.findEmployeeById();
//        EmployeeControllermethods.findEmployeeByName();
        EmployeeControllermethods.showOfficeCodesAsDepartment();
    }



}

