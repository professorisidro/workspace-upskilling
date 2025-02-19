function carregarInfo(){
    fetch("http://localhost:8080/contas")
        .then(res => res.json())
        .then(lista => preencheInfo(lista));
}

function preencheInfo(lista){
    let str = "";
    for(i=0; i<lista.length; i++){
        let conta = lista[i];
            str += `<b>Conta</b>: ${conta.dtoNumConta} <br>
                   <b>CPF:</b> ${conta.dtoCpfTitular} <br>
                   <b>Nome:</b>${conta.dtoNomeTitular} <br>
                   <b>Saldo R$ </b> ${conta.dtoSaldo} 
                   <hr>`;
    }
    document.getElementById("info").innerHTML = str;
}