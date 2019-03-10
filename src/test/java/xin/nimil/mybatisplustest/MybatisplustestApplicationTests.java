package xin.nimil.mybatisplustest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xin.nimil.mybatisplustest.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisplustestApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void contextLoads() {
        System.out.println("----test before ----");
        System.out.println(userMapper.selectList(null));
    }

}
