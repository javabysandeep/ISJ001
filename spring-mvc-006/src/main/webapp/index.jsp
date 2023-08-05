<html>
<body>
<h2>Course Management App!</h2>

<form action="/app/course" method="post">
    <table style="border-width: 10px">
        <tr>
            <td>Course Id:</td>
            <td><input type="number" name="courseId"></td>
        </tr>
        <tr>
            <td>Course Name:</td>
            <td><input type="text" name="courseName"></td>
        </tr>
        <tr>
            <td>Course Price:</td>
            <td><input type="number" name="coursePrice"></td>
        </tr>
        <tr>
            <td>Course Description:</td>
            <td><input type="text" name="courseDescription"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Add Course"></td>
        </tr>

    </table>
</form>
</body>
</html>
