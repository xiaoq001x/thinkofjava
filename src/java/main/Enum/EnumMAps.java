package main.Enum;

import java.util.EnumMap;
import java.util.Map;

import static main.Enum.AlarmPoint.*;

/**
 * Created by Bashark on 2016/11/29.
 */
interface Command {
    void action();
}

public class EnumMaps {
    public static void main(String[] args) {
        EnumMap<AlarmPoint, Command> em = new EnumMap<AlarmPoint, Command>(AlarmPoint.class);
        em.put(KITCHEN, new Command() {
            @Override
            public void action() {
                System.out.println("Kitchen alerm");
            }
        });
        em.put(BATHROOM, new Command() {
            @Override
            public void action() {
                System.out.println("BathRoom alerm");
            }
        });
        for (Map.Entry<AlarmPoint, Command> e : em.entrySet()) {
            System.out.println(e.getKey() + ":");
            e.getValue().action();
        }
    }
}
