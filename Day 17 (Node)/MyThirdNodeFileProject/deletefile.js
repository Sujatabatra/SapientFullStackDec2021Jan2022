const fs=require('fs')

if(fs.existsSync('./docs/deleteMe.txt')){
    fs.unlink('./docs/deleteMe.txt',(err)=>{
        if(err)
            console.log(err)
        else
            console.log('file deleted');

    })
}
else
    console.log("file does not exist")