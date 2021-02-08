import {Pipe,PipeTransform } from '@angular/core';
@Pipe ({  
  name : 'sqrt'  
})  


export class CustompipeComponent implements PipeTransform {
 transform(val:number):number{
   return Math.sqrt(val);
 }
  constructor() { }

 

}
