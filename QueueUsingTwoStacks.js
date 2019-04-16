function processData(input) {
    input = input.split(/[ \n\t]/);
    var list = [];
    for (var i = 1; i < input.length; i++){
        switch (input[i]) {
            case '1': i++;
                list.push(parseInt(input[i]));
                break;
            case '2': list.splice(0, 1);
                break;
            case '3': console.log(list[0])
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
