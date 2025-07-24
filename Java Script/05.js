var prompt = require("prompt-sync")();

let n = Number(prompt('Digite um numero para ver sua tabuada: '))
for(i = 0; i <=10 ; i++){
    console.log('%d X %d = %d', n, i, i*n);
}