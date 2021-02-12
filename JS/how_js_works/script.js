//function

// hoisting

//function calAge(year) {
//console.log(2018 - year);
//}

/*var calAgee = function (year) {
  console.log(2018 - year);
};
calAgee(1990);*/

//Scoping

/*var a = "HELLO";
first();
function first() {
  var b = "hi";
  second();
  function second() {
    c = "hey";
    console.log(a + b + c);
  }
}*/
var john = {
  name: "bhargav",
  yearOfBirth: 1990,
  calAge: function () {
    console.log(this);
    console.log(2018 - this.yearOfBirth);
  },
};
john.calAge();
