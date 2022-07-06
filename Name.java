import java.util.Scanner;

public class Name {
	 public static void main(String args[]) {
	        guess();
	    }
	 public static void guess() {
		 System.out.print("Введите имя: "); {
	        try (Scanner str = new Scanner (System.in)){
					String name = str.next();
					if (name.equals("Вячеслав")) {
				 System.out.println("Привет, Вячеслав");		  
				 } else  {
				 System.out.println("Нет такого имени");
				 } guess();
			}
	     }
	}
}