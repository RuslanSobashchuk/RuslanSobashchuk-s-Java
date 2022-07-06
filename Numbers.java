/**
 * 
 */

/**
 * @author Sobashchuk Ruslan
 *
 */
public class Numbers {
			   public static void main(String[] args) {

				   int[] myList = {3, 4, 5, 6, 7, 8, 9, 10};
		      System.out.print("Элементы массива myList: ");
		      for (int i = 0; i < myList.length; i++) {
		          System.out.print(myList[i] + ", ");
		       }
		      System.out.print("\nЭлементы массива, кратные 3 = ");
		      for (int i = 0; i < myList.length; i++) {
		         if(i%3 == 0){
		             System.out.print(myList[i] + ", ");
		         }
		      }
		      System.out.print("\nЭлементы массива, некратные 3 = ");
		      for (int i = 0; i < myList.length; i++) {
		         if(i%3 != 0){
		             System.out.print(myList[i] + ", ");
		         }
		      }
		   }
		}