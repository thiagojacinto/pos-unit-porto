# Bootcamp Iniciative 2
---

## Description: 

Java Web dynamic project: first steps of API building.

| Module name |  Instructor  |     Date        | Grade |
| :---------- | :----------: | :-------------: | ----: |
| Bootcamp 02 | *Tito Kenzo* | September, 2020 |  N.I. |

## Structure:

### Playing with `web.xml`

* [xml-first/](./web-servlet/xml-first)
  * [WebContent/](./web-servlet/xml-first/WebContent)
    * [META-INF/](./web-servlet/xml-first/WebContent/META-INF)
      * [MANIFEST.MF](./web-servlet/xml-first/WebContent/META-INF/MANIFEST.MF)
    * [WEB-INF/](./web-servlet/xml-first/WebContent/WEB-INF)
      * [lib/](./web-servlet/xml-first/WebContent/WEB-INF/lib)
      * [web.xml](./web-servlet/xml-first/WebContent/WEB-INF/web.xml)
    * [assets/](./web-servlet/xml-first/WebContent/assets)
      * [images/](./web-servlet/xml-first/WebContent/assets/images)
        * [github.svg](./web-servlet/xml-first/WebContent/assets/images/github.svg)
        * [linkedin.svg](./web-servlet/xml-first/WebContent/assets/images/linkedin.svg)
    * [styles/](./web-servlet/xml-first/WebContent/styles)
      * [index.css](./web-servlet/xml-first/WebContent/styles/index.css)
    * [formulario.html](./web-servlet/xml-first/WebContent/formulario.html)
    * [index.html](./web-servlet/xml-first/WebContent/index.html)
    * [resposta.jsp](./web-servlet/xml-first/WebContent/resposta.jsp)
  * [src/](./web-servlet/xml-first/src)
    * [br/](./web-servlet/xml-first/src/br)
      * [com/](./web-servlet/xml-first/src/br/com)
        * [bcbackend/](./web-servlet/xml-first/src/br/com/bcbackend)
    * [utils/](./web-servlet/xml-first/src/utils)
      * [LojaUnit.sql](./web-servlet/xml-first/src/utils/LojaUnit.sql)

### Java Servlets and JSP

* [servlet-api/](./web-servlet/servlet-api)
  * [WebContent/](./web-servlet/servlet-api/WebContent)
    * [META-INF/](./web-servlet/servlet-api/WebContent/META-INF)
      * [MANIFEST.MF](./web-servlet/servlet-api/WebContent/META-INF/MANIFEST.MF)
    * [WEB-INF/](./web-servlet/servlet-api/WebContent/WEB-INF)
      * [lib/](./web-servlet/servlet-api/WebContent/WEB-INF/lib)
        * [mysql-connector-java-8.0.21.jar](./web-servlet/servlet-api/WebContent/WEB-INF/lib/mysql-connector-java-8.0.21.jar)
      * [web.xml](./web-servlet/servlet-api/WebContent/WEB-INF/web.xml)
    * [assets/](./web-servlet/servlet-api/WebContent/assets)
      * [images/](./web-servlet/servlet-api/WebContent/assets/images)
        * [github.svg](./web-servlet/servlet-api/WebContent/assets/images/github.svg)
        * [linkedin.svg](./web-servlet/servlet-api/WebContent/assets/images/linkedin.svg)
    * [styles/](./web-servlet/servlet-api/WebContent/styles)
      * [index.css](./web-servlet/servlet-api/WebContent/styles/index.css)
      * [table.css](./web-servlet/servlet-api/WebContent/styles/table.css)
    * [alterar_cliente.jsp](./web-servlet/servlet-api/WebContent/alterar_cliente.jsp)
    * [index.html](./web-servlet/servlet-api/WebContent/index.html)
    * [lista_clientes.jsp](./web-servlet/servlet-api/WebContent/lista_clientes.jsp)
  * [src/](./web-servlet/servlet-api/src)
    * [br/](./web-servlet/servlet-api/src/br)
      * [com/](./web-servlet/servlet-api/src/br/com)
        * [bcbackend/](./web-servlet/servlet-api/src/br/com/bcbackend)
          * [controllers/](./web-servlet/servlet-api/src/br/com/bcbackend/controllers)
            * [ClienteController.java](./web-servlet/servlet-api/src/br/com/bcbackend/controllers/ClienteController.java)
          * [entity/](./web-servlet/servlet-api/src/br/com/bcbackend/entity)
            * [Cliente.java](./web-servlet/servlet-api/src/br/com/bcbackend/entity/Cliente.java)
          * [model/](./web-servlet/servlet-api/src/br/com/bcbackend/model)
            * [RegraNegClienteAlterar.java](./web-servlet/servlet-api/src/br/com/bcbackend/model/RegraNegClienteAlterar.java)
            * [RegraNegClienteListar.java](./web-servlet/servlet-api/src/br/com/bcbackend/model/RegraNegClienteListar.java)
            * [RegraNegClienteRemover.java](./web-servlet/servlet-api/src/br/com/bcbackend/model/RegraNegClienteRemover.java)
            * [RegraNegClienteSalvar.java](./web-servlet/servlet-api/src/br/com/bcbackend/model/RegraNegClienteSalvar.java)
          * [repository/](./web-servlet/servlet-api/src/br/com/bcbackend/repository)
            * [exceptions/](./web-servlet/servlet-api/src/br/com/bcbackend/repository/exceptions)
              * [ConexaoException.java](./web-servlet/servlet-api/src/br/com/bcbackend/repository/exceptions/ConexaoException.java)
              * [RepositorioException.java](./web-servlet/servlet-api/src/br/com/bcbackend/repository/exceptions/RepositorioException.java)
            * [ClienteRepositorio.java](./web-servlet/servlet-api/src/br/com/bcbackend/repository/ClienteRepositorio.java)
            * [Repositorio.java](./web-servlet/servlet-api/src/br/com/bcbackend/repository/Repositorio.java)
          * [utils/](./web-servlet/servlet-api/src/br/com/bcbackend/utils)
            * [GerenciadorConexaoDB.java](./web-servlet/servlet-api/src/br/com/bcbackend/utils/GerenciadorConexaoDB.java)
            * [GerenciadorConexaoDBMySQL.java](./web-servlet/servlet-api/src/br/com/bcbackend/utils/GerenciadorConexaoDBMySQL.java)
            * [MetodosHttp.java](./web-servlet/servlet-api/src/br/com/bcbackend/utils/MetodosHttp.java)
            * [MySQLQueries.java](./web-servlet/servlet-api/src/br/com/bcbackend/utils/MySQLQueries.java)