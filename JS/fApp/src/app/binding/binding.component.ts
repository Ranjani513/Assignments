import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {
  user='Ranjani';
  title = 'Hello Ranjani';
  buttondisable=true;
  concept="This is a two way binding";

  constructor() { }

  ngOnInit(): void {
  }
  change()
  {
    alert("Event binding works");
  }
}
