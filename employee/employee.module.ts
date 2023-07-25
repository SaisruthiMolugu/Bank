import {NgModule} from '@angular/core';
import { EmployeeListComponent } from './employee-list.component';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { EmployeeService } from './employee.service';

@NgModule({
    declarations:[ EmployeeListComponent],
    imports:[FormsModule,CommonModule],
    exports:[ EmployeeListComponent],
    providers:[EmployeeService]
})
export class EmployeeModule
{

}
