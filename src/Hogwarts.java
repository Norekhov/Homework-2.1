public abstract class Hogwarts {
    private String name;
    private int witchcraft;
    private int transgeneration;

    public Hogwarts(String name, int witchcraft, int transgeneration) {
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgeneration = transgeneration;

    }

    public String getName() {
        return name;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgeneration() {
        return transgeneration;
    }


    private int sumOfBaseCharacteristics() {
        return witchcraft + transgeneration;
    }

    protected abstract int sumOfCharacteristics();

    protected void compareToStudent(Hogwarts hogwarts) {
        int sumOfCharacteristics1 = this.sumOfCharacteristics();
        int sumOfCharacteristics2 = hogwarts.sumOfCharacteristics();
        if (sumOfCharacteristics1 > sumOfCharacteristics2) {
            System.out.printf(
                    "Студент %s лучше студента %s (%d vs %d)%n",
                    this.getName(),
                    hogwarts.getName(),
                    sumOfCharacteristics1,
                    sumOfCharacteristics2
            );
        } else if (sumOfCharacteristics1 < sumOfCharacteristics2) {
            System.out.printf(
                    "Студент %s лучше студента %s (%d vs %d)%n",
                    hogwarts.getName(),
                    this.getName(),
                    sumOfCharacteristics1,
                    sumOfCharacteristics2
            );
        } else {
            System.out.printf(
                    "Студент %s и %s одинаковые (%d vs %d)%n",
                    this.getName(),
                    hogwarts.getName(),
                    sumOfCharacteristics1,
                    sumOfCharacteristics2
            );
        }
    }

    public void compareTo(Hogwarts hogwarts) {
        int sumOfCharacteristics1 = this.sumOfBaseCharacteristics();
        int sumOfCharacteristics2 = hogwarts.sumOfBaseCharacteristics();
        if (sumOfCharacteristics1 > sumOfCharacteristics2) {
            System.out.printf(
                    "Студент %s лучше студента %s (%d vs %d)%n",
                    this.getName(),
                    hogwarts.getName(),
                    sumOfCharacteristics1,
                    sumOfCharacteristics2
            );
        } else if (sumOfCharacteristics1 < sumOfCharacteristics2) {
            System.out.printf(
                    "Студент %s лучше студента %s (%d vs %d)%n",
                    hogwarts.getName(),
                    this.getName(),
                    sumOfCharacteristics1,
                    sumOfCharacteristics2
            );
        } else {
            System.out.printf(
                    "Студент %s и %s одинаковые (%d vs %d)%n",
                    this.getName(),
                    hogwarts.getName(),
                    sumOfCharacteristics1,
                    sumOfCharacteristics2
            );
        }
    }

    @Override
    public String toString() {
        return "%s, сила магии: %d, сила трасгрессии: %d".formatted(name, witchcraft, transgeneration);
    }
    public void print() {
        System.out.println(this);
    }
}



