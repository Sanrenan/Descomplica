//Exemplo Filter

var numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

var resultado = numeros.filter(item => item % 2 == 0);

console.log("Exemplo de uso array filter: " + resultado);

var numerosFilter = numeros.filter(
    function (valor) {
        return valor > 5;
    }
);

console.log(numerosFilter);

function buscarValores(valor) {
    return valor < 5;
}

var numerosEncontrados = numeros.filter(buscarValores);

console.log(numerosEncontrados);

var r1 = numeros.filter((valor) => {
    return valor > 5;
});

console.log(r1);

var funcionarios = [
    { nome: 'Renan', idade: 30 },
    { nome: 'Nita', idade: 32 },
    { nome: 'Jorge', idade: 9 },
    { nome: 'Helena', idade: 5 },
]

var pessoasListagem = funcionarios.filter(
    function (valor) {
        return valor.nome.length < 5 
    }
)

console.log(pessoasListagem);

//Fim do filter

