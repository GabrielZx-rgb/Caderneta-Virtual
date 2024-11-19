<%@page import="br.com.multivix.bean.AcessoBean"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            try {
                if (session.getAttribute("acesso") == null) {
                    System.out.println("Cheguei aqui");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
                if (session.getAttribute("acesso") != null) {
                    AcessoBean acs = new AcessoBean();
                    acs = (AcessoBean) session.getAttribute("acesso");
                    if (acs.getTipo().equals("Usuario")) {
                        request.getRequestDispatcher("indexl.jsp").forward(request, response);
                    }
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e);
            }
        %>
        <meta charset="utf-8">
        <title>Caderneta Virtual</title>
        <jsp:include page="head.jsp"/>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    </head>
    <body>
        <jsp:include page="menulogin.jsp" flush="true"/>
        
        <section class="intro-single" id="introducao">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 col-lg-8">
                        
                    </div>
                    <div class="col-md-12 col-lg-4">
                        <nav aria-label="breadcrumb" class="breadcrumb-box d-flex justify-content-lg-end">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"> <a class="meneee" href="/ProjetoIntegrador/ValidarRegistro?acao=listaRegistros">Voltar</a> </li>
                                <li class="breadcrumb-item color-b" aria-current="page"> Exclus�o de Registros de Vacinas </li>
                            </ol>
                        </nav>
                    </div>
                </div>
            </div>
        </section>
        
        <div class="container" id="to-breadcrumb">
            <div class="jumbotron-alert text-center">
                <h1 class="display-4">Aten��o, Administrador!!!</h1>
                <p class="lead">Ao continuar com essa opera��o, voc� estar� apagando todos os dados do registro de vacinas <strong>${registro.idregistro_vacinas}</strong> do usu�rio <strong>${usuario.nome}</strong> permanentemente!</p>
                <hr class="my-4">
                <p>Voc� tem certeza que deseja prosseguir?!</p>
                <a class="btn btn-secondary btn-lg btn-reset" href="/ProjetoIntegrador/ValidarRegistro?acao=listaRegistros" role="button">Voltar</a>
                <a class="btn btn-danger btn-lg btn-reset" href="/ProjetoIntegrador/ValidarRegistro?acao=excluirRegistro&idregistro_vacinas=${registro.idregistro_vacinas}" role="button">Sim</a>
            </div>  
        </div>
        <jsp:include page="footer.jsp"/>
        <jsp:include page="script.jsp"/>
    </body>
</html>
