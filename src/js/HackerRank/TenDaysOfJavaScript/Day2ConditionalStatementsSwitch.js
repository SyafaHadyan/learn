'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}

function getLetter(s) {
    // Write your code here
    const A = ['a','e','i','o','u'];
    const B = ['b','c','d','f','g'];
    const C = ['h','j','k','l','m']
    if (A.includes(s.charAt(0)))
        return 'A';
    else if (B.includes(s.charAt(0)))
        return 'B';
    else if (C.includes(s.charAt(0)))
        return 'C';
    return 'D';
}


function main() {
    const s = readLine();
    
    console.log(getLetter(s));
}