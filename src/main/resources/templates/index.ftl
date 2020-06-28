<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
      integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

<html lang="ja">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta charset="utf-8" />
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="/admin">Record <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/admin/history">History <span class="sr-only">(current)</span></a>
            </li>
        </ul>
<!--
        <form class="form-inline my-2 my-lg-0">
            <a class="nav-link" href="/admin/addUser">Add User</a>
        </form>
        -->
    </div>
</nav>
<div class="container">
    <table class="table">
        <thead>
        <tr>
       <!--     <th>#</th>
            <th>部署</th>
            <th>氏名</th>
            <th>社員番号</th>
            <th>出勤体温</th>
            <th>退勤体温</th>
            <th>出勤時間</th>
            <th>退勤時間</th>
            -->
            <th>#</th>
            <th>dev</th>
            <th>name</th>
            <th>id</th>
            <th>temp 1</th>
            <th>temp 2</th>
            <th>time 1</th>
            <th>time 2</th>
        </tr>
        </thead>
        <tbody>
        <#list events as event>
            <tr>
                <th>${event.no}</th>
                <td></td>
                <td>${event.user.getName()}</td>
                <td>${event.user.getId()}</td>
                <td>${event.temperature}</td>
                <td></td>
                <td>${event.created}</td>
                <td></td>
            </tr>
        </#list>
        </tbody>
    </table>
</div>
</body>
</html>
