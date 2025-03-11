<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Attendance Management - Chinese Language Course</title>
    <link rel="icon" href="https://cdn-icons-png.flaticon.com/512/2921/2921222.png" type="image/png">
    <link rel="stylesheet" type="text/css" href="attendance.css">
</head>
<body>
    <%
        response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
        if(session.getAttribute("user") == null)
        {
            response.sendRedirect("login.jsp");
        }
    %>
    <div class="sidebar">
        <div>
            <div class="logo">
                <img src="https://cdn-icons-png.flaticon.com/512/2921/2921222.png" alt="Logo">
                <h2>Welcome ${user.username}</h2>
            </div>
            <a href="home.jsp" class="nav-item"><i class="fas fa-tachometer-alt"></i> Home</a>
            <a href="#" class="nav-item active"><i class="fas fa-calendar-check"></i> Attendance Management</a>
            <a href="results.jsp" class="nav-item"><i class="fas fa-chart-bar"></i> Results Management</a>
        </div>
        <div class="settings">
            <a href="settings.jsp" class="nav-item"><i class="fas fa-cog"></i> Settings</a>
        </div>
    </div>
    <div class="content">
        <h1>Attendance Management</h1>
        <div class="card">
            <h3>Mark Attendance</h3>
            <p>Select the date and mark students as present or absent.</p>
            <form action="AttendanceServlet" method="post">
                <table>
                    <tr>
                        <td>Student_id</td>
                        <td><input type="text" name="student_id" required</td>
                    </tr>
                    <tr>
                        <td>Date</td>
                        <td><input type="date" name="date" required></td>
                    </tr>
                    <tr>
                        <td>Status</td>
                        <td>
                            <select name="status" required>
                                <option value="Present">Present</option>
                                <option value="Absent">Absent</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="Submit Attendance"></td>
                    </tr>
                </table>
            </form>
        </div>
        <div class="card">
            <h3>Attendance History</h3>
            <p>View the attendance records for specific students.</p>
            <p><a href="AttendanceListServlet">View Attendance List</a></p>
        </div>
    </div>
    <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
</body>
</html>

