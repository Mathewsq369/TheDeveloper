<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration - Chinese Language Course</title>
    <link rel="icon" href="https://cdn-icons-png.flaticon.com/512/2921/2921222.png" type="image/png">
    <link rel="stylesheet" type="text/css" href="registration.css">
</head>
<body>
    <%
        response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
        if(session.getAttribute("user") == null)
        {
            response.sendRedirect("login.jsp");
        }
    %>
    <div class="register-container">
        <div class="logo">
            <img src="https://cdn-icons-png.flaticon.com/512/2921/2921222.png" alt="Logo">
            <h2>Course Manager</h2>
        </div>
        <h3>Register</h3>
        <form action="registration" method="post">
            <div class="form-group">
                <label for="fullname">Full Name</label>
                <input type="text" name="fullname" id="fullname" placeholder="Enter your full name" required>
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" name="email" id="email" placeholder="Enter your email" required>
            </div>
            <div class="form-group">
                <label for="instructor-id">Instructor ID</label>
                <input type="text" name="instructor_id" id="instructor-id" placeholder="Enter your instructor ID" required>
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" name="password" id="password" placeholder="Enter your password" required>
            </div>
            <div class="form-group">
                <label for="confirm-password">Confirm Password</label>
                <input type="password" name="confirm_password" id="confirm-password" placeholder="Confirm your password" required>
            </div>
            <button type="submit" class="register-button">Register</button>
        </form>
    </div>
</body>
</html>

