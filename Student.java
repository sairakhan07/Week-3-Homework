import java.util.Scanner;

public class Student 
{
   int id;
   String name;
   Course studentCourse;

   Student(int id, String name) //constructor = special method called when class is created (same name); used to initialise attributes
   {//(int id, string name) = constructor parameters
      this.id = id;
      this.name = name;//object's variable = constructor parameter
   }

   public void printStudentValues()
   {
      System.out.println("Student ID: " + id);
      System.out.println("Student name: " + name); //calls id and name from main and displays them when called

      if (studentCourse != null) 
      {
            studentCourse.printCourseValues();
      } else       
      {
            System.out.println("Course: Not enrolled");
      }
   }

   public void enrol(Course newCourse) //method that allows an object of the class Course to be passed in
   {
      this.studentCourse = newCourse; 
   }
   
   public static void main(String[] args)
      {
            Student student1 = new Student(123456, "Anna");//assigns name and id
            student1.printStudentValues();//calls printStudentValues to display name and id

            Course course1 = new Course("C021", "Biomedical Science");

            student1.enrol(course1);//links student with course
            student1.printStudentValues();//method now prints student and course
      }
}


class Course //not public because file name is "Student.java"; only student class public
{
      String courseCode;
      String courseName;

      public Course(String courseCode, String courseName) 
      {
        this.courseCode = courseCode;
        this.courseName = courseName;
      }

      public void printCourseValues()
   {
      System.out.println("Course code: " + courseCode);
      System.out.println("Course name: " + courseName); 
   }
}

