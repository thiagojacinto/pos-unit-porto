<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

  <!-- <link rel="stylesheet" href="/bootcamp-backend/styles/index.css" /> -->

    <style>
      html,
      body {
        padding: 0;
        margin: 0;
        font-family: "Quicksand", sans-serif;
        width: 100vw;
        height: 100vh;
        display: grid;
        grid-template-rows: 1fr auto;
      }

      h1,
      h2,
      h3,
      h4,
      h5 {
        padding: 0;
        margin: 0;
      }
      
      main {
      	margin-top: 1.6rem;
      }

      a {
        text-decoration: none;
      }
      
      header {
      	display: flex;
      	flex-direction: row;
      	
      	align-items: center;
      	justify-content: space-around;
      	
      }
      
      header button {
      	padding: 1.4rem;
      	font-size: 1.4rem;
      	font-weight: 500;
      	color: white;
      	
      	border-radius: 1.8rem;
      	
      	background: -moz-linear-gradient(
          30deg,
          rgba(35, 93, 2, 1) 4%,
          rgba(68, 175, 34, 1) 69%,
          rgba(0, 255, 141, 1) 100%
        );
        background: -webkit-linear-gradient(
          30deg,
          rgba(35, 93, 2, 1) 4%,
          rgba(68, 175, 34, 1) 69%,
          rgba(0, 255, 141, 1) 100%
        );
        background: linear-gradient(
          30deg,
          rgba(35, 93, 2, 1) 4%,
          rgba(68, 175, 34, 1) 69%,
          rgba(0, 255, 141, 1) 100%
        );
      }

      ul {
        list-style-type: none;
        display: flex;
		flex-direction: column;
		align-items: flex-start;
		justify-content: space-around;
      }

      li {
        margin: 1em 0;
        display: flex;
		flex-direction: row;
		align-items: center;
		justify-content: space-between;
		width: 50%
      }

      li span {
        color: red;
      }

      .content {
        margin: 0.6rem 1.6rem;
      }

      .content header {
        -webkit-box-shadow: 0 10px 6px -6px rgba(35, 93, 2, 1);
        -moz-box-shadow: 0 10px 6px -6px rgba(35, 93, 2, 1);
        box-shadow: 0 10px 6px -6px rgba(35, 93, 2, 1);
      }

      .container {
        display: flex;
        flex-direction: column;
        justify-content: space-evenly;
        align-items: center;
      }

      footer {
        color: azure;
        background: rgb(35, 93, 2);
        background: -moz-linear-gradient(
          30deg,
          rgba(35, 93, 2, 1) 4%,
          rgba(68, 175, 34, 1) 69%,
          rgba(0, 255, 141, 1) 100%
        );
        background: -webkit-linear-gradient(
          30deg,
          rgba(35, 93, 2, 1) 4%,
          rgba(68, 175, 34, 1) 69%,
          rgba(0, 255, 141, 1) 100%
        );
        background: linear-gradient(
          30deg,
          rgba(35, 93, 2, 1) 4%,
          rgba(68, 175, 34, 1) 69%,
          rgba(0, 255, 141, 1) 100%
        );
        filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#235d02",
		endColorstr="#00ff8d", GradientType=1);
        border-top-left-radius: 3rem;
        border-top-right-radius: 3rem;
      }

      footer strong {
        margin-top: 1.3rem;
        font-size: 1.8rem;
      }

      footer img {
        width: 3rem;
        height: auto;
        padding: 1rem 0.8rem;
      }

      footer span {
        font-size: 0.8rem;
        margin-bottom: 0.8rem;
      }
    </style>

    <link
      href="https://fonts.googleapis.com/css2?family=Quicksand:wght@300;500;700&display=swap"
      rel="stylesheet"
    />

<title>Alterar Cliente</title>
</head>
<body>

	<div class="content">
      <header>
      	<div class="header__info">
        	<h2>Web Development Bootcamp Backend</h2>
        	<p>Módulo 2: aprendizado imersivo</p>
        	<span>Link do Meet: xxxxxxxxxx</span>
      	</div>
      	
      	<div class="header__extra">
      		<a href="http://localhost:8080/bootcamp-backend/clientes" alt="Lista de Clientes">
      			<button class="header__btn">Lista de Clientes</button>
      		</a>
      	</div>
      </header>

      <main>
        <div class="container">
          <h2>Atualizar Dados</h2>
          
          
          <form action="clientes" method="POST">
          	<input type="hidden" name="alterar" id="alterar" value="1" />
          	<input type="hidden" name="id" id="id" value="<% out.print(request.getParameter("id")); %>" />
            <ul>
              <li>
                <label for="nome">Nome: </label><span>*</span>
                <input type="text" name="nome" id="nome" required="required" />
              </li>
              <li>
                <label for="e-mail">E-mail: </label><span>*</span>
                <input type="text" name="e-mail" id="e-mail" required="required" />
              </li>
              <li>
                <label for="sexo">Sexo:</label>
                <input type="text" name="sexo" id="sexo" />
              </li>
              <li>
                <label for="nomeSocial">Nome social:</label>
                <input type="text" name="nomeSocial" id="nomeSocial" />
              </li>
              <li>
                <label for="apelido">Apelido: </label>
                <input type="text" name="apelido" id="apelido" />
              </li>
              <li>
                <label for="telefone">Telefone:</label>
                <input type="text" name="telefone" id="telefone" />
              </li>
              <li class="form-buttons">
                <input type="submit" value="Alterar" />
              </li>
            </ul>
          </form>
          
	  </main>
	</div>
	  
	<footer>
      <div class="container">
        <strong>Thiago Jacinto @ 2020</strong>
        <div class="social">
          <a
            href="https://linkedin.com/in/thiago-jacinto"
            target="_blank"
            rel="noopener noreferrer"
          >
            <img
              src="/bootcamp-backend/assets/images/linkedin.svg"
              alt="LinkedIn logo"
            />
          </a>
          <a
            href="https://github.com/thiagojacinto"
            target="_blank"
            rel="noopener noreferrer"
          >
            <img
              src="/bootcamp-backend/assets/images/github.svg"
              alt="GitHub logo"
            />
          </a>
        </div>
        <span
          >Créditos:
          <a
            href="https://fontawesome.com"
            target="_blank"
            rel="noopener noreferrer"
            >FontAwesome</a
          ></span
        >
      </div>
    </footer>
	  
</body>
</html>