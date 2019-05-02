import * as readline from 'readline';

let val = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

function passOrfail(num1?: number, num2?: number, num3?: number)	{
	
	let result: boolean = true;
	let Sum: number = num1 + num2 + num3;
	if(Sum < 125)	{result = false;}
	if (num1 < 40)	{
		result = false;
	}
	if (num2 < 40)	{
		result = false;
	}
	if (num3 < 40)	{
		result = false;
	}
if(result == false)	{
		console.log("Failed");
	}
	else	{
		console.log("Passed");
	}
}
val.question("Enter all 3 numbers: ",
	(answer)=>	{
		let sub = answer.split(" ");
		let sub1 = parseInt(sub[0]);
		let sub2 = parseInt(sub[1]);
		let sub3 = parseInt(sub[2]);

		passOrfail(sub1, sub2, sub3);
		val.close();
	}
);