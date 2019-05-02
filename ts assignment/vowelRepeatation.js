var readline = require("readline");
var val = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
val.question("Enter string ", function (answer) {
    var a = 0;
    var e = 0;
    var i = 0;
    var o = 0;
    var u = 0;
    for (var i = 0; i < answer.length; ++i) {
        if (answer[i] == 'a' || answer[i] == 'A') {
            ++a;
        }
        else if (answer[i] == 'e' || answer[i] == 'E') {
            ++e;
        }
        else if (answer[i] == 'i' || answer[i] == 'I') {
            ++i;
        }
        else if (answer[i] == 'o' || answer[i] == 'O') {
            ++o;
        }
        else if (answer[i] == 'u' || answer[i] == 'U') {
            ++u;
        }
    }
    console.log("a occured: " + a + " times.\ne occured: " + e + " times.\ni occured: " + i + " times.\no occured: " + o + " times.\nu occured: " + u + " times.\n");
    val.close();
});
