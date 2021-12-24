//@MyAnnotation


import java.lang.reflect.Method;

class Hello{

    @MyAnnotation(count = 10)
    public void sayHello(){
          System.out.println("hello");
    }
}
public class MyAnnotationExample {
    public static void main(String args[]){
        Hello h = new Hello();

        Method[] method = h.getClass().getMethods();


        MyAnnotation myAnnotation = method[0].getAnnotation(MyAnnotation.class);
        System.out.println(myAnnotation.count());

    }
}
