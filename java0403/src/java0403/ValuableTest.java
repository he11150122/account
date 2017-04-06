package java0403;

public class ValuableTest {
	public static void main(String args[]){
		Valuable[] objectList = new Valuable[4]; //valuable이라는 interface를 impliment하는 클래스들을 담기위한 배열선언

		objectList[0] = new CheckingAccount(100,50,0.01,0.07);

		objectList[1] = new SavingAccount(100,0.05);

		objectList[2] = new Human("Mark", 20);

		objectList[3] = new Car ("MyCar", 5000);
		     

		for(Valuable objectItem : objectList){
			System.out.printf("%s \n", objectItem.toString());

		    System.out.printf("6 month later Valuable : %.2f\n\n", objectItem.EstimateValue(6));

		 }

	} 

		

}
