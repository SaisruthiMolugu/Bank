import { Component } from '@angular/core';
import { Employee  }  from './employee/employee';
   @Component({
  selector: 'app-component',
  /*template: '<emp-list2></emp-list2>',*/
     templateUrl:'./app.component.html',              
  styles : [' ']
})
export class AppComponent
{  
  childMessage :string = '';
  receiveMessage(message:string)
  {
       this.childMessage=message;
  }
  /*`<app-child-component pmessage ="hello child"    (childEvent) = "receiveMessage($event)">
                  </app-child-component><br/>
                  <h1> Message from child is {{childMessage}}</h1>`,
*/
               }

