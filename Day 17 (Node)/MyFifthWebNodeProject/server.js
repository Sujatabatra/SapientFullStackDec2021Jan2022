const http=require('http');

const server=http.createServer((request,response)=>{
    // console.log('request made');
    // console.log(request.url,request.method);

    // response.setHeader("Content-Type","text/plain");
    response.setHeader("Content-Type","text/html");
    response.write("<h1>Node JS</h1>")
    response.write("<p>Hello Everyone, wishing you all from Node JS App</p>");
    response.write("<p>From SFCC Batch!</p>");
    response.end();
})

server.listen(3000,()=>{
    console.log("Listening for request on port 3000");
})