/*var firstName = "bhargav";
console.log(firstName);
//challenge-2
var avgJohn;
var avgMike;
avgJohn = 89 + 120 + 183 / 3;
avgMike = 116 + 94 + 123 / 3;
avgMary = 97 + 134 + 105 / 3;
console.log(
  "John's tean has score" +
    avgJohn +
    "," +
    "Mike's team has score " +
    avgMike +
    "," +
    "mary's :" +
    avgMary
);
if (avgJohn > avgMike && avgJohn > avgMary) {
  console.log(
    "john's team has got highet score in all three maths: " + avgJohn
  );
} else if (avgMike > avgMary) {
  console.log(
    "Mike's team has got highet score in all three maths: " + avgMike
  );
} else {
  console.log(
    "Mary's team has got highet score in all three maths: " + avgMary
  );
}*/

/*var whatToDo = function (job, firstName) {
  switch (job) {
    case "teacher":
      return firstName + " " + "teaches kids hoe to code";

    case "driver":
      return firstName + " " + "drives a cab in lisbon";

    case "designer":
      return firstName + " " + "designs beautiful websites";

    default:
      return firstName + "does something";
  }
};

console.log(whatToDo("driver", "bhargav"));*/

/*var names = ["john", "mark", "jane"];
var years = new Array(1998, 1969, 1848);

console.log(names[0]);

names.push(1981);
names.unshift("ramu");
console.log(names);
*/
//challenge-3
/*var billsPer = [20, 15, 10];

var tipCal = function (tip) {
  return (tip / 100) * bill;
};
var bill = 268;
if (bill < 50) {
  var tip = tipCal(billsPer[0]);
} else if (bill > 50 && bill < 200) {
  var tip = tipCal(billsPer[1]);
} else if (bill >= 200) {
  var tip = tipCal(billsPer[2]);
}
console.log(
  "the full amount: " +
    bill +
    "tip is:" +
    tip +
    "final amout:" +
    bill +
    "+" +
    tip +
    "=" +
    (bill + tip)
);*/

//Objects and properties

/*var bhargav = {
  firstName: "bhargav",
  lastName: "Busem",
  birthyear: 1995,
  family: ["bhargav", "chandi", "rani"],
  job: "Software",
};

console.log(bhargav.firstName);
console.log(bhargav["lastName"]);
console.log("before change::" + bhargav.job);
bhargav.job = "it developer";
console.log(bhargav["job"]);*/

//challenge - 4
/*var John = {
  fullName: "john smith",
  mass: 92, //kg
  height: 1.95,
  BMI: function () {
    this.fbmi = this.mass / (this.height * this.height);
    return this.fbmi;
  },
};

var mark = {
  fullName: "mark miller",
  mass: 70, //kg
  height: 1.65,
  BMI: function () {
    this.fbmi = this.mass / (this.height * this.height);
    return this.fbmi;
  },
};

if (John.BMI() > mark.BMI()) {
  console.log(John.fullName + " has higher BMI of " + John.fbmi);
} else if (mark.fbmi > John.fbmi) {
  console.log(mark.fullName + " has higher BMI of " + mark.fbmi);
} else {
  console.log("They have the same BMI");
}
console.log(John.fbmi, mark.fbmi);*/

//code challenge-5

/*var tipCal = function (bill) {
  var billTip;
  if (bill < 50) {
    billTip = 0.2;
  } else if (bill > 50 && bill < 200) {
    billTip = 0.15;
  } else {
    billTip = 0.1;
  }
  return billTip * bill;
};

var bill = [124, 48, 256, 180, 42];
for (var i = 0; i < bill.length; i++) {
  console.log(tipCal(bill[i]));
}
*/

var john = {
  fullName: "john Smith",
  bills: [124, 48, 268, 180, 42],
  calTip: function () {
    this.tips = [];
    this.finalValue = [];

    for (var i = 0; i < this.bills.length; i++) {
      var perTip;
      var bill = this.bills[i];
      if (this.bill < 50) {
        perTip = 0.2;
      } else if (this.bill > 50 && this.bill < 200) {
        perTip = 0.15;
      } else {
        perTip = 0.1;
      }
      this.tips[i] = bill * perTip;
      this.finalValue[i] = bill + bill * perTip;
    }
  },
};
john.calTip();
console.log(john);
