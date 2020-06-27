<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
      integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

<html lang="en">
<body>
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