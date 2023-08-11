import { Component, OnInit } from "@angular/core";
import {ProductService} from "./product.service";
@Component({
    selector:'product-list',
    templateUrl:'product-list.component.html',
    providers:[ProductService]
})
export class ProductListComponent implements OnInit
{
    productList:any=[];
    List:any;
    productid:any;
    constructor(private productService:ProductService){}
    ngOnInit(): void {
        this.productService.getAllProductDetails().subscribe((data) =>this.productList=data);
    }
    getproductbyid(productid:any)
    {
        this.productService.getProductById(productid).subscribe((data) =>this.List=data);
        console.log(productid);
    }
   
}