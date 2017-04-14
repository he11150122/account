package java0410;

import java0410.Valuable;

public class Car implements Valuable{
	private double price;
	private String name;
	
	public Car(String name,double price){
		this.name=name;
		this.price=price;
	}
	public double EstimateValue(int month){
		price=price*0.8;
		return price=(price*Math.pow(0.99, month));
	}
	public String toString(){
		return String.format("Car name:%s\ninitial price:%.2f",name,price);
	}
	

}
