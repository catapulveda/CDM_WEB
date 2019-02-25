<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="es">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Lotes</title>

        <!-- Custom fonts for this template-->
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

        <!-- Custom styles for this template-->
        <link href="css/sb-admin-2.min.css" rel="stylesheet">

        <!-- Custom styles for this page -->
        <link href="vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
        <link href="vendor/datatables/select.dataTables.min.css" rel="stylesheet">
        <link href="vendor/datatables/estilo_dataTable.css" rel="stylesheet">
    </head>

    <body id="page-top">

        <!-- Page Wrapper -->
        <div id="wrapper">

            <!-- Sidebar -->
            <jsp:include page="sidebar.jsp"></jsp:include>
                <!-- End of Sidebar -->

                <!-- Content Wrapper -->
                <div id="content-wrapper" class="d-flex flex-column">

                    <!-- Main Content -->
                    <div id="content">

                        <!-- Topbar -->
                    <jsp:include page="topbar.jsp"></jsp:include>
                        <!-- End of Topbar -->

                        <!-- Begin Page Content -->
                        <div class="container-fluid">

                            <!-- DataTales Example -->
                            <div class="card shadow mb-4">
                                <div class="card-header py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Lotes</h6>
                                </div>
                                <div class="card-body">
                                    <div class="table-responsive">
                                        <table class="table table-bordered table-hover" id="dataTable" width="100%" cellspacing="0">
                                            <thead>
                                                <tr>
                                                    <th>ESTADO</th>
                                                    <th>Nº DESPACHO</th>
                                                    <th>Nº REMISION</th>                                                    
                                                    <th>Nº EMPRESA</th>
                                                    <th>Nº SERIE</th>
                                                    <th>FASE</th>
                                                    <th>KVA</th>
                                                    <th>TENSION</th>
                                                    <th>AÑO</th>
                                                    <th>PESO</th>
                                                    <th>OBSERVACION</th>
                                                    <th>SERVICIO</th>
                                                    <th>TIPO TRAFO</th>                                                    
                                                </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach items="${detalleLote}" var="lote" varStatus="status">
                                                <tr id="${lote.idtransformador}">
                                                    <td>${lote.estado}</td>
                                                    <td>${lote.despacho.nodespacho}</td>
                                                    <td>${lote.remision.numero}</td>
                                                    <td>${lote.numeroempresa}</td>
                                                    <td>${lote.numeroserie}</td>
                                                    <td>${lote.fase}</td>
                                                    <td>${lote.kvasalida}</td>
                                                    <td>${lote.tps}/${lote.tss}/${lote.tts}</td>
                                                    <td>${lote.ano}</td>
                                                    <td>${lote.peso}</td>
                                                    <td>${lote.observacionsalida}</td>
                                                    <td>${lote.serviciosalida}</td>
                                                    <td>${lote.tipotrafosalida}</td>                                                    
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>

                    </div>
                    <!-- /.container-fluid -->

                </div>
                <!-- End of Main Content -->

                <!-- Footer -->
                <jsp:include page="footer.jsp"></jsp:include>
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
        <jsp:include page="logoutModal.jsp"></jsp:include>
        <!-- End Logout Modal-->

        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="js/sb-admin-2.min.js"></script>

        <!-- Page level plugins -->
        <script src="vendor/datatables/jquery.dataTables.min.js"></script>
        <script src="vendor/datatables/dataTables.bootstrap4.min.js"></script>
        <script src="vendor/datatables/dataTables.select.min.js"></script>        
        <script>
            //PARA AJUSTAR EL ANCHO DE LAS COLUMNAS SEGUN EL TEXTO, SE COLOCA UN ESTILO CSS
            $(document).ready(function () {
                var table = $('#dataTable').DataTable({
                    "select": {
                        style: 'single'
                    },
                    language: {
                        "url": "vendor/datatables/Spanish.json",
                        "select": {
                            rows: {
                                _: "Ha seleccionado %d filas",
                                0: "Haga clic en una fila para seleccionarla.",
                                1: "1 fila seleccionada"
                            }
                        }
                    },                    
                });
                
                $('#dataTable').on( 'dblclick', 'tr', function () {
                    var id = table.row( this ).id();                    
                } );
            });
        </script>

    </body>

</html>
