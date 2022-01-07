var arr=[10,20,30,40];

arr.forEach(function(item){
  console.log(item);
});

arr.forEach(function(item,index,array){
  console.log("item at "+index+" : "+item +" "+array[index]);
});


