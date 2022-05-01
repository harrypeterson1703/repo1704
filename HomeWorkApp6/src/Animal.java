class Animal implements ActionAnimal {
    private String name;
    private int runLimit;
    private  int swimLimit;
    private String nameClassAnimal;
    private static int numOfAnimals = 0;



    Animal(String name, int runLimit, int swimLimit) {
        this.name  = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        nameClassAnimal = getClass().getSimpleName();
        System.out.println("Животных до изменения " + numOfAnimals);
        numOfAnimals++;
        System.out.println("Животных после изменения " + numOfAnimals);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static int getNumOfAnimals() {
        return numOfAnimals;
    }

    public String getNameClassAnimal() {
        return nameClassAnimal;
    }

    @Override
    public String run(int distance) {
        if (distance > runLimit) {
            return  nameClassAnimal + " " + name + " не пробежит " + distance;
        } else  {
            return nameClassAnimal + " " + name + " пробежит " + distance;
        }
    }

    @Override
    public String swim(int distance) {
        if (distance > swimLimit) {
            return  nameClassAnimal + " " + name + " не проплывет " + distance;
        } else  {
            return nameClassAnimal + " " + name + " проплывет " + distance;
        }
    }

    public String toString() {
        return  nameClassAnimal + " " + name + " может пробежать: " + runLimit + ", может проплыть: " + swimLimit;
    }
}
