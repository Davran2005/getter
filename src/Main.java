import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.setWellName("It");
        course.setPhoneNumber("0500020200");
        course.setCourseStartDate(LocalDate.of(2023,01,01));
        System.out.println("Курс "+ course.getWellName() +"\n" + "Номер телефона "+ course.getPhoneNumber()+"\n"+"когда начился "+course.getCourseStartDate());

        Student student = new Student();
        student.setFirstName("Davran");
        student.setLastName("Joldoshbaev");
        student.setAge(18);
        student.setDateOfBirth(LocalDate.of(2005,04,16));
        student.setEmail("davran@email.com");
        System.out.println("Имя "+ student.getFirstName() + "\n" + "Фамилия" + student.getLastName() + "\n" +"Лет " +student.getAge()+"\n"+"Туулган жыл"+ student.getDateOfBirth() + "\n" + "Email" + student.getEmail() );


        Student student2 = new Student();
        student2.setFirstName("Davran");
        student2.setLastName("Joldoshbaev");
        student2.setAge(18);
        student2.setDateOfBirth(LocalDate.of(2005,04,16));
        student2.setEmail("davran@email.com");
        System.out.println("Имя "+ student2.getFirstName() + "\n" + "Фамилия" + student2.getLastName() + "\n" +"Лет " +student2.getAge()+"\n"+"Туулган жыл"+ student2.getDateOfBirth() + "\n" + "Email" + student2.getEmail() );
    }
}