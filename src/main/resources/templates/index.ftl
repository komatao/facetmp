<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
      integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

<html lang="en">
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
                <a class="nav-link" href="#">Index <span class="sr-only">(current)</span></a>
            </li>
        </ul>

        <form class="form-inline my-2 my-lg-0">
            <a class="nav-link" href="/admin/addUser">Add User</a>
        </form>
    </div>
</nav>
<div class="container">
    <table class="table">
        <thead>
        <tr>
            <th>#</th>
            <th>name</th>
            <th>id</th>
            <th>in out</th>
            <th>temperature</th>
            <th>date</th>
        </tr>
        </thead>
        <tbody>
        <#list events as event>
            <tr>
                <th>${event.no}</th>
                <td>${event.user.getName()}</td>
                <td>${event.user.getId()}</td>
                <td>${event.inAndOut}</td>
                <td>${event.temperature}</td>
                <td>${event.created}</td>
            </tr>
        </#list>
        </tbody>
    </table>
</div>
</body>
</html>