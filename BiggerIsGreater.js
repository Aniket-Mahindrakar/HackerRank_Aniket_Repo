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
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}

// Complete the biggerIsGreater function below.
function biggerIsGreater(w) {
    for (var i = w.length - 1; w[i] <= w[i - 1] && i > 0; i--);

    if (i == 0) {
        return 'no answer';
    }
    
    var s = [...w.substring(i, w.length)];
    
    s = s.sort((a, b) => a > b);

    var c = w[i - 1];
    for (var j in s) {
        if (s[j] > c) {
            c = s[j];
            break;
        }
    }

    var j = [...w].indexOf(c, i);

    w = swap(w, i - 1, j);

    w = w.slice(0, i).join("") + w.slice(i, w.length).sort((a, b) => a > b).join("");

    return w;
}

function swap(w, i, j) {
    w = [...w];
    var t = w[i];
    w[i] = w[j];
    w[j] = t;

    return w;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const T = parseInt(readLine(), 10);

    for (let TItr = 0; TItr < T; TItr++) {
        const w = readLine();

        let result = biggerIsGreater(w);

        ws.write(result + "\n");
    }

    ws.end();
}
