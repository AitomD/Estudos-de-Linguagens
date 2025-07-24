var prompt = require("prompt-sync")();

let n1 = Number(prompt('Digite um numero: '));
let n2 = Number(prompt('Digite outro numero: '))

let soma = n1 + n2
console.log('%d + %d é igual a %d', n1, n2, soma);
