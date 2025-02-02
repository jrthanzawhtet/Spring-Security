<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container text-center mt-5">
    <h2 class="mb-4">Welcome to Home View</h2>
    
    <div class="d-grid gap-3 col-4 mx-auto">
        <form action="admin" method="get">
            <button type="submit" class="btn btn-primary btn-lg">Admin View</button>
        </form>

        <form action="member" method="get">
            <button type="submit" class="btn btn-success btn-lg">Member View</button>
        </form>
    </div>
</body>
</html>
