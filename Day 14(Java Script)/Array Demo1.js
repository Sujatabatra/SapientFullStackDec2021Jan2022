var arr=[10,20,30,40];

console.log(arr);
console.log(arr[0]);
console.log(arr[1]);
console.log(arr[2]);
console.log(arr[3]);
console.log(arr[4]);

console.log(" length of an array : " +arr.length);
console.log(" length of an array : " +arr["length"]);

console.log("Type of Array "+typeof arr);

arr.prop1="Sujata";
console.log(arr);

arr[9]=80;
console.log(arr.length);

arr.push(70);
console.log(arr);

arr.unshift(5);
console.log(arr);
