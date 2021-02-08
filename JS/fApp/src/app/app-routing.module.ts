import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { AboutComponent } from './about/about.component';
import {RegisterComponent} from './register/register.component';
import { EncapsulationComponent } from './encapsulation/encapsulation.component';
import { ParentComponent } from './parent/parent.component';
import { DirectivesComponent } from './directives/directives.component';
import { PipesComponent } from './pipes/pipes.component';
import { EmployeedetailsComponent } from './employeedetails/employeedetails.component';
import { BindingComponent } from './binding/binding.component';
import { RxjsComponent } from './rxjs/rxjs.component';



const routes: Routes = [
  {
 path:'login',component:LoginComponent
  },
  {
    path:'about',component:AboutComponent
     },
     {
      path:'register',component:RegisterComponent
       },
       {
        path:'encapsulation',component:EncapsulationComponent
         },
         {
          path:'parent',component:ParentComponent
           },
           {
            path:'directives',component:DirectivesComponent
             },
             {
              path:'pipes',component:PipesComponent
               },
               {
                path:'employeedetails',component:EmployeedetailsComponent
                 },
                 {
                  path:'binding',component:BindingComponent
                 },
                 {
                  path:'rxjs',component:RxjsComponent
                 }

                
                 

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents =[LoginComponent,AboutComponent,RegisterComponent,
  EncapsulationComponent,ParentComponent,DirectivesComponent,PipesComponent,EmployeedetailsComponent,BindingComponent,RxjsComponent]