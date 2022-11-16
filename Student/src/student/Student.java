package student;

/**
 * A class of Student
 * @author Yi Wang
 */
public class Student {
    private static int nextId = 1;

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private Course course1;
    private Course course2;

    /**
     * Default constructor
     */
    public Student() {
        this.id = String.format("%04d", nextId++);
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.age = 0;
        this.course1 = new Course();
        this.course2 = new Course();
    }

    /**
     * Constructor with first name and last name
     * @param firstName the first name of a student
     * @param lastName the last name of a student
     */
    public Student(String firstName, String lastName) {
        this.id = String.format("%04d", nextId++);

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = "";
        this.age = 0;
        this.course1 = new Course();
        this.course2 = new Course();
    }

    /**
     * Constructor with all data members
     * @param id the id of the student
     * @param firstName the firstName of the student
     * @param lastName the lastName of the student
     * @param email the email of the student
     * @param age the age of the student
     * @param course1 the course1 of the student
     * @param course2 the course2 of the student
     */
    public Student(int id, String firstName, String lastName, String email,
                   int age, Course course1, Course course2) {
        this.id = String.format("%04d", nextId++);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.course1 = course1;
        this.course2 = course2;
    }

    /**
     * Copy constructor
     * @param anotherStudent the source student
     */
    public Student(Student anotherStudent) {
        this.id = String.format("%04d", nextId++);
        this.firstName = anotherStudent.firstName;
        this.lastName = anotherStudent.lastName;
        this.email = anotherStudent.email;
        this.age = anotherStudent.age;
        this.course1 = anotherStudent.course1;
        this.course2 = anotherStudent.course2;
    }

    /**
     * To extract the account of an email
     * @return the account of an email
     */
    public String extractEmailAccount() {
        String account = "";
        char c;

        for (int i = 0; i < email.length(); i++) {
            c = email.charAt(i);
            account += c;
            if (c == '@')
                break;
        }

        return account;
    }

    /**
     * To check if an email is valid or not
     * @return if an email is valid or not
     */
    public boolean isEmailValid() {
        int atIdx = -1;
        int dotIdx = -1;

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@')
                atIdx = i;
            if (email.charAt(i) == '.')
                dotIdx = i;
        }

        if (atIdx == -1 || dotIdx == -1)
            return false;
        if (atIdx > dotIdx)
            return false;

        return atIdx != 0 && dotIdx != email.length() - 1;
    }

    @Override
    public String toString() {
        String str = String.format("%-10s: %s %s\n", "Name", firstName, lastName);
        str += String.format("%-10s: %s\n", "ID", id);
        str += String.format("%-10s: %d\n", "Age", age);
        str += String.format("%-10s: %s\n", "Email", email);
        str += String.format("%-10s: %s [%d credits]\n",
                "Course 1", course1.getCourseName(), course1.getCredit());
        str += String.format("%-10s: %s [%d credits]",
                "Course 2", course2.getCourseName(), course2.getCredit());

        return str;
    }

    /**
     * To check if two students are the same or not
     * @param anotherStudent the other student you want to compare with
     * @return if two students are the same or not
     */
    public boolean equals(Student anotherStudent) {
        return id.equals(anotherStudent.id) &&
                firstName.equals(anotherStudent.firstName) &&
                lastName.equals(anotherStudent.lastName) &&
                email.equals(anotherStudent.email) &&
                age == anotherStudent.age &&
                course1.equals(anotherStudent.course1) &&
                course2.equals(anotherStudent.course2);
    }

    /**
     * getter
     * @return the id that will be given to next student
     */
    public static int getNextId() {
        return nextId;
    }

    /**
     * getter
     * @return  the id of the student
     */
    public String getId() {
        return id;
    }

    /**
     * getter
     * @return the first name of the student
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * getter
     * @return the last name of the student
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * getter
     * @return the email of the student
     */
    public String getEmail() {
        return email;
    }

    /**
     * getter
     * @return the age of the student
     */
    public int getAge() {
        return age;
    }

    /**
     * getter
     * @return the first course of the student
     */
    public Course getCourse1() {
        return course1;
    }

    /**
     * getter
     * @return the second course of the student
     */
    public Course getCourse2() {
        return course2;
    }

    /**
     * setter
     * @param nextId
     */
    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }

    /**
     * setter
     * @param id the new id of the student
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * setter
     * @param firstName the new first name of the student
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * setter
     * @param lastName the new last name of the student
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * setter
     * @param email the new email of the student
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * setter
     * @param age the new age of the student
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * setter
     * @param course1 the new first course of the student
     */
    public void setCourse1(Course course1) {
        this.course1 = course1;
    }

    /**
     * setter
     * @param course2 the new second course of the student
     */
    public void setCourse2(Course course2) {
        this.course2 = course2;
    }

}
