package com.Custom_Collection;
import java.util.Arrays;

public class Custom<E> {

   
   private int size = 0;
   private static final int DEFAULT_CAPACITY = 10;
   private Object elements[];

   public Custom() {
       elements = new Object[DEFAULT_CAPACITY];
   }

   //Add method
   public void add(E e) {
       if (size == elements.length) {
           ensureCapacity();
       }
       elements[size++] = e;
   }
    
   //Get method
   public E get(int i) {
       if (i >= size || i < 0) {
           throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
       }
       return (E) elements[i];
   }
    
   //Remove method
   public E remove(int i) {
       if (i >= size || i < 0) {
           throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
       }
       Object item = elements[i];
       int numElts = elements.length - ( i + 1 ) ;
       System.arraycopy( elements, i + 1, elements, i, numElts ) ;
       size--;
       return (E) item;
   }
    
   //Get Size of list
   public int size() {
       return size;
   }
    
   //Print methodv
   public String toString() 
   {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(int i = 0; i < size ;i++) {
            sb.append(elements[i]);
            if(i<size-1){
                sb.append(",");
            }
        }
        sb.append(']');
        return sb.toString();
   }
    
   private void ensureCapacity() {
       int newSize = elements.length * 2;
       elements = Arrays.copyOf(elements, newSize);
   }
}

	


