package com.day19.string;

public class StringBufferDemo {

	public static void main(String args[])
	{
		
		StringBuffer sb = new StringBuffer("Hello");
		
		StringBuffer sb2 = new StringBuffer("Hello");	
		
		// Initial Capacity
		System.out.println("Init Capacity: " + sb.capacity());
		System.out.println("Init Capacity2: " + sb2.capacity());
		
		// Append
		sb.append(" World!");
		System.out.println("Append: " + sb);
		
		// Insert
		sb.insert(1, "Java");
		System.out.println("Insert: " + sb);
		
		// Delete
		sb.delete(2, 4);
		System.out.println("Delete: " + sb);
		
		// Reverse
		sb.reverse();
		System.out.println("Reverse: " + sb);
		
		// Ensure Capacity
		System.out.println("Before Ensuring: " + sb.capacity());
		
		sb.ensureCapacity(50);
		
		System.out.println("After Ensuring: " + sb.capacity());
	}
	
}
