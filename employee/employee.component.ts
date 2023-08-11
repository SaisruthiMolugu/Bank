import { Component, Input ,Output,EventEmitter, OnInit, OnDestroy} from "@angular/core";
import { Employee } from "./employee";
@Component({
    selector:'emp-component',
    template :`<table border ="1" width ="50%">
                <tr>
                     <td>Employee Id</td>
                     <td>{{eobj.empid}}</td>
                </tr>
                <tr>
                     <td>Employee name</td>
                     <td>{{eobj.ename}}</td>
                </tr>
                <tr>
                     <td>Employee salary</td>
                     <td>{{eobj.salary}}</td>
                </tr>
                <tr>
                     <td>Department No</td>
                     <td>{{eobj.deptno}}</td>
            
               </tr>
               <tr>
                     <td>Action</td>
                     <td><input type ="button" value ="Delete" (click)="delete(eobj.empid)"></td>
            
               </tr>
               </table>`
})
export class EmployeeComponent implements OnInit,OnDestroy
{
    @Input()
    eobj:any;

    @Output()
    deleteEvent :EventEmitter<number>= new EventEmitter<number>();

    delete(empid:number)
    {
     this.deleteEvent.emit(empid)
    }
   ngOnInit()
    {
        console.log('Employee Component is intialized');
        
     }
     ngOnDestroy()
     {
          console.log('Employee componnet is removed');
     }


}