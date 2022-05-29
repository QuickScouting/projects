package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Product;

public final class Search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <!-- Basic -->\n");
      out.write("  <meta charset=\"utf-8\" />\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("  <!-- Mobile Metas -->\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("  <!-- Site Metas -->\n");
      out.write("  <meta name=\"keywords\" content=\"\" />\n");
      out.write("  <meta name=\"description\" content=\"\" />\n");
      out.write("  <meta name=\"author\" content=\"\" />\n");
      out.write("  <link rel=\"shortcut icon\" href=\"images/favicon.png\" type=\"image/x-icon\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  <title>ShopDuck</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- bootstrap core css -->\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\" />\n");
      out.write("  <!--owl slider stylesheet -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- font awesome style -->\n");
      out.write("  <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("  <!-- Custom styles for this template -->\n");
      out.write("  <link href=\"css/style.css\" rel=\"stylesheet\" />\n");
      out.write("  <!-- responsive style -->\n");
      out.write("  <link href=\"css/responsive.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("    .feature_section {\n");
      out.write("        background-color: #86cfda;\n");
      out.write("    }\n");
      out.write("* {\n");
      out.write("    box-sizing: border-box\n");
      out.write("}\n");
      out.write("\n");
      out.write("#search {\n");
      out.write("    outline: none;\n");
      out.write("    border: none;\n");
      out.write("    display: inline-block\n");
      out.write("}\n");
      out.write("\n");
      out.write("#burgundy {\n");
      out.write("    color: rgb(153, 40, 59)\n");
      out.write("}\n");
      out.write("\n");
      out.write("#orange,\n");
      out.write("select,\n");
      out.write(".btn {\n");
      out.write("    color: orange\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fa-search {\n");
      out.write("    font-size: 20px;\n");
      out.write("    padding: 10px;\n");
      out.write("    margin-bottom: 3px;\n");
      out.write("    padding-right: 20px\n");
      out.write("}\n");
      out.write("\n");
      out.write(".search-nav-item {\n");
      out.write("    height: 40px\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav {\n");
      out.write("    padding: 0px 100px\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fa-user-o,\n");
      out.write(".fa-shopping-cart {\n");
      out.write("    font-size: 20px;\n");
      out.write("    padding: 4px\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group {\n");
      out.write("    margin-bottom: 5px\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("    padding-left: 10px\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group:last-child {\n");
      out.write("    margin-bottom: 0\n");
      out.write("}\n");
      out.write("\n");
      out.write("h6 {\n");
      out.write("    margin-bottom: 0px\n");
      out.write("}\n");
      out.write("\n");
      out.write("#sort {\n");
      out.write("    outline: none;\n");
      out.write("    border: none\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn {\n");
      out.write("    border: 1px solid orange;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    background-color: #fff\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn:hover {\n");
      out.write("    color: #fff;\n");
      out.write("    background-color: orange\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card-body {\n");
      out.write("    padding: 8px\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sign {\n");
      out.write("    width: 25px;\n");
      out.write("    height: 25px\n");
      out.write("}\n");
      out.write("\n");
      out.write(".discount {\n");
      out.write("    border: 1px solid orange;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    width: 65px;\n");
      out.write("    position: absolute;\n");
      out.write("    top: 2%\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media(min-width:1200px) {\n");
      out.write("    #search {\n");
      out.write("        width: 300px;\n");
      out.write("        padding: 5px;\n");
      out.write("        padding-left: 20px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .search-nav-item {\n");
      out.write("        margin-left: 400px;\n");
      out.write("        width: 350px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .fa-user-o {\n");
      out.write("        margin-left: 300px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .text {\n");
      out.write("        display: none\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .fa-user-o,\n");
      out.write("    .fa-shopping-cart {\n");
      out.write("        font-size: 20px;\n");
      out.write("        padding-left: 20px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #sidebar {\n");
      out.write("        width: 30%;\n");
      out.write("        padding: 20px;\n");
      out.write("        float: left\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #products {\n");
      out.write("        width: 70%;\n");
      out.write("        padding: 10px;\n");
      out.write("        margin: 0;\n");
      out.write("        float: right\n");
      out.write("    }\n");
      out.write("    \n");
      out.write(".card{\n");
      out.write("ransition-duration: .3s;\n");
      out.write("transition-property: transform;\n");
      out.write("transition-timing-function: ease-out;\n");
      out.write("}\n");
      out.write(".card:hover{\n");
      out.write("transform: translateY(-20px);\n");
      out.write("}\n");
      out.write("    \n");
      out.write("    .card {\n");
      out.write("        width: 300px;\n");
      out.write("        height: 330px;\n");
      out.write("        border: solid black 1px;\n");
      out.write("        margin-bottom: 10px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .card-img-top {\n");
      out.write("        width: 210px;\n");
      out.write("        height: 200px;\n");
      out.write("        border-radius: 10px;\n");
      out.write("        display: block; margin-left: auto; margin-right: auto;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("\n");
      out.write("    del {\n");
      out.write("        padding-right: 2px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .filter,\n");
      out.write("    #mobile-filter {\n");
      out.write("        display: none\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media(min-width:992px) and (max-width:1199px) {\n");
      out.write("    #search {\n");
      out.write("        width: 300px;\n");
      out.write("        padding: 5px;\n");
      out.write("        padding-left: 20px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .search-nav-item {\n");
      out.write("        margin-left: 200px;\n");
      out.write("        width: 350px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .fa-user-o {\n");
      out.write("        margin-left: 160px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .text {\n");
      out.write("        display: none\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #sidebar {\n");
      out.write("        width: 30%;\n");
      out.write("        padding: 20px;\n");
      out.write("        float: left\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #products {\n");
      out.write("        width: 70%;\n");
      out.write("        padding: 10px;\n");
      out.write("        margin: 0;\n");
      out.write("        float: right\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .card {\n");
      out.write("        width: 200px;\n");
      out.write("        height: 330px;\n");
      out.write("        border: none\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .card-img-top {\n");
      out.write("        width: 210px;\n");
      out.write("        height: 200px;\n");
      out.write("        border-radius: 10px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .fa-plus,\n");
      out.write("    .fa-minus {\n");
      out.write("        font-size: 12px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .sign {\n");
      out.write("        height: 25px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .price {\n");
      out.write("        width: 99px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .filter,\n");
      out.write("    #mobile-filter {\n");
      out.write("        display: none\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media(min-width:768px) and (max-width:991px) {\n");
      out.write("    #search {\n");
      out.write("        width: 300px;\n");
      out.write("        padding: 5px;\n");
      out.write("        padding-left: 20px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .search-nav-item {\n");
      out.write("        margin-left: 60px;\n");
      out.write("        width: 350px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .fa-user-o {\n");
      out.write("        margin-left: 80px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .text {\n");
      out.write("        display: none\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #sidebar {\n");
      out.write("        width: 35%;\n");
      out.write("        padding: 20px;\n");
      out.write("        float: left\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #products {\n");
      out.write("        width: 65%;\n");
      out.write("        padding: 10px;\n");
      out.write("        margin: 0;\n");
      out.write("        float: right\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .card {\n");
      out.write("        border: none\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .filter,\n");
      out.write("    #mobile-filter {\n");
      out.write("        display: none\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media(min-width:576px) and (max-width:767px) {\n");
      out.write("    .text {\n");
      out.write("        display: none\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .search-nav-item {\n");
      out.write("        margin-left: 35px;\n");
      out.write("        width: 270px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #search {\n");
      out.write("        width: 240px;\n");
      out.write("        padding: 5px;\n");
      out.write("        padding-left: 20px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .fa-search {\n");
      out.write("        padding: 3px;\n");
      out.write("        font-size: 18px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #sidebar {\n");
      out.write("        width: 40%;\n");
      out.write("        padding: 20px;\n");
      out.write("        float: left\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    .card {\n");
      out.write("        border: none\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #off {\n");
      out.write("        padding-left: 2px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #sorting span,\n");
      out.write("    #res {\n");
      out.write("        font-size: 14px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .filter,\n");
      out.write("    #mobile-filter {\n");
      out.write("        display: none\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media(max-width:575px) {\n");
      out.write("    .search-nav-item {\n");
      out.write("        margin: 0;\n");
      out.write("        width: 100%;\n");
      out.write("        margin-top: 10px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #search {\n");
      out.write("        width: 80%;\n");
      out.write("        padding-left: 10px;\n");
      out.write("        margin-top: 10px;\n");
      out.write("        padding-right: 10px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .fa-search {\n");
      out.write("        padding: 10px;\n");
      out.write("        font-size: 18px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #sidebar {\n");
      out.write("        display: none\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .filter {\n");
      out.write("        margin-left: 70%;\n");
      out.write("        margin-top: 2%\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #sorting,\n");
      out.write("    #res {\n");
      out.write("        font-size: 12px;\n");
      out.write("        margin-top: 2%\n");
      out.write("    }\n");
      out.write("}\n");
      out.write(".hero_area{\n");
      out.write("    min-height: 20px;\n");
      out.write("}\n");
      out.write(".header_section{\n");
      out.write("    background-color: #86cfda\n");
      out.write("}\n");
      out.write(".footer_section{\n");
      out.write("    clear: both;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- header section strats -->\n");
      out.write("    <header class=\"header_section\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <nav class=\"navbar navbar-expand-lg custom_nav-container \">\n");
      out.write("          <a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("            <span>\n");
      out.write("              ShopDuck\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"\"> </span>\n");
      out.write("          </button>\n");
      out.write("\n");
      out.write("          <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("              <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"Home.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"AboutUs.jsp\"> About </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"Contact.jsp\">Contact Us</a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("              <i class=\"fas fa-search\"></i>\n");
      out.write("              <form id=\"search-form\" action=\"search\" method=\"get\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Search\" name=\"name\">\n");
      out.write("                    <input type=\"submit\" class=\"search-domain btn btn-primary px-1\" value=\"Search\">\n");
      out.write("              </form>\n");
      out.write("            <div class=\"user_option-box\">\n");
      out.write("              <a href=\"Login.jsp\">\n");
      out.write("                <i class=\"fas fa-user-alt\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"\">\n");
      out.write("                <i class=\"fas fa-cart-plus\"></i>\n");
      out.write("              </a>\n");
      out.write("                <a></a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("    <!-- end header section -->\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Begin filter -->\n");
      out.write("    <section id=\"sidebar\">\n");
      out.write("    <p> Home | <b>All Iphones</b></p>\n");
      out.write("    <div class=\"border-bottom pb-2 ml-2\">\n");
      out.write("        <h4 id=\"burgundy\">Filters</h4>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"py-2 border-bottom ml-3\">\n");
      out.write("        <h6 class=\"font-weight-bold\">Categories</h6>\n");
      out.write("        <div id=\"orange\"><span class=\"fa fa-minus\"></span></div>\n");
      out.write("        <form>\n");
      out.write("            <div class=\"form-group\"> <input type=\"checkbox\" id=\"artisan\"> <label for=\"artisan\">Fresh Artisan Breads</label> </div>\n");
      out.write("            <div class=\"form-group\"> <input type=\"checkbox\" id=\"breakfast\"> <label for=\"breakfast\">Breakfast Breads</label> </div>\n");
      out.write("            <div class=\"form-group\"> <input type=\"checkbox\" id=\"healthy\"> <label for=\"healthy\">Healthy Breads</label> </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"py-2 border-bottom ml-3\">\n");
      out.write("        <h6 class=\"font-weight-bold\">Accompainments</h6>\n");
      out.write("        <div id=\"orange\"><span class=\"fa fa-minus\"></span></div>\n");
      out.write("        <form>\n");
      out.write("            <div class=\"form-group\"> <input type=\"checkbox\" id=\"tea\"> <label for=\"tea\">Tea Cakes</label> </div>\n");
      out.write("            <div class=\"form-group\"> <input type=\"checkbox\" id=\"cookies\"> <label for=\"cookies\">Cookies</label> </div>\n");
      out.write("            <div class=\"form-group\"> <input type=\"checkbox\" id=\"pastries\"> <label for=\"pastries\">Pastries</label> </div>\n");
      out.write("            <div class=\"form-group\"> <input type=\"checkbox\" id=\"dough\"> <label for=\"dough\">Cookie Dough</label> </div>\n");
      out.write("            <div class=\"form-group\"> <input type=\"checkbox\" id=\"choco\"> <label for=\"choco\">Chocolates</label> </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"py-2 ml-3\">\n");
      out.write("        <h6 class=\"font-weight-bold\">Top Offers</h6>\n");
      out.write("        <div id=\"orange\"><span class=\"fa fa-minus\"></span></div>\n");
      out.write("        <form>\n");
      out.write("            <div class=\"form-group\"> <input type=\"checkbox\" id=\"25off\"> <label for=\"25\">25% off</label> </div>\n");
      out.write("            <div class=\"form-group\"> <input type=\"checkbox\" id=\"5off\"> <label for=\"5off\" id=\"off\">5% off on artisan breads</label> </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("    <!-- End filter -->\n");
      out.write("\n");
      out.write("    <!-- products section -->\n");
      out.write("    <section id=\"sanpham\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"d-flex flex-row\">\n");
      out.write("            <div class=\"ml-auto mr-lg-4\">\n");
      out.write("                <div id=\"sorting\" class=\"border rounded p-1 m-1\"> <span class=\"text-muted\">Sort by</span> <select name=\"sort\" id=\"sort\">\n");
      out.write("                        <option value=\"popularity\"><b>Popularity</b></option>\n");
      out.write("                        <option value=\"prcie\"><b>Price</b></option>\n");
      out.write("                        <option value=\"rating\"><b>Rating</b></option>\n");
      out.write("                    </select> </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("            ");

                        List<Product> Slist = (List<Product>) session.getAttribute("Slist");
                        for (Product c : Slist) {
                    
      out.write("\n");
      out.write("            <div class=\"col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1\">\n");
      out.write("                <div class=\"card\"> <img class=\"card-img-top\" src=\"");
      out.print( c.getImage());
      out.write("\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5><b>");
      out.print( c.getName());
      out.write("</b> </h5>\n");
      out.write("                        <div class=\"d-flex flex-row my-2\">\n");
      out.write("                            <div class=\"text-muted\">");
      out.print( c.getPrice());
      out.write("</div>\n");
      out.write("                            <div class=\"ml-auto\"> <button class=\"border rounded bg-white sign\"><span class=\"fa fa-plus\" id=\"orange\"></span></button> <span class=\"px-sm-1\">");
      out.print( c.getQuantity());
      out.write("</span> <button class=\"border rounded bg-white sign\"><span class=\"fa fa-minus\" id=\"orange\"></span></button> </div>\n");
      out.write("                        </div> <button class=\"btn w-100 rounded my-2\">Add to cart</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("  <!-- footer section -->\n");
      out.write("  <footer class=\"footer_section\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-6 col-lg-3 footer-col\">\n");
      out.write("          <div class=\"footer_detail\">\n");
      out.write("            <h4>\n");
      out.write("              About\n");
      out.write("            </h4>\n");
      out.write("            <p>\n");
      out.write("              Necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with\n");
      out.write("            </p>\n");
      out.write("            <div class=\"footer_social\">\n");
      out.write("              <a href=\"https://www.facebook.com/duydx6868\">\n");
      out.write("                <i class=\"fab fa-facebook\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"\">\n");
      out.write("                <i class=\"fab fa-twitter-square\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"\">\n");
      out.write("                <i class=\"fab fa-linkedin\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"https://www.instagram.com/xunduzzz/\">\n");
      out.write("                <i class=\"fab fa-instagram-square\"></i>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6 col-lg-3 footer-col\">\n");
      out.write("          <div class=\"footer_contact\">\n");
      out.write("            <h4>\n");
      out.write("              Reach at..\n");
      out.write("            </h4>\n");
      out.write("            <div class=\"contact_link_box\">\n");
      out.write("              <a href=\"\">\n");
      out.write("                <i class=\"fas fa-map-marker-alt\"></i>\n");
      out.write("                <span>\n");
      out.write("                  Location\n");
      out.write("                </span>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"\">\n");
      out.write("                <i class=\"fas fa-phone-alt\"></i>\n");
      out.write("                <span>\n");
      out.write("                  Call +84 867751518\n");
      out.write("                </span>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"\">\n");
      out.write("                <i class=\"fas fa-envelope\"></i>\n");
      out.write("                <span>\n");
      out.write("                  duydxhe151374@fpt.edu.vn\n");
      out.write("                </span>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6 col-lg-3 footer-col\">\n");
      out.write("          <div class=\"footer_contact\">\n");
      out.write("            <h4>\n");
      out.write("              Subscribe\n");
      out.write("            </h4>\n");
      out.write("            <form action=\"#\">\n");
      out.write("              <input type=\"text\" placeholder=\"Enter email\" />\n");
      out.write("              <button type=\"submit\">\n");
      out.write("                Subscribe\n");
      out.write("              </button>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6 col-lg-3 footer-col\">\n");
      out.write("          <div class=\"map_container\">\n");
      out.write("            <div class=\"map\">\n");
      out.write("              <div id=\"googleMap\"></div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("  <!-- footer section -->\n");
      out.write("\n");
      out.write("  <!-- jQery -->\n");
      out.write("  <script src=\"js/jquery-3.4.1.min.js\"></script>\n");
      out.write("  <!-- popper js -->\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\">\n");
      out.write("  </script>\n");
      out.write("  <!-- bootstrap js -->\n");
      out.write("  <script src=\"js/bootstrap.js\"></script>\n");
      out.write("  <!-- owl slider -->\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js\">\n");
      out.write("  </script>\n");
      out.write("  <!-- custom js -->\n");
      out.write("  <script src=\"js/custom.js\"></script>\n");
      out.write("  <!-- Google Map -->\n");
      out.write("  <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCh39n5U-4IoWpsVGUHWdqB6puEkhRLdmI&callback=myMap\"></script>\n");
      out.write("  <!-- End Google Map -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
