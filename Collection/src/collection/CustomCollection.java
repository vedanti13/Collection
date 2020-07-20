package collection;

import java.util.*;

  class MyClass {
    public static List myList(Object[] a) {
       return new ArrayList(a);
    }
  }
    class ArrayList extends AbstractList
               implements java.io.Serializable {
    
  private Object[] x;

  ArrayList(Object[] array) {
      x = array;
  }
  public Object get(int index) {
      return x[index];
  }
  public Object set(int index, Object element) {
      Object oldVal = x[index];
      x[index] = element;
      return oldVal;
  }
  public int size() {
      return x.length;
  }
    }
  public class CustomCollection{
   public static void main(String[] args) {
        try{
      String s[]={"Java","C","C++","Python","HTML","CSS","Kotlin","Android","JS","JSP"};
      Object o;
      int i=0;
      MyClass a= new MyClass();
      List lst=a.myList(s);
      System.out.println("The list is: "+lst);
      ArrayList al=new ArrayList(s);
      o=al.get(1);
      System.out.println("The retrieved element is: "+o);
      String s1="PHP";
      o=al.set(2,s1);
      System.out.println("The set element in place of Implementation is: "+s1);
      System.out.println("Now the new list is: "+lst);
      i=al.size();
      System.out.println("The size of the array list is: "+i);
      }
      catch(Exception e){}
    }
    }