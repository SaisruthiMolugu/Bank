interface GenDemo<T>
{
    void addFirst(T element);
   void append(T element);
    void searchelement(T element);
}
class Stack<T>implements GenDemo<T>
{
     T[] a;
    private int index=-1;
    public Stack(T[] a)
    {
        this.a =a;
    }
      public void addFirst(T element)
      {
          a[0]=element;
          index++;
      }
      public void append(T element)
      {
          for(int i=0;i<=a.length-1;i++)
          {
              if(a[i]==null)
              {
                  a[i]=element;
                   break;
              }
         
          }
          index++;
      }
      public void searchelement(T element)
      {
          for(int i=0;i<=index;i++)
          {
              if(a[i]==element)
              {
                  System.out.println("elementt found");
            break;
              }
          }
      }
      public void display()
      {
          for(int i=0;i<=index;i++)
              System.out.println(a[i]);
      }
}
class StringStack implements GenDemo<String>
{
    private String[] arr;
    private int index=-1;
    public StringStack(String[] arr)
    {
    	this.arr =arr;
    }
      public void addFirst(String element)
      {
    	  
          arr[0]=element;
          index++;
      }
      public void append(String element)
      {
          for(int i=0;i<arr.length-1;i++)
          {
              if(arr[i]==null)
                  arr[i]=element;
              break;
          }
          index++;
      }
      public void searchelement(String element)
      {
          for(int i=0;i<=index;i++)
          {
              if(arr[i]==element)
                  System.out.println("elementt found");
             break;
          }
      }
      public void display()
      {
          for(int i=0;i<=index-1;i++)
              System.out.println(arr[i]);
      }
      public void move()
      {
    	  
      }
}
class Gen {
    public static void main(String[] args) {
  Stack<Integer> s = new Stack<Integer>(new Integer[10]);
          s.addFirst(1);
          s.append(100);
          s.append(10);
          s.append(101);
          s.searchelement(10);
        s.display();
      StringStack ss = new StringStack(new String[10]);
      ss.addFirst("Hi");
      ss.append("Hello");
      ss.append("How");
      ss.append("are");
      ss.append("you");
      ss.searchelement("Sruthi");
    s.display();
    }

 

}

 