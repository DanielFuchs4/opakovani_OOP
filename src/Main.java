public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Koště", 1, 4.9);
        Student student2 = new Student("Poklička", 4, 1.0);
        Student student3 = new Student("Koště", 2,4.0);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        if (student1.equals(student3)) {
            System.out.println("stejný");
        } else {
            System.out.println("jiný");
        }

        System.out.println(student1.getPrumer());
        student1.zlepsiPrumer(0.5);
        System.out.println(student1.getPrumer());
        System.out.println(student1.klasifikace());

    }
}