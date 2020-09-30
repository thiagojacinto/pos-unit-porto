package br.com.bcbackend.utils;

public enum MySQLQueries {
	CONSULTAR("SELECT nome, email, cpf, dataNascimento, sexo, nomeSocial, apelido, telefone FROM clientes WHERE cpf=? OR email=?"),
	CONSULTARPORID("SELECT nome, email, cpf, dataNascimento, sexo, nomeSocial, apelido, telefone FROM clientes WHERE id=?"),
	INSERIR("INSERT INTO clientes (nome, email, cpf, dataNascimento, sexo, nomeSocial, apelido, telefone) VALUES(?,?,?,?,?,?,?,?)"),
	EXCLUIR("DELETE FROM clientes WHERE id=?"),
	ALTERAR("UPDATE clientes SET nome=?, email=?, cpf=?, dataNascimento=?, sexo=?, nomeSocial=?, apelido=?, telefone=? WHERE id=?"),
	LISTARTUDO("SELECT id, nome, email, cpf, dataNascimento, sexo, nomeSocial, apelido, telefone FROM clientes LIMIT 20");
	
	private String sqlQuery;
	
	private MySQLQueries(String sqlQuery) {
		this.sqlQuery = sqlQuery;
	}
	
	public String getQuery() {
		return sqlQuery;
	}
	
}
