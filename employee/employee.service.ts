import {empData} from './Employee-data';
import { Employee} from './employee';
export class EmployeeService
{
     public getllEmployees() :Employee[]
     {
        return empData;
     }
}