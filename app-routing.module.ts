import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeListComponent2 } from './employee/employee-list.component2';
import { BookListComponent } from './book/book-list.component';
import { TrainsListComponent } from './train/trains-list.componet';
import { ProductListComponent } from './product/product-list.component';
import { BookImageComponent } from './book/book-image.component';
import { EmployeeRouteService } from './employee/emloyee-route.service';
import { LoginComponent } from './login.component';

const routes: Routes = [
  {component:LoginComponent,path:'log-in'},
  {component:EmployeeListComponent2,path:'employeelist',canActivate :[EmployeeRouteService]},
  {component:BookListComponent,path:'booklist',children:[
    {component:BookImageComponent,path:'bookimage/:bookName'}]},
  {component:TrainsListComponent,path:'trainlist'},
  {component:ProductListComponent,path:'productlist'}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
