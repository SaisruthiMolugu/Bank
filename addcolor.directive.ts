import { Directive, ElementRef, HostListener,HostBinding } from "@angular/core";
@Directive({
    selector : '[addColor]'
})
export class AddColorDirective
{
   /* constructor(private elementRef:ElementRef)
    {
        this.elementRef.nativeElement.style.backgroundColor ='pink';
    }*/
    @HostBinding('style.backgroundColor') bgColor:string="";
    @HostListener('mouseover')
    onMouseOver()
    {
          this.bgColor='pink';
    }
    @HostListener('mouseleave')
    OnMouseLeave()
    {
           this.bgColor ='violet';
    }

}