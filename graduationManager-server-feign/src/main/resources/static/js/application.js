function testLogin() {
    if(window.location.href.indexOf("login.html")<0){
        if(typeof(getCookie("token"))=="undefined"||getCookie("token")==null) {
            window.location.href = "/login/login.html?error=未登录，请登录";
        }
    }

}
testLogin();
function setCookie(key,val){
    $.cookie(key,val, { expires: 7, path: '/' });
}
function getCookie(key){
    return $.cookie(key);
}
/*
function deletedCookie() {
    document.cookie="";
}
*/
function deletedCookie(){
    var date=new Date();
    date.setTime(date.getTime()-10000);
    var keys=document.cookie.match(/[^ =;]+(?=\=)/g);
    if (keys) {
        for (var i =  keys.length; i--;)
            document.cookie=keys[i]+"=0; expire="+date.toGMTString()+"; path=/";
    }
}




