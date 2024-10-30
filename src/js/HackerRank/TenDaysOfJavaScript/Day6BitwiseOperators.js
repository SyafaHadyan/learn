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
function getMaxLessThanK(n,k)
{
    const max = [];
    let result = 0;
    for (let i = 1; i <= n; i++)
    {
        max.push(i);
        for (let j = 0; j < n - i; j++)
        {
            let temp = i & (i + 1) + j;
            if (temp < k && temp > result)
            {
                result = temp;
            }
        }
    }
    /*
    if (n == k || n == 0 || k == 0)
    {
        return 0;
    }
    */
    return result;
}

function main() {
    const q = +(readLine());
    
    for (let i = 0; i < q; i++) {
        const [n, k] = readLine().split(' ').map(Number);
        
        console.log(getMaxLessThanK(n, k));
    }
}