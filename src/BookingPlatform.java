import java.util.*;

public class BookingPlatform {

    // Collections to store all our data
    private static final List<Student> students = new ArrayList<>();
    private static final List<Mentor> mentors = new ArrayList<>();
    private static final List<Session> sessions = new ArrayList<>();
    private static final Map<Integer, User> userMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Peer Tutor Booking Platform ===");
            System.out.println("1. Register new Student");
            System.out.println("2. Register new Mentor");
            System.out.println("3. List all Students");
            System.out.println("4. List all Mentors");
            System.out.println("5. Book a Session");
            System.out.println("6. List all Sessions");
            System.out.println("7. Cancel a Session");
            System.out.println("8. Exit");
            System.out.print("Enter an option (1-8): ");

            String input = sc.nextLine();

            if (input.equals("1")) {
                // Register Student
                System.out.print("Enter student's name: ");
                String name = sc.nextLine();
                System.out.print("Enter student's graduation year: ");
                int graduationYear = sc.nextInt();

                Student student = new Student(name, graduationYear);
                students.add(student);
                userMap.put(student.getId(), student);
                System.out.println("Student registered with ID: " + student.getId());

            } else if (input.equals("2")) {
                // Register Mentor
                System.out.print("Enter mentor's name: ");
                String name = sc.nextLine();
                System.out.print("Enter mentor's department: ");
                String department = sc.nextLine();

                Mentor mentor = new Mentor(name, department);
                mentors.add(mentor);
                userMap.put(mentor.getId(), mentor);
                System.out.println("Mentor registered with ID: " + mentor.getId());

            } else if (input.equals("3")) {
                // List Students
                if (students.isEmpty()) {
                    System.out.println("No students registered.");
                } else {
                    System.out.println("Registered Students:");
                    for (Student s : students) {
                        System.out.println(" - " + s);
                    }
                }

            } else if (input.equals("4")) {
                // List Mentors
                if (mentors.isEmpty()) {
                    System.out.println("No mentors registered.");
                } else {
                    System.out.println("Registered Mentors:");
                    for (Mentor m : mentors) {
                        System.out.println(" - " + m);
                    }
                }

            } else if (input.equals("5")) {
                // Book a Session
                System.out.print("Enter Student ID: ");
                int studentId = Integer.parseInt(sc.nextLine());
                System.out.print("Enter Mentor ID: ");
                int mentorId = Integer.parseInt(sc.nextLine());

                if (!userMap.containsKey(studentId) || !(userMap.get(studentId) instanceof Student)) {
                    System.out.println("Invalid Student ID.");
                    continue;
                }

                if (!userMap.containsKey(mentorId) || !(userMap.get(mentorId) instanceof Mentor)) {
                    System.out.println("Invalid Mentor ID.");
                    continue;
                }

                Student student = (Student) userMap.get(studentId);
                Mentor mentor = (Mentor) userMap.get(mentorId);

                System.out.println("Select session type:");
                System.out.println("1. Subject 1-to-1");
                System.out.println("2. Career Coaching");
                String sessionChoice = sc.nextLine();

                Session session = null;

                if (sessionChoice.equals("1")) {
                    System.out.print("Enter subject name: ");
                    String subject = sc.nextLine();
                    session = new SubjectSession(student, mentor, subject);

                } else if (sessionChoice.equals("2")) {
                    System.out.print("Enter coaching topic: ");
                    String topic = sc.nextLine();
                    session = new CareerSession(student, mentor, topic);

                } else {
                    System.out.println("Invalid session type.");
                    continue;
                }

                sessions.add(session);
                student.notify("Session ID " + session.getSessionId() + " booked.");
                mentor.notify("New session with Student " + student.getName() + " (Session ID " + session.getSessionId() + ").");
                System.out.println("Session booked successfully.");
                System.out.println(session);

            } else if (input.equals("6")) {
                // List Sessions
                if (sessions.isEmpty()) {
                    System.out.println("No sessions have been booked yet.");
                } else {
                    System.out.println("Scheduled Sessions:");
                    for (Session sess : sessions) {
                        System.out.println(" - " + sess);
                    }
                }

            } else if (input.equals("7")) {
                // Cancel Session
                System.out.print("Enter Session ID to cancel: ");
                int sessionId = Integer.parseInt(sc.nextLine());

                Session sessionToCancel = null;
                for (Session sess : sessions) {
                    if (sess.getSessionId() == sessionId) {
                        sessionToCancel = sess;
                        break;
                    }
                }

                if (sessionToCancel == null) {
                    System.out.println("No session found with ID: " + sessionId);
                    continue;
                }

                sessions.remove(sessionToCancel);
                sessionToCancel.getStudent().notify("Your session (ID " + sessionId + ") has been cancelled.");
                sessionToCancel.getMentor().notify("Session (ID " + sessionId + ") with student " +
                        sessionToCancel.getStudent().getName() + " has been cancelled.");
                System.out.println("Session " + sessionId + " cancelled successfully.");

            } else if (input.equals("8")) {
                System.out.println("Exiting... Goodbye!");
                running = false;

            } else {
                System.out.println("Invalid option. Please enter a number from 1 to 8.");
            }
        }

        sc.close();
    }

}