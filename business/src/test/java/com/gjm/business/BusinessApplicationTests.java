package com.gjm.business;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = BusinessApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class BusinessApplicationTests {
    public void print(int rows){
        if(rows>0){
            System.out.println("操作成功");
        }else {
            System.out.println("操作失败");
        }
    }
}
