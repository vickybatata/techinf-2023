function separar (frase, separador){
    return frase.split(separador);
}
//ex1
//cenario 1
console.log(separar("O rato roeu a roupa do rei de Roma", " ")); 
//cenario 2
console.log(separar("JavaScript é incrível", " "));
//cenario 3
console.log(separar("Eu gosto de programar", " "));
 //ex2 
 //cenario 4  
console.log(separar("João,Maria,José", ",")); 
//cenario 5
console.log(separar("Ana Maria,Paulo Coelho,Carla", ","));
//ex3
// cenario 6
console.log(separar("fulano@gmail.com;ciclano@yahoo.com;beltrano@outlook.com", ";"));
//cenario 7
console.log(separar("contato@empresa.com;suporte@site.com", ";"));
//cenario 8
console.log(separar("admin@fundacao.org;info@site.org", ";"));
//ex4
//cenario 9
console.log(separar("Nome -- Sobrenome -- Idade -- País", " -- "));
//cenario 10
console.log(separar("Item 1 -- Item 2 -- Item 3 -- Item 4", " -- "));
//cenario 11
console.log(separar("Rua A -- Bairro B -- Cidade C -- Estado D", " -- "));
//ex5
// cenario 12
console.log(separar("/usr/local/bin", "/"));
//cebario 13
console.log(separar("/home/user/documents", "/"));
//cenario 14
console.log(separar("/var/www/html", "/"));
//ex06
//cenario 15
console.log(separar("JavaScript", ''));
//cenario 16
console.log(separar("Eu gosto de programar", ''));
//cenario 17
console.log(separar("Olá Mundo", ''));
//ex07
//cenario 18
console.log(separar("O sol está brilhando. O céu está azul. É um ótimo dia!", "."));
//cenario 19
console.log(separar("Programar é divertido. Pratique todos os dias.", "."));
//cenario 20
console.log(separar("Olá. Como vai você?", "."));
//ex06
//cenario 21
console.log(separar("15/08/2024", "/"));
//cenario 22
console.log(separar("01/01/2020", "/"));
//cenario 23
console.log(separar("31/12/1999", "/"));
//ex10
//cenario 24
console.log(separar("14:35:20", ":"));
//cenario 25
console.log(separar("09:05:15", ":"));
//cenario 26
console.log(separar("23:59:59", ":"));
//cenario 27
console.log(separar("Primeira linha\nSegunda linha\nTerceira linha", "\n"));
//cenario 28
console.log(separar("Lorem ipsum dolor sit amet,\nconsectetur adipiscing elit,\nsed do eiusmod tempor incididunt ut labore.", "\n"));
//cenario 29
console.log(separar("Linha única sem quebras", "\n"));
//cenario 30
console.log(separar("Primeira linha de um texto. Segunda linha usando template strings. Terceira linha com mais detalhes.", "\n"));
//cenario 31
console.log(separar("Lorem ipsum dolor sit amet,consectetur adipiscing elit. Ut enim ad minim veniam.", "\n"));
//cenario 32
