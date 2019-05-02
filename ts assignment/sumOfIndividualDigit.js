"use strict";
exports.__esModule = true;
var readline = require("readline");
var val = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
var x;
var r;
val.question('enter a number ', function (answer) {
    var num = parseInt(answer);
    while (num != 0) {
        r = num % 10;
        x = r + x;
        num = num / 10;
    }
    console.log(x);
    val.close();
});
