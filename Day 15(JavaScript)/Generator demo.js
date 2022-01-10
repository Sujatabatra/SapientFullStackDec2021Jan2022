function * evenNumberGenerator1(){
      var num1 = 0;
      while(true){
         num1+=2
         yield num1
      }
   }
   // display first two elements
   var iter1 = evenNumberGenerator1();
   console.log(iter1.next())
   console.log(iter1.next())
   //using for of to iterate till 12
  console.log("====================") 
	for(var n1 of evenNumberGenerator()){
      if(n1==12)break;
      console.log(n1);
   }