let express = require('express')

let app = express()

function saludar(req, res){
    res.send("hola soy gaalpos bakcend")
}
function calcular(req, res){
    let num1=5
    let num2=3
    res.send(num1+num2)
}

app.get("/", saludar)

app.listen(3000)