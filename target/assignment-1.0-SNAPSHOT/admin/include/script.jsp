<script>
    // Get the Sidebar
    var mySidebar = document.getElementById("mySidebar");

    // Get the DIV with overlay effect
    var overlayBg = document.getElementById("myOverlay");

    // Toggle between showing and hiding the sidebar, and add overlay effect
    function w3_open() {
        if (mySidebar.style.display === 'block') {
            mySidebar.style.display = 'none';
            overlayBg.style.display = "none";
        } else {
            mySidebar.style.display = 'block';
            overlayBg.style.display = "block";
        }
    }

    // Close the sidebar with the close button
    function w3_close() {
        mySidebar.style.display = "none";
        overlayBg.style.display = "none";
    }
</script>

<!-- Bootstrap core JavaScript-->
<script src="/admin/asset/vendor/jquery/jquery.min.js"></script>
<script src="/admin/asset/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="/admin/asset/vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="/admin/asset/js/sb-admin-2.min.js"></script>

<!-- Page level plugins -->
<script src="/admin/asset/vendor/chart.js/Chart.min.js"></script>

<!-- Page level custom scripts -->
<script src="/admin/asset/js/demo/chart-area-demo.js"></script>
<script src="/admin/asset/js/demo/chart-pie-demo.js"></script>