<script  language="Javascript">
<!--
var goodURL  = "https://www.notion.so/02-7347b870f7cc458aa85b357e660b903b?pvs=4"  //이곳에 인증이 되었을때 이동할 페이지  입력
    alert("패스워드를 입력하셔야 합니다.")

var password =  test("PASSWD 입력","")

    if (password == null)  {
        alert("출입금지")
        location  = "history.back();"         // 실패시 이동 주소       history.back();를 넣어도 됨
    }
    else  {
        var  combo =  password
        var  total =  combo.toLowerCase()

    if  (total == "test")  {                // 비밀번호
        alert("성공했습니다")
        location  =  goodURL
    }
    else  {
        alert("출입금지")
        location  = "history.back();"    // 실패시 이동 주소      history.back();를 넣어도 됨
    }
}
//-->
</script>
