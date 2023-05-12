let listaCompras = ["Maça", "Banana", "Pão", "Manteiga"];

console.log(listaCompras[1]);

listaCompras[2] = "Pão de sal";
console.log(listaCompras[2]);

listaCompras.push("café");
console.log(listaCompras);

//splice add a lista na posição 2 e o 0 é pra nao deletar nada.
listaCompras.splice(2,0,"Uva");
console.log(listaCompras);

//nova linha
console.log("\n")

//forEach percorre o array item por item. 
listaCompras.forEach(item => {
    console.log(`Item ${item}`);
});

//nova linha
console.log("\n")

const numeros = [10,25,35,36,8,94];
//imprimi todos os numeros do array 
numeros.forEach(n => console.log(n));


//nova linha
console.log("\n")

numeros.forEach(n => {
    if(n % 2 == 0){
        console.log(n);
    }
})
