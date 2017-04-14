package java0410;

import java0410.Valuable;

public class Human implements Valuable{
	private String name;
	private int age;
	
	public Human(String name,int age){
		this.name=name;
		this.age=age;
	}
	public double EstimateValue(int month){
		return Double.POSITIVE_INFINITY;
	}
	public String toString(){
		return String.format("Human name:%s\nregistered age:%d",name,age);
	}	
	

}
