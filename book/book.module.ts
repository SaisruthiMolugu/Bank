import {NgModule} from '@angular/core';
import { BookListComponent } from './book-list.component';
import { CommonModule } from '@angular/common';
import { BookImageComponent } from './book-image.component';
import { RouterModule } from '@angular/router';
@NgModule({
    declarations:[BookListComponent,BookImageComponent],
    imports:[CommonModule,RouterModule],
    exports:[BookListComponent,BookImageComponent],
    providers:[]
 
})
export class BookModule
{

}