var i = 0;
function timedCount() {
	  i = i + 1; 
	//start new thread with value of i
	postMessage(i);
	//call timedCount() method after every 500 millisecond i.e start a new thread with icremented value of i in every 1/2 second
    setTimeout("timedCount()",500);
}

timedCount();
