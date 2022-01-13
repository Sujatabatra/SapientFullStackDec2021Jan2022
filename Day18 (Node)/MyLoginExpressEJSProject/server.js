const { query } = require('express');
const express=require('express');

const app=express();

app.set("view engine","ejs");
// app.set('views','myviews');

app.listen(3000);

app.get("/",(request,response)=>{
    response.render('index');
})

app.get("/login",(request,response)=>{
    var data=request.query;
    console.log(data);
    var message;
    if(data.uname===data.pwd){
        // response.render('success',{username:data.uname});
        message="Login Succesful!"
    }
    else{
        // response.render('failure',{username:data.uname});
        message="Login Failed!"
    }
    response.render('result',{username:data.uname,msg:message});
})