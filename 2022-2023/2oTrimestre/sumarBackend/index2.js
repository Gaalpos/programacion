let express = require('express')
let cors = require("cors")

let app = express()
app.use(cors())

function saludar(req, res){
    res.json("hola soy gaalpos backend")
}
function calcular(req, res){
    let num1=5
    let num2=3
    res.json(num1+num2)
}

function suma( req, res){
    let num1 = +req.params.num1;
    let num2 = +req.params.num2;
    // num1 = parseFloat(num1)
    // num2 = parseFloat(num2)
    let resultado = num1+num2;
    res.send(resultado+" ");
}


app.get("/hola", saludar)
app.get("/calcular", calcular)

// localhost:3000/suma/4/5
app.get("/suma/:num1/:num2", suma)



app.listen(3000)
console.log('Servidor a la escucha en el puerto 3000')