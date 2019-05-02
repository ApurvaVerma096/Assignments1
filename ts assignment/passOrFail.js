"use strict";
exports.__esModule = true;
var readline = require("readline");
var val = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
function passOrfail(num1, num2, num3) {
    var result = true;
    var Sum = num1 + num2 + num3;
    if (Sum < 125) {
        result = false;
    }
    if (num1 < 40) {
        result = false;
    }
    if (num2 < 40) {
        result = false;
    }
    if (num3 < 40) {
        result = false;
    }
    if (result == false) {
        console.log("Failed");
    }
    else {
        console.log("Passed");
    }
}
val.question("Enter all 3 numbers: ", function (answer) {
    var sub = answer.split(" ");
    var sub1 = parseInt(sub[0]);
    var sub2 = parseInt(sub[1]);
    var sub3 = parseInt(sub[2]);
    passOrfail(sub1, sub2, sub3);
    val.close();
});
