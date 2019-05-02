import * as readline from 'readline';

let val = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });
   
 var arr : number[][]=[[1,2,3],[4,5,6],[7,8,0]]

    for(var i=0;i<3;i++){
        for(var j=0;j<3;j++){

            if((i+j)<=2){

                console.log(arr[i][j]);
            }
            else{
                continue;
        }
    }
}