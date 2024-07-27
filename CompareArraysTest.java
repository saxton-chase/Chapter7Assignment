
public class CompareArraysTest {

	public static void main(String[] args) {
		int [] arrayOne = new int[]{2,5,5,7,8};
		int [] arrayTwo = new int[]{12,12,20,5,6};
		int [] arrayThree = new int[]{12,12,20,5,6};
		int [] arrayFour = new int[]{100,50,60,75,80,30,20,5,1,2};
		int [] arrayFive = new int []{2,5,5,7,8};
		
		//Welcome
		System.out.print("Welcome To My Program!!!\n\n\n");
		///
		System.out.print("This program will test whether arrays are equivalent or not.\n");
		System.out.print("The program will test six seperate arrays.\n");
		System.out.print("If the arrays are equal 'true' will be printed, and if they are not, 'fasle' will be printed.\n\n\n\n\n");
		///
		
		//printing value of comparisons
		System.out.printf("The comparison of array 1 and array 2 produces %B\n",CompareArrays.compare(arrayOne, arrayTwo));
		System.out.printf("The comparison of array 1 and array 3 produces %B\n",CompareArrays.compare(arrayOne, arrayThree));
		System.out.printf("The comparison of array 3 and array 4 produces %B\n",CompareArrays.compare(arrayThree, arrayFour));
		System.out.printf("The comparison of array 1 and array 5 produces %B\n",CompareArrays.compare(arrayOne, arrayFive));
		System.out.printf("The comparison of array 1 and array 2 produces %B\n",CompareArrays.compare(arrayOne, arrayTwo));
		System.out.printf("The comparison of array 1 and array 4 produces %B\n",CompareArrays.compare(arrayOne, arrayFour));
		System.out.printf("The comparison of array 2 and array 3 produces %B\n",CompareArrays.compare(arrayTwo, arrayThree));
	}

}
