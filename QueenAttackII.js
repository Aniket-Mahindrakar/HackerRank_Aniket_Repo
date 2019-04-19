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

// Complete the queensAttack function below.
function queensAttack(n, k, r_q, c_q, obstacles) {
    var count = 0;

    var o = obstacles.filter((e) => e[0] > r_q && e[1] < c_q);
    
    for (var i = r_q + 1, j = c_q - 1; i <= n && j > 0; i++ , j--){
        if (o.length != 0) {
            if (i == o[0][0] && j == o[0][1]) {
                break;
            }
        }
        count++;
    }

    var o = obstacles.filter((e) => e[0] > r_q && e[1] == c_q);
    
    for (var i = r_q + 1, j = c_q; i <= n; i++){
        if (o.length != 0) {
            if (i == o[0][0] && j == o[0][1]) {
                break;
            }
        }
        count++;
    }

    var o = obstacles.filter((e) => e[0] > r_q && e[1] > c_q);
    
    for (var i = r_q + 1, j = c_q + 1; i <= n && j <= n; i++ , j++){
        if (o.length != 0) {
            if (i == o[0][0] && j == o[0][1]) {
                break;
            }
        }
        count++;
    }

    var o = obstacles.filter((e) => e[0] == r_q && e[1] > c_q);
    
    for (var i = r_q, j = c_q + 1; j <= n; j++) {
        if (o.length != 0) {
            if (i == o[0][0] && j == o[0][1]) {
                break;
            }
        }
        count++;
    }
    
    var o = obstacles.filter((e) => e[0] < r_q && e[1] > c_q);
    
    for (var i = r_q - 1, j = c_q + 1; j <= n && i > 0; i--, j++) {
        if (o.length != 0) {
            if (i == o[0][0] && j == o[0][1]) {
                break;
            }
        }
        count++;
    }
    
    var o = obstacles.filter((e) => e[0] < r_q && e[1] == c_q);
    
    for (var i = r_q - 1, j = c_q; i > 0; i--) {
        if (o.length != 0) {
            if (i == o[0][0] && j == o[0][1]) {
                break;
            }
        }
        count++;
    }
    
    var o = obstacles.filter((e) => e[0] < r_q && e[1] < c_q);
    
    for (var i = r_q - 1, j = c_q - 1; i > 0 && j > 0; i--, j--) {
        if (o.length != 0) {
            if (i == o[0][0] && j == o[0][1]) {
                break;
            }
        }
        count++;
    }
    
    var o = obstacles.filter((e) => e[0] == r_q && e[1] < c_q);
    
    for (var i = r_q, j = c_q - 1; j > 0; j--) {
        if (o.length != 0) {
            if (i == o[0][0] && j == o[0][1]) {
                break;
            }
        }
        count++;
    }
    
    return count;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const nk = readLine().split(' ');

    const n = parseInt(nk[0], 10);

    const k = parseInt(nk[1], 10);

    const r_qC_q = readLine().split(' ');

    const r_q = parseInt(r_qC_q[0], 10);

    const c_q = parseInt(r_qC_q[1], 10);

    let obstacles = Array(k);

    for (let i = 0; i < k; i++) {
        obstacles[i] = readLine().split(' ').map(obstaclesTemp => parseInt(obstaclesTemp, 10));
    }

    let result = queensAttack(n, k, r_q, c_q, obstacles);

    ws.write(result + "\n");

    ws.end();
}
