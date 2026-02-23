WEEK 3 (Classes and Objects) 
1. Declare a Student class with attributes for ID (of data type int) and name (of type String). 2. Now define a constructor that will assign values that are passed in for ID and name, to the class fields of name and ID. 
3. Define a print method that will output the values for these ID and name attributes. 4. Now instantiate an object of the Student class (within main), and pass suitable values for student name (you could use your first name) and an ID number (could be your eight digit ID, or something similar) to the constructor. 
5. Test that these values have been passed and assigned correctly by calling the print method on your student object. 
6. Now create a Course class with attributes for the (course) code (of data type String), and name (of data type String). 
7. Furthermore, add a constructor that allows the course code and name to be passed in and assigned to the corresponding attributes, and also create a print method that prints out the values of the course attributes to screen. 
8. Add an additional attribute to your Student class - just like you created an attribute (with a data type and a variable identified) - create an object of the class Course. 
9. Now write a method with the name 'enrol' to your Student class. This method should allow an object of the class Course to be passed in, and this should subsequently be assigned to the Student class attribute of type Course (you created in the previous step). 
10. Now modify the print method of the Student class so that it prints out the details of the course the student is enrolled on. Hint: can you call a method through the course attribute? 
11. Test that you can instantiate the Course class (passing in values for the course you are enrolled on: the course name and code). Then call the 'enrol' method on the student object you created previously and pass in the object of course. 
12. Finally, test that the student object has enrolled on the course by calling the print method on the student object. This should display both the student details as well as the course details. 
