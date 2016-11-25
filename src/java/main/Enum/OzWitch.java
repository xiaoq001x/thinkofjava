package main.Enum;

/**
 * Created by Administrator on 2016/11/25.
 */
public enum OzWitch {
    WEST("a"), NORTH("b"), EAST("c"), SOUTH("d");
    private String description;

    private OzWitch(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        for (OzWitch witch : OzWitch.values()) {
            System.out.println(witch + ":" + witch.getDescription());
        }
    }
}
