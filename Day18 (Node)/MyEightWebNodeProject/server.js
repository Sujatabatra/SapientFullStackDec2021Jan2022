const http=require('http');
const fs=require('fs');
const {URL}=require('url');
const {parse:parseQuery}=require('querystring');

var server=http.createServer((request,response)=>{
    
    const serverOrigin="http://localhost:3000";

    const url=new URL(request.url,serverOrigin);
    
    if(request.url==='/'){
        fs.readFile('./views/index.html',(err,data)=>{
            if(err){
                console.log(err);
                response.end();
            }
            else{
                response.end(data);
            }
        })
    }
    else if(url.pathname==='/login'){
        console.log("hello");
        var query=parseQuery(url.search.substr(1));
        console.log(query);
        if(query.uname===query.pwd)
            response.write("<p>Logic Successful!</p>")
        else
            response.write("<p>Login Failed</p>")
        response.end();

    }
})

server.listen(3000,()=>{
    console.log('server is listening on port 3000')
})