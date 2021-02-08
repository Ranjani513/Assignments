import { Component, OnInit } from '@angular/core';
import {FormControl,FormGroup, Validators} from '@angular/forms';
@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {
// studentForm:FormGroup;
  constructor() { }
  studentForm =new FormGroup({
    email :new FormControl('',[Validators.required,Validators.email]),
    fullname:new FormControl(''),
    password:new FormControl('',[Validators.minLength(3),Validators.maxLength(10)])
  })
  ngOnInit(): void {
    
  }
  /*onSubmit(form:FormGroup)
  {
    console.log(form.value);
    alert("submitted Successfully!!!!!!!!");
  }*/
  onSubmit()
  {
    console.warn(this.studentForm.value);
   
    //alert("submitted Successfully!!!!!!!!");
  }
  get email()
  {
    return this.studentForm.get('email');
  }
  get password()
  {
    return this.studentForm.get('password')
  }

}
