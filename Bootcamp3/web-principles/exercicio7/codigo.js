const botao = document.getElementsByTagName("input").item(0);
let numero = 0;
botao.addEventListener("click", adicionarTexto);

function adicionarTexto() {
  toggleName(botao);
  
  let paragrafo = document.createElement("p");
  paragrafo.style = estiloRandomico();
  numero++;
  paragrafo.textContent = `Você clicou no botão. Tentativa n. ${numero}`;
  document.body.appendChild(paragrafo);
};

let estilos = [
  "background-color: blue; color: white;",
  "background-color: green; text-align: right;",
  "background-color: gray; color: orange",
  "font-weight: 800;",
  "font-style: italic;",
  "font-size: 1.3rem; text-align: right;",
  "text-align: center; ",
];

let estiloRandomico = () => {
  const randomico = Math.floor(Math.random() * estilos.length);
  return estilos[randomico];
}

function toggleName(elemento) {
  if (elemento.value === "clicar") { 
    elemento.value = "clicou! Clique outra vez...";
    return;
  }
  elemento.value = "clicar";
}