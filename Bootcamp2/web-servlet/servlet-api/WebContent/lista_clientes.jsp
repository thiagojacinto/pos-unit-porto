<%@page import="br.com.bcbackend.utils.MetodosHttp"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.bcbackend.entity.Cliente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="/bootcamp-backend/styles/table.css">

<style>
html, body {
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
	background: -moz-linear-gradient(30deg, rgba(35, 93, 2, 1) 4%,
		rgba(68, 175, 34, 1) 69%, rgba(0, 255, 141, 1) 100%);
	background: -webkit-linear-gradient(30deg, rgba(35, 93, 2, 1) 4%,
		rgba(68, 175, 34, 1) 69%, rgba(0, 255, 141, 1) 100%);
	background: linear-gradient(30deg, rgba(35, 93, 2, 1) 4%,
		rgba(68, 175, 34, 1) 69%, rgba(0, 255, 141, 1) 100%);
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

.btn__home {
	margin: 2rem 0;
	padding: 1.4rem;
	font-size: 1.4rem;
	font-weight: 500;
	color: white;
	border-radius: 1.8rem;
	background: -moz-linear-gradient(30deg, rgba(35, 93, 2, 1) 4%,
		rgba(68, 175, 34, 1) 69%, rgba(0, 255, 141, 1) 100%);
	background: -webkit-linear-gradient(30deg, rgba(35, 93, 2, 1) 4%,
		rgba(68, 175, 34, 1) 69%, rgba(0, 255, 141, 1) 100%);
	background: linear-gradient(30deg, rgba(35, 93, 2, 1) 4%,
		rgba(68, 175, 34, 1) 69%, rgba(0, 255, 141, 1) 100%);
}
</style>

<link
      href="https://fonts.googleapis.com/css2?family=Quicksand:wght@300;500;700&display=swap"
      rel="stylesheet"
    />

<title>Listagem de Clientes</title>
</head>
<body>

	<div class="content">
		<main>
		
			<a href="/bootcamp-backend"><button class="btn__home">Voltar a página inicial</button></a>
			
			<div class="table-users">
			<div class="header">Clientes registrados</div>
			
			<table cellspacing="0">
		      <tr>
		         <th>Nome</th>
		         <th>CPF</th>
		         <th>Email</th>
		         <th>Nascimento</th>
		         <th>Sexo</th>
		         <th>Nome social</th>
		         <th>Apelido</th>
		         <th>Telefone</th>
		         <th>Ações</th>
		      </tr>
			<%
				ArrayList<Cliente> lista = (ArrayList<Cliente>) request.getAttribute("clientes");
				
				if (lista == null || lista.size() == 0) {
					
					out.print("<tr>");
						out.print("<td> - </td>");
						out.print("<td> - </td>");
						out.print("<td> - </td>");
						out.print("<td> - </td>");
						out.print("<td> - </td>");
						out.print("<td> - </td>");
						out.print("<td> - </td>");
						out.print("<td> - </td>");
						out.print("<td> - </td>");
						
					out.print("</tr>");
				} else {
					for(Cliente cliente : lista){
						
						/* out.println(cliente.getCpf() + " / " + cliente.getNome() + "<br/>"); */
						
						out.print("<tr>");
						
							out.print("<td>" + cliente.getNome() + "</td>");
							out.print("<td>" + cliente.getCpf() + "</td>");
							out.print("<td>" + cliente.getEmail() + "</td>");
							out.print("<td>" + cliente.getDataNascimento() + "</td>");
							out.print("<td>" + cliente.getSexo() + "</td>");
							out.print("<td>" + cliente.getNomeSocial() + "</td>");
							out.print("<td>" + cliente.getApelido() + "</td>");
							out.print("<td>" + cliente.getTelefone() + "</td>");
							out.print("<td>");
							
							String deletarId = "/v1/clientes?id=" + String.valueOf(cliente.getId());
							
							out.print("<a href=\"http://localhost:8080/bootcamp-backend/alterar_cliente.jsp?id=" + cliente.getId() + "\"><button>Alterar</button></a>");
							out.print("<a href=\"http://localhost:8080/bootcamp-backend/clientes?delete=1&id=" + cliente.getId() + "\"><button>Remover</button></a>");
							
							out.print("</td>");
						
						out.print("</tr>");
					}
				}
			%>
			</table>
			</div>
			
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