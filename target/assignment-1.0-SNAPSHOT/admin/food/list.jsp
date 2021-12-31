<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page import="manager.food.assignment.entity.Food" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("utf-8");
    ArrayList<Food> listFood = (ArrayList<Food>) request.getAttribute("list");
%>

<!DOCTYPE html>
<html>
<head>
    <jsp:include page="/admin/include/header.jsp">
        <jsp:param name="title" value="Food list"/>
        <jsp:param name="description" value="Food list"/>
        <jsp:param name="keywords" value="admin, page...."/>
    </jsp:include>
    <style>
        .msg-error {
            color: red;
        }
    </style>
</head>
<body id="page-top">

<!-- Page Wrapper -->
<div id="wrapper">

    <!-- Sidebar -->
    <jsp:include page="/admin/include/left-menu.jsp"/>
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

        <!-- Main Content -->
        <div id="content">
            <!-- Begin Page Content -->
            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="d-sm-flex align-items-center justify-content-between mb-4">
                    <h1 class="h3 mb-0 text-gray-800">List Food</h1>
                </div>

                <div class="card-body">
                    <form class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search" style="float:right">
                        <div class="input-group">
                            <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..."
                                   aria-label="Search" aria-describedby="basic-addon2">
                            <div class="input-group-append">
                                <button class="btn btn-primary" type="button">
                                    <i class="fas fa-search fa-sm"></i>
                                </button>
                            </div>
                        </div>
                    </form>
                    <div class="table-responsive">
                        <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                            <thead>
                                <tr>
                                    <th>Name</th>
                                    <th>Category</th>
                                    <th>Description</th>
                                    <th>Thumbnail</th>
                                    <th>Price</th>
                                    <th>Status</th>
                                    <th>Start Date</th>
                                    <th>End Date</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    for(int i = 0; i < listFood.size(); i++){
                                %>
                                <tr>
                                    <th><%=listFood.get(i).getName()%></th>
                                    <th><%=listFood.get(i).getCategory()%></th>
                                    <th><%=listFood.get(i).getDescription()%></th>
                                    <th>
                                        <img src="<%=listFood.get(i).getThumbnail()%>" style="width: 70px" class="w3-border w3-padding">
                                    </th>
                                    <th><%=listFood.get(i).getPrice()%></th>
                                    <th><%=listFood.get(i).getStatus()%></th>
                                    <th><%=listFood.get(i).getSdate()%></th>
                                    <th><%=listFood.get(i).getFdate()%></th>
                                    <th>
                                        <a href="/admin/food/detail?id=<%=listFood.get(i).getId()%>">Detail</a>&nbsp;
                                        <a href="/admin/food/edit?id=<%=listFood.get(i).getId()%>">Edit</a>&nbsp;
                                        <a href="/admin/food/delete?id=<%=listFood.get(i).getId()%>">Delete</a>
                                    </th>
                                </tr>
                                <%
                                    }
                                %>
                                <tr></tr>
                            </tbody>
                        </table>
                    </div>
                </div>

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- End of Main Content -->

        <!-- Footer -->
        <jsp:include page="/admin/include/footer.jsp"/>
        <!-- End of Footer -->

    </div>
    <!-- End of Content Wrapper -->

</div>
<!-- End of Page Wrapper -->

<!-- Scroll to Top Button-->
<a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
</a>

<!-- Logout Modal-->
<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
            <div class="modal-footer">
                <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                <a class="btn btn-primary" href="login.html">Logout</a>
            </div>
        </div>
    </div>
</div>

<jsp:include page="/admin/include/script.jsp"/>
</body>

</html>