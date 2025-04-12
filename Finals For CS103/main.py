# FINALS OUTPUT FOR COMPUTER PROGRAMMING 2 (CS103)
# NAME: RICO NATHANIEL D. TAN

# 1. Determine if School bus is also an instance of the Vehicle class.
print("\n\n1. Determine if School bus is also an instance of the Vehicle class.\n")

# Building classes Vehicle and SchoolBus.
class Vehicle:
    def __init__(self, make, model, year): #Constructor
        self.make = make
        self.model = model
        self.year = year

    def display_info(self): #Method to display vehicle information
        return f"{self.year} {self.make} {self.model}"
    
class SchoolBus(Vehicle):
    def __init__(self, make, model, year):
        super().__init__(make, model, year)
        
    def display_info(self): #Method to display school bus information
        # Overriding the display_info method to include "School Bus" in the output
        return f"{self.year} {self.make} {self.model} (School Bus)"
    
# Creating an instance of Vehicle and SchoolBus
print("Creating instances of Vehicle and SchoolBus...")
vehicle = Vehicle("Toyota", "Camry", 2022)
school_bus = SchoolBus("Ford", "Transit", 2023)

# Displaying vehicle and school bus information
print("Vehicle and School Bus Information:\n")
print(vehicle.display_info()) 
print(school_bus.display_info()) 

# Checking if SchoolBus is an instance of Vehicle
print("\nIs SchoolBus an instance of Vehicle?")
if isinstance(school_bus, Vehicle):
    print("Yes, SchoolBus is an instance of Vehicle.")

# END OF QUESTION 1
#2. Build a class Employee with multiple constructors that can initialize an employee object in different ways.
print("\n\n2. Build a class Employee with multiple constructors that can initialize an employee object in different ways.\n")

# Building the Employee class with multiple constructors.
class Employee:
    def __init__(self, name, age=None, position=None): #Constructor
        self.name = name
        self.age = age
        self.position = position

    def display_info(self): #Method to display employee information
        info = f"Name: {self.name}"
        if self.age:
            info += f", Age: {self.age}"
        if self.position:
            info += f", Position: {self.position}"
        return info
    
    def __init__(self, name, age, position): #Constructor with complete parameters
        self.name = name
        self.age = age
        self.position = position
       
    @classmethod 
    def from_name_and_position(cls, name, position): #Constructor with name and position
        return cls(name, None, position) #Using the class method to create an instance with name and position only
    
    @classmethod        
    def from_name_and_age(cls, name, age): #Constructor with name and age
        return cls(name, age, None)
        
    @classmethod
    def from_name(cls, name): #Constructor with only name
        return cls(name, None, None)
    
# Creating an array of Employee objects with different constructors
employees = [
    Employee("Adele Naumann", 26, "Lead Researcher"),
    Employee.from_name_and_position("Ada Church", "Engineering Department Head"),
    Employee.from_name_and_age("Maria Nearl", 25),
    Employee.from_name("Angelina Ajimu")
]

# Displaying employee information
print("Employee Information:")
for employee in employees:
    print("\nEmployee number " + str(employees.index(employee) + 1) + ":")
    print(employee.display_info())

# END OF QUESTION 2
#3. Build a two class call SchoolOne and SchoolTwo that display there list of students average grades and GPA.
print("\n\n3. Build two classes called SchoolOne and SchoolTwo that display their list of students average grades and GPA.\n")

# Building classes SchoolOne and SchoolTwo.
class SchoolOne: # Building the first class SchoolOne.
    class Student: # Nested class for Students, containing name and grades.
        def __init__(self, name, grades):
            self.name = name
            self.grades = grades

        @staticmethod # Static method to calculate average grades
        # This method is static because it does not depend on the instance of the class.
        def calculate_average(grades):
            return round(sum(grades) / len(grades), 2)

        def calculate_gpa(self):
            average = self.calculate_average(self.grades)
            thresholds = [ 
            (90, 4.0),
            (80, 3.0),
            (70, 2.0),
            (60, 1.0),
            (0,  0.0)
            ]
            for threshold, gpa in thresholds:
                if average >= threshold:
                    return gpa
            return 0.0

    def __init__(self): 
        self.students = []
        
    def display_grades(self):
        for student in self.students:
            print("===========================")
            print(f"Name: {student.name}")
            print(f"Grades: {student.grades}")
            print(f"Average: {student.calculate_average(student.grades)}")
            print(f"GPA: {student.calculate_gpa()}\n")
            

