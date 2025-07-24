const prompt = require('prompt-sync')();

function maiormenor(a,b){
    if(a > b){
        return console.log('A é maior que B');
    }
    else{
        return console.log('B é maior');
        
    }
}
maiormenor(6,5);