package main.Enum;

/**
 * Created by Administrator on 2016/11/25.
 */
public class EnumClass {
    public static void main(String[] args) {
        System.out.println(Shrubery.values()[1]);
        for (Shrubery s : Shrubery.values()) {
            System.out.println(s + ":" + s.ordinal());//枚举的顺序值
            System.out.println(s.compareTo(Shrubery.CRAWLING));//返回的是两个枚举值的顺序之差
            System.out.println(s.equals(Shrubery.CRAWLING));//是不是同一个枚举实例
            System.out.println(s == Shrubery.CRAWLING);//同上
            System.out.println(s.getDeclaringClass());
            System.out.println(s.name());
        }
    }
}
