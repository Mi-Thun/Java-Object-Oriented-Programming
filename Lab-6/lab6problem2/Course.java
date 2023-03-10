package lab6problem2;

public class Course {
    private String courseID;
    private String courseTitle;
    private double credit;
    private Student[] studentList;
    private int numberOfStudent;
    private Faculty faculty;

    public Course() {
    }

    public Course(String courseID, String courseTitle, double credit) {
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public String toString() {
        return "Course{}";
    }

    void addStudent(Student newStudent) {

    }

    void dropStudent(Student studentId) {

    }

    void addFaculty(Faculty newFaculty) {

    }

    void dropFaculty() {

    }

    void printStudentList() {

    }

    void printFacultyList() {

    }

}
