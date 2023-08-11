import { Component, OnInit } from "@angular/core";
import{Router,ActivatedRoute} from '@angular/router';
@Component({
    selector:'book-list',
    templateUrl:'./book-list.component.html'

})
export class BookListComponent 
{
    constructor(private router:Router,private activaeRoute:ActivatedRoute){}
    books=[{"bookTitle":"JavaCompleteReference","author":"Herbert","publisher":"McGraw","price":900},
           {"bookTitle":"HowtoCpp","author":"Ditel","publisher":"pearson","price":700},
           {"bookTitle":"LetUsC","author":"Kanetkar","publisher":"BPB","price":1000},
           {"bookTitle":"SherlokHomes","author":"James","publisher":"ABC","price":1200}, ]
    goToRoute(bookTitle:string)
    {
        this.router.navigate(['bookimage',bookTitle],{relativeTo:this.activaeRoute});
    }
        }