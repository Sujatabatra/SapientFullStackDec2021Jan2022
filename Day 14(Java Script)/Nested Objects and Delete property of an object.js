var obj={
  "firstname":"Sujata",
  lastname:"Batra",
  yearsofexp:21,
  technology:"Java",
  address:{
    hNo:111,
    state:"delhi",
    city : "delhi",
    pincode :110009
  }
}

console.log(obj.address.hNo);
console.log(obj["address"]["hNo"]);
console.log(obj["address"].hNo);
console.log(obj.address["hNo"]);

delete obj.lastname;
console.log(obj);


