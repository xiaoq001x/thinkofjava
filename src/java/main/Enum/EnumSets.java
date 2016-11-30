package main.Enum;

import java.util.EnumSet;

import static main.Enum.AlarmPoint.*;

/**
 * Created by Bashark on 2016/11/29.
 */
public class EnumSets {
    public static void main(String[] args) {
        EnumSet<AlarmPoint> points = EnumSet.noneOf(AlarmPoint.class);
        System.out.println("新建" + points);
        points.addAll(EnumSet.of(START1, START2, KITCHEN));
        System.out.println("加入元素" + points);
        points = EnumSet.allOf(AlarmPoint.class);
        points.removeAll(EnumSet.of(START1, START2, KITCHEN));
        System.out.println("移除部分元素" + points);
        points.removeAll(EnumSet.range(OFFICE1, OFFICE4));
        System.out.println("移除部分元素" + points);
        points = EnumSet.complementOf(points);
        System.out.println("加入全部元素" +points);
    }
}
