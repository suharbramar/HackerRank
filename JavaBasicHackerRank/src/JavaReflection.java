import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class JavaReflection {

    public static void main(String args[]) throws ClassNotFoundException {
        Class student = Class.forName(args[0]);
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(int i = 0; i < methods.length; i++){
            methodList.add(methods[i].getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
}
