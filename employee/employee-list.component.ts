import { Component } from "@angular/core";
import { Employee } from "./employee";
import { empData } from "./Employee-data";
import { EmployeeService } from "./employee.service";
@Component({
    selector:'emp-list',
    templateUrl : './employee-list.component.html'

})
export class EmployeeListComponent
{
  empList:Employee[];
  public constructor(private employeeService:EmployeeService)
  {
           this.empList=this.employeeService.getllEmployees();
  }
    
    public deleteEmployeeRow(index:number)
    {
      this.empList.splice(index,1);
    }
}  