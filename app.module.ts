import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule} from  '@angular/forms';

import { SquarePipe } from './square.pipe';
import { StringReversePipe } from './stringreverse.pipe';
import { AppChildComponent } from './app.childcomponent';
import { EmployeeModule } from './employee/employee.module';
import { AddColorDirective } from './addcolor.directive';
import { BookModule } from './book/book.module';
import { RouterLink } from '@angular/router';
import { TrainModule } from './train/train.module';
import { ProductModule } from './product/product.module';
import { LoginComponent } from './login.component';
import { LoginService } from './login.service';






@NgModule({
  declarations: [ AppComponent,SquarePipe,StringReversePipe,AppChildComponent,AddColorDirective,LoginComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
   FormsModule,
   EmployeeModule,
   BookModule,
   RouterLink,
   TrainModule,
   ProductModule,
   
   
  
   
  ],
  providers: [LoginService],
  bootstrap: [AppComponent]
})
export class AppModule { }
