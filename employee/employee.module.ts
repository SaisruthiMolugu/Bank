import { NgModule } from "@angular/core";
import { EmployeeListComponent } from "./employee-list.component";
import { FormsModule } from "@angular/forms";

import { CommonModule } from "@angular/common";

import { EmployeeService } from "./employee.service";



import { EmployeeListComponent2 } from "./employee-list.component2";
import { EmployeeComponent } from "./employee.component";
import { EmployeeCrudComponent } from "./employee-crud.componenet";
import { EmployeeRouteService } from "./emloyee-route.service";


@NgModule({
    declarations:[EmployeeListComponent,EmployeeListComponent2,EmployeeComponent,EmployeeCrudComponent],
    imports:[FormsModule, CommonModule],
    exports:[EmployeeListComponent,EmployeeListComponent2],
    providers:[EmployeeService,EmployeeRouteService]

})

export class EmployeeModule

{




}