package Small;
public class Conference{
        String name;
        String place;

    public Conference() {
    }

    public Conference(String name, String place) {
        this.name = name;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Conference{" + "name=" + name + ", place=" + place + '}';
    }

        
}