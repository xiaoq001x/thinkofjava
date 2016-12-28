package main;


import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

interface IEntity {

}

class Entity implements IEntity {
    private String s1;

    private String s2;

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;

    }

    public Entity(String s1) {
        this.s1 = s1;

    }
}

public class Test {

    public static void reflect(Object e) throws Exception {
        Class cls = e.getClass();
        Method[] methods = cls.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            Method f = cls.getDeclaredMethod("getS1");
            f.setAccessible(true);
            System.out.println(f.invoke(e));
        }
    }

    public static void main(String[] args) throws Exception {
        Entity e = new Entity("ss");
        Entity e2 = new Entity("ss");
        Entity entity = (Entity) reflectObj(e, e2);
    }

    public static Object reflectObj(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException, java.beans.IntrospectionException {

        try {
            Class clazz = obj2.getClass();
            Field[] fields = obj.getClass().getDeclaredFields();//获得属性
            for (Field field : fields) {
                PropertyDescriptor pd = null;
                pd = new PropertyDescriptor(field.getName(),
                        clazz);
                Method getMethod = pd.getReadMethod();//获得get方法
                Method setMethod = pd.getWriteMethod();//获取set方法

                Object o1 = getMethod.invoke(obj);//执行get方法返回一个Object
                Object o2 = getMethod.invoke(obj2);//执行get方法返回一个Object

                if (o1 == null || o1.equals("") || o1.equals(o2)) {
                    System.out.println("o1 属性:" + field.getName() + "的" + getMethod.getName() + " 返回" + o1);
                    System.out.println("o2 属性:" + field.getName() + "的" + getMethod.getName() + " 返回" + o2);
                } else {
                    setMethod.invoke(obj2, o1);//如果o1有值就替换o2
                    System.out.println("o1 有值 属性:" + field.getName()
                            + " 值:" + o1 + " 替换 o2 " + field.getName() + "值:" + getMethod.invoke(obj2));
                }
            }
        } catch (SecurityException | IllegalArgumentException e) {
            e.printStackTrace();
        }
        return obj2;

    }
}