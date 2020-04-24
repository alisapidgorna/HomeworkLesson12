public abstract class Human {
    public String name;
    public int weight;
    public int height;
    public String hairColor;
    public String nails;
    public String brain;

    public Human(String name, int weight, int height, String hairColor, String nails, String brain){
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.hairColor = hairColor;
        this.nails = nails;
        this.brain = brain;
    }
    public void study(String prLanguage){
        System.out.println("Human.study() called. Studying:  " + prLanguage);
    }
    public abstract void talk(String language);
    public abstract void move(int speed);
    public abstract void run(int speed);
    public abstract void hobby(String hobby);
}

