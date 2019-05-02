import * as readline from 'readline';

let val = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });

  
  var x : number;
  var r : number;

  val.question('enter a number ', (answer) => {
     var num : number = parseInt(answer)
     while(num != 0){
          r = num%10;
          x= r+x;
          num = num/10; 
     }
     console.log(x);
    val.close();
  });