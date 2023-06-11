package commandPattern;

public class CeilingFan {
    private String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void on() {
        System.out.println(getName() + " is on");
    }

    public void off() {
        System.out.println(getName() + " is off");
    }
}
