//Function Expression
var wish=function(name){
  return "Hello "+name;
}

wish("Vidhyadhar");

//function declaration
function demo(){
  console.log("Hi I am demo functiion");
}

var executor=function(fn,name){
  var greet=fn(name);
  console.log(greet);
}

executor(wish,"Navnath");

//function without name : Anonymous function
executor(function(name){
  return "Welcome "+name;
},"Jyothi");