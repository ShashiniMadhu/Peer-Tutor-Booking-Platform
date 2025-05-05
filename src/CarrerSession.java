public class CarrerSession extends Session{
    public String topic;

    public CarrerSession(Student student, Mentor mentor, String dateTime, String topic) {
        super(student, mentor, dateTime);
        this.topic = topic;
    }

    @Override
    public String getType() {
        return "Career Coaching";
    }
    @Override
    public String getDetails() {
        return "Topic: " + topic;
    }
}
