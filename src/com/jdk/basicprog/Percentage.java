package com.jdk.basicprog;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int physic=40;
        int chemistry=60;
        int math=50;
        float total_marks;
        float mark_per;     
        total_marks=physic+chemistry+math;
        mark_per=(total_marks/300)*100;
        System.out.println("Total marks="+total_marks);
        System.out.println("Percentage="+mark_per+"% ");
	}

}
