const prompt = require('prompt-sync')();
function par(num){
    if (num % 2 == 0){
        return true;
    }
    else{
        return false;
    }
}
let num = prompt('digite um numero: ')
console.log(par(num));
