var numeros = [1,2,3,4,5,6,7,8,9,10];

var nums = numeros.map(function(valor){
    return valor * 2;
});

console.log(nums);

var funcionarios = [
    { nome: 'Renan', idade: 30 },
    { nome: 'Nita', idade: 32 },
    { nome: 'Jorge', idade: 9 },
    { nome: 'Helena', idade: 5 },
]

nomes = funcionarios.map(pessoa => pessoa.nome);

console.log(nomes);

//reduce
var total = 0;
for(var i =0; i < numeros.length; i++){
    total += numeros[i];
}

console.log(total);

var tot = numeros.reduce(function (total,numero){
    return total + numero;
}, 0);

console.log(tot);



