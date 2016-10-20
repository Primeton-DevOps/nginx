function localResource() {
    window.location = "test.html";
}

function remoteService(method) {
    if (method == "POST") {
        add();
    } else if (method == "GET") {
        query();
    } else {
        query();
    }

}

function add() {
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


function query() {
    $.ajax({
        url : "/api/rest/users",
        type : 'GET',
        contentType : 'application/json',
        success : function(text) {
            alert(text);
        },
        error: function(text) {
            alert(text);
        }
    });
}