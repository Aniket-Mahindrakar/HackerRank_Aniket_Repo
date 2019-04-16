'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(str => str.trim());

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the equalStacks function below.
 */
function equalStacks(h1, h2, h3) {
    /*
     * Write your code here.
     */

    var s1 = h1.reduce((partial_sum, a) => partial_sum + a); 
    var s2 = h2.reduce((partial_sum, a) => partial_sum + a); 
    var s3 = h3.reduce((partial_sum, a) => partial_sum + a);

    if (s1 == s2 && s2 == s3) {
        return s1;
    }

    h1.reverse();
    h2.reverse();
    h3.reverse();

    while (true) {
        if (s1 >= s2 && s1 >= s3) {
            var num = h1.pop();
            s1 = s1 - num; 
        }
        else if (s2 >= s1 && s2 >= s3) {
            var num = h2.pop();
            s2 = s2 - num; 
        }
        else if (s3 >= s1 && s3 >= s2) {
            var num = h3.pop();
            s3 = s3 - num; 
        }

        if (s1 == s2 && s2 == s3) {
            return s1;
        }
    }
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const n1N2N3 = readLine().split(' ');

    const n1 = parseInt(n1N2N3[0], 10);

    const n2 = parseInt(n1N2N3[1], 10);

    const n3 = parseInt(n1N2N3[2], 10);

    const h1 = readLine().split(' ').map(h1Temp => parseInt(h1Temp, 10));

    const h2 = readLine().split(' ').map(h2Temp => parseInt(h2Temp, 10));

    const h3 = readLine().split(' ').map(h3Temp => parseInt(h3Temp, 10));

    let result = equalStacks(h1, h2, h3);

    ws.write(result + "\n");

    ws.end();
}
