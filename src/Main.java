public class Main {
    public static void main(String[] args) {
        // == Testing ==
        Gryffindor potter = new Gryffindor("Гарри Поттер",55,15,70,76,18);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер",8,9,11,6,85);
        Gryffindor ron = new Gryffindor("Рон Уизли",77,17,20,16,12);
        Slytherin draco = new Slytherin("Драко Малфой",15,77,4,71,11,12,40);
        Slytherin graham = new Slytherin("Грэхэм Монтегю",66,26,8,551,31,6,90);
        Slytherin gregory = new Slytherin("Грегори Гойл",65,8,6,4,61,15,10);

        System.out.println(graham);
        System.out.println("----------Comparing in Hogwarts----------");
        Hogwarts.compareTo(draco,potter);
        System.out.println("----------Comparing in Gryffindor----------");
        potter.compareTo(hermione);

    }
}