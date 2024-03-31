public class Puffendui extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Puffendui(String name, int witchcraft, int transgeneration, int diligence, int loyalty, int honesty) {
        super(name, witchcraft, transgeneration);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    protected int sumOfCharacteristics() {
        return diligence+loyalty+honesty;
    }

    public void compareTo(Puffendui puffendui) {
        compareToStudent(puffendui);
    }

    @Override
    public String toString() {
        return super.toString() + ", сила трудолюбства: %d, сила верности: %d, сила честности: %d".formatted(diligence, loyalty, honesty);
    }
}
