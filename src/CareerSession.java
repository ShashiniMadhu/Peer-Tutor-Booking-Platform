public class CareerSession extends Session {
    public String topic;

    public CareerSession(Student student, Mentor mentor, String topic) {
        super(student, mentor);
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