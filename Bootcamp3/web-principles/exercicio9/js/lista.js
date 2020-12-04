const input = document.querySelector("#entrada");
const button = document.querySelector("#btnAdd");
const list = document.querySelector("ul");

button.onclick = function () {
  let textoItem = input.value;
  input.value = "";

  //Cria os novos elementos li e botão
  const novoItem = document.createElement("li");
  const novoBtn = document.createElement("button");

  //ajusta os novos elementos para o padrão que queremos
  novoItem.textContent = textoItem;
  novoBtn.textContent = "remover";

  //adiciona na tela os novos elementos
  novoItem.appendChild(novoBtn);
  list.appendChild(novoItem);

  //adiciona uma ação ao botão "remover" do item
  novoBtn.onclick = function () {
    list.removeChild(novoItem);
    input.focus();
  };
  input.focus();
};
