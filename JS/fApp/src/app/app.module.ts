import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule,routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { TestComponent } from './test/test.component';
import { FormsModule } from '@angular/forms';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { Child1Component } from './child1/child1.component';
import { EncapsulationComponent } from './encapsulation/encapsulation.component';
import { PipesComponent } from './pipes/pipes.component';
import { CustompipeComponent } from './custompipe/custompipe.component';
import { RegisterComponent } from './register/register.component';
import { EmployeedetailsComponent } from './employeedetails/employeedetails.component';
import { EmployeeserviceService } from './employeeservice.service';
import {ReactiveFormsModule} from '@angular/forms';
import { AboutComponent } from './about/about.component';
import { DirectivesComponent } from './directives/directives.component';
import { BindingComponent } from './binding/binding.component';
import { RxjsComponent } from './rxjs/rxjs.component';




@NgModule({
  declarations: [
    AppComponent,
    TestComponent,
    ParentComponent,
    ChildComponent,
    Child1Component,
    EncapsulationComponent,
    PipesComponent,
    CustompipeComponent,
    routingComponents,
    EmployeedetailsComponent,
   AboutComponent,
   DirectivesComponent,
   BindingComponent,

   RegisterComponent,

   RxjsComponent,
  
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  
  providers: [EmployeeserviceService],
  bootstrap: [AppComponent]
 
    
})
export class AppModule { 
  
}
