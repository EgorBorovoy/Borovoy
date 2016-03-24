package Small;
public class Seance {
       int date;
       int peopleQty;
       String topic;

    public Seance() {
    }

    public Seance(int date, int peopleQty, String topic) {
        this.date = date;
        this.peopleQty = peopleQty;
        this.topic = topic;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getPeopleQty() {
        return peopleQty;
    }

    public void setPeopleQty(int peopleQty) {
        this.peopleQty = peopleQty;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "Seance{" + "date=" + date + ", peopleQty=" + peopleQty + ", topic=" + topic + '}';
    }
       

}
  