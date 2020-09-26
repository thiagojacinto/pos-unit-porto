<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	
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
	
	<title>Dados do Cadastro</title>
</head>
<body>
	<div class="content">
		<main>
			<h2>Confirme os seguintes dados: </h2>
		
			<%
				String nome = request.getParameter("nome");
				String cpf = request.getParameter("cpf");
				String email = request.getParameter("e-mail");
				String dataNascimento = request.getParameter("dataNascimento");
				String sexo = request.getParameter("sexo");
				String nomeSocial = request.getParameter("nomeSocial");
				String apelido = request.getParameter("apelido");
				String telefone = request.getParameter("telefone");
				
				out.print("<table>");
				out.print("<thead><tr><th colspan=2>Dados</th></tr><tr><th>Campo</th><th>Valor</th></tr></thead>");
				out.print("<tbody>");
				
				out.print(String.format("<tr><td>Nome</td><td>%s</td></tr>", nome));
				out.print(String.format("<tr><td>CPF</td><td>%s</td></tr>", cpf));
				out.print(String.format("<tr><td>E-mail</td><td>%s</td></tr>", email));
				if (dataNascimento != "") out.print(String.format("<tr><td>Nascimento</td><td>%s</td></tr>", dataNascimento));
				if (sexo != "") out.print(String.format("<tr><td>Sexo</td><td>%s</td></tr>", sexo));
				if (nomeSocial != "") out.print(String.format("<tr><td>Nome Social</td><td>%s</td></tr>", nomeSocial));
				if (apelido != "") out.print(String.format("<tr><td>Apelido</td><td>%s</td></tr>", apelido));
				if (telefone != "") out.print(String.format("<tr><td>Telefone</td><td>%s</td></tr>", telefone));
				
				out.print("</tbody>");
				out.print("</table>");
			
			%>
			
			<a href="#"><button>Confirmar</button></a>
			<a href="index.html"><button>Voltar</button></a>
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