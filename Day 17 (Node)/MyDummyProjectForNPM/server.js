const http=require('http');
const fs=require('fs');
const _=require('lodash');

const server=http.createServer((request,response)=>{
   
    const num=_.random(0,20);
    console.log(num);
    
    const greet=_.once(()=>console.log("Hi I am Greet"));
    greet();
    greet();
   
    fs.readFile('./views/index.html',(err,data)=>{
        if(err){
            console.log(err);
            response.end();
        }
        else{
            response.end(data);
        }
    })
})
server.listen(3000,()=>{
    console.log("Server listening at 3000");
})