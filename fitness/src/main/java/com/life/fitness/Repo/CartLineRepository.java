package com.life.fitness.Repo;

import com.life.fitness.Entity.CartLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("cartLineRepository")
public interface CartLineRepository extends JpaRepository<CartLine, Integer>{
	
	List<CartLine> findCartLineByCartId(int cartId);
	
	CartLine findCartLineByCartIdAndId(int cartId,int id);

}
