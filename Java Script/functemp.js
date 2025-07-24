const prompt = require("prompt-sync")();

function celsiusfah(temp){
    return temp * 1.8 + 32;
}
let cel = prompt('Digite uma temperatura em celsius: ')
console.log(celsiusfah(cel));