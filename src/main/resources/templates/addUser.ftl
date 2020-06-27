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
    <form role="form" action="/admin/addUser" method="post">
        <div class="form-group row">
            <label for="inputName" class="col-sm-2 col-form-label">Name</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputName" name="inputName" placeholder="Name">
            </div>
        </div>
        <div class="form-group row">
            <label for="inputId" class="col-sm-2 col-form-label">Id</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputId" name="inputId" placeholder="Id">
            </div>
        </div>
        <button type="submit">submit</button>
    </form>
</div>
</body>
</html>
