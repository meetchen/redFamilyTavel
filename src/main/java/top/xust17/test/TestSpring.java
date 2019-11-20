package top.xust17.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.xust17.dao.UserDao;
import top.xust17.domain.User;
import top.xust17.service.UserService;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestSpring {
    @Test
    public void test1(){
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService userService = (UserService) ac.getBean("userService");
        userService.findAll();
    }

    @Test
    public void test2() throws IOException {
        // 加载配置
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建Sql
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> all = mapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
        sqlSession.close();
        resourceAsStream.close();
    }
}
