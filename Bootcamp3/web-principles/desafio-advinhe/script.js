const PALPITES_ANTERIORES = "Palpites anteriores: ";
const TENTATIVA_ERRADA = "Errado!"
const TENTATIVA_CERTA = "Parabéns! Seu número está certo!"
const PALPITE_BAIXO = "Seu palpite está muito baixo!"
const PALPITE_ALTO = "Seu palpite está muito alto!"
const FINAL_SEM_TENTATIVAS = "Tentativas esgotadas :( Mais sorte na próxima!"
const CONTEUDO_VAZIO = " ";

function gerarNumero() {
  return Math.floor(Math.random() * 99 + 1);
}

console.assert(typeof gerarNumero() === "number", "gerarNumero() deve retornar um número");

let numero = gerarNumero();
let listaDePalpites = [];
let tentativas = 0;

const botaoSubmeterPalpite = document.querySelector("fieldset button");
const campoPalpite = document.getElementById("input__palpite");
const sugestoes = document.querySelector(".sugestoes");
const palpites = document.querySelector(".palpites");
const verificacao = document.querySelector(".verificacao");
const ajuda = document.querySelector(".ajuda");
const botaoResetar = document.getElementById("btn__reset");

/**
 * Retorna o valor do palpite
 * @param {HTMLFormEvent} event 
 */
function salvarPalpite() {
  const palpite = Number(campoPalpite.value);
  campoPalpite.value = "";
  return palpite;
};

botaoSubmeterPalpite.addEventListener("click", event => {
  jogar(event);
});

function jogar(event) {
    event.preventDefault();
    const palpite = salvarPalpite();
    try {
      if (listaDePalpites.length === 0) ativarCampos();
      verificarPalpite(palpite);
    } catch (error) {
      finalizarJogo(false);
    }
}
function ativarCampos() {
  sugestoes.removeAttribute("style");
}

function limparListaDePalpites() {
  listaDePalpites = [];
  palpites.textContent = PALPITES_ANTERIORES;
}

function verificarPalpite(palpite) {

  if (listaDePalpites.length > 9) {
    return finalizarJogo(false);
  }
  listaDePalpites.push(palpite);
  palpites.textContent += `${palpite} `;
  
  if (palpite === numero) {
    return finalizarJogo(true);
  }
  continuarJogo(palpite);
}

function continuarJogo(palpite) {
  verificacao.textContent = TENTATIVA_ERRADA;
  if (palpite > numero) {
    ajuda.textContent = PALPITE_ALTO;
    return;
  }
  ajuda.textContent = PALPITE_BAIXO;
}

function finalizarJogo(ganhou = true) {
  verificacao.textContent = ganhou ? TENTATIVA_CERTA : FINAL_SEM_TENTATIVAS;
  ajuda.textContent = CONTEUDO_VAZIO;
  campoPalpite.setAttribute("disabled", "disabled");
  botaoSubmeterPalpite.setAttribute("disabled", "disabled");
  ganhou && verificacao.classList.add("sucesso");
  botaoResetar.removeAttribute("disabled");
  botaoResetar.addEventListener("click", event => {
    event.preventDefault();
    reiniciarJogo();
  });
}

function reiniciarJogo() {
  tentativas++;
  numero = gerarNumero();
  limparListaDePalpites();
  verificacao.classList.remove("sucesso");
  campoPalpite.removeAttribute("disabled");
  botaoSubmeterPalpite.removeAttribute("disabled");
  sugestoes.setAttribute("style", "display:none;");
  botaoResetar.setAttribute("disabled", "");
}