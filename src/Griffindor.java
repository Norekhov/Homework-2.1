public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int witchcraft, int transgeneration, int nobility, int honor, int bravery) {
        super(name, witchcraft, transgeneration);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    protected int sumOfCharacteristics() {
        return nobility + honor + bravery;
    }

    public void compareTo(Griffindor griffindor) {
        compareToStudent(griffindor);
    }

    @Override
    public String toString() {
        return super.toString() + ", сила благородства: %d, сила чести: %d, сила храбрости: %d".formatted(nobility, honor, bravery);
    }
}

