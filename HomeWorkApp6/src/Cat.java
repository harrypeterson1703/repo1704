class Cat extends Animal {
    Cat(String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);
    }

    @Override
    public String swim(int distance) {
        return getNameClassAnimal() + " " + getName() + " не поплывет";
    }
}