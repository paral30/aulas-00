function calcularMediaAritmetica(num1,num2) {
    return(num1 + num2) / 2;
}

console.log(calcularMediaAritmetica(10,8));


//Arrow Functions

const calMedPond = (num1,num2) => {
    return(num1 * 0.7) + (num2 * 0.3);

}

//Podemos reescrever assim:
//const calMedPond = (num1,num2) => (num1 * 0.7) + (num2 * 0.3);

console.log(calMedPond(80,78));
