import com.mzdora.pojo.Shaco;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Shaco shaco = (Shaco) context.getBean("shaco");
        System.out.println(shaco);
        shaco.getBoxs().shout();
    }
}