const { query } = require('express');
const express=require('express');

const app=express();

app.listen(3000);

app.get("/",(request,response)=>{
    response.sendFile('./views/index.html',{root:__dirname});
})

app.get("/login",(request,response)=>{
    var data=request.query;
    console.log(data);
    if(data.uname===data.pwd){
        response.sendFile('./views/success.html',{root:__dirname});
    }
    else{
        response.sendFile('./views/failure.html',{root:__dirname});
    }
})