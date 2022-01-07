function greet(){
  console.log("Hello Everyone");
}

function greet(name,timeOfDay){
  console.log("Welcome "+name+" in the "+timeOfDay);
}
greet();
var returnValue=greet("Ganesh","Morning");
console.log(returnValue);

function sum(number1,number2){
  return number1+number2;
}

var retValue=sum(10,20);
console.log(retValue);
