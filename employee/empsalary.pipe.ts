import  {Pipe,PipeTransform} from '@angular/core';
import { empData } from './Employee-data';
import {Employee} from './employee';

@Pipe({name:"EmpSalary"})
export class EmpSalary implements PipeTransform
{ 
    transform(e:Employee[]):any
    {
      /* eempList:Employee[]=[];
       for(var i=0;i<this.empData.length;i++)           
      if(empData.salary >3000 && e.salary <5000)
       return ;
    }
    
   /* transform(e:any):any
    {
      if(e>3000 && e <5000)
       return e;
    }*/
  }
}