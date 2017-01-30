package helloworld;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HelloWorld 
{ 
    private static SessionFactory factory; 

    public static String foo()
    {
        try{
         factory = new AnnotationConfiguration().
                   configure("hibernate.cfg.xml").
                   //addPackage("com.xyz") //add package if used.
                   addAnnotatedClass(Employee.class).
                   buildSessionFactory();
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      ManageEmployee ME = new ManageEmployee();

        
        String s = "Testing updated JSP.\n:";
        s += ME.listEmployees();
        return s; 
    }
    
    public static void main(String args[])
    {
        System.out.println("zzzz");
    }  
}
