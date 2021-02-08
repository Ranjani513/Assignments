import { Component, OnInit } from '@angular/core';
import { EmployeeserviceService } from '../employeeservice.service';

@Component({
  selector: 'app-employeedetails',
  templateUrl: './employeedetails.component.html',
  styleUrls: ['./employeedetails.component.css']
})
export class EmployeedetailsComponent implements OnInit {
public employee:any[]=[];
  constructor(private _employeeserviceService:EmployeeserviceService) {

   }

  ngOnInit() {
    this.employee=this._employeeserviceService.getEmployees();
  }

}
