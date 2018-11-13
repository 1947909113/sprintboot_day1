package com.baizhi.test;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class TestSpringboot extends BaseTest {

    @Autowired
    EmpService empService;

    @Test
    public void test(){
        List<Emp> emps = empService.queryAll();
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }

}
