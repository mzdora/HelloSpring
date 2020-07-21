import com.mzdora.dao.StudentMapper;
import com.mzdora.pojo.student;
import com.mzdora.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Javatest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<student> students = studentMapper.getStudents();
        for (student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
