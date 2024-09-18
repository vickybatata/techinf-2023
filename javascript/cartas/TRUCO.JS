
function olharcartas() {

    fetch("https://deckofcardsapi.com/api/deck/3qetepz1hdag/draw/?count=3")


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
// .then(function(respostaApi){
//     const obj = respostaApi.json();
//     return obj;
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
    fetch("https://deckofcardsapi.com/api/deck/3qetepz1hdag/shuffle/")
        .then(converterParaJson)
        .then(atualizarInfo)
        .catch(erro => alert(erro));

    // console.log(jsonData);
    // if (jsonData.success) {
    //  alert("Reembaralhado com sucesso!");
    // }
    // })
}
function atualizarInfo(jsonData) {
    if (!jsonData.success)
        throw new Error("Erro ao acessar dados da api");
    const deck_id = jsonData.deck_id;
    const remaining = jsonData.remaining;
    const info1 = document.getElementById("deck_id");
    const info2 = document.getElementById("remaining");
    info1.innerText = deck_id;
    info2.innerText = remaining;
    // console.log(info2)

    return jsonData;

}


