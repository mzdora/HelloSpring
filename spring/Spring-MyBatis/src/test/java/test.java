import com.mzdora.dao.userMapper;
import com.mzdora.dao.userMapperImpl;
import com.mzdora.pojo.user;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.mzdora.utils.MybatisUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        userMapper user = (userMapper) context.getBean("user");
        List<com.mzdora.pojo.user> users = user.getUsers();
        for (com.mzdora.pojo.user user1 : users) {
            System.out.println(user1);
        }
    }
}
