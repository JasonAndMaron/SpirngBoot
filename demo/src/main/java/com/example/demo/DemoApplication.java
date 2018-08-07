package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DemoApplication {
	private Kkoko kkoko = null;
	private static DemoApplication jojo(){
		return new DemoApplication();
	}
	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		DemoApplication demoApplication = new DemoApplication();
		Kkoko kkoko = demoApplication.kkoko;
		System.out.println(">>>>> " + kkoko);
		System.out.println("3123132 : " + DemoApplication.jojo());
		int[] jj = {1,2,3,4,5,'3'};
		int[] jjs = {1,2,3,4,5};
		Map<String,Object> map = new HashMap<>(7);
		List list = new ArrayList(90);
		list.add("o0o");
		list.add(90);
		list.add(90);
		list.add(90);
		list.add(90);
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println("iterte : " + iterator.next());
		}
		for(Object obj : list){
			System.out.println("obj : "+ obj);
		}

		System.out.println(jj + "jjs : " +jjs[2]);
		System.out.println("map : ");
		System.out.println("list : " + list);
		System.out.println("list : " + list.get(1));
		System.out.println("java is a perfect language!!!");
	}
}

class Kkoko{

}
