package com.yyq.dao;

import com.yyq.dao.bean.OrderLineQueryCondition;
import com.yyq.dao.bean.OrderLineQueryResult;
import com.yyq.dao.bean.User;
import org.junit.Test;
import org.omg.CORBA.INTERNAL;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MapperTest {

    static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void test1(){
        //selectOrderLinesByCondition
        MyDao mapper = (MyDao) context.getBean(MyDao.class);
        OrderLineQueryCondition con = new OrderLineQueryCondition();
        con.setCustomerUserId(2l);
        List<OrderLineQueryResult> list = mapper.selectOrderLinesByCondition(con);
        for (OrderLineQueryResult item: list) {
            System.out.println(item);
        }
        //insertUser
        User user = new User();
        user.setUserName("张三");
        user.setAddress("上海市");
        user.setUserNumber("20004");
        user.setCreatedBy(1l);
        mapper.insertUser(user);
        System.out.println("新添加用户的ID：" + user.getUserId());
        //updateUser
        User user2 = new User();
        user2.setUserId(2l);
        user2.setAddress("上海市浦东新区");
        Integer result_num = mapper.updateUser(user2);
        if(result_num > 0){
            System.out.println("更新成功=== " + user2);
        }

        //deleteUser
        Integer result_num2 = mapper.deleteUser(user.getUserId());
        if (result_num2 > 0){
            System.out.println("删除成功=== ID" + user.getUserId());
        }

    }

}
