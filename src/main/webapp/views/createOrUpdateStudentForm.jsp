<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student form</title>
    <!-- Thêm thẻ link tới Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <form action="/student/createOrUpdateStudent" method="post" modelAttribute="student">
        <input type="hidden" name="id" value="${student.id}" />
        <div class="form-group">
            <label for="name">Name:</label>
            <input type="text" name="name" value="${student.name}" class="form-control mb-2" id="name" placeholder="Enter name" />
        </div>
        <div class="form-group">
            <label for="age">Age:</label>
            <input type="text" name="age" value="${student.age}" class="form-control mb-2" id="age" placeholder="Enter age" />
        </div>
        <div class="form-group">
            <label for="address">Address:</label>
            <input type="text" name="address" value="${student.address}" class="form-control mb-2" id="address" placeholder="Enter address" />
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>

<!-- Thêm thẻ script tới thư viện jQuery và Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
