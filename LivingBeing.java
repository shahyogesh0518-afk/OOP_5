package workshop_5;

interface LivingBeing {
    void specialFeature();
}
class Fish implements LivingBeing {
    public void specialFeature() {
        System.out.println("Fish can swim");
    }
}
class Bird implements LivingBeing {
    public void specialFeature() {
        System.out.println("Bird can fly");
    }
}
