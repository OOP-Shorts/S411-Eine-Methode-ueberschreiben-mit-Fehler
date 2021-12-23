public class OldDog extends Dog{

    private boolean isDeaf;

    public OldDog(String name, String breed, int age, boolean isDeaf) {
        super(name, breed, age);
        this.isDeaf = isDeaf;
    }

    public boolean isDeaf() {
        return isDeaf;
    }

    public void setDeaf(boolean deaf) {
        isDeaf = deaf;
    }

    @Override
    public void bark() {
        if (!isDeaf) {
            super.bark();
        }
    }
}
