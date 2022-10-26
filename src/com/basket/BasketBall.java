package com.basket;
/**
 * 
 * BasketBall pojo class.
 *
 */
public class BasketBall {
	private String brandName = "";
	private String color = "";
	private double price;
	
	/**
	 * No-arg constructor.
	 */
	public BasketBall() {
	}
	/**
	 * Overloaded constructor to instantiate {@link BasketBall}
	 * 
	 * @param brandName brand name of basket ball.
	 * @param color color of basket ball.
	 * @param price price of basket ball.
	 */
	public BasketBall(final String brandName, final String color, final double price) {
		this.brandName = brandName;
		this.color = color;
		this.price = price;
	}
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}