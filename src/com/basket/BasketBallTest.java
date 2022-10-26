package com.basket;

/**
 * 
 * Test class to test {@link BasketBall}.
 *
 */
public class BasketBallTest {

	public static void main(String[] args) {

		testNoArgConstructor();
		testSetter();
		testOverloadedConstructor();
	}
	
	/**
	 * Tests overloaded constructor.
	 */
	private static void testNoArgConstructor() {
		final BasketBall basketBall = new BasketBall();
		System.out.println("Testing No Argument Constructor, Get, Set mehtods:");
		System.out.println("Initial Object State");
		System.out.println("brandName: " + basketBall.getBrandName());
		System.out.println("color: " + basketBall.getColor());
		System.out.println("price: " + basketBall.getPrice());

	}
	
	private static void testSetter() {
		final BasketBall basketBall = new BasketBall();
		basketBall.setBrandName("Nike");
		basketBall.setColor("Black");
		basketBall.setPrice(12000);
		System.out.println("Setting brandName: Nike, color: Black, price: 12000");
		System.out.println("brandName: " + basketBall.getBrandName());
		System.out.println("color: " + basketBall.getColor());
		System.out.println("price: " + basketBall.getPrice());

	}
	

	/**
	 * Tests no-arg constructor
	 */
	private static void testOverloadedConstructor() {
		final BasketBall basketBall = new BasketBall("Puma", "Black", 10000);
		System.out.println("Testing Overloaded Constructor brandName: Pumna, color: Black, price: 10000");
		System.out.println("brandName: " + basketBall.getBrandName());
		System.out.println("color: " + basketBall.getColor());
		System.out.println("price: " + basketBall.getPrice());
	}


}
