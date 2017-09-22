
var  DIGIT_TO_FIND = 4;
var  NUMBER = 56287;

function findIfDigitIsPresent(thisNumber) {
	console.log(thisNumber);
	while (thisNumber !== 0) {
		
		console.log(thisNumber);
         // this will not work here 
		// ************************//
	    var thisDigit = thisNumber % 10;
	    thisNumber = thisNumber / 10;

	    if (thisDigit === DIGIT_TO_FIND) {
	        return true;
	    }
	}
	return false;
}


function odoMeter() {
	var increment = 0;
	for(var i = 1; i <= NUMBER; i++) {
		var tmp = findIfDigitIsPresent(i);
		if(tmp) {
			increment = increment + 1;
		}
	}
	console.log(NUMBER - increment)
}

