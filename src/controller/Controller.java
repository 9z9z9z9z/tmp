package controller;

import java.util.Scanner;

import model.*;

public class Controller {
	public static Color inputColor() throws java.lang.IllegalArgumentException{
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Input color of linen: dark / light / colored\n");
		    try{
		    	return Color.valueOf(sc.nextLine());
		    }
		    catch (IllegalArgumentException exc){
		    	System.out.println("Incorrect input");
		    }
		    finally {
		    	}
		    }
	}
	
	public static int inputInt(String mes){
		System.out.println(mes);
	        while (true){
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Input integer number\n");
	        if (sc.hasNextInt()){
	            return sc.nextInt();
	        }
	    }
	}
	
	public static ColoredLinen inputLinen()
	{
	    System.out.println("=========================================\n");
	    int tempW = inputInt("Input temperature of washing\n");
	    int tempI = inputInt("Input temperature of ironing\n");
	    Color color = inputColor();
	    ColoredLinen ans = new ColoredLinen(tempW, tempI, color);
	    return  ans;
	}
	
	public static WashingMachine inputWS() {
	    int num = inputInt("Input number of linens\n");
	    int temp = inputInt("Input temperature of machine");
	    Color color = inputColor();
	    WashingMachine machine = new WashingMachine(temp, color, "Mef", "Ariel");
	    ColoredLinen[] basket = new ColoredLinen[num];
	    for (int i = 0; i < num; i++)
	    {
	        basket[i] = inputLinen();
	    }
	    return machine;
	}
}
