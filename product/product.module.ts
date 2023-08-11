import { NgModule } from "@angular/core";
import { ProductListComponent } from "./product-list.component";
import { CommonModule } from "@angular/common";
import { HttpClientModule } from "@angular/common/http";
import { ProductService } from "./product.service";

@NgModule({
    declarations:[ProductListComponent],
    imports:[CommonModule,HttpClientModule],
    exports:[ProductListComponent],
    providers:[ProductService]
})
export class ProductModule
{

}