package hib;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class View {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Details d=new Details();
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
	    Session session=sf.openSession();
	    session.beginTransaction();
	    System.out.println("1.ADD Details \n2.UPDATE Details\3.Delete");
        int a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        if (a==1)
        {
        System.out.println("enter the id:");
        int r=s.nextInt();
        d.setId(r);
        System.out.println("enter the product name:");
        String t=s.next();
        d.setPro_name(t);
        System.out.println("enter the quantity in gm:");
        int p=s.nextInt();
        d.setQuantity(p);
        System.out.println("enter the no of products:");
        int f=s.nextInt();
        d.setNo_of_products(f);
        System.out.println("enter the dealer name:");
        String u=s.next();
        d.setDealer(u);
        System.out.println("enter the price");
        double g=s.nextDouble();
        d.setPrice(g);
        d.setTotal(g*f);
	    session.save(d);
	    session.getTransaction().commit();
	    session.close();
        }
	    if (a==2)
	    {
	    	int f;
	    	System.out.println("enter the id to update price");
	    	f=s.nextInt();
	    Details g=session.get(Details.class,f );
	    double c=s.nextDouble();
	    g.setPrice(c);
	    g.setTotal(c*g.getNo_of_products());
	    session.save(g);
	    session.getTransaction().commit(); 	
	    session.close();
	    } 
	}
}
