package Singleton;

public enum SingletonENUM {
    INSTANCE;

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
