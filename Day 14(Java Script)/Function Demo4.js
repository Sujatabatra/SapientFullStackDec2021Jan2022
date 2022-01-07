var obj={
  prop1:10,
  prop2:'Sujata',
  prop4:function(){
    console.log("demo to show function as a value of one of the property of an object");
  }
};
obj.prop3= function(name){
  return "Hello "+name;
}

console.log(typeof obj.prop3);
console.log(obj);