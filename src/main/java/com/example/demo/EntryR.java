package com.example.demo;

import java.util.List;
import java.util.Scanner;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryR extends JpaRepository<Entry, Integer>{
	Entry findByTitle(String title);
	List<Entry> findByCategory(String category);
}



class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float a1,a2,a3,b1,b2,b3,c1,c2,c3;
		
		System.out.println("enter the value of a1");
		
		try {
			a1=sc.nextFloat();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("invalid data: please run the program Again and pass valid data types");
			return;
		}
		System.out.println("enter the value of b1");
		try {
			b1=sc.nextFloat();
			c1=5+a1;
		} catch (Exception e) {
			System.out.println("invalid data: please run the program Again and pass valid data types");
			return;// TODO: handle exception
		}
		
		System.out.println("enter the value of a2");
		try {
			a2=sc.nextFloat();
		} catch (Exception e) {
			System.out.println("invalid data: please run the program Again and pass valid data types");
			return;// TODO: handle exception
		}		
		
		System.out.println("enter the value of b2");
		try {
			b2=sc.nextFloat();
			c2=a2+b2;
		} catch (Exception e) {
			System.out.println("invalid data: please run the program Again and pass valid data types");
			return;// TODO: handle exception
		}		
		
		System.out.println("enter the value of a3");
		try {
			a3=sc.nextFloat();
		} catch (Exception e) {
			System.out.println("invalid data: please run the program Again and pass valid data types");
			return;// TODO: handle exception
		}		
		
		System.out.println("enter the value of b3");
		try {
			b3=9.0f;
			
			c3=c2+b3;
		} catch (Exception e) {
			System.out.println("invalid data: please run the program Again and pass valid data types");
			return;// TODO: handle exception
		}		
		
				
	}
}