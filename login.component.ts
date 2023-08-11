import { Component, OnInit } from "@angular/core";
import { LoginService } from "./login.service";

@Component({
    selector : 'log-in',
    templateUrl : './login.component.html'

})

export class LoginComponent implements OnInit{
    
    constructor(private loginService:LoginService){}
    ngOnInit(): void 
    {
        
    }
    authenticate(username:string,password:string)
    {
        if(username=='Sruthi' && password == 'sruthi0211')
        this.loginService.login();
    }
}