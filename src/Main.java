import KEKW.Gryffindor;
import KEKW.Hogwarts;
import KEKW.Hufflepuff;
import KEKW.Ravenclaw;
import KEKW.Slytherin;

import static KEKW.Gryffindor.compareGryffindorStudents;
import static KEKW.Hufflepuff.compareHufflepuffStudents;
import static KEKW.Ravenclaw.compareRavenclawStudents;
import static KEKW.Slytherin.compareSlytherinStudents;
public class Main {
    public static void main(String[] args) {

        Slytherin draco = new Slytherin("Драко Малфой", 20, 30,
                20, 50, 40, 50, 80);

        Slytherin grehem = new Slytherin("Грэхэм Монтегю", 10, 20,
                60, 10, 60, 50, 60);

        Slytherin gregori = new Slytherin("Грегори Гойл", 30, 80,
                40, 50, 40, 60, 90);


        Ravenclaw chou = new Ravenclaw("Чжоу Чанг", 25, 35,
                45, 55, 45, 45);

        Ravenclaw padma = new Ravenclaw("Падма Патил", 25, 35,
                65, 45, 85, 25);

        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 35, 45,
                55, 65, 75, 85);


        Hufflepuff zakharia = new Hufflepuff("Захария Смит", 12, 22,
                72, 62, 42);

        Hufflepuff sedrik = new Hufflepuff("Седрик Диггори", 32, 42,
                52, 22, 82);

        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 42,
                22, 62, 72, 12);


        Gryffindor harry = new Gryffindor("Гарри Поттер", 35, 25,
                75, 45, 95);

        Gryffindor hermiona = new Gryffindor("Гермиона Грейнджер", 75, 65,
                75, 25, 65);

        Gryffindor ron = new Gryffindor("Рон Уизли", 85, 35,
                55, 15, 15);


//Сделайте метод, который выводит на экран описание студента.
        print(draco);
        print(chou);
        print(zakharia);
        print(harry);
        System.out.println();


//сравнивают между собой учеников одного факультета по свойствам
        (harry).compareGryffindor(hermiona);
        System.out.println();

        (zakharia).compareHufflepuff(sedrik);
        System.out.println();

        (chou).compareRavenclaw(padma);
        System.out.println();

        (draco).compareSlytherin(gregori);
        System.out.println();


//Реализуйте 4 метода,которые сравнивают между собой учеников одного факультета по свойствам.
// У каждого ученика нужно сложить баллы по каждому свойству


        compareGryffindorStudents(harry, ron);
        System.out.println();

        compareHufflepuffStudents(zakharia, sedrik);
        System.out.println();

        compareRavenclawStudents(padma, chou);
        System.out.println();

        compareSlytherinStudents(draco, gregori);
        System.out.println();


//Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию
// трансгрессии, и выводит в консоль сравнительную оценку между двумя учениками.
        harry.compareHogwarts(draco);
        System.out.println();

        chou.compareHogwarts(gregori);
        System.out.println();

    }

    public static void print(Hogwarts students) {
        System.out.println(students);
    }

}