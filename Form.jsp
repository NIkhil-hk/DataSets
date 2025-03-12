<!DOCTYPE html>
<html>
<head>
    <title>User Data Form</title>
</head>
<body>
    <h1>User Data Form</h1>
    <form action="submitForm" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>

        <label for="age">Age:</label>
        <input type="number" id="age" name="age" required><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>