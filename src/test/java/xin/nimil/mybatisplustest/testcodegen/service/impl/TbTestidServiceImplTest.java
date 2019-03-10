package xin.nimil.mybatisplustest.testcodegen.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xin.nimil.mybatisplustest.testcodegen.entity.TbTestid;
import xin.nimil.mybatisplustest.testcodegen.service.ITbTestidService;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/3/10
 * @Time:15:10
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TbTestidServiceImplTest {

    @Autowired
    private ITbTestidService iTbTestidService;

    @Test
    public void testins(){
        TbTestid tbTestid = new TbTestid();
        tbTestid.setName("adasd");
        iTbTestidService.save(tbTestid);
    }

}