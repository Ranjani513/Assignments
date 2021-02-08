/*import { Component } from '@angular/core';
@Component({
  selector: 'app-parent',
  template: `
    Message: {{message}}
    <app-child (messageEvent)="receiveMessage($event)"></app-child>
  `,
  styleUrls: ['./parent.component.css']
})
export class ParentComponent {

  constructor() { }

  message:string='';

  receiveMessage($event:string) {
    this.message = $event
  }
}
*/import { Component, ViewChild, AfterViewInit } from '@angular/core';
import { ChildComponent } from "../child/child.component";

@Component({
  selector: 'app-parent',
  template: `
  <div style="border:3px outset blue;background-color:white;color:black;font-family:italic;font-size:30px;">
  <h3>Component Communication(view child)</h3>
  Message: {{ message }}
    <app-child></app-child>
    </div>
  `,
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements AfterViewInit {

  @ViewChild(ChildComponent) child:any;

  constructor() { }

  message:string;

  ngAfterViewInit() {
    this.message = this.child.message
  }
}

