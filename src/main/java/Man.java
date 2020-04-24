public class Man extends Human implements Actions{
    private String name;
    private String nationality;
    private String occupation;
    private String eyes;
    private int legs;
    private int foot;
    private int salary;
    private int house;

    public Man(String name, String nationality, String occupation, String eyes, int legs, int foot, int salary, int house) {
        super("Man", 70, 185, "Blond", "Short", "Very clever");
        this.name = name;
        this.nationality = nationality;
        this.occupation = occupation;
        this.eyes = eyes;
        this.legs = legs;
        this.foot = foot;
        this.salary = salary;
        this.house = house;
    }
    @Override
    public void study(String prLanguage) {
        super.study(prLanguage);
    }
    @Override
    public void talk(String language) {
        System.out.println("Man.talk() called. Talking in: French and Ukrainian");
    }
    @Override
    public void move(int speed) {
        System.out.println("Man.move() called. Moving at speed:  " + speed);
    }
    @Override
    public void run(int speed) {
        System.out.println("Man.run() called. Running at speed:  " + speed);
    }
    @Override
    public void hobby(String hobby) {
        System.out.println("Man.hobby() called. Hobbies are:  " + hobby);
    }

    public void earnMoney() {
        System.out.println("Man earns money every month: " + this.salary + " USD ");
    }
    public void buyHouse() {
        System.out.println("Man buys a house: " + this.house + " meters ");
    }
    public void marryAWoman(String name) {
        System.out.println("Man gets married with: " + name);
    }
}
