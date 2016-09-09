package kr.co.saramin.springcontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("---------------------testBeanFactory------------------------");
    	testBeanFactory();
    	
    	System.out.println("---------------------testBeanFactory2------------------------");
    	testBeanFactory2();
    	
    	System.out.println("---------------------testApplicationContext------------------------");
    	testApplicationContext();
    }
    
    private static void testBeanFactory() {
    	BeanFactory bf = new XmlBeanFactory(new ClassPathResource("config/applicationContext.xml"));
    	
    	User user = null;
    	Guestbook gb = null;
    	
    	// type으로 빈 가져오기
    	user = bf.getBean(User.class);
    	System.out.println(user.getName());
    	
    	// id로 가져오기
    	user = (User)bf.getBean("user");
    	System.out.println(user.getName());
    	
    	// name으로 가져오기
    	user = (User)bf.getBean("myuser");
    	System.out.println(user.getName());
    	
    	
    	// 같은 타입의 빈이 한 개 이상 있을 때 type으로 가져오기
    	// error
    	// gb = bf.getBean(Guestbook.class);
    	// System.out.println(gb.getMessage());
    	
    	// id로 빈 가져오기
    	gb = (Guestbook)bf.getBean("gb1");
    	System.out.println(gb.getMessage());
    	
    	System.out.println(bf.getBean("gb") == bf.getBean("gb1"));
    }
    
    private static void testBeanFactory2() {
    	BeanFactory bf = new XmlBeanFactory(new ClassPathResource("config/applicationContext2.xml"));
    	
    	User user = null;
    	Guestbook gb = null;
    	
    	// type으로 빈 가져오기
//    	user = bf.getBean(User.class);
//    	System.out.println(user.getName());
    	
    	// id로 가져오기
    	user = (User)bf.getBean("user");
    	System.out.println(user.getName());
    	
    	// name으로 가져오기
    	user = (User)bf.getBean("myuser");
    	System.out.println(user.getName());
    	
    	
    	// 같은 타입의 빈이 한 개 이상 있을 때 type으로 가져오기
    	// error
    	// gb = bf.getBean(Guestbook.class);
    	// System.out.println(gb.getMessage());
    }
    
    
    public static void testApplicationContext() {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config/applicationContext.xml");
    	
    	User user = null;
    	Guestbook gb = null;
    	
    	// type으로 빈 가져오기
    	user = ac.getBean(User.class);
    	System.out.println(user.getName());
    	
    	// id로 가져오기
    	user = (User)ac.getBean("user");
    	System.out.println(user.getName());
    	
    	// name으로 가져오기
    	user = (User)ac.getBean("myuser");
    	System.out.println(user.getName());
    	
    	
    	// 같은 타입의 빈이 한 개 이상 있을 때 type으로 가져오기
    	// error
    	// gb = bf.getBean(Guestbook.class);
    	// System.out.println(gb.getMessage());
    	
    	// id로 빈 가져오기
    	gb = (Guestbook)ac.getBean("gb");
    	System.out.println(gb.getMessage());
    	
//    	System.out.println(ac.getBean("gb") == ac.getBean("gb1"));
    }
}
