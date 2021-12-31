<%
    String title = request.getParameter("title");
    String description = request.getParameter("description");
    String keywords = request.getParameter("keywords");
%>
<title><%= title%></title>
<meta name="description" content="<%= description%>"/>
<meta name="keywords" content="<%= keywords%>"/>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta charset="UTF-8">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- Custom fonts for this template-->
<link href="/admin/asset/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
<link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

<!-- Custom styles for this template-->
<link href="/admin/asset/css/sb-admin-2.min.css" rel="stylesheet">
<style>
    html,body,h1,h2,h3,h4,h5 {font-family: "Raleway", sans-serif}
</style>