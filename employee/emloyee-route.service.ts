import { Injectable } from "@angular/core";
import { LoginService } from "../login.service";
import { ActivatedRouteSnapshot, ActivationStart, CanActivate, RouterStateSnapshot } from "@angular/router";
@Injectable(providedIn:'root')
export class EmployeeRouteService implements CanActivate
{
    constructor(private loginService:LoginService){}
    canActivate(route:ActivatedRouteSnapshot,state :RouterStateSnapshot): boolean
    {
      return this.loginService.getIsLoggedIn;
    }
}