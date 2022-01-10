// function print(a,b){
//   console.log(arguments);
//   console.log(a);
//   console.log(b);
// }

function print(){
  for(var index=0;index<arguments.length;index++){
    console.log(arguments[index]);
  }
}
// console.log(print);
print(11,22,33,44,'Sujata');