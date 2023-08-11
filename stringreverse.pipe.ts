import {Pipe,PipeTransform} from '@angular/core';
@Pipe({name:'reverse'})
export class StringReversePipe implements PipeTransform
{
    transform(str:string) :string
    {
          var rev: string=" ";
          for(var i=str.length;i>=0;i--)
          rev=rev+str.charAt(i);
          return rev

    }
}