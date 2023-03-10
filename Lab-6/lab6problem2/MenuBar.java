package lab6problem2;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuBar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Course> courseList = new ArrayList<Course>();
        ArrayList<Student> studentList = new ArrayList<Student>();
        ArrayList<Faculty> facultyList = new ArrayList<Faculty>();
        while (true) {
            System.out.println("1. Add\n2. Delete\n3. Update\n4. Print\n5. Search");
            System.out.print("Enter a number between 1 to 5: ");
            int a = input.nextInt();

            if (a == 1) {
                System.out.println("1. Add a Student\n2. Add a Course\n3. Add a Faculty");
                System.out.print("Enter number between 1 to 3: ");
                int x = input.nextInt();

                if (x == 1) {
                    //Add Student
                    Student newStudent = new Student();
                    System.out.print("Enter student name:");
                    String studentName = input.next();
                    newStudent.setStudentName(studentName);
                    System.out.print("Enter student ID:");
                    int studentID = input.nextInt();
                    newStudent.setStudentID(studentID);
                    System.out.print("Enter student CGPA:");
                    double cgpa = input.nextDouble();
                    newStudent.setStudentCGPA(cgpa);
                    studentList.add(newStudent);
                } else if (x == 2) {
                    //Add Course
                    Course newCourse = new Course();
                    System.out.print("Enter course title:");
                    String title = input.next();
                    newCourse.setCourseTitle(title);
                    System.out.print("Enter course ID:");
                    String courseID = input.next();
                    newCourse.setCourseID(courseID);
                    System.out.print("Enter course credit:");
                    Double credit = input.nextDouble();
                    newCourse.setCredit(credit);
                    courseList.add(newCourse);

                } else if (x == 3) {
                    //Add Faculty
                    Faculty newFaculty = new Faculty();
                    System.out.print("Enter faculty name:");
                    String facultyName = input.next();
                    newFaculty.setFacultyName(facultyName);
                    System.out.print("Enter faculty position:");
                    String position = input.next();
                    newFaculty.setFacultyPosition(position);
                    System.out.print("Enter faculty ID:");
                    int facultyId = input.nextInt();
                    newFaculty.setFacultyId(facultyId);
                    facultyList.add(newFaculty);
                }
            } else if (a == 2) {
                System.out.println("1. Delete a Student\n2. Delete a Course\n3. Delete a Faculty");
                System.out.print("Enter number between 1 to 3: ");
                int x = input.nextInt();

                if (x == 1) {
                    //Delete Student
                    int ID = input.nextInt();
                    int c = 0;
                    for (int i = 0; i < studentList.size(); i++) {
                        if(studentList.get(i).getStudentID()== ID);
                        c = i;
                    }
                    studentList.remove(c);
                } else if (x == 2) {
                    //Delete Course
                    String course = input.nextLine();
                    int c = 0;
                    for (int i = 0; i < studentList.size(); i++) {
                        if(courseList.get(i).getCourseID().equals(course));
                        c = i;
                    }
                    courseList.remove(c);
                } else if (x == 3) {
                    //Delete Faculty
                    int facultyID = input.nextInt();
                    int c = 0;
                    for (int i = 0; i < studentList.size(); i++) {
                        if(studentList.get(i).getStudentID()== facultyID);
                        c = i;
                    }
                    facultyList.remove(c);
                }
            } else if (a == 3) {
                System.out.println("1. Update Student\n2. Update Course\n3. Update Faculty");
                System.out.print("Enter number between 1 to 3: ");
                int x = input.nextInt();

                if (x == 1) {
                    //Update Student
                    Student temp = new Student();
                    int id = input.nextInt();
                    int newId = input.nextInt();
                    String newName = input.next();
                    double newCgpa = input.nextDouble();
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getStudentID() == id) {
                            temp.setStudentName(newName);
                            temp.setStudentID(newId);
                            temp.setStudentCGPA(newCgpa);
                        }
                    }
                } else if (x == 2) {
                    //Update Course
                    Course tmp = new Course();
                    String id = input.next();
                    String nId = input.next();
                    String nTitle = input.next();
                    double nCredit = input.nextDouble();
                    for (int i = 0; i < courseList.size(); i++) {
                        if (courseList.get(i).getCourseID() == id) {
                            tmp.setCourseID(nId);
                            tmp.setCourseTitle(nTitle);
                            tmp.setCredit(nCredit);
                        }
                    }
                } else if (x == 3) {
                    //Update Faculty
                    Faculty tmp = new Faculty();
                    int id = input.nextInt();
                    int nId = input.nextInt();
                    String nFName = input.next();
                    String nPosition = input.next();
                    for (int i = 0; i < facultyList.size(); i++) {
                        if (facultyList.get(i).getFacultyId() == id) {
                            tmp.setFacultyId(nId);
                            tmp.setFacultyName(nFName);
                            tmp.setFacultyPosition(nPosition);
                        }
                    }
                }
            } else if (a == 4) {
                System.out.println("1. Print all Students\n2. Print all Courses\n3. Print all Faculties\n4. Print information of a student\n5. Print information of a course\n6. Print information of a faculty\n7. Print student list and faculty information of a course\n8. Print courses taken by a student");
                System.out.print("Enter number between 1 to 8: ");
                int x = input.nextInt();

                if (x == 1) {
                    //Print all students
                    for (int i = 0; i < studentList.size(); i++) {
                        System.out.println(studentList.get(i).getStudentName());
                    }
                } else if (x == 2) {
                    //Print all course
                    for (int i = 0; i < courseList.size(); i++) {
                        System.out.println(courseList.get(i).getCourseTitle());
                    }
                } else if (x == 3) {
                    //Print all faculty
                    for (int i = 0; i < facultyList.size(); i++) {
                        System.out.println(facultyList.get(i).getFacultyName());
                    }
                } else if (x == 4) {
                    //Print information of a student
                    System.out.print("Enter student id here: ");
                    int id = input.nextInt();
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getStudentID() == id) {
                            System.out.println("Student information result is given bellow...");
                            System.out.println("Name: " + studentList.get(i).getStudentName());
                            System.out.println("ID: " + studentList.get(i).getStudentID());
                            System.out.println("CGPA: " + studentList.get(i).getStudentCGPA());
                        }
                    }
                } else if (x == 5) {
                    //Print information of a course
                    String id = input.next();
                    for (int i = 0; i < courseList.size(); i++) {
                        if (courseList.get(i).getCourseID() == id) {
                            System.out.println(courseList.get(i).getCourseID());
                            System.out.println(courseList.get(i).getCourseTitle());
                            System.out.println(courseList.get(i).getCredit());
                        }
                    }
                } else if (x == 6) {
                    //Print information of a faculty
                    int id = input.nextInt();
                    for (int i = 0; i < facultyList.size(); i++) {
                        if (facultyList.get(i).getFacultyId() == id) {
                            System.out.println(facultyList.get(i).getFacultyId());
                            System.out.println(facultyList.get(i).getFacultyName());
                            System.out.println(facultyList.get(i).getFacultyPosition());
                        }
                    }
                } else if (x == 7) {
                    //Print student list and faculty information of a course
                    String id = input.next();
                    for (int i = 0; i < courseList.size(); i++) {
                        if (courseList.get(i).getCourseID() == id) {
                            System.out.println(courseList.get(i).getCourseTitle());
                            System.out.print("Faculty: ");
                            courseList.get(i).printFacultyList();
                            System.out.println("Students: ");
                            courseList.get(i).printStudentList();
                        }
                    }
                } else if (x == 8) {
                    //Print courses taken by a student
                }
            } else if (a == 5) {
                System.out.println("1. Search a Student\n2. Search a Course\n3. Search a Faculty\n4. Search whether a student takes a course\n5. Search whether a faculty teaches a course\n6. Search courses taken by a student\n7. Search courses taken by a faculty");
                System.out.print("Enter: ");
                int x = input.nextInt();

                if (x == 1) {
                    //Search a Student
                    int id = input.nextInt();
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getStudentID() == id) {
                            System.out.println(studentList.get(i).getStudentName());
                            System.out.println(studentList.get(i).getStudentID());
                            System.out.println(studentList.get(i).getStudentCGPA());
                        }
                    }
                } else if (x == 2) {
                    //Search a Course
                    String id = input.next();
                    for (int i = 0; i < courseList.size(); i++) {
                        if (courseList.get(i).getCourseID() == id) {
                            System.out.println(courseList.get(i).getCourseID());
                            System.out.println(courseList.get(i).getCourseTitle());
                            System.out.println(courseList.get(i).getCredit());
                        }
                    }
                } else if (x == 3) {
                    //Search a Faculty
                    int id = input.nextInt();
                    for (int i = 0; i < facultyList.size(); i++) {
                        if (facultyList.get(i).getFacultyId() == id) {
                            System.out.println(facultyList.get(i).getFacultyId());
                            System.out.println(facultyList.get(i).getFacultyName());
                            System.out.println(facultyList.get(i).getFacultyPosition());
                        }
                    }
                } else if (x == 4) {
                    //Search whether a student takes a course
                } else if (x == 5) {
                    //Search whether a faculty teaches a course
                } else if (x == 6) {
                    //Search courses taken by a student
                } else if (x == 7) {
                    //Search courses taught by a faculty
                }
            }
        }
    }
}
