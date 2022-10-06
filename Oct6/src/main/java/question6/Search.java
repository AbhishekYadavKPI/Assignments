package question6;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Search {
	public int FindCommon() {
		ArrayList<String> string1 = new ArrayList<String>(Arrays.asList("Apple","Banana","Tomato","Abc"));
		ArrayList<String> string2 = new ArrayList<String>(Arrays.asList("Onion","Tomato","Abc"));
		ArrayList<String> string3 = new ArrayList<String>(Arrays.asList("Capsicum","Potato","Tomato","Mushroom","Abc"));
		ArrayList<String> string4 = new ArrayList<String>(Arrays.asList("Tomato","Brinjal","Abc"));
		ArrayList<String> string5 = new ArrayList<String>(Arrays.asList("Kiwi","Mango","Tomato","Abc"));
		List common = string1.stream().filter(string2::contains)
				.filter(string3::contains).filter(string4::contains)
				.filter(string5::contains).collect(Collectors.toList());
		//List<Integer> index = retain.stream().Arrays.asList(string1.indexOf("retain"),string2.indexOf("retain"),string3.indexOf("retain"),string4.indexOf("retain"),string5.indexOf("retain"));
		
		/*
		 * common.forEach(i->System.out.println(i+" "+string1.indexOf(i)+","+string2.
		 * indexOf(i)+","+
		 * string3.indexOf(i)+","+string4.indexOf(i)+","+string5.indexOf(i)));
		 */	
		int result=0;
		System.out.println("The position of common element in Arraylist 3 is");
		result =string3.indexOf(common.get(0));
		
		return result;
	}

}
