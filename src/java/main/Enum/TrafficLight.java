package main.Enum;

/**
 * Created by Administrator on 2016/11/25.
 */
import org.junit.Before;
import org.junit.Test;

import static main.Enum.Single.*;

public class TrafficLight {
    Single color = Single.GREEN;
    private TrafficLight trafficLight;

    public void change() {
        switch (color) {
            case RED:
                color = Single.GREEN;
                break;
            case GREEN:
                color = YELLOW;
                break;
            case YELLOW:
                color = RED;
                break;
        }
    }

    @Override
    public String toString() {
        return "TrafficLight{" +
                "color=" + color +
                '}';
    }

    @Before
    public void testBefor() {
        trafficLight = new TrafficLight();
    }

    @Test
    public void test() {
        for (int i = 0; i < 7; i++) {
            System.out.println(trafficLight);
            trafficLight.change();
        }
    }
}
