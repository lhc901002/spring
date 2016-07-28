package org.michaelliu.spring.orm.mybatis.mapper;

import org.michaelliu.spring.beans.dto.OrderProduct;

import java.util.List;

/**
 * Created by Michael on 7/1/16.
 */
public interface OrderProductMapper {

    OrderProduct selectByPrimaryKey(Long id);

    List<OrderProduct> selectAll();

    void insert(OrderProduct orderProduct);

    void insertSelective(OrderProduct orderProduct);

}
