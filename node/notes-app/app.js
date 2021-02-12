/*const validator=require('validator')
const color=require('chalk')
const notes=require('./notes.js')
//fs.appendFileSync('notes.txt','  welcome to nodejs')
const msg=notes()
const isEmail=validator.isEmail('ranjani@gmail.com')
console.log(msg)
console.log(isEmail)
console.log(color.green.inverse('sucess'))
console.log(color.red('Error'))*/
const notes=require('./notes.js');
console.log(notes.getnotes()+' '+notes.mynotes());