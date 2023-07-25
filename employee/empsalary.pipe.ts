import  {Pipe,PipeTransform} from '@angular/core';
import { empData } from './Employee-data';
import {Employee} from './employee';
@Pipe({name:"empsalary"})
export class EmpSalary implements PipeTransform
{ 
    transform(emplist:Employee[])
    {
        var Dummy :emplist[];
         <div>  *ngIf = (EmpSalary>3000) && (EmpSalary < 5000) </div>
    }

}