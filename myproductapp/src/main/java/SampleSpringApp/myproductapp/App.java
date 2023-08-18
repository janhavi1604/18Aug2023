package SampleSpringApp.myproductapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mybean.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        //ctx.refresh();
        
        Product product=ctx.getBean(Product.class,coffee);
        
        System.out.println(product);
    }
}
