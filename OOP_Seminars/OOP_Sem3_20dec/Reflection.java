package OOP_Seminars.OOP_Sem3_20dec;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Reflection {
    public static void main(String[] args) {

        Class c = String.class;
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            if ((field.getModifiers() & Modifier.PRIVATE) > 0) {

                System.out.println(field);
            }
        }

        Class[] interfaces = Student.class.getInterfaces();
        for (Class _interface : interfaces) {
            System.out.println("-----------");
            System.out.println(_interface.getName());
            System.out.println("-----------");
        }
        
        // Integer 
        // List<Integer>
        // ArrayList<String> 
        

    }
}

interface Marker {

}

class Student implements Marker {

}