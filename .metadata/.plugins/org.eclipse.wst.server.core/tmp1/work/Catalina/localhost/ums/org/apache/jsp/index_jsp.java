/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.16
 * Generated at: 2019-04-15 06:09:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/UMS/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/ums/WEB-INF/lib/spring-webmvc-5.1.0.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1537493032000L));
    _jspx_dependants.put("jar:file:/D:/UMS/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/ums/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098691290000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.1.0.RELEASE.jar", Long.valueOf(1554267642629L));
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1554267778176L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>UMS</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Open+Sans|Candal|Alegreya+Sans\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"resources/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"resources/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"resources/css/imagehover.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/style.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<!--Navigation bar-->\r\n");
      out.write("\t<nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\tdata-target=\"#myNavbar\"></button>\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"index.html\">Jubi<span>lant</span></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t<li class=\"btn-trial\"><a href=\"#Home\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#about\">About</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#programmes\">Programmes</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#infrasturcture\">Infrastructure</a></li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn btn-default dropdown-toggle form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"button\" id=\"menu1\" data-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\tLogin As: <span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"menu1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"user/loginForm?role=s\">Student</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"user/loginForm?role=f\">Faculty</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"user/loginForm?role=a\">Admin</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<!--/ Navigation bar-->\r\n");
      out.write("\r\n");
      out.write("\t<!--Banner-->\r\n");
      out.write("\t<div class=\"banner\"\r\n");
      out.write("\t\tstyle=\"background: url('resources/images/bg-banner.jpg') no-repeat center top\">\r\n");
      out.write("\t\t<div class=\"bg-color\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"banner-text text-center\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text-border\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2 class=\"text-dec\">Dream & Fulfill</h2>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"intro-para text-center quote\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"big-text\">Follow your dreams, &nbsp they know the\r\n");
      out.write("\t\t\t\t\t\t\t\tway.<p><p class=\"small-t\r\n");
      out.write("\t\t\t\t\t\t\text\">Jubilant sets the benchmark of the\r\n");
      out.write("\t\t\t\t\t\t\t\tglobal education with a system that matches the best of\r\n");
      out.write("\t\t\t\t\t\t\t\tpractices, theories, resources and standards all over the WORLD.</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--/ Banner-->\r\n");
      out.write("\t<!--About-->\r\n");
      out.write("\t<section id=\"about\" class=\"section-padding\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"header-section text-center\">\r\n");
      out.write("\t\t\t\t\t<h2>About</h2>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\tIndia's Leading Research & Innovation Driven Pvt. University<br>\r\n");
      out.write("\t\t\t\t\t\tBelow are some reasons Why we are consistently recognized as best:\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<hr class=\"bottom-line\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"about\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"heading pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>Government Recognized</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Jubilant university has been established by an act of\r\n");
      out.write("\t\t\t\t\t\t\t\tState Legislature and recognized by University Grants\r\n");
      out.write("\t\t\t\t\t\t\t\tCommission(UGC) through the Act of State Legislature.</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"about-img pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-check-square-o\"></i>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"about\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"heading pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>Reputed Faculty</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Jubilant has some of the most talented and dedicated\r\n");
      out.write("\t\t\t\t\t\t\t\tthought leaders in the country who come from the best\r\n");
      out.write("\t\t\t\t\t\t\t\tinstitutions around the world.</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"about-img pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-graduation-cap\"></i>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"about\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"heading pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>Top Placements</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\tBiggest strength of Jubilant. A unique Corporate Resource centre\r\n");
      out.write("\t\t\t\t\t\t\t\tto facilitate excellent placements.<br> Alumni all over the\r\n");
      out.write("\t\t\t\t\t\t\t\tworld in leading companies like McKinsey, HLL and Reliance.\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"about-img pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-trophy\"></i>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<!--/ About-->\r\n");
      out.write("\r\n");
      out.write("\t<!--Programs-->\r\n");
      out.write("\t<section id=\"programmes\" class=\"section-padding\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"header-section text-center\">\r\n");
      out.write("\t\t\t\t\t<h2>Programmes</h2>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\tThere are Various full courses available in our university.<br>\r\n");
      out.write("\t\t\t\t\t\tHere is the list of some full time graduate and post graduate\r\n");
      out.write("\t\t\t\t\t\tcourses.\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<hr class=\"bottom-line\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"service-box text-center\">\r\n");
      out.write("\t\t\t\t\t\t<h2>Undergraduate Programmes</h2>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\tB.Tech<br>B.com<br>B.B.A<br>B.sc<br>B.C.A\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"service-box text-center\">\r\n");
      out.write("\t\t\t\t\t\t<h2>Postgraduate Programmes</h2>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\tM.Tech<br>M.com<br>M.B.A<br>M.sc<br>M.C.A\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"service-box text-center\">\r\n");
      out.write("\t\t\t\t\t\t<h2>Trainings</h2>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\tBasic 3D Modelling using Blender<br>Realistic Architectural\r\n");
      out.write("\t\t\t\t\t\t\t3D Modelling<br>Trading Algorithms<br>Entrepreneurship<br>And\r\n");
      out.write("\t\t\t\t\t\t\tmany more\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<!--/ programmes-->\r\n");
      out.write("\r\n");
      out.write("\t<!--Testimonial-->\r\n");
      out.write("\t<section id=\"testimonial\" class=\"section-padding\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"header-section text-center\">\r\n");
      out.write("\t\t\t\t\t<h2 class=\"white\">See What Our Alumni Are Saying?</h2>\r\n");
      out.write("\t\t\t\t\t<p class=\"white\">Here are some of the experiences shared by our\r\n");
      out.write("\t\t\t\t\t\talumni about Jubilant</p>\r\n");
      out.write("\t\t\t\t\t<hr class=\"bottom-line bg-white\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"text-comment\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"text-par\">\"Life in Jubilant has been a breathtaking\r\n");
      out.write("\t\t\t\t\t\t\texperience.All the faculty members,mentors and everyone in\r\n");
      out.write("\t\t\t\t\t\t\tJubilant family have been a great help and a strong support. This\r\n");
      out.write("\t\t\t\t\t\t\tplace has immensely added to my persona and I will always cherish\r\n");
      out.write("\t\t\t\t\t\t\tthe memories I shared with this place.\"</p>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<p class=\"text-name\">\r\n");
      out.write("\t\t\t\t\t\t\tHimani Gupta- MBA in Competitive Intelligence<br>\r\n");
      out.write("\t\t\t\t\t\t\tBatch:2012-14\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"text-comment\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"text-par\">\"Jubilant has been a completely enriching\r\n");
      out.write("\t\t\t\t\t\t\texperience. I have acquired lot of confidence through various\r\n");
      out.write("\t\t\t\t\t\t\tplaforms provided by College such as Sangathan, Youth Fest etc\r\n");
      out.write("\t\t\t\t\t\t\twhich gave us opportunity to present our innate creativity and\r\n");
      out.write("\t\t\t\t\t\t\ttalent. The faculty is very supportive and ready to help\r\n");
      out.write("\t\t\t\t\t\t\tanytime.\"</p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"text-name\">\r\n");
      out.write("\t\t\t\t\t\t\tAnita Kumari - B.sc(Fashion Design)<br>Batch:2011-14\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<!--/ Testimonial-->\r\n");
      out.write("\t<!--Infrastructure-->\r\n");
      out.write("\t<section id=\"infrasturcture\" class=\"section-padding\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"header-section text-center\">\r\n");
      out.write("\t\t\t\t\t<h2>Infrastructure</h2>\r\n");
      out.write("\t\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t\t<hr class=\"bottom-line\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 col-sm-6 padleft-right\">\r\n");
      out.write("\t\t\t\t\t<figure class=\"imghvr-fold-up\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"resources/images/library.jfif\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t\t\t<figcaption>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Library</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Synonymous with the abode of knowledge, the six libraries\r\n");
      out.write("\t\t\t\t\t\t\t\tat Jubilant are stocked with the lakhs of books and thousands of\r\n");
      out.write("\t\t\t\t\t\t\t\tjournals to propel the wisdom growth of the students. These\r\n");
      out.write("\t\t\t\t\t\t\t\tlibraries are frequently updated with new books and other useful\r\n");
      out.write("\t\t\t\t\t\t\t\tstudy material for students.</p>\r\n");
      out.write("\t\t\t\t\t\t</figcaption>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 col-sm-6 padleft-right\">\r\n");
      out.write("\t\t\t\t\t<figure class=\"imghvr-fold-up\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"resources/images/classroom.jfif\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t\t\t<figcaption>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Syndicate Rooms</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t300 students can brainstorm at the same time in 50 Syndicate\r\n");
      out.write("\t\t\t\t\t\t\t\tRooms.<br>The Syndicate Rooms provide the perfect setting\r\n");
      out.write("\t\t\t\t\t\t\t\tto acquire team skills through exercises like brain-storming\r\n");
      out.write("\t\t\t\t\t\t\t\tsessions, group discussions, role-plays etc.\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</figcaption>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 col-sm-6 padleft-right\">\r\n");
      out.write("\t\t\t\t\t<figure class=\"imghvr-fold-up\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"resources/images/auditorium.jfif\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t\t\t<figcaption>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Auditorium</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<p>State-of-the-art auditoriums with a combined seating\r\n");
      out.write("\t\t\t\t\t\t\t\tcapacity of over 3,500 act as a common ground for students,\r\n");
      out.write("\t\t\t\t\t\t\t\tfaculty and corporate personalities for regular interfaces,\r\n");
      out.write("\t\t\t\t\t\t\t\tconferences and other events.</p>\r\n");
      out.write("\t\t\t\t\t\t</figcaption>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 col-sm-6 padleft-right\">\r\n");
      out.write("\t\t\t\t\t<figure class=\"imghvr-fold-up\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"resources/images/play.jfif\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t\t\t<figcaption>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Playground</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<p>At Jubilant,sports form one of the important aspects of a\r\n");
      out.write("\t\t\t\t\t\t\t\tstudent's development.From increasing concentration levels and\r\n");
      out.write("\t\t\t\t\t\t\t\tworking as a team to inculcating a winning spirit;sports help\r\n");
      out.write("\t\t\t\t\t\t\t\tstudents build a strong character.</p>\r\n");
      out.write("\t\t\t\t\t\t</figcaption>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 col-sm-6 padleft-right\">\r\n");
      out.write("\t\t\t\t\t<figure class=\"imghvr-fold-up\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"resources/images/hostel.jfif\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t\t\t<figcaption>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Hostel Accomodation</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Jubilant offers comprehensive hostel facilities for boys\r\n");
      out.write("\t\t\t\t\t\t\t\tand girls separately within the University Campus.Caring wardens\r\n");
      out.write("\t\t\t\t\t\t\t\tand a vigilant security ensures a pleasant stay allowing\r\n");
      out.write("\t\t\t\t\t\t\t\tstudents to focus on academics.</p>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 col-sm-6 padleft-right\">\r\n");
      out.write("\t\t\t\t\t<figure class=\"imghvr-fold-up\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"resources/images/labs.jfif\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t\t\t<figcaption>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Laboratory</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<p>The specialised biotechnology laboratories are equipped to\r\n");
      out.write("\t\t\t\t\t\t\t\tconduct advanced practical and research work.Jubilant has over\r\n");
      out.write("\t\t\t\t\t\t\t\t300 labs where students experiment and bring to practice what\r\n");
      out.write("\t\t\t\t\t\t\t\tthey have learnt in theory.</p>\r\n");
      out.write("\t\t\t\t\t\t</figcaption>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<!--/ Courses-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!--Footer-->\r\n");
      out.write("\t<footer id=\"footer\" class=\"footer\">\r\n");
      out.write("\t\t<div class=\"container text-center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h3>For More Information</h3>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- End newsletter-form -->\r\n");
      out.write("\t\t\t<ul class=\"social-links\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#link\"><i class=\"fa fa-twitter fa-fw\"></i></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#link\"><i class=\"fa fa-facebook fa-fw\"></i></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#link\"><i class=\"fa fa-google-plus fa-fw\"></i></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#link\"><i class=\"fa fa-dribbble fa-fw\"></i></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#link\"><i class=\"fa fa-linkedin fa-fw\"></i></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\tAll rights reserved\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<!--/ Footer-->\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"resources/js/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"resources/js/jquery.easing.min.js\"></script>\r\n");
      out.write("\t<script src=\"resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"resources/js/custom.js\"></script>\r\n");
      out.write("\t<script src=\"resources/contactform/contactform.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
