import entity.Student;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Sabina", 99, 25, "female"));
        studentList.add(new Student(2, "Shamil", 98, 25, "male"));
        studentList.add(new Student(3, "Ermek", 97, 17, "male"));
        studentList.add(new Student(4, "Arstan", 96, 18, "male"));
        studentList.add(new Student(5, "Arthur", 95, 19, "male"));
        studentList.add(new Student(6, "Kanykei", 94, 18, "female"));
        studentList.add(new Student(7, "Rauan", 93, 20, "male"));
        studentList.add(new Student(8, "Eliza", 92, 34, "female"));
        studentList.add(new Student(9, "Chyngyz", 91, 29, "male"));
        studentList.add(new Student(10, "Azat", 90, 25, "male"));

        studentList.stream().map(x -> x.getName()).forEach(x -> System.out.format("%s ", x));
        System.out.println();

        System.out.println("====================================================================");
        System.out.println("Те кто старше 20 лет:");
        studentList.stream().filter(x -> x.getAge() > 20).map(x -> x.getName() + " " + x.getAge()).forEach(x -> System.out.println(x));

        System.out.println("======================================================================");
        studentList.stream().map(x -> "ID: " + x.getId() + ", Средняя оценка: " + x.getAverageRating()).forEach(x -> System.out.println(x));

        System.out.println("=======================================================================");
        studentList.stream().map(x -> x.getName() + " -> " + x.getName().charAt(0) + x.getName().length()).forEach(x -> System.out.println(x));

        //  Sabina -> S6
    }
//        public static Integer addStudent(Student student) {
//        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
//        hibernateSession.beginTransaction();
//        hibernateSession.save(student);
//        hibernateSession.getTransaction().commit();
//        hibernateSession.close();
//        System.out.println("Студент успешно добавлено " + student.toString());
//        return student.getId();
//    }
    public static List<Student> getNamesList() {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<Student> namesList = hibernateSession.createQuery("FROM Student").list();
        hibernateSession.close();
        System.out.println("Получено " + namesList.size() + " студентов");
        return namesList;
    }

    public static List<Student> getNamesListByAge(int minAge) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<Student> namesListByAge = hibernateSession.createQuery("FROM Student").list();
        hibernateSession.close();
        System.out.println("Получено " + namesListByAge.size() + " студентов");
        return namesListByAge;
    }
}
