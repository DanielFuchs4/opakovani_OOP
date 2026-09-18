import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        SkolniSystem skolniSystem = new SkolniSystem();

        Student student1 = new Student("Koště", 1, 4.9);
        Student student2 = new Student("Poklička", 4, 1.0);
        Student student3 = new Student("Koště", 2,4.0);

/*
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

 */

        skolniSystem.addStudent(student1);
        skolniSystem.addStudent(student2);
        skolniSystem.addStudent(student3);

        System.out.println(student1.radekVypisu());
        System.out.println(student2.radekVypisu());
        boolean menu = true;
        while (menu) {

            System.out.println("-------MENU-------");
            System.out.println("1 - přidat studenta");
            System.out.println("2 - vypsat studenty");
            System.out.println("3 - Hledat podle jména");
            System.out.println("4 - Konec");
            System.out.println("------------------");
            System.out.println("");
            System.out.print("Výběr: ");
            int vyber = input.nextInt();
            input.nextLine();
            System.out.println("");

            if (vyber ==1){
                System.out.print("Jméno: ");
                String jmeno = input.nextLine();
                System.out.print("Průměr: ");
                double prumer = input.nextDouble();
                input.nextLine();
                System.out.print("Ročník: ");
                int rocnik = input.nextInt();
                input.nextLine();

                skolniSystem.addStudent(new Student(jmeno, rocnik, prumer));
                System.out.println("Student added");
            } else if (vyber ==2){
                skolniSystem.vypis();
            } else if (vyber ==3){
                System.out.print("Jméno: ");
                String jmeno = input.nextLine();
                System.out.println(skolniSystem.najdiStudenta(jmeno));
            } else if (vyber ==4){
                menu = false;
            }

        }
    }
}