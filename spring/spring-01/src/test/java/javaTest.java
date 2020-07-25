import com.mzdora.pojo.Cat;
import com.mzdora.pojo.CatSelecter;
import com.mzdora.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class javaTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //User user = (User) applicationContext.getBean("user");
        //System.out.println(user);
        CatSelecter cat = (CatSelecter) applicationContext.getBean("Cat");
        cat.getCat().meow();
    }
}
