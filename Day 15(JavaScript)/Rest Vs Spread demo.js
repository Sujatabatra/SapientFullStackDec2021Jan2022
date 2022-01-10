function sum(...args){  //rest
  var sum=0;
  args.forEach(function(number){
    sum+=number;
  });
  return sum
}

console.log(sum(10,20,30,40));

function add(a,b,c){
  return a+b+c;
}

var arr=[10,20,30,40];
console.log(add(...arr)); //Spread