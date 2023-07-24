class List1<T>
{
     private T [] a;
       private int index=-1;
       private T value;
       public List1( T[] a)  {this.a =a;}
       public void addAtBeg(T element)
       {
                
                a[0] = element;   
              
                index++;
       }
       public void append(T element)
       {
           for(int i=0;i<a.length-1;i++)
              if(a[i]==null)
               {
                   a[i]=element;
                   break;
               }
           index++;
       }  
       public  void insertAtposition(int position,T element)
       {
           for(int i=a.length-2;i>=position-1;i--)
                 a[i+1]=a[i];
               a[position-1]= element;
               index++;
       }
       public void deleteatend()
       {
           for(int i=0;i<=index-1;i++)

               value =a[index];
           index--;
       }
       public void deleteatbegining()
       {
            for(int i=0;i<=index-1;i++)
                a[i]=a[i+1];
            index--;
       }
       public void delete(T element)
       {
    	   int j=0,found=0;
           for(int i=0;i<index-1;i++)
           {
               if(a[i]==element) 
            	 found =1;
                 j =i;
                 break;
           }
           if(found==1)
           {
        	   for(int i=j;i<index-1;i++)
        	   {
        		   a[i]=a[i+1];
        	   }
        	  
           }
           index--;
       }
       public void display()
       {
           for(int i=0;i<index-1;i++)
               System.out.println(a[i]);
       }
}
      class  List
       {
           public static void main(String[] args)
           {
              List1<Integer>s = new List1<Integer>(new Integer[10]);
              s.addAtBeg(20);
              s.append(8);        
            s.append(15);
            s.append(33);
            s.append(44);
              s.insertAtposition(2,34);
             s.addAtBeg(2);
           s.deleteatend();
              s.deleteatbegining();
            // s.addAtBeg(220);
            // s.delete(33);
              s.delete(15);
              s.display();


}
}