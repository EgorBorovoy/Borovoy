package Small;
public class Seance extends Conference{
       String date;
       String topic;
       int peopleQty;

    public Seance() {
    }

    public Seance(String date, String topic, int coll) {
        this.date = date;
        this.topic = topic;
        this.peopleQty = coll;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getColl() {
        return peopleQty;
    }

    public void setColl(int coll) {
        this.peopleQty = coll;
    }

    @Override
    public String toString() {
        return "Seance{" + "date=" + date + ", topic=" + topic + ", coll=" + peopleQty + '}';
    }

}


  