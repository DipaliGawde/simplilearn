package dataTypes;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");

	    String userName = myObj.nextLine();  // Read user input
	    System.out.println("Hello " + userName +",let us learn Java data types");  // Output user input
	    
	    System.out.println("Following are the data types ans their sizes");
	    
	    System.out.println("byte is a data type and its size is :"+Byte.SIZE +" bits"+  "and "+Byte.BYTES+" bytes");
	    System.out.println("short is a data type and its size is :"+Short.SIZE+" bits"+ " and "+Short.BYTES+" bytes");
	    System.out.println("int is a data type and its size is :"+Integer.SIZE+" bits"+ " and "+Integer.BYTES+" bytes");
	    System.out.println("long is a data type and its size is :"+Long.SIZE+" bits"+ " and "+Long.BYTES+" bytes");
	    System.out.println("float is a data type and its size is :"+Float.SIZE+" bits"+ " and "+Float.BYTES+" bytes");
	    System.out.println("double is a data type and its size is :"+Double.SIZE+" bits"+ " and "+Double.BYTES+" bytes");
	    System.out.println("boolean is a data type and it returns TRUE or False");
	    System.out.println("char is a data type and its size is :"+Character.SIZE+" bits"+ " and "+Character.BYTES+" bytes");
	}

}
