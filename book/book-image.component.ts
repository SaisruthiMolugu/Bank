import { Component, OnInit } from "@angular/core";
import { ActivatedRoute,ParamMap,RouterOutlet } from "@angular/router";
@Component({
    selector:'book-image',
    template:'<img [src] ="imageUrl">'
})
export class BookImageComponent implements OnInit
{
   imageUrl:any;

   constructor(private activatedRoute:ActivatedRoute){}

   ngOnInit(): void {
       this.imageUrl = this.activatedRoute.snapshot.paramMap.get('bookName');
       this.imageUrl="assets/"+this.imageUrl+".png";
   }
}