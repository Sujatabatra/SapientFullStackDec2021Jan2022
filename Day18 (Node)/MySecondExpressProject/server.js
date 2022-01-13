const express=require('express');

//express app
const app=express();

//listen for requests at port :3000
app.listen(3000);

app.get('/',(request,response)=>{
    response.sendFile("./views/index.html",{root:__dirname});
});

app.get("/about",(request,response)=>{
    response.sendFile("./views/about.html",{root:__dirname});
});

app.get("/about-us",(request,response)=>{
    console.log("Hello");
    response.redirect("/about");
})

app.use((request,response)=>{
    response.status(404).sendFile("./views/404.html",{root:__dirname})
});
