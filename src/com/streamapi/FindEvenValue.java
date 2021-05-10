package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenValue {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(11,20,30,40,45,89,13);
		List<Integer> evnlst1 = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evnlst1);

		list.stream().filter(i->i%2==0).forEach(i->System.out.print(i+" "));
		
		List<Integer> evnlst2 = list.stream().filter(i->i%2==0).map(i->i).collect(Collectors.toList());
		System.out.println(evnlst2);

	
	}

}
