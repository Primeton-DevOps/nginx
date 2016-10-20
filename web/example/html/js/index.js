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
    var json = JSON.stringify({id:'10001', name: 'Nginx'});
    $.ajax({
        url : "/api/rest/users",
        type : 'POST',
        data : json,
        cache : false,
        dataType : 'json',
        contentType : 'application/json',
        success : function(text) {
            console.log("Return: " + text)
            alert("Return: " + text);
        },
        error: function(text) {
            console.log("Error: " + text)
            alert("Return: " + text);
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