package com.neu.elm_spm.controller;

import com.neu.elm_spm.po.Cart;
import com.neu.elm_spm.service.CartService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/CartController")
public class CartController {
    @Resource
    private CartService cartService;

    @RequestMapping("/listCart")
    public List<Cart> listCart(Cart cart){
        return cartService.listCart(cart);
    }

    @RequestMapping("/saveCart")
    public int saveCart(Cart cart){
        return cartService.saveCart(cart);
    }

    @RequestMapping("/updateCart")
    public int updateCart(Cart cart){
        return cartService.updateCart(cart);
    }

    @RequestMapping("/removeCart")
    public int removeCart(Cart cart){
        return cartService.removeCart(cart);
    }
}
