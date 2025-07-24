var prompt = require("prompt-sync")();

let n1 = Number(prompt('digite um numero: '))
let n2 = Number(prompt('digite outro numero: '))

if(n1 < n2){
    console.log('O numero %d é maior', n2);
}
else{
    console.log('O numero %d é maior', n1);
    
}