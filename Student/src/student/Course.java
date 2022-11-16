package student;

/**
 * Class of Course
 * @author Yi Wang
 */
public class Course {
    private String courseName;
    private int credit;
    private boolean isComplimentaryCourse;

    /**
     * Default constructor
     */
    public Course() {
        this.courseName = "";
        this.credit = 0;
        this.isComplimentaryCourse = false;
    }

    /**
     * Constructor with course name
     * @param courseName course name
     */
    public Course(String courseName) {
        this.courseName = courseName;
        this.credit = 0;
        this.isComplimentaryCourse = false;
    }

    /**
     * Constructor with all data members
     * @param courseName the name of the course
     * @param credit the credif of the course
     * @param isComplimentaryCourse if the course is a complimentary or not
     */
    public Course(String courseName, int credit, boolean isComplimentaryCourse) {
        this.courseName = courseName;
        this.credit = credit;
        this.isComplimentaryCourse = isComplimentaryCourse;
    }

    /**
     * Copy constructor
     * @param anotherCourse the source Course
     */
    public Course(Course anotherCourse) {
        this.courseName = anotherCourse.courseName;
        this.credit = anotherCourse.credit;
        this.isComplimentaryCourse = anotherCourse.isComplimentaryCourse;
    }

    @Override
    public String toString() {
        String str = String.format("%-15s: %s\n", "Course Name", courseName);
        str += String.format("%-15s: %d\n", "Credit", credit);
        str += String.format("%-15s: %s", "Complimentary", isComplimentaryCourse ? "Yes" : "No");
        return str;
    }

    /**
     * To compare two courses if the two courses are the same or not
     * @param anotherCouerse the other course you want to compare with
     * @return if the two courses are the same or not
     */
    public boolean equals(Course anotherCouerse) {
        return courseName.equals(anotherCouerse.courseName) &&
                credit == anotherCouerse.credit &&
                isComplimentaryCourse == anotherCouerse.isComplimentaryCourse;
    }

    /**
     * getter
     * @return the name of the course
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * getter
     * @return the new credit of the course
     */
    public int getCredit() {
        return credit;
    }

    /**
     * getter
     * @return the complimentary status of the course
     */
    public boolean isIsComplimentaryCourse() {
        return isComplimentaryCourse;
    }

    /**
     * setter
     * @param courseName the new name of the course
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * setter
     * @param credit the new credit of the course
     */
    public void setCredit(int credit) {
        this.credit = credit;
    }

    /**
     * setter
     * @param isComplimentaryCourse the new complimentary status of the course
     */
    public void setIsComplimentaryCourse(boolean isComplimentaryCourse) {
        this.isComplimentaryCourse = isComplimentaryCourse;
    }
}
