/**
 * 
 */
package com.nnu.generic;

/**
 * @author ZoroXing
 *
 */
public class TestGeneric<T> {

    
    public void hello(T a){
        System.out.println("Hello hello() "+a);
    }
    
//    静态方法中不能引用泛型类中的参数，可以通过定义静态泛型方法解决
//    public static void helloStatic(T a){
//        System.out.println("Hello world "+a);
//    }
    
//    静态泛型方法
      public static <A> void helloStaticGeneric(A a){
          System.out.println("Hello helloStaticGeneric() "+a);
      }
      
//    普通泛型方法
      public <B> void helloCommonGeneric(B b){
          System.out.println("Hello helloCommonGeneric() "+b);
      }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TestGeneric<String> tg = new TestGeneric<String>();
        tg.hello("nnajing");
        TestGeneric.helloStaticGeneric("ddddd");
        tg.helloCommonGeneric("bbbbb");
    }

}
