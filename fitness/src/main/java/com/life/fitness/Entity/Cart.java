package com.life.fitness.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "cart")
public class Cart implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@OneToOne
	private User user;

	@Column(name = "cart_lines")
	private int cartLines;

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
