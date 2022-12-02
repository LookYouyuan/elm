package com.neu.elm_spm.mapper;

import com.neu.elm_spm.po.Cart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartMapper {

    int saveCart(Cart cart);

    int removeCart(Cart cart);

    List<Cart> listCart(Cart cart);

    int updateCart(Cart cart);
}
