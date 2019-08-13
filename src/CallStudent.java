public class CallStudent {
    public static void main(String[] args) {
        System.out.println("Hellowwwww");
        Student sirawat = new Student();
        System.out.println("Object sirawat = "+sirawat);
        sirawat.addCours();
        sirawat.dropCourse();
        sirawat.payment();
        sirawat.enrollment();
        
        //crete object GraduateStudent
        GraduateStudent kaneki = new GraduateStudent();
        kaneki.oralExamination();
        kaneki.thesisExamination();
        kaneki.addCours();
        kaneki.dropCourse();
        kaneki.enrollment();
        kaneki.payment(); 
    }
}