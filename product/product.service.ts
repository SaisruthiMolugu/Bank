import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
@Injectable()
export class ProductService
{
    constructor(private httpClient:HttpClient){}
    public getAllProductDetails() :Observable<any>
    {
        return this.httpClient.get('http://localhost:8090/product/');
    }
    public getProductById(productid:any) :Observable<any>
     {
        return this.httpClient.get('http://localhost:8090/product/'+productid);
     }
}