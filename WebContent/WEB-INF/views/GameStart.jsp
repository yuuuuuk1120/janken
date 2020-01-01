<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>じゃんけんゲーム</title>
</head>

<body>
    <h2>じゃんけん・・・・</h2>
    <form method="POST" action="Janken">
        <p>一つだけ手を選択してください。</p>
        <ul>
            <li><input type="radio" name="hand" value="0"> <label
                for="gu">グー</label></li>

            <li><input type="radio" name="hand" value="1"> <label
                for="choki">チョキ</label></li>

            <li><input type="radio" name="hand" value="2"> <label
                for="pa">パー</label></li>

        </ul>


        <input type="submit" value="ぽんっ！" />

    </form>


</body>
</html>