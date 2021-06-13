package com.life.fitness.Service;


import com.life.fitness.Entity.Cart;
import com.life.fitness.Entity.CartLine;
import com.life.fitness.Repo.CartLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service("cartLineService")
@Transactional
public class CartLineServiceImpl implements CartLineService {

	@Autowired
	private CartService cartService;

	@Autowired
	private CartLineRepository cartLineRepository;

	@Override
	public CartLine findCartLineById(int id) {
		// TODO Auto-generated method stub
		return cartLineRepository.getOne(id);
	}

	@Override
	public boolean saveCartLine(CartLine cartLine) {
		// TODO Auto-generated method stub
		 cartLineRepository.saveAndFlush(cartLine);
		 return true;
	}

	@Override
	public boolean updateCartLine(CartLine cartLine) {
		// TODO Auto-generated method stub
		cartLineRepository.saveAndFlush(cartLine);
		return true;
	}

	@Override
	public boolean deleteCartLine(CartLine cartLine) {
		// TODO Auto-generated method stub
		cartLineRepository.delete(cartLine);
		return false;
	}

	@Override
	public List<CartLine> findAllCartLine(int cartId) {
		// TODO Auto-generated method stub
		return cartLineRepository.findAll();
	}

	@Override
	public List<CartLine> findCartLines() {
		Cart cart = cartService.findCart();
		return cartLineRepository.findCartLineByCartId(cart.getId());
	}

	@Override
	public CartLine findCartLineByCartIdAndProductId(int cartId, int id) {
		// TODO Auto-generated method stub
		return cartLineRepository.findCartLineByCartIdAndId(cartId, id);
	}

}
