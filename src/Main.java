public class Main{
    public static void main(String[] args) {
        Tutor[] tutors = TutorGenerator.generateTutor(10);
        for (int i = 0; i < tutors.length; i++){
            System.out.println(tutors[i]);
        }
        System.out.println("-------------------------------------------------------------------------");
        Student[] students = StudentGenerator.generateStudent(30);
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
        System.out.println("-------------------------------------------------------------------------");
        for (Student student: students){
            if (student != null && student.getGroup() != null && student.getGroup().toLowerCase().equals("42001")) {
                System.out.println(student.toString());
            }
        }
        }

    }

