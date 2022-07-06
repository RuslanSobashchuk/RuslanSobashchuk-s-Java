import java.util.Scanner;

/**
 * 
 */

/**
 * @author Sobashchuk Ruslan
 *
 */
public class Hello {
	 public static void main(String args[]) {
	        guess();
	    }
	 public static void guess() {
	        try (Scanner num = new Scanner (System.in)){
		System.out.print("Введите число: "); {
			int i;
			 i = num.nextInt();
			 if (i <=7) {
				 System.out.println("Введите число больше 7");		  
				 } else {
				 System.out.println("Привет");
				 } guess();
}
}
}
}