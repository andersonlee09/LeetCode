$(function(){

    function checkusername(){
        var username = $("#username");
        if(username.val() == ""){
            $("#usernameinfo").text("请输入用户名");
            $("#usernameinfo").show();
            username.focus();
            return false;
        } else {
            $("#usernameinfo").hide();
            return true;
        }
    }

    function checkpassword(){
        var password = $("#password");
        if(password.val() == ""){
            $("#passwordinfo").text("请输入密码");
            $("#passwordinfo").show();
            password.focus();
            return false;
        } else {
            $("#passwordinfo").hide();
            return true;
        }
    }

    function checkimagecode(){
        var imagecode = $("#imagecode");
        if(imagecode.val() == ""){
            $("#imagecodeinfo").text("请输入验证码");
            $("#imagecodeinfo").show();
            imagecode.focus();
            return false;
        } else if(imagecode.val() != "uwv6") {
            $("#imagecodeinfo").text("验证码错误");
            $("#imagecodeinfo").show();
            imagecode.focus();
            return false;
        }else {
            $("#imagecodeinfo").hide();
            return true;
        }
    }

    $("#mysubmit").click(function(){
        if(checkusername() && checkpassword() && checkimagecode())
            return true;
        else
            return false;
    });

    $("#username").blur(function(){
        checkusername();
    });
    $("#password").blur(function(){
        checkpassword();
    });
    $("#imagecode").blur(function(){
        checkimagecode();
    });

    var d= new Date();
    var year = d.getFullYear();
    var month = d.getMonth();
    var date = d.getDate();
    $("#currentdate").text(year+"/"+ (month+1) +"/"+date);
    // var currentdate = document.getElementById("currentdate");
    // currentdate.innerHTML = year+"/"+ (month+1) +"/"+date;
});