//divisible by 3 - Fizz
//divisble by 5 - Buzz
//divisble by both 3 or 5 - FizzBuzz
// not divisble by 3 or 5 - 'input'
//not a number - 'Not a number

const output = fizzBuzz(15)
console.log(output)
function fizzBuzz(input){
    if (typeof input !== 'number') console.log('Not a number');
    else if(input % 3 === 0 && input % 5 === 0) console.log('FizzBuzz');
    else if (input % 3 != 0 && input % 5 != 0) console.log(input);
    else if (input % 3 === 0) console.log('Fizz');
    else if (input % 5 === 0) console.log('Buzz');
}