class SchoolTwo: # Building the second class SchoolTwo. Built identically to SchoolOne.
    class Student:
        def __init__(self, name, grades):
            self.name = name
            self.grades = grades

        @staticmethod
        def calculate_average(grades):
            return round(sum(grades) / len(grades), 2)

        def calculate_gpa(self):
            average = self.calculate_average(self.grades)
            thresholds = [
            (90, 4.0),
            (80, 3.0),
            (70, 2.0),
            (60, 1.0),
            (0,  0.0)
            ]
            for threshold, gpa in thresholds:
                if average >= threshold:
                    return gpa
            return 0.0

    def __init__(self):
        self.students = []

    def display_grades(self):
        for student in self.students:
            print("===========================")
            print(f"Name: {student.name}")
            print(f"Grades: {student.grades}")
            print(f"Average: {student.calculate_average(student.grades)}")
            print(f"GPA: {student.calculate_gpa()}\n")

# Creating instances of SchoolOne and SchoolTwo
school_one = SchoolOne()
school_two = SchoolTwo()

# Adding students to SchoolOne and SchoolTwo
school_one.students = [
    SchoolOne.Student("Adele Naumann", [98, 95, 96]),
    SchoolOne.Student("Anthony Simon", [83, 86, 88]),
    SchoolOne.Student("Enciodes Silverash", [90, 91, 94])
]

school_two.students = [
    SchoolTwo.Student("Maria Nearl", [79, 80, 85]),
    SchoolTwo.Student("Jane Willow", [88, 90, 92]),
    SchoolTwo.Student("Angelina Ajimu", [83, 89, 91])
]

# Displaying students' average grades and GPA for SchoolOne
print("School One Students' Grades and GPA:")
school_one.display_grades()

# Displaying students' average grades and GPA for SchoolTwo
print("School Two Students' Grades and GPA:")
school_two.display_grades()

# END OF QUESTION 3
#4. Operator Overloading Create a Vector class that supports addition using the + operator, allowing you to add two vectors.
print("\n\n4. Operator Overloading Create a Vector class that supports addition using the + operator, allowing you to add two vectors.\n")

# Building the Vector class.
class Vector:
    def __init__(self, x, y): #Constructor
        self.x = x
        self.y = y

    @staticmethod # Static method to add two vectors
    def add(v1, v2): #Method to add two vectors
        return Vector(v1.x + v2.x, v1.y + v2.y)

    def __str__(self): #String representation of the vector
        return f"Vector({self.x}, {self.y})"

# Creating instances of Vector
vector1 = Vector(2, 3)
vector2 = Vector(4, 5)

# Adding vectors using the + operator
result = Vector.add(vector1, vector2) #Using the static method to add the two vectors

# Displaying the result
print("Vector 1:", vector1)
print("Vector 2:", vector2)
print("Result:", result)

# END OF QUESTION 4
#5. Composition Over Inheritance: Create a Book class with a Author class included within it, demonstrating composition over inheritance.
print("\n\n5. Composition Over Inheritance: Create a Book class with a Author class included within it, demonstrating composition over inheritance.\n")

# Building the Book and Author: Firstname Lastname.
class Book:
    def __init__(self, title, author):
        self.title = title
        self.author = author

class Author:
    def __init__(self, name):
        self.name = name

# Creating instances of Book and Author
book = Book("Chronicles: Fates Undone", Author("Rin C. Naumann"))

# Displaying book information
print("Book Information:")
print(f"Title: {book.title}")
print(f"Author: {book.author.name}")

# END OF QUESTION 5