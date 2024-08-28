 function div(a, b){
        let resto= Number(a) % Number(b);
        let total = (a - resto) /b
        return total;
    }

    console.log(div(10,3));
    console.log(div(9,3));
    console.log(div(9,2));
    console.log(div(7,5));
    console.log(div(0, 5));
