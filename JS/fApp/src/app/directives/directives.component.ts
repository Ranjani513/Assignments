import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent implements OnInit {

  constructor() { }
 show:boolean=true;
 persons=["Ranjani","Nikhila","Sowmya"]
  ngOnInit(): void {
  }

}
