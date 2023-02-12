public class Main {

    public static void main(String[] args) {

        Course riy = new Course("Riyaziyyat", "RİY101", "Riy");
        Course fizika = new Course("Fizika", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher(" A. Aqil ", "90550000000", "MAT");
        Teacher t2 = new Teacher("A. Fatime", "90550000001", "FZK");
        Teacher t3 = new Teacher("Eli Veliyev", "90550000002", "KMY");

        riy.addTeacher(t1);
        fizika.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Elçin Əliyev", 4, "140144015", riy, fizika, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student s2 = new Student("A. Asad", 4, "2211133", riy, fizika, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("M. İsmayil", 4, "221121312", riy, fizika, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();

    }

}
