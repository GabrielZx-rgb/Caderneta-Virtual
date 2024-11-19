package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Caderneta Virtual</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menuindex.jsp", out, false);
      out.write("\n");
      out.write("        <!-- Carousel -->\n");
      out.write("        <div class=\"intro intro-carousel\" style=\"padding-top: 3%;\">\n");
      out.write("            <div id=\"carousel\" class=\"owl-carousel owl-theme\">\n");
      out.write("                <div class=\"carousel-item-a intro-item bg-image\" style=\"background-image: url(image/three-persons-sitting-on-the-stairs-talking-with-each-other-1438072.jpg)\">\n");
      out.write("                    <div class=\"overlay overlay-a\"></div>\n");
      out.write("                    <div class=\"intro-content display-table\">\n");
      out.write("                        <div class=\"table-cell\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-lg-8\">\n");
      out.write("                                        <div class=\"intro-body\">\n");
      out.write("                                            <p class=\"intro-title-top\"><br>\n");
      out.write("                                            </p>\n");
      out.write("                                            <h1 class=\"intro-title mb-4\"> Consulta das suas <span class=\"color-b\">Vacinas </span> Online!</h1>\n");
      out.write("                                            <p class=\"intro-subtitle intro-price\"> <a href=\"sistemas.jsp#consulta\"><span class=\"price-a\">Saiba Mais</span></a> </p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item-a intro-item bg-image\" style=\"background-image: url(image/12966.jpg)\">\n");
      out.write("                    <div class=\"overlay overlay-a\"></div>\n");
      out.write("                    <div class=\"intro-content display-table\">\n");
      out.write("                        <div class=\"table-cell\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-lg-8\">\n");
      out.write("                                        <div class=\"intro-body\">\n");
      out.write("                                            <h1 class=\"intro-title mb-4\"> Descubra como <span class=\"color-b\">recuperar</span> seu cartão de vacinas! <br>\n");
      out.write("                                            </h1>\n");
      out.write("                                            <p class=\"intro-subtitle intro-price\"> <a href=\"calendario.jsp#carteira\"><span class=\"price-a\">Saiba Mais</span></a> </p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item-a intro-item bg-image\" style=\"background-image: url(image/man-wearing-white-dress-shirt-3184316.jpg)\">\n");
      out.write("                    <div class=\"overlay overlay-a\"></div>\n");
      out.write("                    <div class=\"intro-content display-table\">\n");
      out.write("                        <div class=\"table-cell\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-lg-8\">\n");
      out.write("                                        <div class=\"intro-body\">\n");
      out.write("                                            <h1 class=\"intro-title mb-4\">Gostaria de trabalhar conosco? <br>\n");
      out.write("                                                <span class=\"color-b\">Junte-se </span> a nós!</h1>\n");
      out.write("                                            <p class=\"intro-subtitle intro-price\"> <a href=\"contato.jsp\"><span class=\"price-a\">Saiba Mais</span></a> </p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Fim do Carousel --> \n");
      out.write("\n");
      out.write("        <!-- Seção de Introdução do Site -->\n");
      out.write("\n");
      out.write("        <div class=\"container\" id=\"introducao\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <h2 class=\"featurette-heading text-center title-a\">Seja Bem-vindo a Caderneta Virtual!</h2>\n");
      out.write("                    <br>\n");
      out.write("                    <p class=\"lead text-center\">A Caderneta Virtual e toda sua equipe lhe deseja boas-vindas!<br>\n");
      out.write("                        Ficamos felizes que você esteja visitando nosso Web Site e esperamos que você utilize de nossos serviços. <br>\n");
      out.write("                        Nosso principal objetivo a longo prazo é sempre alcançar resultados completos para a sua saúde.<br>\n");
      out.write("                        Mas, no processo, também mantemos o foco em oferecer o melhor serviço ao usuário. Estamos sempre fazendo do nosso sistema o lugar mais seguro e confiável possível!</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container marketing\"> \n");
      out.write("            <!-- Fim da Introdução do Site --> \n");
      out.write("\n");
      out.write("            <!-- Ínicio de Serviços -->\n");
      out.write("            <section class=\"section-services section-t8\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"title-wrap text-center\">\n");
      out.write("                                <div class=\"title-box\">\n");
      out.write("                                    <h2 class=\"title-a\">Sistemas</h2>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <div class=\"card-box-c foo\">\n");
      out.write("                                <div class=\"card-header-c d-flex\" >\n");
      out.write("                                    <div class=\"card-box-ico\"> <span class=\"fa fa-id-badge\"></span> </div>\n");
      out.write("                                    <div class=\"card-title-c align-self-center\">\n");
      out.write("                                        <h2 class=\"title-c\">Consultas</h2>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-body-c\">\n");
      out.write("                                    <p class=\"content-c\">Você poderá consultar online as suas vacinas em qualquer dispositivo. </p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-footer-c\"> <a href=\"sistemas.jsp#consulta\" class=\"link-c link-icon meneee\">Saiba mais <span class=\"ion-ios-arrow-forward\"></span> </a> </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <div class=\"card-box-c foo\">\n");
      out.write("                                <div class=\"card-header-c d-flex\">\n");
      out.write("                                    <div class=\"card-box-ico\"> <span class=\"fa fa-file-text\"></span> </div>\n");
      out.write("                                    <div class=\"card-title-c align-self-center\">\n");
      out.write("                                        <h2 class=\"title-c\">Históricos</h2>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-body-c\">\n");
      out.write("                                    <p class=\"content-c\">Você poderá acompanhar o seu histórico\n");
      out.write("                                        online em qualquer dispositivo.</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-footer-c\"> <a href=\"sistemas.jsp#historico\" class=\"link-c link-icon meneee\">Saiba mais <span class=\"ion-ios-arrow-forward\"></span> </a> </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <div class=\"card-box-c foo\">\n");
      out.write("                                <div class=\"card-header-c d-flex\">\n");
      out.write("                                    <div class=\"card-box-ico\"> <span class=\"fa fa-user-md\"></span> </div>\n");
      out.write("                                    <div class=\"card-title-c align-self-center\">\n");
      out.write("                                        <h2 class=\"title-c\">Vacinações</h2>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-body-c\">\n");
      out.write("                                    <p class=\"content-c\">Você poderá encontar lugares mais próximos e acessiveis para tomar vacinas.</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-footer-c\"> <a href=\"sistemas.jsp#vacinacao\" class=\"link-c link-icon meneee\">Saiba mais <span class=\"ion-ios-arrow-forward\"></span> </a> </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <!-- Fim dos Serviços--> \n");
      out.write("\n");
      out.write("            <!-- Ínicio das Notícias -->\n");
      out.write("            <section class=\"section-news section-t8\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"title-wrap justify-content-between\">\n");
      out.write("                                <div class=\"title-box\">\n");
      out.write("                                    <h2 class=\"title-a text-center\">Últimas Notícias</h2>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"new-carousel\" class=\"owl-carousel owl-theme\">\n");
      out.write("                        <div class=\"carousel-item-c\">\n");
      out.write("                            <div class=\"card-box-b card-shadow news-box\">\n");
      out.write("                                <div class=\"img-box-b\"> <img src=\"image/n1.jpg\" alt=\"\" class=\"img-b img-fluid\"> </div>\n");
      out.write("                                <div class=\"card-overlay\">\n");
      out.write("                                    <div class=\"card-header-b\">\n");
      out.write("                                        <div class=\"card-category-b\"> <a href=\"#\" class=\"category-b\">Saiba mais</a> </div>\n");
      out.write("                                        <div class=\"card-title-b\">\n");
      out.write("                                            <h2 class=\"title-2\"> <a href=\"#\">Dia D da vacinação contra o Sarampo</a> </h2>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"card-date\"> <span class=\"date-b\">30 de Novembro de 2019</span> </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-item-c\">\n");
      out.write("                            <div class=\"card-box-b card-shadow news-box\">\n");
      out.write("                                <div class=\"img-box-b\"> <img src=\"image/n2.gif\" alt=\"\" class=\"img-b img-fluid\"> </div>\n");
      out.write("                                <div class=\"card-overlay\">\n");
      out.write("                                    <div class=\"card-header-b\">\n");
      out.write("                                        <div class=\"card-category-b\"> <a href=\"#\" class=\"category-b\">Saiba mais</a> </div>\n");
      out.write("                                        <div class=\"card-title-b\">\n");
      out.write("                                            <h2 class=\"title-2\"> <a href=\"#\">Vacinação contra a Gripe</a> </h2>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"card-date\"> <span class=\"date-b\">12 de Dezembro de 2019</span> </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-item-c\">\n");
      out.write("                            <div class=\"card-box-b card-shadow news-box\">\n");
      out.write("                                <div class=\"img-box-b\"> <img src=\"image/n3.gif\" alt=\"\" class=\"img-b img-fluid\"> </div>\n");
      out.write("                                <div class=\"card-overlay\">\n");
      out.write("                                    <div class=\"card-header-b\">\n");
      out.write("                                        <div class=\"card-category-b\"> <a href=\"#\" class=\"category-b\">Saiba mais</a> </div>\n");
      out.write("                                        <div class=\"card-title-b\">\n");
      out.write("                                            <h2 class=\"title-2\"> <a href=\"#\">Surto de Sarampo no Brasil <br>\n");
      out.write("                                                </a> </h2>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"card-date\"> <span class=\"date-b\">19 de Novembro de 2019</span> </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-item-c\">\n");
      out.write("                            <div class=\"card-box-b card-shadow news-box\">\n");
      out.write("                                <div class=\"img-box-b\"> <img src=\"image/n4.jpeg\" alt=\"\" class=\"img-b img-fluid\"> </div>\n");
      out.write("                                <div class=\"card-overlay\">\n");
      out.write("                                    <div class=\"card-header-b\">\n");
      out.write("                                        <div class=\"card-category-b\"> <a href=\"#\" class=\"category-b\">Saiba mais</a> </div>\n");
      out.write("                                        <div class=\"card-title-b\">\n");
      out.write("                                            <h2 class=\"title-2\"> <a href=\"#\">Vacina contra HPV reduz lesões pré-cancerosas em até 51%</a> </h2>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"card-date\"> <span class=\"date-b\">02 de Julho de 2019</span> </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <!-- Fim das Notícias --> \n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "script.jsp", out, false);
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}