package com.javalive.advanceCollettionConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExpressionWithCollection {

	public void streamWithLambda1() {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);
	}

	public void streamWithLambda2() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		Stream<Integer> stream = list.stream();
		List<Integer> evenNumbersList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.print(evenNumbersList);
	}

	public static void main(String[] args) {
		LambdaExpressionWithCollection obj=new LambdaExpressionWithCollection();
		obj.streamWithLambda1();
		obj.streamWithLambda2();
	}
}
