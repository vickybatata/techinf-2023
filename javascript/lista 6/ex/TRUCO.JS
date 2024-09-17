fetch('https://deckofcardsapi.com/api/deck/cj1j26c7xeh4/draw/?count=3')
.then(function(data){
    const obj = data.json();
    return obj;
}).then(function(json) {
    console.log(json)
    console.table(json.cards, ["code", "image", "value", "sult"]);
    console.log('restam', json.remaining, 'cartas')
}); 

