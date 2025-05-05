public class Main {
    public static void main(String[] args) {

        // Create different session types
        Student alice = new Student("Alice", 2026);
        Mentor bob = new Mentor("Bob", "IT");

        // Create a subject session
        Session mathSession = new SubjectSession(alice,bob,"2024.05.08","Static");

        // When we call toString() on this Session reference
        System.out.println(mathSession.toString());
    }
}