package assigment;

public class odoMetetr {

	public static void main(String[] args) {
		
		int NUMBER = 100;
		int increment = 0;
		odoMetetr ODO = new odoMetetr();
		for(int i = 1; i <= NUMBER; i++) {
			
			if(ODO.findIfDigitIsPresent(i)) {
				increment = increment + 1;
			}
		}
		System.out.print(NUMBER - increment);
	}
	boolean findIfDigitIsPresent(int thisNumber) {
		int thisDigit;
		int DIGIT_TO_FIND = 4;
		while (thisNumber != 0) {
		    thisDigit = thisNumber % 10;    
		    thisNumber = thisNumber / 10; 
		    System.out.println(thisNumber);
		    if (thisDigit == DIGIT_TO_FIND) {
		        return true;
		    }
		}
		return false;
	}

}

 