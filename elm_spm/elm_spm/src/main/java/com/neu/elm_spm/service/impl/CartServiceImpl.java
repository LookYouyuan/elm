package com.neu.elm_spm.service.impl;

import com.neu.elm_spm.mapper.CartMapper;
import com.neu.elm_spm.po.Cart;
import com.neu.elm_spm.service.CartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Resource
    private CartMapper cartMapper;
    @Override
    public int saveCart(Cart cart) {
        return cartMapper.saveCart(cart);
    }

    @Override
    public int removeCart(Cart cart) {

        return cartMapper.removeCart(cart);
    }

    @Override
    public int updateCart(Cart cart) {
        return cartMapper.updateCart(cart);
    }

    @Override
    public List<Cart> listCart(Cart cart) {
        return cartMapper.listCart(cart);
    }
}
