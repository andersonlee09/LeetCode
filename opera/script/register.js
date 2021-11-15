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

    function checkpassword2(){
        var password2 = $("#password2");
        if(password2.val() == ""){
            $("#password2info").text("请再次输入密码");
            $("#password2info").show();
            password2.focus();
            return false;
        }
        var password = $("#password");
        if(password2.val()!=password.val())
        { $("#password2info").text("输入密码错误");
            $("#password2info").show();
            password2.focus();
            return false;}
        else {
            $("#password2info").hide();
            return true;
        }
    }

    function checkmyname(){
        var myname= $("#myname");
        if(myname.val() == ""){
            $("#mynameinfo").text("请输入姓名");
            $("#mynameinfo").show();
            myname.focus();
            return false;
        } else {
            $("#mynameinfo").hide();
            return true;
        }
    }

    function checkphone(){
        var phone= $("#phone");
        if(phone.val() == ""){
            $("#phoneinfo").text("请输入手机号");
            $("#phoneinfo").show();
            phone.focus();
            return false;
        }
        if(phone.val().length!=11){
            $("#phoneinfo").text("输入手机号错误");
            $("#phoneinfo").show();
            phone.focus();
            return false;}
        else {
            $("#phoneinfo").hide();
            return true;
        }
    }

    function checkmailbox(){
        var mailbox= $("#mailbox");
        if(mailbox.val() == ""){
            $("#mailboxinfo").text("请输入邮箱");
            $("#mailboxinfo").show();
            mailbox.focus();
            return false;
        }
        var reg= /^([a-zA-Z]|[0-9])(\w|\-)+@[a-zA-Z0-9]+\.([a-zA-Z]{2,4})$/;
        if (!reg.test(mailbox.val())) {
            $("#mailboxinfo").text("邮箱格式错误");
            $("#mailboxinfo").show();
            mailbox.focus();
            return false;
        }

        else {
            $("#mailbox").hide();
            return true;
        }
    }

    function checkschool(){
        var school= $("#school");
        if(school.val() == ""){
            $("#schoolinfo").text("请输入学校");
            $("#schoolinfo").show();
            school.focus();
            return false;
        } else {
            $("#schoolinfo").hide();
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
        if(checkusername() && checkpassword() &&checkpassword2() &&checkmyname() &&checkphone() &&checkmailbox() &&checkschool() && checkimagecode())
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
    $("#password2").blur(function(){
        checkimagecode();
    });
    $("#myname").blur(function(){
        checkimagecode();
    });
    $("#phone").blur(function(){
        checkimagecode();
    });
    $("#mailbox").blur(function(){
        checkimagecode();
    });
    $("school").blur(function(){
        checkimagecode();
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