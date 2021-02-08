 
/*console.log('Hello world');
function cal(year)
{
    return(2018-year);
}
console.log(cal(1998));
var age=89;
function hello()
{
console.log(age);
var age=34;
console.log(age);
}
hello();
console.log(age);
//scope chain
var a="hello";
f1();
function f1()
{
    var b="hi";
    f2();

function f2()
{
    var c="how are u";
    console.log(a+' '+b+' '+c);
    f3();
}
}
function f3()
{
    console.log(this.b);
}
//this keyword
console.log("About this keyword");
var ranjani=
{
    fName:"ranjani",
    year:1998,
    cal:function()
    {
        console.log(this);
        console.log(2020-this.year);
        var x=this.fName;
        function inner()
        {
            console.log('inner function'+' '+x);
        }
        inner();
    }
}
ranjani.cal();

function scopeing()
{
    console.log("Scopeing");
}
scopeing();
//function expression

var person=function()
{
    console.log("ranjani");
}
person();
//inheritance
var Person=function(name,year,job)
{
    this.name=name;
    this.year=year;
    this.job=job;
    this.calculate=function()
    {
        console.log(2020-this.year);
    }
}
var john=new Person('john',1998,'software');
var mark=new Person('mark',1999,'developer');
console.log(mark.job);
mark.calculate();
john.calculate();
Person.prototype.lastname='Hello';
console.log(mark.lastname);
console.log(john.lastname);
console.log(john.hasOwnProperty('job'));
console.log(Person.hasOwnProperty('lastname'));
var age=13;
var obj={
    name:'raga',
    city:'hyderabad'
}
var obj1=obj;
obj.name='ranjani';
console.log(obj);
console.log(obj1);
function fun(a,b)
{
    a=23;
    b.name='busim';
}
fun(age,obj);
console.log(age+' '+obj.name);
//callback function;
/*var years=[1234,1998,1995];
function f1(arr,fn)
{
    var arrRes=[];
    for(var i=0;i<arr.length;i++)
    {
        arrRes.push(fn(arr[i]));
    }
    return arrRes;
}
function calculateage(el)
{
    return 2020-el;
}
var result=f1(years,calculateage);
console.log(result);
//immediate invoke function
/*(function()
{
    console.log("Hello world");
    })();
//clousers
function retirement(year)
{
    var a='these many years left';
    return function(YearOfBirth)
    {
        console.log(year-(2020-YearOfBirth)+' '+a);
    }
}
retirement(65)(1994);
//arrow function
var arrowfunc=(a,b)=>
    console.log("Hello Arrow function"+' '+(a+b));

arrowfunc(3,5);
function Person(name)
{
    this.name=name;
}
//ES5
Person.prototype.myfriends=
function(friends)
{
    var arr=friends.map(function(el)
    {
      return `${this.name}: friends ${el}`
    }.bind(this))
    console.log(arr);
}
var friends=['sushma','manasa'];
new Person('ranjani').myfriends(friends);
//ES6
function Person(name)
{
    this.name=name;
}
Person.prototype.myfriends=
function(friends)
{
    var arr=friends.map(el => 
    
       `${this.name}: friends ${el}`
    )
    console.log(arr);
}
var friends=['sushma','manasa'];
new Person('raga').myfriends(friends);
//object destructuring
var person=['ranjani',22];
console.log(person[0]+' '+person[1]);
var [name ,age1]=['nikhila',21];
console.log(name +' '+age1);
const person1={
    fName:'Ramya',
    age2:22
};
const {fName,age2}=person1;
console.log(fName);
console.log(age2);
*/
//const boxes=document.querySelectorAll('.box');
//var boxesArr=Array.prototype.slice.call(boxes);
/*Array.from(boxes).forEach(function(cur)
    {cur.style.backgroundColor='pink';});
//boxesArr.forEach(cur=>cur.textContent='Hello ranjani');
//restparameters
var arr=[2,4,5,6,7,9];
function sum(a,b,c,d,e,g)
{
    return (a+b+c+d+e+g);
}
var result=sum(...arr);
console.log(result);*/
//--------------------------------------------------------------------
//Asynchrnous function
const second=()=>{
    setTimeout(()=>{
        console.log('second function');
    },2000);
    //console.log("second function");
}
const first=()=>{
    console.log("Hello from first");
    second();
    console.log("the end");
}
first();