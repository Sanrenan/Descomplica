class Pessoa{
    constructor(nome, sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    falar(){
        console.log('Olá' + " " + this.nome);
    
    }
}



p1 = new Pessoa("Renan", "Ribeiro");

p1.falar();