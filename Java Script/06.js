var prompt = require("prompt-sync")();

let nome = String(prompt('digite uma palavra: '))
let contra = nome.split('').reverse().join('')
console.log(contra);
