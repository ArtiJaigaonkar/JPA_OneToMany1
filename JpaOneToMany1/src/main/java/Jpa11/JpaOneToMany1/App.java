package Jpa11.JpaOneToMany1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner ac=new Scanner(System.in);
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("TP");
        EntityManager em=emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Courses11 obj1=new Courses11(101,"Java Full Stack",3);
        Courses11 obj2=new Courses11(102,"Angular",2);
        Courses11 obj3=new Courses11(103,"C",4);
        
        em.persist(obj3);
        em.persist(obj2);
        em.persist(obj1);
        
        List<Courses11> list=new ArrayList<>();
        list.add(obj3);
        list.add(obj2);
        list.add(obj1);
        
        Student11 obj = new Student11(101,"Arti","Latur",list);
        em.persist(obj);
        
        em.getTransaction().commit();
        
    }
}
