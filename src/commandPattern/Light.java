package commandPattern;

public class Light {
    private String name;

    public Light(String name) {
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
