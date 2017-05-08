package java0508;

public class Car implements Valuable{
	private double price;
	private String name;
	
	public Car(String name,double price){
		this.name=name;
		this.price=price;
	}
	public double EstimateValue(int month){
		price*=0.8;
		return price*Math.pow(0.99, month);
	}
	public double EstimateValue(){
		price=price*0.8;
		return price=(price*Math.pow(0.99, 1));
	}
	public String toString(){
		return String.format("Car name:%s\ninitial price:%.2f",name,price);
	}
	

}
