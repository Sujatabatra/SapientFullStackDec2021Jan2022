const express=require('express');

//express app
const app=express();

//listen for requests at port :3000
app.listen(3000);

app.get('/',(request,response)=>{
    response.send("<p>Home Page</p>");
});

app.get("/about",(request,response)=>{
    response.send("<p1>About Page</p1>")
});
