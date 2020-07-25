import com.mzdora.log.crud;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.converter.json.GsonBuilderUtils;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        crud crudImpl = (crud) context.getBean("crudImpl");
        crudImpl.add();
    }
}
