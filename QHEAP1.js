function processData(input) {
    //Enter your code here
    input = input.split(/[ \t\n]+/);
    heap = [];
    for (var i = 1; i < input.length; i++){
        switch (input[i]) {
            case '1': i++;
                heap.push(parseInt(input[i]));
                break;
            case '2': i++;
                heap = heap.filter(e => e !== parseInt(input[i]));
                break;
            case '3': console.log(Math.min(...heap));
                break;
        }
    }
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});
