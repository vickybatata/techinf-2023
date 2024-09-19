let deckId = "3qetepz1hdag";
let listOfCards = "4C,7H,AS,7D,3C,3H,3S,3D,2C,2H,2S,2D,AC,AH,AD,KC,KH,KS,KD,JC,JH,JS,JD,QC,QH,QS,QD"

function gerarBaralho(){
    fetch("https://deckofcardsapi.com/api/deck/new/shuffle/?cards=4C,7H,AS,7D,3C,3H,3S,3D,2C,2H,2S,2D,AC,AH,AD,KC,KH,KS,KD,JC,JH,JS,JD,QC,QH,QS,QD")
        .then(converterParaJson)
        .then(atualizarInfo)
        .catch(erro => alert(erro));

}

function olharcartas() {

    fetch(`https://deckofcardsapi.com/api/deck/${deckId}/draw/?count=3`)


        .then(converterParaJson)
        .then(atualizarInfo)
        .then(imprimeTabela)
        .then(mostrarCartas)
        .catch(erro => alert(erro));
}

function converterParaJson(data) {
    const obj = data.json();
    return obj;
}

function imprimeTabela(json) {
    console.table(json.cards, ["code", "image", "value", "sult"]);
    console.log('restam', json.remaining, 'cartas')

    return json;

}

function mostrarCartas(jsonData) {
    const cards = jsonData.cards;
    console.log(jsonData)

    for (let i = 0; i < 3; i++) {
        const id = `carta${i + 1}`;

        const card = document.getElementById(id);
        let img = card.querySelector('img');

        if (img == null) {
            img = document.createElement('img');
        }

        img.setAttribute('src', cards[i].image);
        card.append(img);
    }



    return jsonData;

}

function Reembaralhar() {
    fetch(`https://deckofcardsapi.com/api/deck/${deckId}/shuffle/`)
        .then(converterParaJson)
        .then(atualizarInfo)
        .catch(erro => alert(erro));

    // console.log(jsonData);
    // if (jsonData.success) {
     alert("Reembaralhado com sucesso!");
    // }
    // })
}

function atualizarInfo(jsonData) {
    if (!jsonData.success)
        throw new Error("Erro ao acessar dados da api");
    // const deck_id = jsonData.deck_id;
    deckId = jsonData.deck_id;
    const remaining = jsonData.remaining;
    const info1 = document.getElementById("deck_id");
    const info2 = document.getElementById("remaining");
    info1.innerText = deckId;
    info2.innerText = remaining;
    // console.log(info2)

    return jsonData;

}


