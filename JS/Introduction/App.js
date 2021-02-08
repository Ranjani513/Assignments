 
console.log('Hello world');
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
/*var age=13;
var obj={
    name:'raga',
    city:'hyderabad'
}
var obj1=obj;
obj.name='ranjani';
console.log(obj);
console.log(obj1);*/