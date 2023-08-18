package SampleSpringApp.myspringapp;

/**
 * Hello world!
 *
 */
import com.mybean.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("springbean.xml");
    	Device device=context.getBean(Device.class,"device");
    	System.out.println(device);
    	Location location=context.getBean(Location.class,"location");
    	System.out.println(location);
    	Technician technician=context.getBean(Technician.class,"technician");
    	System.out.println(technician);
        
    }
}
