package SpringCore.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext cntx=new ClassPathXmlApplicationContext("spring.xml");
        Phone p= (Phone)cntx.getBean("idpass");
        p.vodaphone();
        p.vodaphone();
    }
}
