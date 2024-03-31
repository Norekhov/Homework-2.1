public class Kogtevran extends Hogwarts {
    private int intellect;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevran(String name, int witchcraft, int transgeneration, int intellect, int wisdom, int wit, int creativity) {
        super(name, witchcraft, transgeneration);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    protected int sumOfCharacteristics() {
        return intellect + wisdom + wit + creativity;
    }

    public void compareTo(Kogtevran kogtevran) {
        compareToStudent(kogtevran);
    }
    @Override
    public String toString() {
        return super.toString() + ", сила ума: %d, сила мудрости: %d, сила остроумности: %d, сила творчества: %d".
                formatted(intellect, wisdom, wit, creativity);
    }
}
