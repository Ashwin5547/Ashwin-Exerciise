package com.exercise.demo;
import java.util.*;
public class Exercise002 {

	public static void main(String[] args) {
		ArrayList<String> words=new ArrayList<String>();
		words.add("himalayan");
		words.add("kawasakizx");
		words.add("triumph");
		words.add("bmwgs");
		words.add("cbr");
		
		findWord(words);
		
		}
	
	public static void findWord(ArrayList<String> words) {
		
		
		for(int i=0;i<words.size();i++) {
			
			String n=words.get(i);
			
			if(n.length()==10){
				System.out.println(n);
			}
		}
	}
}