const getTitle = [
  "Isso é um título?",
  "Agora é um título",
  "Talvez mais um título",
  "Na dúvida, título",
  "Opa, mais um título",
  "Finalmente um título"
];

const adicionarCabecalho = () => {
  const header = document.createElement(`h${randomHeader()}`);
  header.textContent = getTitle[randomHeader()];
  document.body.appendChild(header);
};

const randomHeader = () => {
  return Math.floor(Math.random() * 5) + 1;
};

const butao = document.querySelector("button");
butao.addEventListener("click", adicionarCabecalho);