const fs=require('fs');
//reading file
//Asynchronous
fs.readFile('./docs/blog.txt',(err,data)=>{
    if(err){
        console.log(err);
    }else{
        console.log(data.toString())
    }
    
})
// console.log('last line')

//writing files
fs.writeFile('./docs/blog.txt','hello world',()=>{
    console.log("File was written");
})

fs.writeFile('./docs/blog1.txt','hello world',()=>{
    console.log("File was written");
})