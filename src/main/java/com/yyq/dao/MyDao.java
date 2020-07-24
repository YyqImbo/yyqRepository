package com.yyq.dao;

import com.yyq.dao.bean.OrderLineQueryCondition;
import com.yyq.dao.bean.OrderLineQueryResult;
import com.yyq.dao.bean.User;

import java.util.List;

public interface MyDao {
    /*
    * 查询条件包含`订单编号(模糊)、订单行号、物料编码(模糊)、物料名称(模糊)、订单创建人id、订单客户id`
    * 查询结果包含`订单编号、客户名称、客户地址、订单备注、订单创建人、
    *                              订单行号、物料编码、物料名称、单价、数量、行总价`
    * */
    List<OrderLineQueryResult> selectOrderLinesByCondition(OrderLineQueryCondition condition);

    int insertUser(User user);

    int updateUser(User user);

    int deleteUser(Long userId);
}
