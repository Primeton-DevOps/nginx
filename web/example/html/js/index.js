function localResource() {
    window.location = "test.html";
}

function remoteService() {
    var json = {"id": "1001", "name": "Nginx"};
    $.ajax({
        url : "/api/rest/users",
        type : 'POST',
        data : json,
        cache : false,
        contentType : 'application/json',
        success : function(text) {
            alert(text);
        },
        error: function(text) {
            alert(text);
        }
    });
}