<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <%@include file="common/head.jsp" %>
    <link rel="stylesheet" href="../../../static/md/css/markdown.css"/>
    <link rel="stylesheet" href="../../../static/md/css/editormd.min.css"/>
</head>
<body>
<!--1.导航栏-->
<%--<%@include file="common/nav.jsp" %>--%>
<div id="layout">
    <form action="/article/save" method="post">
        <div class="title option">
            <label>Title</label>
            <input type="text" class="form-control" id="title" name="title">
        </div>
        <div class="row categoryTag">
            <div class="col-md-6">
                <div><label>Category</label></div>
                <select class="" class="form-control" id="category" name="category">
                    <option value="Java">Java</option>
                    <option value="Web">Web</option>
                    <option value="Linux">Linux</option>
                    <option value="分布式系统">分布式系统</option>
                    <option value="数据库">数据库</option>
                    <option value="算法">算法</option>
                    <option value="其它">其它</option>
                </select>
            </div>
            <div class="col-md-6">
                <label>Tag</label>
                <input type="text" class="form-control" id="tag" name="tag">
            </div>
        </div>
        <div class="describe option">
            <label>Describe</label>
                <input type="text" class="form-control" id="describe" name="describe">
        </div>
        <div class="option">
            <label>Content</label>
        </div>
        <div class="row">
            <div id="test-editormd">
                <textarea id="content" name="content" style="display:none;"></textarea>
            </div>
        </div>
        <div class="form-group articleSubmit option">
            <button type="submit" class="btn btn-default">Submit</button>
        </div>
    </form>
</div>

<script src="../../../static/jq/jquery-3.0.0.min.js"></script>
<script src="../../../static/md/js/editormd.min.js"></script>
<script type="text/javascript">
    var testEditor;
    $(function () {
        testEditor = editormd("test-editormd", {
            width: "90%",
            height: 640,
            syncScrolling: "single",
            path: "../static/md/lib/"
        });
    });
</script>
</div>
</body>
</html>
