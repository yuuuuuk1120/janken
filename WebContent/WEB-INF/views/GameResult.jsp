<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>じゃんけんの勝敗</title>
</head>
<body>
    <h2>結果</h2>
    <p>あなたの手は${requestScope.h }で、</p>
    <p>CPUの手は${requestScope.c }を出しました。</p>
    <br />
    <br />
    <p>勝敗の結果は${requestScope.result }</p>
</body>
</html>