
	import java.io.*;

	public class True {

	public static void main(String[] args) {
	boolean dirFlag = false;

	// create File object
	File stockDir = new File("d://Stock/ stockDir ");

	try {
	   dirFlag = stockDir.mkdir();
	} catch (SecurityException Se) {
	System.out.println("Error while creating directory in Java:" + Se);
	}

	if (dirFlag)
	   System.out.println("Directory created successfully");
	else
	   System.out.println("Directory was not created successfully");
	}
	}