const nomeCompleto = document.querySelector(".nome");
const idade = document.querySelector(".idade");
const paragrafo = document.querySelector("p");
const botao = document.querySelector("input[type=button]");

botao.addEventListener("click", exibirInformacao);

function exibirInformacao() {
  let nome = nomeCompleto.value.split(" ")[0];
  let futuro = futurizar(Number(idade.value));
  console.table({nome, futuro});
  paragrafo.textContent = `${nome} terá ${futuro.idade} anos em ${futuro.ano}.`;
}

const futurizar = (numero) => {
  const random = Math.floor(Math.random() * 100) + 1;
  let ano = new Date().getFullYear() + random;
  let idade = numero + random;
  return {ano, idade};
}