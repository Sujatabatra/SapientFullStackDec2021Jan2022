package com.sujata.demo;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class InstanceMethodMethodReferenceOne {

	public static void main(String[] args) {
		
//		Consumer<String> consumer=name->System.out.println(name);
		
		Consumer<String> consumer=System.out::println;
		consumer.accept("Sujata");

		
//		BiFunction<String, String, String> biFunction=(str1,str2)->str1.concat(str2);
		
		BiFunction<String, String, String> biFunction=String::concat;
		
		System.out.println(biFunction.apply("Sujata", "Batra"));
	}

}
