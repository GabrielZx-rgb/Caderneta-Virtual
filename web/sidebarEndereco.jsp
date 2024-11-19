<%@page import="br.com.multivix.bean.AcessoBean"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            try {
                if (session.getAttribute("acesso") == null) {
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e);
            }
        %>
        <meta charset="utf-8">
        <title>Caderneta Virtual</title>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <jsp:include page="head.jsp"/>
    </head>
    <body>
        <jsp:include page="menulogin.jsp"/>
        <jsp:useBean id="id" scope="request" class="br.com.multivix.bean.AcessoBean"/>
        <jsp:useBean id="end" scope="request" class="br.com.multivix.bean.EnderecoBean"/>

        <%
            AcessoBean acs = new AcessoBean();
            acs = (AcessoBean) session.getAttribute("acesso");
        %>

        <div class="wrapper" id="introducao"> 
            <!-- Sidebar  -->
            <nav id="sidebar">
                <div class="sidebar-header">
                    <button type="button" class="close" id="collapseSidebar"> <span style="color: #000;" aria-hidden="true">&times;</span> </button>
                    <h3 class="text-center">
                        <a class="meneee" href="sidebar.jsp">
                            <span style="font-size: 70pt;">
                                <i class="fa fa-user-circle text-center" aria-hidden="true"></i>
                            </span>
                        </a>
                    </h3>
                </div>
                <ul class="nav nav-tabs flex-column list-unstyled components text-center">
                    <li><a href="#subMenuPage" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Minha Conta</a>
                        <ul class="collapse list-unstyled" id="subMenuPage">
                            <li><a href="/ProjetoIntegrador/ValidarAcesso?acao=listarAcesso&idusuario=<% out.print(acs.getIdusuario()); %>">Meu Acesso</a></li>
                            <li><a href="/ProjetoIntegrador/ValidarForm?acao=listarDados&idusuario=<% out.print(acs.getIdusuario()); %>">Meus Dados</a></li>
                            <li><a href="/ProjetoIntegrador/ValidarForm?acao=listarEndereco&idusuario=<% out.print(acs.getIdusuario()); %>">Meu Endere�o</a></li>
                        </ul>
                    </li>
                    <li><a href="/ProjetoIntegrador/ValidarHistorico?acao=listarHistoricoUsuario&idusuario=<% out.print(acs.getIdusuario()); %>">Hist�rico</a></li>
                    <li><a href="/ProjetoIntegrador/ValidarRegistro?acao=listarVacinas&idusuario=<% out.print(acs.getIdusuario());%>">Minhas Vacinas</a></li>
                    <li><a href="/ProjetoIntegrador/ValidarLocal?acao=listarLocais">Locais de Vacina��o</a></li>
                </ul>
                <ul class="list-unstyled CTAs">
                    <li><a href="/ProjetoIntegrador/ValidarAcesso?acao=deslogar" class="deslogar">Deslogar</a></li>
                </ul>
            </nav>

            <!-- Page Content  -->

            <div id="content">
                <nav class="navbar navbar-expand-lg navbar-light bg-light">
                    <div class="container-fluid">
                        <button type="button" id="sidebarCollapse" class="btn btn-info"><span class="fa fa-bars"></span> </button>
                        <button class="btn btn-dark d-inline-block d-lg-none ml-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"> </button>
                        <%
                            if (acs.getTipo().equals("Administrador")) {
                        %>
                        <jsp:include page="menuadmin.jsp"/><%                            }
                        %>  
                    </div>
                </nav>
                <div class="container">
                    <form class="formulario" action="ValidarForm" method="post">
                        <h2 class="text-center" style="padding-bottom: 2%;">Dados do Endere�o</h2>
                        <div class="form-row">
                            <div class="form-group col-md-9">
                                <label for="inputAddress">Endere�o</label>
                                <div class="wrap-input">
                                    <input class="inputdados" type="text" name="txtEndereco" id="endereco" value="${endereco.endereco}">
                                    <span class="focus-inputdados"></span><span class="symbol-inputdados"><i class="fa fa-map-marker"></i></span>
                                </div>

                            </div>
                            <div class="form-group col-md-3">
                                <label for="inputState">Estado</label>
                                <div class="wrap-input">
                                    <select class="inputdadim" name="optionEstado" id="estado">
                                        <option selected>${endereco.estado}</option>
                                        <option>Acre</option>
                                        <option>Alagoas</option>
                                        <option>Amap�</option>
                                        <option>Amazonas</option>
                                        <option>Bahia</option>
                                        <option>Cear�</option>
                                        <option>Distrito Federal</option>
                                        <option>Esp�rito Santo</option>
                                        <option>Goi�s</option>
                                        <option>Maranh�o</option>
                                        <option>Mato Grosso</option>
                                        <option>Mato Grosso do Sul</option>
                                        <option>Minas Gerais</option>
                                        <option>Par�</option>
                                        <option>Para�ba</option>
                                        <option>Paran�</option>
                                        <option>Pernambuco</option>
                                        <option>Piau�</option>
                                        <option>Rio de Janeiro</option>
                                        <option>Rio Grande do Norte</option>
                                        <option>Rio Grande do Sul</option>
                                        <option>Rond�nia</option>
                                        <option>Roraima</option>
                                        <option>Santa Catarina</option>
                                        <option>S�o Paulo</option>
                                        <option>Sergipe</option>
                                        <option>Tocantins</option>
                                    </select>
                                </div>

                            </div>
                            <div class="form-group col-md-4">
                                <label for="inputCity">Cidade</label>
                                <div class="wrap-input">
                                    <input class="inputdados" type="text" name="txtCidade" id="cidade" value="${endereco.cidade}">
                                    <span class="focus-inputdados"></span><span class="symbol-inputdados"><i class="fa fa-map-marker"></i></span>
                                </div>

                            </div>
                            <div class="form-group col-md-4">
                                <label for="input">Bairro</label>
                                <div class="wrap-input">
                                    <input class="inputdados" type="text" name="txtBairro" id="bairro" value="${endereco.bairro}">
                                    <span class="focus-inputdados"></span><span class="symbol-inputdados"><i class="fa fa-map-marker"></i></span>
                                </div>

                            </div>
                            <div class="form-group col-md-4">
                                <label for="input">CEP</label>
                                <div class="wrap-input">
                                    <input class="inputdados" type="text" name="txtCEP" id="cep" placeholder="000000-000" value="${endereco.cep}">
                                    <span class="focus-inputdados"></span><span class="symbol-inputdados"><i class="fa fa-map-marker" aria-hidden="true"></i></span>
                                </div>

                            </div>
                        </div>
                        <ul class="nav justify-content-center bot">
                            <input type="hidden" name="acao" value="atualizarEndereco">
                            <input type="hidden" name="txtIdEndereco" value="${endereco.idendereco}">
                            <input type="hidden" name="idusuario" value="<% out.print(acs.getIdusuario());%>">
                            <button type="submit" class="btn btn-primary btn-send">Atualizar</button>
                            <button type="reset" class="btn btn-danger btn-reset">Apagar</button>
                        </ul>
                    </form>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
        <jsp:include page="script.jsp"/>
    </body>
</html>
