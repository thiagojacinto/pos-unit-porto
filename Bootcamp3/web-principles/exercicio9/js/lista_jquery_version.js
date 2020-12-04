const input = jQuery("#entrada");
const button = $("#btnAdd");
const list = $("ul");

button.click( function () {
  let textoItem = input.val();
  input.val("");

  //Cria os novos elementos li e botão
  const novoItem = $("<li classs=\"item_adicionado\"></li>");
  const novoBtn = $("<button class=\"btn_remover\"></button>");

  //ajusta os novos elementos para o padrão que queremos
  novoItem.text(textoItem);
  novoBtn.text("remover");

  //adiciona na tela os novos elementos
  novoBtn.appendTo(novoItem);
  novoItem.appendTo(list);

  //adiciona uma ação ao botão "remover" do item
  novoBtn.click( function () {
    novoItem.remove();
    input.focus();
  });
  input.focus();
});
