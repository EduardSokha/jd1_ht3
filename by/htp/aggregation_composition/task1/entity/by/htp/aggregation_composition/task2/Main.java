package by.htp.aggregation_composition.task2;

import by.htp.aggregation_composition.task2.entity.Car;
import by.htp.aggregation_composition.task2.entity.Engine;
import by.htp.aggregation_composition.task2.entity.SpareWheel;
import by.htp.aggregation_composition.task2.entity.Tire;

public class Main {

	public static void main(String[] args) {
		
		Engine eng = new Engine();
		
		Tire t = new Tire();
		Tire t2 = new Tire();
		Tire t3 = new Tire();
		Tire t4 = new Tire();
		
		SpareWheel sp = new SpareWheel();
		
		Car ca = new Car(eng);
		
		ca.add(t);
		ca.add(t2);
		ca.add(t3);
		ca.add(t4);
		
		System.out.println(ca.getFuel());
		System.out.println(ca.go());
		System.out.println(ca.getTires());
		System.out.println(ca.getName());
		System.out.println("----------------");
		
		ca.go();
		ca.refuel(20);
		ca.change(sp, 2);
		
		System.out.println(ca.getFuel());
		System.out.println(ca.go());
		System.out.println(ca.getTires());
		System.out.println(ca.getName());
		System.out.println("----------------");
		
		ca.refuel(20);
		
		System.out.println(ca.getFuel());
		
		// TODO Auto-generated method stub

	}

}
