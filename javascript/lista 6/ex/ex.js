//Função 1
function csvToLines(csvString) {
    return csvString.split('\n');
}


//Função 2
function linesToColumns(lines, separador) {
    let result = [];
    
    for (let i = 0; i < lines.length; i++) {
       result.push(lines[i].split(separador));
    }
    
    return result;
}



//Funçao 3
function extractHeader(rows) {
    if (rows.length === 0) {
        return [];
    }
    return rows[0];
}



//Função 4
function extractContent (row){
    if (row.length <= 1) {
        return [];
    }
    return row.slice(1);
}


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
   

   //PrintCsv
   function printCSV(csvText, separador) {
    const csvL = csvToLines(csvText);
    const lToC = linesToColumns(csvL, separador);
    const exH = extractHeader(lToC);
    const exC = extractContent(lToC);
    const contToJSON = contentToJsonData(exH, exC)
    return contToJSON
}

function extract() {
    const fs = require('fs')
    const csvOscar = fs.readFileSync('./oscar_best_pictures.csv', 'utf-8')
    return csvOscar
}

function extractApp() {
    const fs = require('fs')
    const csvOscar = fs.readFileSync('./shanghai_ranking_2024.csv', 'utf-8')
    return csvOscar
}
module.exports = {csvToLines, linesToColumns, extractHeader, extractContent, rowToJSON, contentToJsonData, printCSV, extract, extractApp}