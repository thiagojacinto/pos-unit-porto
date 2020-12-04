$(function () {
  $("#accordion").accordion({
    collapsible: true,
  });

  function carregarConteudo() {

    $("#accordion p").each( function () {
      const paragrafo = this;
      
      const random = Math.floor(Math.random() * 3) + 1;
      const nome = `verso${random}`;
      let url = `http://127.0.0.1:5500/exercicio10/assets/${nome}.txt`;
      
      $.ajax({
        url,
        type: "GET",
        dataType: "text",
      })
      .done(function (res) {
        $(paragrafo).text(res);
      })
      .fail(function (xhr, status, errorThrown) {
        console.log("Erro: " + errorThrown);
        console.log("Status: " + status);
        console.dir(xhr);
      });
    });
  }
  carregarConteudo();

  function aplicarEfeito() {
    $("#accordion").toggle("slide", {}, 300);
    carregarConteudo();
  };

  $("button").on("click", aplicarEfeito);
});
