public class Main {

    public static void main(String[] args) {
        Griffindor garry = new Griffindor("Гарри Поттер", 80, 67, 45, 56, 67);
        Griffindor germiona = new Griffindor("Гермиона Грейнджер", 75, 52, 56, 67, 78);
        Griffindor ron = new Griffindor("Рон Уизли", 70, 85, 65, 54, 43);
        garry.compareTo(germiona);
        germiona.compareToStudent(ron);
        ron.compareTo(garry);

        garry.print();
        germiona.print();
        ron.print();

        Puffendui drako = new Puffendui("Драко Малфой", 95, 76, 76, 6, 36);
        Puffendui grehem = new Puffendui("Грэхэм Монтегю", 67, 53, 98, 87, 76);
        Puffendui gregory = new Puffendui("Грегори Гойл", 50, 49, 87, 65, 55);
        drako.compareTo(gregory);

        drako.print();
        grehem.print();
        gregory.print();

        Kogtevran zahar = new Kogtevran("Захария Смит", 42, 25, 35, 46, 57, 45);
        Kogtevran sedryk = new Kogtevran("Седрик Диггори", 75, 38, 97, 86, 75, 64);
        Kogtevran ghastin = new Kogtevran("Джастин Финч-Флетчли", 91, 76, 35, 36, 75, 62);
        zahar.compareTo(ghastin);
        sedryk.compareTo(zahar);

        zahar.print();
        sedryk.print();
        ghastin.print();

        Slizerin choy = new Slizerin("Чжоу Чанг", 84, 91, 47, 49, 29, 82, 93);
        Slizerin padma = new Slizerin("Падма Патил", 74, 3826, 38, 49, 60, 83, 59);
        Slizerin marcus = new Slizerin("Маркус Белби", 61, 59, 41, 62, 73, 83, 73);
        choy.compareToStudent(marcus);
        padma.compareTo(marcus);

        choy.print();
        padma.print();
        marcus.print();
    }
}
