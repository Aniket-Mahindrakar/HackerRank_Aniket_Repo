function processData(input) {
    //Enter your code here
    input = input.split(/[ \n\t]/);
    var stack = [];

    for (var i = 1; i < input.length; i++){
        switch (input[i]) {
            case '1': i++;
                stack.push(parseInt(input[i]));
                break;
            case '2': stack.pop()
                break;
            case '3': console.log(Math.max(...stack));
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
