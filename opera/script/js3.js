function check(){
    var username = form2.username;
    var password = form2.password;
    var password2 = form2.password2;
    var myname = form2.myname;
    var phone = form2.phone;
    var mailbox = form2.mailbox;
    var school= form2.school;
    var imagecode = form2.imagecode;
    var usernameinfo = document.getElementById("usernameinfo");
    var passwordinfo = document.getElementById("passwordinfo");
    var password2info = document.getElementById("password2info");
    var mynameinfo = document.getElementById("mynameinfo");
    var phoneinfo = document.getElementById("phoneinfo");
    var mailboxinfo = document.getElementById("mailboxinfo");
    var schoolinfo = document.getElementById("schoolinfo");
    var imagecodeinfo = document.getElementById("imagecodeinfo");
    if(username.value  == ""){
        // alert("请输入用户名");
        usernameinfo.innerHTML = "请输入用户名";
        usernameinfo.style.display = "block";
        username.focus();
        return false;
    } else {
        usernameinfo.style.display = "none";
    }

    if(password.value  == ""){
        // alert("请输入密码");
        passwordinfo.innerHTML = "请输入密码";
        passwordinfo.style.display = "block";
        password.focus();
        return false;
    } else {
        mima=password.value;
        passwordinfo.style.display = "none";
    }
    if(password2.value  == ""){
        // alert("请再次输入密码");
        password2info.innerHTML = "请再次输入密码";
        password2info.style.display = "block";
        password2.focus();
        return false;
    }
    else {
        passwordinfo.style.display = "none";
    }
    if(password.value!=password2.value)
    {password2info.innerHTML = "输入密码错误";
        password2info.style.display = "block";
        password2.focus();
        return false;
    }
    else{
        password2info.style.display = "none";
    }

    if(myname.value  == ""){
        // alert("请输入用户名");
        mynameinfo.innerHTML = "请输入姓名";
        mynameinfo.style.display = "block";
        myname.focus();
        return false;
    } else {
        mynameinfo.style.display = "none";
    }
    if(phone.value  == ""){
        // alert("请输入电话");
        phoneinfo.innerHTML = "请输入电话号码";
        phoneinfo.style.display = "block";
        phone.focus();
        return false;
    } else {
        phoneinfo.style.display = "none";
    }
    if(phone.value.length!=11){
        // alert("请输入电话");
        phoneinfo.innerHTML = "电话号码错误";
        phoneinfo.style.display = "block";
        phone.focus();
        return false;
    } else {
        phoneinfo.style.display = "none";
    }

    if(mailbox.value  == ""){
        // alert("请输入邮箱");
        mailboxinfo.innerHTML = "请输入邮箱";
        mailboxinfo.style.display = "block";
        mailbox.focus();
        return false;
    } else {
        mailboxinfo.style.display = "none";
    }
    var reg= /^([a-zA-Z]|[0-9])(\w|\-)+@[a-zA-Z0-9]+\.([a-zA-Z]{2,4})$/;
    if (!reg.test(mailbox.value)) {
        mailboxinfo.innerHTML = "请输入正确格式的邮箱";
        mailboxinfo.style.display = "block";
        mailbox.focus();
        return false;
    } else {
        mailboxinfo.style.display = "none";
    }
    if(school.value  == ""){
        // alert("请输入学院名");
        schoolinfo.innerHTML = "请输入学院名";
        schoolinfo.style.display = "block";
        school.focus();
        return false;
    } else {
        schoolinfo.style.display = "none";
    }

    if(imagecode.value  == ""){
        // alert("请输入验证码");
        imagecodeinfo.innerHTML = "请输入验证码";
        imagecodeinfo.style.display = "block";
        imagecode.focus();
        return false;
    } else {
        imagecodeinfo.style.display = "none";
    }
    if(imagecode.value  != "uwv6"){
        // alert("验证码输入不正确");
        imagecodeinfo.innerHTML = "验证码输入不正确";
        imagecodeinfo.style.display = "block";
        imagecode.focus();
        return false;
    } else {
        imagecodeinfo.style.display = "none";
    }
    return true;
}

window.onload = function(){
    var d= new Date();
    var year = d.getFullYear();
    var month = d.getMonth();
    var date = d.getDate();
    var currentdate = document.getElementById("currentdate");
    currentdate.innerHTML = year+"/"+ (month+1) +"/"+date;
}