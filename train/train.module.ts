import { NgModule } from "@angular/core";
import { TrainService } from "./train.service";
import { TrainsListComponent } from "./trains-list.componet";
import { CommonModule } from "@angular/common";
import { HttpClientModule } from "@angular/common/http";

@NgModule({
    declarations:[TrainsListComponent],
    imports:[CommonModule,HttpClientModule],
    exports:[TrainsListComponent],
    providers:[TrainService]

})
export class TrainModule
{

}