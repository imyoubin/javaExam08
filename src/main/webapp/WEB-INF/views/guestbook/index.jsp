<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>방명록</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
    <h1>방명록</h1>
    <button id="loadBtn">방명록 글 불러오기</button>
    <table border="1" id="guestTable" style="margin-top: 10px;">
        <thead>
            <tr>
                <th>이름</th>
                <th>내용</th>
                <th>날짜</th>
            </tr>
        </thead>
        <tbody>
        </tbody>
    </table>

    <script>
        $('#loadBtn').on('click', function() {
            $.ajax({
                url: 'https://raw.githubusercontent.com/clz2025-red/api/refs/heads/main/guestbook',
                method: 'GET',
                dataType: 'json',
                success: function(data) {
                    let tbody = $('#guestTable tbody');
                    tbody.empty();
                    data.forEach(item => {
                        let row = `<tr>
                            <td>${item.name}</td>
                            <td>${item.content}</td>
                            <td>${item.regDate}</td>
                        </tr>`;
                        tbody.append(row);
                    });
                },
                error: function() {
                    alert('데이터를 불러오지 못했습니다.');
                }
            });
        });
    </script>
</body>
</html>