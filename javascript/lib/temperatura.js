function Temperatura(celsius) {
    return (Number(celsius) * 9/5) + 32;
}

let celsius = prompt("Insira a temperatura em Celsius:");
let fahrenheit = Temperatura(celsius);
console.log(fahrenheit);
