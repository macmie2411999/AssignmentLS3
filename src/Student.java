import java.util.Scanner;

public class Student {
    private String Name;
    private String IDStudent;
    private Integer Age;
    private String IDClass;
    private String Email;
    private String Phone;
    private String Gender;
    private Double GPA;
    private String Rating;

    public Student() {

    }

    public Student(String name, String IDStudent, Integer age, String IDClass, String email, String phone,
                   String gender, Double GPA, String rating) {
        this.Name = name;
        this.IDStudent = IDStudent;
        this.Age = age;
        this.IDClass = IDClass;
        this.Email = email;
        this.Phone = phone;
        this.Gender = gender;
        this.GPA = GPA;
        this.Rating = rating;
    }

    // create student
    public static Student creatStudent() {
        //get information of student
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Name (String): ");
        String name = inputScanner.nextLine();
        System.out.print("ID Student (String): ");
        String IDStudent = inputScanner.nextLine();
        System.out.print("Age (Integer): ");
        Integer age = inputScanner.nextInt();
        inputScanner.nextLine();
        System.out.print("ID Class (String): ");
        String IDClass = inputScanner.nextLine();
        System.out.print("Email (String): ");
        String email = inputScanner.nextLine();
        System.out.print("Phone (String): ");
        String phone = inputScanner.nextLine();
        System.out.print("Gender (String): ");
        String gender = inputScanner.nextLine();
        System.out.print("Pre-judge Rating (String): ");
        String rating = inputScanner.nextLine();
        System.out.print("GPA (Double): ");
        Double GPA = inputScanner.nextDouble();
        inputScanner.close();

        // create object and set values to attributes
        Student student = new Student();
        student.setName(name);
        student.setIDStudent(IDStudent);
        student.setAge(age);
        student.setIDClass(IDClass);
        student.setEmail(email);
        student.setPhone(phone);
        student.setGender(gender);
        student.setGPA(GPA);
        student.setRating(rating);

        return student;
    }

    // show information of student
    public static void showInformationOfStudent(Student student) {
        System.out.print(student.toString());
    }

    // check GPA and rate by GPA
    public static void processGPA(Student student) {
        Double GPA = student.getGPA();
        if ((GPA >= 9) && (GPA <= 10)) {
            student.setRating("Excellent");
        } else if ((GPA >= 7) && (GPA < 8)) {
            student.setRating("Good");
        } else if ((GPA >= 5) && (GPA < 6)) {
            student.setRating("Medium");
        } else if ((GPA < 5)) {
            student.setRating("Bad");
        } else {
            student.setRating("Unknown");
        }

        // show the rating of student
        System.out.println("\n----------Rating of student " + student.getName() + "----------");
        System.out.println("The post-judge Rating of student " + student.getName() + " is " + student.getRating());
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getIDStudent() {
        return IDStudent;
    }

    public void setIDStudent(String IDStudent) {
        this.IDStudent = IDStudent;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getIDClass() {
        return IDClass;
    }

    public void setIDClass(String IDClass) {
        this.IDClass = IDClass;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Double getGPA() {
        return GPA;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    @Override
    public String toString() {
        return "\n\n----------Information of Student: " + Name + "----------\n" +
                "IDStudent = " + IDStudent + "\n" +
                "Age = " + Age + "\n" +
                "IDClass = " + IDClass + "\n" +
                "Email = " + Email + "\n" +
                "Phone = " + Phone + "\n" +
                "Gender = " + Gender + "\n" +
                "GPA = " + GPA +"\n" +
                "Rating = " + Rating + "\n";
    }
}
