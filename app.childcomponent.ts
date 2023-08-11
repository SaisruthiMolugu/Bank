
import {Component,Input ,Output ,EventEmitter} from "@angular/core";
@Component({
    selector:'app-child-component',
    template: `<h1>Message from parent is  {{pmessage}}</h1>
               <input type ="button" value ="send message" (click)="sendMessage()">`,
    styles : [' ']
})
export class AppChildComponent
{
    //indicates the following proprty gets from ints parent component
    @Input()
    pmessage:string ='';

    @Output()
    childEvent = new EventEmitter<string>();
    sendMessage()
    {
        this.childEvent.emit("Hello parent");
    }

}