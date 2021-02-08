import { CompileTemplateMetadata } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import {Observable} from 'rxjs';
@Component({
  selector: 'app-rxjs',
  templateUrl: './rxjs.component.html',
  styleUrls: ['./rxjs.component.css']
})
export class RxjsComponent implements OnInit {
  constructor() { }
 const myobservable=new Observable(x=>{
  x.next("1");
  x.next("2");
  x.next("3");
  setTimeout(() => {
    x.next("4");
    x.next("5");
    x.complete();
  },3000);
})
  ngOnInit():void {
  this.myobservable.subscribe({
    next(x:any){
      console.log(x);
    },
    complete(){
   console.log("completed");
    }
  })
  }


}
