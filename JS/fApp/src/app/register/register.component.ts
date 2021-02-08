import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() { }
  name='';
 email='';
 
onSubmit(data:any)
{
  
  console.log(data);
  alert("Successfully registered");
}
  ngOnInit(): void {
  }

}
