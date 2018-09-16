package com.example.demo;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.*;

@SpringBootApplication
//@Controller
@RequestMapping()
public class DemoApplication {
	private Kkoko kkoko = null;
	private static DemoApplication jojo(){
		return new DemoApplication();
	}
	@RequestMapping()
	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//		DemoApplication demoApplication = new DemoApplication();
//		Kkoko kkoko = demoApplication.kkoko;
//		System.out.println(">>>>> " + kkoko);
//		System.out.println("3123132 : " + DemoApplication.jojo());
//		int[] jj = {1,2,3,4,5,'3'};
//		int[] jjs = {1,2,3,4,5};
//		Map<String,Object> map = new HashMap<>(7);
//		List list = new ArrayList(90);
//		list.add("o0o");
//		list.add(90);
//		list.add(90);
//		list.add(90);
//		list.add(90);
//		Iterator iterator = list.iterator();
//		while(iterator.hasNext()){
//			System.out.println("iterte : " + iterator.next());
//		}
//		for(Object obj : list){
//			System.out.println("obj : "+ obj);
//		}
		int[] jio = new int[9];
		List list = new ArrayList();

//		JSONObject jsonObject = JSONObject.parseObject("{tets:tt}");
//		System.out.println(jj + "jjs : " +jjs[2]);
		System.out.println("int[] : " + Arrays.toString(jio));
//		System.out.println("list : " + list);
//		System.out.println("list : " + list.get(1));
//		System.out.println("java is a perfect language!!!");
	}

}

class Kkoko{

}
