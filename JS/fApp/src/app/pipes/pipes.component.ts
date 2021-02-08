import { Component, OnInit } from '@angular/core';
import {CustompipeComponent} from "../custompipe/custompipe.component";
@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {
title='ranjani';
  constructor() { }

  ngOnInit(): void {
  }

}
