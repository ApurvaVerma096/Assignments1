import * as readline from 'readline';

let val = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });


  var fact : number = 1;
  var num : number;

  val.question('enter a number ', (num) => {

       for ( var i = 1 ; i <= parseInt(num) ; i++ ){
                fact = fact * i;
       }

       console.log(fact);
val.close();

});