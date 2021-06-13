package com.life.fitness.Service;


import com.life.fitness.Entity.Cart;

public interface CartService {
	
	boolean saveCart(Cart cart);
	boolean updateCart(Cart cart);
	
	Cart findCart();

}
