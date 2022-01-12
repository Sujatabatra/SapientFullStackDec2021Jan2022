const http=require('http');
const fs=require('fs');

const server=http.createServer((request,response)=>{

    response.setHeader("Content-Type","text/html");

    fs.readFile("./views/index.html",(err,data)=>{
        if(err){
            console.log(err)
            response.end();
        }
        else{
            response.write(data);
            response.end();
        }
    })
})

server.listen(3000,()=>{
    console.log('server listening at port 3000')
})