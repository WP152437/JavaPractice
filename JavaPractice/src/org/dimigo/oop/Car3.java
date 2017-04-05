/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *	 |_ Car
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author ajin
 * @version : 1.0
 */
public class Car3 {

	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car3(){
	}

	public Car3(String Company, String Model, String Color, int MaxSpeed, int Price){
		this.company = Company;
		this.model = Model;
		this.color = Color;
		this.maxSpeed = MaxSpeed;
		this.price = Price;
	}
	public Car3(String Company, String Model, String Color,int MaxSpeed){
		this.company = Company;
		this.model = Model;
		this.color = Color;
		this.maxSpeed = MaxSpeed;
	}
	public Car3(String Company, String Model, String Color){
		this.company = Company;
		this.model = Model;
		this.color = Color;
	}

	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getPrice() {
		return price;
	}

	public void setCompany(String Company) {
		this.company = Company;

	}

	public void setModel(String Model) {
		this.model = Model;

	}

	public void setColor(String Color) {
		this.color = Color;

	}

	public void setMaxSpeed(int MaxSpeed) {
		this.maxSpeed = MaxSpeed;

	}

	public void setPrice(int Price) {
		this.price = Price;

	}

}
