<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/2/20
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>简历(Resume)</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../favicon.ico">


    <!-- Bootstrap core CSS -->
    <link href="../../../bt/css/bootstrap.min.css" rel="stylesheet">
    <link href="../../../bt/css/bootstrap-theme.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../../bt/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="../../../bt/css/starter-template.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>

        body {
            font-family: 'microsoft yahei', Arial, sans-serif;
        }

        /* 定义辅助CSS来美化简历头部 */
        .cvheader {
            border-bottom: 10px solid #DFDFDF;
            padding-top: 30px;
            padding-bottom: 20px;
        }

        .cvheader h1 {
            margin: 0;
        }

        .address {
            background: #efb73e;
            color: #fff;
            padding: 10px 0;
        }

        /*美化简历主体*/
        .cvbody {
            padding-top: 50px;
        }

        .cbox {
            margin-bottom: 30px;
            color: #FFFFFF;
            padding: 50px;
        }

        /*定义盒子颜色*/
        .green {
            background: green;
        }

        .orange {
            background: orange;
        }

        .red {
            background: red;
        }

        .black {
            background: black;
        }

        .bbox {
            border: 1px solid #DFDFDF;
            border-radius: 5px;
            margin-bottom: 30px;
            padding: 50px;
        }

        .footer {
            margin: 30px 0 30px;
            padding: 50px;
            background: #CCC;
            color: #FFF;
        }
    </style>
</head>
<body>
<!--1.导航栏-->
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <!--导航栏出现小屏幕时遮挡-->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Mazic's blog</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="#">Blog</a></li>
                <li><a href="#tool">Tools</a></li>
                <li><a href="#resume">Resume</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>
<!--头部-->
<div class="container">
    <div class="row cvheader">
        <div class="col-lg-7 col-md-7 col-xs-12">
            <!--  添加颜色//-->
            <h1 class="text-primary">Terry Lee</h1>
            <!--  添加图标 //-->
            <p><span class="glyphicon glyphicon-paperclip"></span> Java工程师 && 大数据挖掘</p>
        </div>

        <div class="col-lg-3 col-md-3 col-xs-12">
            <div class="row">

                <div class="col-lg-4 col-md-4 col-xs-4">
                    <p class="address text-center">联系</p>
                </div>

                <div class="col-lg-8 col-md-8 col-xs-8">
                    <p><span class="glyphicon glyphicon-envelope"></span> 1*******78@qq.com</p>
                    <p><span class="glyphicon glyphicon-earphone"></span> 139####9073</p>
                    <p><span class="glyphicon glyphicon-road"></span> 天堂大家朝阳路</p>
                </div>

            </div>
        </div>

        <div class="col-lg-2 col-md-2 col-xs-12">
            <p>
                <!-- 这里定义图片为响应式，并且添加圆角效果，以便保证图片在不同设备上都可以完美显示 //-->
                <img class="img-responsive img-rounded"
                     src="http://www.gbtags.com/gb/networks/avatars/13d6393f-a44c-4180-8cb6-7bf0e4776283.png" alt="">
            </p>
        </div>
    </div>
</div>
<!--2.简历主体-->
<div class="container">
    <div class="row cvbody">
        <!--将简历分为三部分,其中中间为空白区域-->

        <!--简历左部分-->
        <div class="col-lg-6 col-md-6 col-xs-12">
            <div class="row">
                <div class="cbox black">
                    <h4>个人介绍</h4>
                    <p>
                        热爱生活,喜欢技术.Lorem ipsum dolor sit amet, consectetur adipisicing elit.<br>
                        Necessitatibus asperiores eum consequatur hic rem earum <br>
                        repudiandae dicta! Est officiis similique fugiat quod quibusdam<br>
                        rerum ipsum eos soluta tempore cupiditate! Accusantium?<br>
                        ${resume.selfHobby}
                    </p>
                </div>
                <div class="cbox black">
                    <h4>个人技能</h4>
                    <p>
                        HTML/CSS/Jacascript
                    <div class="progress">
                        <div class="progress-bar progress-bar-success" style="width: 60%"></div>
                    </div>
                    Java/J2EE
                    <div class="progress">
                        <div class="progress-bar progress-bar-success" style="width: 60%"></div>
                    </div>
                    数据库
                    <div class="progress">
                        <div class="progress-bar progress-bar-success" style="width: 60%"></div>
                    </div>
                    </p>
                </div>
                <div class="cbox black">
                    <h4>语言水平</h4>
                    <p>
                        Lorem ipsum dolor sit amet, consectetur adipisicing elit. Illum nostrum pariatur facere laborum
                        sint possimus assumenda nemo qui et quidem enim quibusdam a consequatur eius eveniet dolorum
                        exercitationem asperiores quo.
                    </p>
                </div>
            </div>
        </div>

        <!--中间空白-->
        <div class="col-lg-1 col-md-1 col-xs-12">
        </div>
        <!--右部分-->
        <div class="col-lg-5 col-md-5 col-xs-12">
            <div class="row">
                <div class="bbox">
                    <h4>教育背景</h4>
                    <p>
                        2015.09 — 至 今&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;浙江工业大学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;控制工程（硕士）
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;综合排名前1%（专业共51人）.<br>
                        2011.09 — 2015.06&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;河北科技大学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;自动化（本科）
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;综合排名前8%（专业共100人）.<br>

                    </p>
                </div>
                <div class="bbox">
                    <h4>工作经验</h4>
                    <p>
                        2016.06 — 2017.3 制造设备状态监测管理系统 Java研发工程师<br>
                        名称：制造设备状态监测管理系统<br>
                        简介：该系统用于制造装备的监控和制造信息管理，系统分为实时监控、生产计划、设备管理、实验预约、个人中心、制造看板等6个模块。<br>
                        框架：Struts2，Spring，Hibernate，Socket，WebSocket等。<br>
                        职责:1.根据系统需求，完成各模块后台功能开发（如订单、设备信息管理、现场制造信息看板等功能）<br>
                        2.采用TCP协议，通过Socket实现MFC客户端与Web服务器之间监控数据传输<br>
                        3.使用WebSocket实现服务与浏览器之间数据交换<br>
                        4.使用git进行项目管理<br>

                    </p>
                </div>
                <div class="bbox">
                    <h4>个人爱好</h4>
                    <p>
                        各种手工品
                    </p>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="footer text-center">关注-微博</div>
    </div>
</div>
</body>
</html>
