import { Component ,ViewEncapsulation} from '@angular/core';

@Component({
  selector: 'app-root',
    templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
 // template:`<h1>welcome to nisum</h1><p>Hi</p>`,
 // styles:[`h1{color:red};`,`p{color:violet;}`],

})
export class AppComponent {
  user='Ranjani';
  title = 'Hello Ranjani';
  buttondisable=true;
  concept="This is a two way binding";
  change()
  {
    this.user=' Successfully completed the binding concept';
  }

}
