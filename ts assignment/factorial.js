"use strict";
exports.__esModule = true;
var readline = require("readline");
var val = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
var fact = 1;
var num;
val.question('enter a number ', function (num) {
    for (var i = 1; i <= parseInt(num); i++) {
        fact = fact * i;
    }
    console.log(fact);
    val.close();
});
