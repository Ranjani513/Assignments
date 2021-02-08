import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmployeeserviceService {

  constructor() { }
  getEmployees()
  {
    return[
      {"id":1 ,"name":"ranjani","age":21},
      {"id":2 ,"name":"manasa","age":24},
      {"id":3 ,"name":"mamatha","age":28},
      {"id":4 ,"name":"ramya","age":22}
    ];
  }
}
