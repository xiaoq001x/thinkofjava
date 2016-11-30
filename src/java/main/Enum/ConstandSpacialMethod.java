package main.Enum;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Bashark on 2016/11/29.
 */
public enum ConstandSpacialMethod {
    DATA_TIME {
        String getInfo() {
            return DateFormat.getDateTimeInstance().format(new Date());
        }
    },
    CLASS_PATH {
        String getInfo() {
            return System.getenv("CLASSPATH");
        }
    },
    VERSION {
        String getInfo() {
            return System.getProperty("java.version");
        }
    };

    abstract String getInfo();

    public static void main(String[] args) {
        for (ConstandSpacialMethod csm : values()) {
            System.out.println(csm.getInfo());
        }
    }

}
