<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard - Chinese Language Course</title>
    <link rel="icon" href="https://cdn-icons-png.flaticon.com/512/2921/2921222.png" type="image/png">
    <link rel="stylesheet" type="text/css" href="home.css">
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
                <h2>Course Manager</h2>
            </div>
            <a href="#" class="nav-item active"><i class="fas fa-tachometer-alt"></i> Home</a>
            <a href="attendance.jsp" class="nav-item"><i class="fas fa-calendar-check"></i> Attendance</a>
            <a href="results.jsp" class="nav-item"><i class="fas fa-chart-bar"></i> Results</a>
            <a href="registration.jsp" class="nav-item"><i class="fas fa-chart-bar"></i> Registration </a>
        </div>
        <div class="settings">
            <a href="settings.jsp" class="nav-item"><i class="fas fa-cog"></i> Settings</a>
        </div>
    </div>
    <div class="main-content">
        <div class="topbar">
            <div class="profile-pic">
                <img src="https://cdn-icons-png.flaticon.com/512/847/847969.png" alt="User Profile">
            </div>
        </div>
        <div class="content">
            <h1>Welcome ${user}</h1>
            <div class="card">
                <h3>Level 1 to 5 Class Timetable</h3>
                <table class="timetable">
                    <thead>
                        <tr>
                            <th>Time</th>
                            <th>Class</th>
                            <th>Venue</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>07:00 AM - 09:00 AM</td>
                            <td>MORNING CLASS</td>
                            <td>LANGUAGE LAB (FASS)</td>
                        </tr>
                        <tr>
                            <td>12:00 PM - 14:00 PM</td>
                            <td>AFTERNOON CLASS</td>
                            <td>LANGUAGE LAB (FASS)</td>
                        </tr>
                        <tr>
                            <td>16:00 PM - 18:00 PM</td>
                            <td>EVENING CLASS</td>
                            <td>LANGUAGE LAB (FASS)</td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="card">
                <h3>Upcoming Events</h3>
                <p>No events scheduled for today.</p>
            </div>
            <div class="card">
                <h3>Notifications</h3>
                <ul>
                    <li>New student enrolled in Chinese Grammar 101.</li>
                    <li>Classroom B2 maintenance scheduled for tomorrow.</li>
                    <li>Reminder: Submit monthly attendance report.</li>
                </ul>
            </div>
        </div>
    </div>
    <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
</body>
</html>

