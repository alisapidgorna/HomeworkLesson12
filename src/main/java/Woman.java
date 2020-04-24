public class Woman extends Human {
    private String name;
    private String nationality;
    private String occupation;
    private String eyes;
    private String eyebrows;
    private int legs;
    private int foot;

    public Woman(String name, String  nationality, String occupation, String eyes, String eyebrows, int legs, int foot){
        super("Woman", 58, 179, "Black", "Red", "Clever");
        this.name = name;
        this.nationality = nationality;
        this.occupation = occupation;
        this.eyes = eyes;
        this.eyebrows = eyebrows;
        this.legs = legs;
        this.foot = foot;
    }
    @Override
    public void study(String prLanguage) {
        super.study(prLanguage);
    }
    @Override
    public void talk(String language) {
        System.out.println("Woman.talk() called. Talking in: English and Ukrainian");
    }
    @Override
    public void move(int speed)  {
        System.out.println("Woman.move() called. Moving at speed:  " + speed);
    }
    @Override
    public void run(int speed) {
        System.out.println("Woman.run() called. Running at speed:  " + speed);
    }
    public void mood(String mood){
        System.out.println("Woman.mood() called. Mood was:  " + mood);
    }
    private void changedMood(String changedMood){
        System.out.println("Woman.changedMood() called. Mood is changing to:  " + changedMood);
    }
    @Override
    public void hobby(String hobby)  {
        System.out.println("Woman.hobby() called. Hobbies are:  " + hobby);
        changedMood("Quarantine :(");
    }
}