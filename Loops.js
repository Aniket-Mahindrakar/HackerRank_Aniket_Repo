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

/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
    let i = 0;
    while (i < s.length) {
        const c = s.charAt(i);
        var vowels = ['a', 'e', 'i', 'o', 'u'];
        if (vowels.includes(c)) {
            console.log(c);
        }
        i++;
    }
    i = 0;
    while (i < s.length) {
        const c = s.charAt(i);
        var vowels = ['a', 'e', 'i', 'o', 'u'];
        if (!vowels.includes(c)) {
            console.log(c);
        }
        i++;
    }
}


function main() {
    const s = readLine();
    
    vowelsAndConsonants(s);
}