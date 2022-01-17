var express=require("express");
var fs=require("fs");
var bodyParser=require("body-parser");

var app=express();
app.use(bodyParser.json());

app.get("/items",function(request,response){
    response.header('Access-Control-Allow-Origin', "*");
    response.header('Access-Control-Allow-Methods', 'GET,PUT,POST,DELETE');
    response.header('Access-Control-Allow-Headers', 'Content-Type');
    var myReadStream=fs.createReadStream(__dirname+"/data.json","utf8");
    myReadStream.pipe(response);

});

app.get("/items/:itemNo",function(request,response){
    response.header('Access-Control-Allow-Origin', "*");
    response.header('Access-Control-Allow-Methods', 'GET,PUT,POST,DELETE');
    response.header('Access-Control-Allow-Headers', 'Content-Type');
    fs.readFile("data.json","utf8",function(err,data){
        items=JSON.parse(data);
        
        for(i=0;i<items.length;i++){
            if(items[i].ItemCode===request.params.itemNo)
                response.send(JSON.stringify(items[i]));
        }
    });
});

app.post("/items",function(request,response){
    var data=fs.readFileSync("data.json","utf8");
    items=JSON.parse(data);
    var item=request.body;
    items.push(item);

    fs.writeFileSync("data.json",JSON.stringify(items));
    response.send(JSON.stringify(item));

});



app.listen(3000);
console.log("application listen at port 3000");
