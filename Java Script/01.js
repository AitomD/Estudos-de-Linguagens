var prompt = require("prompt-sync")();

let num = prompt('Digite um numero: ');

if (num % 2 == 0){
    console.log('Esse numero é par');
}
else{
    console.log('Esse numero é impar');
    
}