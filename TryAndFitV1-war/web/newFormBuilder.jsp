<%--
    Document   : formBuilder
    Created on : 24 sept. 2016, 09:38:04
    Author     : amir.zidi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html lang="en">

    <head>

        <!-- start: Meta -->
        <meta charset="utf-8">
        <title>Try And Fit</title>
        <meta name="description" content="Try And Fit Dashboard">

        <!-- end: Meta -->

        <!-- start: Mobile Specific -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- end: Mobile Specific -->

        <!-- start: CSS -->
        <link id="bootstrap-style" href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/bootstrap-responsive.min.css" rel="stylesheet">
        <link id="base-style" href="css/style.css" rel="stylesheet">
        <link id="base-style-responsive" href="css/style-responsive.css" rel="stylesheet">
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" type="text/css" media="screen" href="http://formbuilder.online/assets/css/form-builder.min.css">
        <link id="base-style" href="css/perso/jquery.steps.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" media="" href="css/perso/form-builder.css">
        <link rel="stylesheet" type="text/css" media="" href="css/perso/form-render.min.css">
        <!--link rel="stylesheet" type="text/css" media="" href="css/perso/likeImage.css"-->
        <!-- end: CSS -->


        <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
                <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
                <link id="ie-style" href="css/ie.css" rel="stylesheet">
        <![endif]-->

        <!--[if IE 9]>
                <link id="ie9style" href="css/ie9.css" rel="stylesheet">
        <![endif]-->

        <!-- start: Favicon -->
        <link rel="shortcut icon" href="img/favicon.ico">
        <!-- end: Favicon -->
        <style>
            body {
                background: lightgrey;
            }

            textarea.form-control {
                height: 120px;
            }
            article, aside, figure, footer, header, hgroup, 
            menu, nav, section { display: block; }
            .thumb {
                height: 200px;
                border: 1px solid #000;
                margin: 10px 5px 0 0;
            }

        </style>
    </head>

    <body>
        <!-- start: Header -->
        <div class="navbar">
            <div class="navbar-inner">
                <div class="container-fluid">
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </a>
                    <a class="brand" href="index.html"><span>Try And Fit</span></a>

                    <!-- start: Header Menu -->
                    <div class="nav-no-collapse header-nav">
                        <ul class="nav pull-right">
                            <li class="dropdown hidden-phone">
                                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                                    <i class="halflings-icon white warning-sign"></i>
                                </a>
                                <ul class="dropdown-menu notifications">
                                    <li class="dropdown-menu-title">
                                        <span>You have 11 notifications</span>
                                        <a href="#refresh"><i class="icon-repeat"></i></a>
                                    </li>	
                                    <li>
                                        <a href="#">
                                            <span class="icon blue"><i class="icon-user"></i></span>
                                            <span class="message">New user registration</span>
                                            <span class="time">1 min</span> 
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="icon green"><i class="icon-comment-alt"></i></span>
                                            <span class="message">New comment</span>
                                            <span class="time">7 min</span> 
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="icon green"><i class="icon-comment-alt"></i></span>
                                            <span class="message">New comment</span>
                                            <span class="time">8 min</span> 
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="icon green"><i class="icon-comment-alt"></i></span>
                                            <span class="message">New comment</span>
                                            <span class="time">16 min</span> 
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="icon blue"><i class="icon-user"></i></span>
                                            <span class="message">New user registration</span>
                                            <span class="time">36 min</span> 
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="icon yellow"><i class="icon-shopping-cart"></i></span>
                                            <span class="message">2 items sold</span>
                                            <span class="time">1 hour</span> 
                                        </a>
                                    </li>
                                    <li class="warning">
                                        <a href="#">
                                            <span class="icon red"><i class="icon-user"></i></span>
                                            <span class="message">User deleted account</span>
                                            <span class="time">2 hour</span> 
                                        </a>
                                    </li>
                                    <li class="warning">
                                        <a href="#">
                                            <span class="icon red"><i class="icon-shopping-cart"></i></span>
                                            <span class="message">New comment</span>
                                            <span class="time">6 hour</span> 
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="icon green"><i class="icon-comment-alt"></i></span>
                                            <span class="message">New comment</span>
                                            <span class="time">yesterday</span> 
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="icon blue"><i class="icon-user"></i></span>
                                            <span class="message">New user registration</span>
                                            <span class="time">yesterday</span> 
                                        </a>
                                    </li>
                                    <li class="dropdown-menu-sub-footer">
                                        <a>View all notifications</a>
                                    </li>	
                                </ul>
                            </li>
                            <!-- start: Notifications Dropdown -->
                            <li class="dropdown hidden-phone">
                                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                                    <i class="halflings-icon white tasks"></i>
                                </a>
                                <ul class="dropdown-menu tasks">
                                    <li class="dropdown-menu-title">
                                        <span>test1</span>
                                        <a href="#refresh"><i class="icon-repeat"></i></a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="header">
                                                <span class="title">test2</span>
                                                <span class="percent"></span>
                                            </span>
                                            <div class="taskProgress progressSlim red">80</div> 
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="header">
                                                <span class="title">test4</span>
                                                <span class="percent"></span>
                                            </span>
                                            <div class="taskProgress progressSlim green">47</div> 
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="header">
                                                <span class="title">test5</span>
                                                <span class="percent"></span>
                                            </span>
                                            <div class="taskProgress progressSlim yellow">32</div> 
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="header">
                                                <span class="title">test3</span>
                                                <span class="percent"></span>
                                            </span>
                                            <div class="taskProgress progressSlim greenLight">63</div> 
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="header">
                                                <span class="title">test6</span>
                                                <span class="percent"></span>
                                            </span>
                                            <div class="taskProgress progressSlim orange">80</div> 
                                        </a>
                                    </li>
                                    <li>
                                        <a class="dropdown-menu-sub-footer">View all tasks</a>
                                    </li>	
                                </ul>
                            </li>
                            <!-- end: Notifications Dropdown -->
                            <!-- start: Message Dropdown -->
                            <li class="dropdown hidden-phone">
                                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                                    <i class="halflings-icon white envelope"></i>
                                </a>
                                <ul class="dropdown-menu messages">
                                    <li class="dropdown-menu-title">
                                        <span>You have 9 messages</span>
                                        <a href="#refresh"><i class="icon-repeat"></i></a>
                                    </li>	
                                    <li>
                                        <a href="#">
                                            <span class="avatar"><img src="img/avatar.jpg" alt="Avatar"></span>
                                            <span class="header">
                                                <span class="from">
                                                    Admin
                                                </span>
                                                <span class="time">
                                                    6 min
                                                </span>
                                            </span>
                                            <span class="message">

                                            </span>  
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="avatar"><img src="img/avatar.jpg" alt="Avatar"></span>
                                            <span class="header">
                                                <span class="from">
                                                    Admin
                                                </span>
                                                <span class="time">
                                                    56 min
                                                </span>
                                            </span>
                                            <span class="message">
                                                test1
                                            </span>  
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="avatar"><img src="img/avatar.jpg" alt="Avatar"></span>
                                            <span class="header">
                                                <span class="from">
                                                    Admin
                                                </span>
                                                <span class="time">
                                                    3 hours
                                                </span>
                                            </span>
                                            <span class="message">
                                                test2
                                            </span>  
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="avatar"><img src="img/avatar.jpg" alt="Avatar"></span>
                                            <span class="header">
                                                <span class="from">
                                                    Admin
                                                </span>
                                                <span class="time">
                                                    yesterday
                                                </span>
                                            </span>
                                            <span class="message">
                                                test3
                                            </span>  
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="avatar"><img src="img/avatar.jpg" alt="Avatar"></span>
                                            <span class="header">
                                                <span class="from">
                                                    Admin
                                                </span>
                                                <span class="time">
                                                    Jul 25, 2012
                                                </span>
                                            </span>
                                            <span class="message">
                                                test4
                                            </span>  
                                        </a>
                                    </li>
                                    <li>
                                        <a class="dropdown-menu-sub-footer">View all messages</a>
                                    </li>	
                                </ul>
                            </li>
                            <!-- end: Message Dropdown -->
                            <li>
                                <a class="btn" href="#">
                                    <i class="halflings-icon white wrench"></i>
                                </a>
                            </li>
                            <!-- start: User Dropdown -->
                            <li class="dropdown">
                                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                                    <i class="halflings-icon white user"></i> Admin
                                    <span class="caret"></span>
                                </a>
                                <ul class="dropdown-menu">
                                    <li class="dropdown-menu-title">
                                        <span>Account Settings</span>
                                    </li>
                                    <li><a href="#"><i class="halflings-icon user"></i> Profile</a></li>
                                    <li><a href="login.html"><i class="halflings-icon off"></i> Logout</a></li>
                                </ul>
                            </li>
                            <!-- end: User Dropdown -->
                        </ul>
                    </div>
                    <!-- end: Header Menu -->

                </div>
            </div>
        </div>
        <div class="container-fluid-full"> 
            <div class="row-fluid">

                <!-- start: Main Menu -->
                <div id="sidebar-left" class="span2">
                    <div class="nav-collapse sidebar-nav">
                        <ul class="nav nav-tabs nav-stacked main-menu">
                            <li><a href="index.html"><i class="icon-bar-chart"></i><span class="hidden-tablet"> Dashboard</span></a></li>	
                            <li><a href="newFormBuilder.jsp"><i class="icon-align-justify"></i><span class="hidden-tablet"> Form Builder</span></a></li>
                            <li><a href="formList.jsp"><i class="icon-align-justify"></i><span class="hidden-tablet"> Form List</span></a></li>
                            <li><a href="charts.jsp"><i class="icon-align-justify"></i><span class="hidden-tablet"> Real-Time Charts</span></a></li>
                            <li><a href="formStat.jsp"><i class="icon-align-justify"></i><span class="hidden-tablet"> from charts</span></a></li>

                        </ul>
                    </div>
                </div>
                <!-- end: Main Menu -->
                <div id="content" class="span10">
                    <div class="container-fluid">

                        <h1 class="page-header">Création du formulaire</h1>
                        <div class="row">
                            <div id="example-basic">
                                <h3>Type</h3>
                                <section>
                                    <table align="center">
                                        <tr>   
                                            <td>
                                                <div>
                                                    <input type="image" id="like" src="img/like.jpg" align="middle"/>
                                                </div>
                                            </td>
                                            <td>
                                                <div>
                                                    <input type="image" id="rate" src="img/rating.jpg" align="middle"/>
                                                </div>
                                            </td>
                                        </tr>
                                    </table>
                                </section>
                                <h3>Contenu</h3>
                                <section>



                                    <div id="images" class="box black span11">
                                        <div class="box-header">
                                            <h2><i class="halflings-icon white list"></i><span class="break"></span>Création</h2>
                                            <div class="box-icon">
                                                <a href="#" class="btn-minimize"><i class="halflings-icon white chevron-up"></i></a>
                                                <a href="#" class="btn-close"><i class="halflings-icon white remove"></i></a>
                                            </div>
                                        </div>
                                        <div class="box-content">
                                            <label style="color:black;" >Nom du formulaire</label>

                                            <input id="formName" class="">

                                            <hr>
                                            <table>
                                                <tr>
                                                    <td>
                                                        <input type="file" name="files[]" id="filer_input" multiple="multiple">
                                                    </td>
                                                    <td>
                                                        <input type="button" id ="Submit-Button" value="Uploader" class="">
                                                    </td>
                                                    <td>
                                                        <input type="button" id ="Delete-Button" value="Supprimer" class="">
                                                    </td>
                                                </tr>
                                            </table> 
                                            <output id="list"></output>



                                        </div>
                                    </div>

                                </section>
                                <h3>Ajouter</h3>
                                <section>
                                    <div id="fb-editor"></div>

                                </section>
                                <h3>visualiser</h3>
                                <section>
                                    <a href="#" class="btn btn-primary btn-lg btn-block" id="preview"><span class="glyphicon glyphicon-eye-open"></span>Visualiser</a>
                                    <span class="likebtn-wrapper" data-identifier="item_1"></span>

                                </section>

                            </div>
                        </div>

                        <div id="idForm"> <form id="fb-render"></form></div>
                        <input id="temp" type="hidden" name="" value="">

                        <div id="build-wrap"></div>
                        <!-- /.col-lg-12 -->
                    </div>

                </div>


            </div>
        </div>
    </div>




    <input id ="idForm" type="hidden" name="" value="">
    <div class="modal hide fade" id="myModal">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">×</button>
            <h3>Settings</h3>
        </div>
        <div class="modal-body">
            <p>Here settings can be configured...</p>
        </div>
        <div class="modal-footer">
            <a href="#" class="btn" data-dismiss="modal">Close</a>
            <a href="#" class="btn btn-primary">Save changes</a>
        </div>
    </div>



    <footer>

        <p>
            Try and Fit
        </p>

    </footer>


    <script src="js/jquery-1.9.1.min.js"></script>
    <script src="js/jquery-migrate-1.0.0.min.js"></script>

    <script src="js/jquery-ui-1.10.0.custom.min.js"></script>

    <script src="js/jquery.ui.touch-punch.js"></script>

    <script src="js/modernizr.js"></script>

    <script src="js/bootstrap.min.js"></script>

    <script src="js/jquery.cookie.js"></script>

    <script src='js/fullcalendar.min.js'></script>

    <script src='js/jquery.dataTables.min.js'></script>

    <script src="js/excanvas.js"></script>

    <script src="js/jquery.chosen.min.js"></script>

    <script src="js/jquery.uniform.min.js"></script>

    <script src="js/jquery.cleditor.min.js"></script>

    <script src="js/jquery.noty.js"></script>

    <script src="js/jquery.elfinder.min.js"></script>

    <script src="js/jquery.raty.min.js"></script>

    <script src="js/jquery.iphone.toggle.js"></script>

    <script src="js/jquery.uploadify-3.1.min.js"></script>

    <script src="js/jquery.gritter.min.js"></script>

    <script src="js/jquery.imagesloaded.js"></script>

    <script src="js/jquery.masonry.min.js"></script>

    <script src="js/jquery.knob.modified.js"></script>

    <script src="js/jquery.sparkline.min.js"></script>

    <script src="js/counter.js"></script>

    <script src="js/retina.js"></script>

    <script src="js/custom.js"></script>



    <script src="js/perso/jquery.steps.js"></script>
    <script src="js/perso/pnotify.custom.min.js"></script>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootbox.js/4.4.0/bootbox.min.js"></script>
    <script src="http://formbuilder.online/assets/js/form-builder.min.js"></script>
    <script src="https://formbuilder.online/assets/js/form-render.min.js"></script>
    <script src="//rawgithub.com/ashleydw/lightbox/master/dist/ekko-lightbox.js"></script>



    <script>
        $("#example-basic").steps({
            headerTag: "h3",
            bodyTag: "section",
            transitionEffect: "slideLeft",
            autoFocus: true
        });


        $(document).ready(function () {
            $("#like").click(function () {
                $("#idForm").val(1);
                bootbox.alert('vous avez sélectionné un formulaire "Like/unLike" !');


            });
        });

        $(document).ready(function () {
            $("#rate").click(function () {
                $("#idForm").val(2);
                bootbox.alert('vous avez sélectionné un formulaire "Rating" !');


            });
        });


        $("#preview").click(function () {
            jQuery(document).ready(function ($) {


                var formRenderOpts = {
                    formData: formBuilder.formData
                };
                $(fbRender).formRender(formRenderOpts);
            });
            var content = document.getElementById('idForm');
            formName = $('#formName').val();
            $("#idForm").hide();
            var like = '<div class="container"><a href="#" class="btn btn-info btn-lg">\n\
                <span class = "glyphicon glyphicon-thumbs-up"></span>Like\n\
                </a>\n\
                <a href = "#" class = "btn btn-info btn-lg">\n\
                <span class ="glyphicon glyphicon-thumbs-down"></span>unLike\n\
                </a></div>';

            bootbox.alert({
                message: '<div><h class="page-header">' + formName + '<h><hr>' + $("#list").html() + '<br>' + like + '<br>' + content.innerHTML + '</div>',
                backdrop: true
            });
        });
        $("input[type='file']").on("change", function (e) {
            files = e.target.files;
            $("#Submit-Button").prop({"disabled": false});
        });
        $("#Submit-Button").on("click", function () {

            var data = new FormData();
            $.each(files, function (key, value) {
                data.append(key, value);
            });

            $.ajax({
                url: "DoUploadImage",
                type: "POST",
                data: data,
                cache: false,
                processData: false,
                contentType: false,
                success: function (data, textStatus, jqXHR) {
                    bootbox.alert("Image uploaded successfully");
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    bootbox.alert("Error on image upload");
                }
            });
        });

        var x;
        function handleFileSelect(evt) {
            var files = evt.target.files; // FileList object

            // Loop through the FileList and render image files as thumbnails.
            var like = '<div class="panel-footer">\n\
                <h4><a href="#" title="Nature Portfolio"></a></h4>\n\
                    <span class="pull-right">\n\
                        <i id="like1" class="glyphicon glyphicon-thumbs-up"></i> <div id="like1-bs3"></div>\n\
                        <i id="dislike1" class="glyphicon glyphicon-thumbs-down"></i> <div id="dislike1-bs3"></div>\n\
                    </span>\n\
                </div></div>';
            for (var i = 0, f; f = files[i]; i++) {

                // Only process image files.
                if (!f.type.match('image.*')) {
                    continue;
                }

                var reader = new FileReader();

                // Closure to capture the file information.
                reader.onload = (function (theFile) {
                    return function (e) {
                        // Render thumbnail.
                        var ul = document.createElement('ul');
                        ul.setAttribute("class", "bxslider");
                        var span = document.createElement('span');
                        span.innerHTML = ['<span id="im"><img class="thumb" src="', e.target.result,
                            '" title="', escape(theFile.name), '"/><span>' + like].join('');
                        document.getElementById('list').insertBefore(span, null);

                        /*ul.innerHTML = ['<li><img src="', e.target.result,
                         '" title="', escape(theFile.name), '"/></li>'].join('');
                         
                         
                         ul.innerHTML = ['<img class="thumb" src="', e.target.result,
                         '" title="', escape(theFile.name), '"/>'].join('');*/
                        //document.getElementById('#list2').append(div);
                        //document.getElementById('list2').insertBefore(ul, null);


                    };
                })(f);

                // Read in the image file as a data URL.
                reader.readAsDataURL(f);
            }


        }

        document.getElementById('filer_input').addEventListener('change', handleFileSelect, false);


        $(document).ready(function () {
            $("#Delete-Button").click(function () {

                $("#im").remove();


            });
        });





        // formBuilder


        var fbTemplate = document.getElementById('fb-editor');
        var formBuilder;
        var fbRender = document.getElementById('fb-render');
        var formName;
        $(document).ready(function ($) {

            var options = {
                editOnAdd: false,
                disableFields: [
                    'autocomplete',
                    'file',
                    'date',
                    'header',
                    'checkbox',
                ]
            };
            formBuilder = $(fbTemplate).formBuilder(options).data('formBuilder');
            $(".form-builder-save").click(function (e) {
                e.preventDefault()
                var text = $('#preview');
                text.val(formBuilder.formData);
                doGetJson(formBuilder.formData);
            });
        });
        function doGetJson(data) {

            $.ajax({
                type: 'GET',
                url: 'DoSaveJsonData',
                data: {
                    data: data,
                    formName: $("#formName").val()
                },
                success: function () {


                    bootbox.alert({
                        message: "Form saved successfully ! ",
                        className: 'bb-alternate-modal'
                    });
                },
                error: function () {

                    new PNotify({
                        title: 'Erreur!',
                        text: 'Le serveur ne répond pasd.',
                        type: 'error'
                    });

                }
            });
        }

        $("#preview").click(function () {
            jQuery(document).ready(function ($) {


                var formRenderOpts = {
                    formData: formBuilder.formData
                };
                $(fbRender).formRender(formRenderOpts);
            });
            var content = document.getElementById('idForm');
            formName = $('#formName').val();
            $("#idForm").hide();

            bootbox.alert({
                message: '<h class="page-header">' + formName + '<h><hr><div class="box-content"><div class="masonry-gallery">' +
                        $("#list").html() + '</div></div>' + $("#rateYo").html() + '<div>'
                        + content.innerHTML + '</div>',
                backdrop: true
            });
        });


        //like unlike
        $(document).ready(function () {
            $('i.glyphicon-thumbs-up, i.glyphicon-thumbs-down').click(function () {
                var $this = $(this),
                        c = $this.data('count');
                if (!c)
                    c = 0;
                c++;
                $this.data('count', c);
                $('#' + this.id + '-bs3').html(c);
            });
            $(document).delegate('*[data-toggle="lightbox"]', 'click', function (event) {
                event.preventDefault();
                $(this).ekkoLightbox();
            });
        });


    </script>

</body>
</html>



