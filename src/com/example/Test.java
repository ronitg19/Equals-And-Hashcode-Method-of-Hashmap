package com.example;

import java.util.HashMap;
import java.util.Map;

public class Test {
  public static void main(String[] args) {
	 Map<Student, String> map = new HashMap<Student, String>();
	 map.put(new Student(1, "A"),"Class10");
	 map.put(new Student(1, "A"),"Class10");
	 System.out.println(map);
}
}
