package br.com.bcbackend.controllers;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bcbackend.entity.Cliente;
import br.com.bcbackend.model.RegraNegClienteAlterar;
import br.com.bcbackend.model.RegraNegClienteListar;
import br.com.bcbackend.model.RegraNegClienteRemover;
import br.com.bcbackend.model.RegraNegClienteSalvar;

@WebServlet(name = "clientes", urlPatterns = "/clientes")
public class ClienteController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		if ((req.getParameter("delete") != null) && (req.getParameter("delete").equals("1"))) {
						
			doDelete(req, resp);
			return;
		}
		
		RegraNegClienteListar servicoListar = new RegraNegClienteListar();
		ArrayList<Cliente> clientes;
		try {
			clientes = (ArrayList<Cliente>) servicoListar.listar();
		
			req.setAttribute("clientes", clientes);
			
			RequestDispatcher toListaDispatcher = req.getRequestDispatcher("lista_clientes.jsp");
			toListaDispatcher.forward(req, resp);
			
		} catch (Exception e) {
			resp.getWriter().append("Erro: " + e.getMessage());
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		if ((req.getParameter("alterar") != null) && (req.getParameter("alterar").equals("1"))) {
			
			doPut(req, resp);
			return;
		}
		
		try {

			Date dataConvertida = conversaoData(req.getParameter("dataNascimento"));

			Cliente inputCliente = 
					new Cliente(
							req.getParameter("nome"), 
							req.getParameter("e-mail"), 
							req.getParameter("cpf"), 
							dataConvertida, 
							req.getParameter("sexo"), 
							req.getParameter("nomeSocial"), 
							req.getParameter("apelido"), 
							req.getParameter("telefone")
							);

			RegraNegClienteSalvar servicoSalvar = new RegraNegClienteSalvar();
			servicoSalvar.salvar(inputCliente);
			
			this.doGet(req, resp);

		} catch (java.text.ParseException e) {

			e.printStackTrace();
			
			resp.getWriter().append("Erro: " + e.getMessage());
			
		} catch (Exception e) {
		
			resp.getWriter().append("Erro: " + e.getMessage());
		}
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("[REMOVER] Acessado... ID = " + req.getParameter("id"));
		
		Cliente inputCliente = new Cliente();
		inputCliente.setId(
				Integer.parseInt(req.getParameter("id"))
				);
		
		RegraNegClienteRemover servicoRemover = new RegraNegClienteRemover();
		
		try {
			servicoRemover.remover(inputCliente);
		
		} catch (Exception e) {
			resp.getWriter().append("[REMOVER] Erro: " + e.getMessage());
			e.printStackTrace();
		}
		
		RequestDispatcher toHomeDispatcher = req.getRequestDispatcher("index.html");
		toHomeDispatcher.forward(req, resp);
		
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("[ALTERAR] Acessado... ID = " + req.getParameter("id"));
		Cliente inputCliente = new Cliente(
				req.getParameter("nome"), 
				req.getParameter("e-mail"), 
				null, 
				null, 
				req.getParameter("sexo"), 
				req.getParameter("nomeSocial"), 
				req.getParameter("apelido"), 
				req.getParameter("telefone")
				);
		inputCliente.setId(
				Integer.parseInt(req.getParameter("id"))
				);
		
		RegraNegClienteAlterar servicoAlterar = new RegraNegClienteAlterar();
		
		try {
			servicoAlterar.alterar(inputCliente);
		
		} catch (Exception e) {
			resp.getWriter().append("[ALTERAR] Erro: " + e.getMessage());
			e.printStackTrace();
		}
		
		doGet(req, resp);
	}

	/**
	 * Converte data informada em string no formato "dd-MM-yyyy"
	 * @param data em {@code String} no formando "dd-MM-yyyy"
	 * @return data em {@code sql.Date}
	 * @throws ParseException
	 */
	private Date conversaoData(String dataString) throws ParseException {
		java.util.Date data = new SimpleDateFormat("dd-MM-yyyy").parse(dataString);

		Date dataConvertida = new Date(data.getTime());
		
		return dataConvertida;
	}

}
