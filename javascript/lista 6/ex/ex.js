//Função 1
function csvToLines(csvString) {
    return csvString.split('\n');
}
console.log(csvToLines("nome;idade\nJoão;28\nMaria;32")); 
console.log(csvToLines("produto;preço\nArroz;5.00\nFeijão;7.50")); 
console.log(csvToLines("Filme;Diretor;Ano;Duração;Gênero;País de Origem;Receita Bruta\nParasita;Bong Joon-ho;2019;132;Drama;Coréia do Sul;258.8M\nGreen Book;Peter Farrelly;2018;130;Drama;EUA;321.8M")); 

//Função 2
function linesToColumns(lines) {
    let result = [];
    
    for (let i = 0; i < lines.length; i++) {
       result.push(lines[i].split(';'));
    }
    
    return result;
}

console.log(linesToColumns(["nome;idade", "João;28", "Maria;32"])); 
console.log(linesToColumns(["produto;preço", "Arroz;5.00", "Feijão;7.50"])); 
console.log(linesToColumns(["Filme;Diretor;Ano;Duração;Gênero;País de Origem;Receita Bruta", "Parasita;Bong Joon-ho;2019;132;Drama;Coréia do Sul;258.8M", "Green Book;Peter Farrelly;2018;130;Drama;EUA;321.8M"]));

//Funçao 3
function extractHeader(extract) {
    return extract.split();
}