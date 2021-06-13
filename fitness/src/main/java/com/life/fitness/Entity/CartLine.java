package com.life.fitness.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter
@Getter
@Table(name = "cart_line")
public class CartLine implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@OneToOne
	private ProductDetails product;
	
	@Column(name="cart_id")
	private int cartId;
	
	@Column(name="total")
	private double total;
	
	@Column(name="product_count")
	private int productCount;
	
	@Column(name="buying_price")
	private double buyingPrice;
	
	@Column(name="is_available")
	private boolean isAvailable;


}
