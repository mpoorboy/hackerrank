process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();    
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////

function main() {
    var n = parseInt(readLine());
    var a = [];
    var sum_1 = 0;
    var sum_2 = 0;
    
    for(a_i = 0; a_i < n; a_i++) {
       a[a_i] = readLine().split(' ');
       a[a_i] = a[a_i].map(Number);
    }
    
    for (var i = 0; i < n; i++) {
        sum_1 += a[i][i];
        sum_2 += a[i][(n-i)-1];
    }

    var diff = Math.abs(sum_1 - sum_2);
    console.log(diff);
}
