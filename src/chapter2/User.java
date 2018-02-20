package chapter2;

public class User {

    private String name;
    private int points;
    private boolean moderator;

    public User(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean isModerator() {
        return moderator;
    }

    public void setModerator(boolean moderator) {
        this.moderator = moderator;
    }

    public void turnModerator(){
        this.moderator = true;
    }

    @Override
    public String toString() {
        return "chapter2.User{" +
                "name='" + name + '\'' +
                ", points=" + points +
                ", moderator=" + moderator +
                '}';
    }
}
