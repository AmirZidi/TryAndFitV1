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
                        <div class="row">
                            <div class="col-lg-12">
                                <div id="high" style="height: 400px; min-width: 310px"></div>
                                <div id="cont" style="height: 250px; min-width: 310px"></div>
                            </div>
                            <!-- /.col-lg-12 -->
                        </div>
                        <div id="fb-editor"></div>



                    </div>


                </div>
            </div>
        </div>

     

        
        
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

        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootbox.js/4.4.0/bootbox.min.js"></script>
        <script src="https://code.highcharts.com/stock/highstock.js"></script>

        <script src="js/perso/pnotify.custom.min.js"></script>



        <script>
            $(document).ready(function ($) {

                Highcharts.setOptions({
                    global: {
                        useUTC: false
                    }
                });

                // Create the chart
                $('#high').highcharts('StockChart', {
                    chart: {
                        events: {
                            load: function () {

                                // set up the updating of the chart each second
                                var series = this.series[0];
                                setInterval(function () {
                                    var x = (new Date()).getTime(), // current time
                                            y = Math.round(Math.random() * 100);
                                    series.addPoint([x, y], true, true);
                                }, 1000);
                            }
                        }
                    },
                    rangeSelector: {
                        buttons: [{
                                count: 1,
                                type: 'minute',
                                text: '1M'
                            }, {
                                count: 5,
                                type: 'minute',
                                text: '5M'
                            }, {
                                type: 'all',
                                text: 'All'
                            }],
                        inputEnabled: false,
                        selected: 0
                    },
                    title: {
                        text: 'Visites Clients'
                    },
                    exporting: {
                        enabled: false
                    },
                    series: [{
                            name: 'Random data',
                            data: (function () {
                                // generate an array of random data
                                var data = [],
                                        time = (new Date()).getTime(),
                                        i;

                                for (i = -999; i <= 0; i += 1) {
                                    data.push([
                                        time + i * 1000,
                                        Math.round(Math.random() * 100)
                                    ]);
                                }
                                return data;
                            }())
                        }]
                });

            });
            $(function () {
                $(document).ready(function () {
                    Highcharts.setOptions({
                        global: {
                            useUTC: false
                        }
                    });

                    $('#cont').highcharts({
                        chart: {
                            type: 'spline',
                            animation: Highcharts.svg, // don't animate in old IE
                            marginRight: 10,
                            events: {
                                load: function () {

                                    // set up the updating of the chart each second
                                    var series = this.series[0];
                                    setInterval(function () {
                                        var x = (new Date()).getTime(), // current time
                                                y = Math.random();
                                        series.addPoint([x, y], true, true);
                                    }, 1000);
                                }
                            }
                        },
                        title: {
                            text: 'Retours Clients'
                        },
                        xAxis: {
                            type: 'datetime',
                            tickPixelInterval: 150
                        },
                        yAxis: {
                            title: {
                                text: 'Value'
                            },
                            plotLines: [{
                                    value: 0,
                                    width: 1,
                                    color: '#808080'
                                }]
                        },
                        tooltip: {
                            formatter: function () {
                                return '<b>' + this.series.name + '</b><br/>' +
                                        Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) + '<br/>' +
                                        Highcharts.numberFormat(this.y, 2);
                            }
                        },
                        legend: {
                            enabled: false
                        },
                        exporting: {
                            enabled: false
                        },
                        series: [{
                                name: 'Random data',
                                data: (function () {
                                    // generate an array of random data
                                    var data = [],
                                            time = (new Date()).getTime(),
                                            i;

                                    for (i = -19; i <= 0; i += 1) {
                                        data.push({
                                            x: time + i * 1000,
                                            y: Math.random()
                                        });
                                    }
                                    return data;
                                }())
                            }]
                    });
                });
            });


        </script>

    </body>
</html>



