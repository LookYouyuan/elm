package com.neu.elm_spm.service;

import com.neu.elm_spm.po.Cart;

import java.util.List;

public interface CartService {
    int saveCart(Cart cart);
    int removeCart(Cart cart);
    int updateCart(Cart cart);
    List<Cart> listCart(Cart cart);
}
