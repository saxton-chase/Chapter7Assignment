
public class CompareArrays {
	public static boolean compare(int [] arrayOne, int [] arrayTwo) {
		int counter = 0;
		boolean trueorFalse = false;
		if (arrayOne.length == arrayTwo.length) {
			while(counter != arrayOne.length) {
				if(arrayOne[counter] == arrayTwo[counter])
					trueorFalse = true;
				else
					trueorFalse = false;
				counter++;
			}
			return trueorFalse;
		}
		else
			return false;	
	}

}
