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
function Node(data) {
    this.data = data;
    this.next = null;
}
function Solution() {
//Begin code
  this.insert=function(head,data){
    var n = new Node(data);

    if (head === null) {
      head = n;
      return head;
    }

   var temp = head;
        
   while (temp.next !== null) {
      temp = temp.next;
    }

    temp.next = n;
    return head;
  };
//End code
this.display = function(head) {
    var start = head;
        
    while(start){
      process.stdout.write(start.data+" ");
      start = start.next;
    }
        
    };
}
function main() {
    var T = parseInt(readLine());
    var head = null;
    var mylist = new Solution();
    
    for(i=0;i<T;i++) {
      var data = parseInt(readLine());
      head = mylist.insert(head,data);
    }
    
    mylist.display(head);
}
