import com.mzdora.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class javaTest {
    public static void main(String[] args) {
        ApplicationContext Context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Student student = (Student) Context.getBean("Student");
        System.out.println(student);
    }
}
