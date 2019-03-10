package xin.nimil.mybatisplustest.testcodegen.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xin.nimil.mybatisplustest.testcodegen.entity.TbTestgen;
import xin.nimil.mybatisplustest.testcodegen.service.ITbTestgenService;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/3/10
 * @Time:14:52
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TbTestgenServiceImplTest {

    @Autowired
    private ITbTestgenService iTbTestgenService;

    @Test
    public void testins(){
        TbTestgen tbTestgen = new TbTestgen();
        tbTestgen.setTestgen("teststst");
        iTbTestgenService.save(tbTestgen);
        System.out.println("insert success");
    }

    @Test
    public void changevalue(){
        TbTestgen tbTestgen = new TbTestgen();
        tbTestgen.setTestgen("aaa");
        iTbTestgenService.save(tbTestgen);
    }
}