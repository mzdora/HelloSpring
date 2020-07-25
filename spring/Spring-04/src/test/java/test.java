import com.mzdora.config.JavaConfig;
import com.mzdora.pojo.Dell;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Dell dell = (Dell) context.getBean("dell");
        dell.getLaptop().shout();
        System.out.println(dell.getName());
    }
}
