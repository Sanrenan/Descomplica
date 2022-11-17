var valores = [8, 1, 7, 2, 9];

console.log(valores[1]);

console.log("Array invertido: " + valores.reverse());

console.log("Array com join: " + valores.join('|'));

for (let i = 0;i < valores.length; i++)
{
    console.log(valores[i]);
}

var soma = 0;

for (let i = 0;i < valores.length; i++)
{
    soma += valores[i];
    console.log(soma);
}

console.log(valores);

var media = soma / valores.length;

console.log(media);

var retirado = valores.shift();

console.log("primeiro elemento retirado: " + retirado);

console.log(valores);

valores.push(11);

console.log("acrescentando com push: " + valores);

valores.pop();

console.log("retirando o ultimo elemento com pop: " + valores);

var arr1 = [10, 5, 6, 8, -4, 3];

console.log(arr1);

arr1.splice(4, 1);

console.log("removendo com splice: " + arr1);

var nomes = ['renan', 'natalia', 'jorge', 'julia', 'helena'];

console.log(nomes)

nomes.splice(0,1,'reninho')

console.log("removendo e alterando com splice: " + nomes);

nomes.unshift('Familia');

console.log(nomes);

var nomes2 = nomes.slice(1,6)

console.log("criando um novo array com slice: " + nomes2);

var nomes3 = ['bruna', 'celina', 'erika', 'laura'];

var familia = nomes2.concat(nomes3);

console.log("novo array criado com concat: " + familia);
