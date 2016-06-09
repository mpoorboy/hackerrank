function processData(input) {
  var data = input.split('\n');
  var N = data.shift();
    
  data.map(d => {
    var str = d.split('');
    var even = [];
    var odd = [];
      
    for (var i = 0; i < str.length; i++) {
        if (i % 2 === 0) {
            even.push(str[i]);
        } else {
            odd.push(str[i])
        }
    }
      
    console.log(even.join(''), odd.join(''));
  });
    
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

