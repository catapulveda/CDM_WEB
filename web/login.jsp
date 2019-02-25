<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <title>Iniciar Sesión</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">        
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" integrity="sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP" crossorigin="anonymous">
        <style>
            /* Coded with love by Mutiullah Samim */
            body,
            html {
                margin: 0;
                padding: 0;
                height: 100%;
            }
            .user_card {
                height: 400px;
                width: 350px;
                margin-top: auto;
                margin-bottom: auto;

                position: relative;
                display: flex;
                justify-content: center;
                flex-direction: column;
                padding: 10px;
                box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
                -webkit-box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
                -moz-box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
                border-radius: 5px;

            }
            .container_logo {
                position: absolute;
                height: 180px;
                width: 180px;
                top: -75px;
                border-radius: 50%;
                /*background: #60a3bc;*/
                padding: 10px;
                text-align: center;
            }
            .img_logo {
                height: 158px;
                width: 180px;
                /*border-radius: 50%;*/
                border: 2px solid white;
            }
            .form_container {
                margin-top: 100px;
            }
            .login_btn {
                width: 100%;
                background: #c0392b !important;
                color: white !important;
            }
            .login_btn:focus {
                box-shadow: none !important;
                outline: 0px !important;
            }
            .login_container {
                padding: 0 2rem;
            }
            .input-group-text {
                background: #c0392b !important;
                color: white !important;
                border: 0 !important;
                border-radius: 0.25rem 0 0 0.25rem !important;
            }
            .input_user,
            .input_pass:focus {
                box-shadow: none !important;
                outline: 0px !important;
            }
            .custom-checkbox .custom-control-input:checked~.custom-control-label::before {
                background-color: #c0392b !important;
            }
        </style>
    </head>
    <!--Coded with love by Mutiullah Samim-->
    <body>
        <div class="container h-100">
            <div class="d-flex justify-content-center h-100">
                <div class="user_card">
                    <div class="d-flex justify-content-center">
                        <div class="container_logo">
                            <img src="img/LOGO CDM.png" class="img_logo" alt="Logo">
                        </div>
                    </div>
                    <div class="d-flex justify-content-center form_container">
                        <form action="login" method="post">
                            <div class="input-group mb-3">
                                <div class="input-group-append">
                                    <span class="input-group-text"><i class="fas fa-user"></i></span>
                                </div>
                                <input type="text" id="username" name="username" class="form-control input_user" value="" placeholder="Usuario">
                            </div>
                            <div class="input-group mb-2">
                                <div class="input-group-append">
                                    <span class="input-group-text"><i class="fas fa-key"></i></span>
                                </div>
                                <input type="password" id="password" name="password" class="form-control input_pass" value="" placeholder="Contraseña">
                            </div>
                            <div class="form-group">
                                <div class="custom-control custom-checkbox">
                                    <input type="checkbox" class="custom-control-input" id="customControlInline">
                                    <label class="custom-control-label" for="customControlInline">Recordarme</label>
                                </div>
                            </div>
                            <div class="d-flex justify-content-center mt-3 login_container">
                                <button type="submit" id="login" name="iniciar" class="btn login_btn">Iniciar Sesión</button>
                            </div>
                        </form>
                    </div>                   
                    <div class="mt-2 mx-auto">
                        ${mensaje}
                    </div>                    
                    <div class="mt-4">
                        <div class="d-flex justify-content-center links">
                            No tienes cuenta? <a href="#" class="ml-2">Regístrese!</a>
                        </div>
                        <div class="d-flex justify-content-center links">
                            <a href="#">Olvidó su contraseña?</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>      
    </body>
</html>
