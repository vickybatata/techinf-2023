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
function extractHeader(rows) {
    if (rows.length === 0) {
        return [];
    }
    return rows[0];
}

console.log(extractHeader([["nome", "idade"], ["João", "28"], ["Maria", "32"]]));

console.log(extractHeader([["produto", "preço"], ["Arroz", "5.00"], ["Feijão", "7.50"]]));

console.log(extractHeader([["Filme", "Diretor", "Ano", "Duração", "Gênero", "País de Origem", "Receita Bruta"],["Parasita", "Bong Joon-ho", "2019", "132", "Drama", "Coréia do Sul", "258.8M"],["Green Book", "Peter Farrelly", "2018", "130", "Drama", "EUA", "321.8M"]
]));

//Função 4
function extractContent (row){
    if (row.length <= 1) {
        return [];
    }
    return row.slice(1);
}
console.log(extractContent([["nome", "idade"], ["João", "28"], ["Maria", "32"]]));
console.log(extractContent([["produto", "preço"], ["Arroz", "5.00"], ["Feijão", "7.50"]]));
console.log(extractContent([["Filme", "Diretor", "Ano", "Duração", "Gênero", "País de Origem", "Receita Bruta"],["Parasita", "Bong Joon-ho", "2019", "132", "Drama", "Coréia do Sul", "258.8M"],["Green Book", "Peter Farrelly", "2018", "130", "Drama", "EUA", "321.8M"]]));

//Função 5
function rowToJSON(header, content){
    const obj = {};
    
    for(let i=0; i < header.length; i++) {
    let key = header[i];
    let value = content[i];

    obj[key] = value;
    }
    return obj;
}
    console.log(rowToJSON(["nome", "idade"], ["João", "28"]))
    console.log(rowToJSON(["produto", "preço"], ["Arroz", "5.00"]))
    console.log(rowToJSON(["Filme", "Diretor", "Ano", "Duração", "Gênero", "País de Origem", "Receita Bruta"], ["Parasita", "Bong Joon-ho", "2019", "132", "Drama", "Coréia do Sul", "258.8M"]))

//Função 6
function contentToJsonData(header, content) {
    const list = [];
    for (let i = 0; i < content.length; i++) {
        let row = content[i]
        let obj = rowToJSON(header, row)
        list.push(obj)
    }
    return list
}
   console.log(contentToJsonData(["nome", "idade"],[["João", "28"], ["Maria", "32"]]));
   console.log(contentToJsonData(["produto", "preço"],[["Arroz", "5.00"], ["Feijão", "7.50"]]))
   console.log(contentToJsonData(["Filme", "Diretor", "Ano", "Duração", "Gênero", "País de Origem", "Receita Bruta"],[["Parasita", "Bong Joon-ho", "2019", "132", "Drama", "Coréia do Sul","258.8M"], ["Green Book", "Peter Farrelly", "2018", "130", "Drama", "EUA","321.8M"]]))

   