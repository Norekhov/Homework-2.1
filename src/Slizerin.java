public class Slizerin extends Hogwarts {
    private int cunning;
    private int decisiveness;
    private int ambition;
    private int resourcefulness;
    private int authority;

    public Slizerin(String name, int witchcraft, int transgeneration, int cunning, int decisiveness, int ambition, int resourcefulness, int authority) {
        super(name, witchcraft, transgeneration);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authority = authority;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getAuthority() {
        return authority;
    }

    @Override
    protected int sumOfCharacteristics() {
        return cunning + ambition + decisiveness + resourcefulness + authority;
    }

    public void compareTo(Slizerin slizerin) {
        compareToStudent(slizerin);
    }

    @Override
    public String toString() {
        return super.toString() + ", сила хитрости: %d, сила решительности: %d, сила амбициозности: %d, сила находчивости: %d, жажда власти: %d".
                formatted(cunning, ambition, decisiveness, resourcefulness, authority);
    }
}

