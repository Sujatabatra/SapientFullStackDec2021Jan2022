const express=require('express');
const morgan=require('morgan');

//express app
const app=express();

//listen for requests at port :3000
app.listen(3000);

//middleware & static files
app.use(express.static('public'));

//middleware
app.use((request,response,next)=>{
    console.log("new request made");
    console.log("host : "+request.hostname);
    console.log("path : "+request.url);
    next();
})

app.use((request,response,next)=>{
    console.log("in next middleware");
    next();
})

app.use(morgan('dev'))

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
