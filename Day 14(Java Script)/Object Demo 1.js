var obj={
  "firstname":"Sujata",
  lastname:"Batra",
  yearsofexp:21,
  technology:"Java",
  1:"Value1"
}

console.log(obj.firstname);
console.log(obj["lastname"]);

// console.log(obj.1);  Syntax error
console.log(obj[1]);

var property="lastname";
console.log(obj.property);
console.log(obj[property]);