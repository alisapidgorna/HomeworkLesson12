import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Collection interface: ");
        //Collection: базовый интерфейс для всех коллекций и других интерфейсов коллекций
        Collection woman1 = new ArrayList();
        woman1.add("Jane Austen");
        woman1.add("is one of the 10 best English writers");
        woman1.add("was born nowadays");
        woman1.add("was born in 1775");
        woman1.remove("was born nowadays");
        Iterator iterator = woman1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Number of elements in woman1's collection:  " + woman1.size());

        System.out.println("---------------------------------------------"
                + "\n" + "List Interface: ");
        //Списки в Java реализуют интерфейс List, который, в свою очередь, расширяет интерфейс Collection
        //Список позволяет хранить любые значения, в том числе повторяющиеся
        //Объекты хранятся в порядке их добавления в список. Доступ к элементам списка осуществляется по индексу
        List woman2 = new ArrayList();
        woman2.add("Charlotte Bronte");
        woman2.add("is an English poet and novelist");
        woman2.add("was born nowadays");
        woman2.set(2, "was born in 1816");
        for (int i = 0; i < woman2.size(); i++) {
            System.out.println(woman2.get(i));
        }
        System.out.println("Number of elements in woman2's collection:  " + woman2.size());

        System.out.println("---------------------------------------------"
                + "\n" + "Queue Interface: ");
        //PriorityQueue: очередь приоритетов
        //У метода remove() есть две формы - remove() и remove(Object o), а у poll() - только одна
        //В первой форме оба метода одинаковые - они убирают "голову" (первый элемент) очереди
        //Точно то же самое получим, если напишем вместо remove() poll()
        Queue woman3 = new PriorityQueue();
        woman3.offer("Joanne Rowling");
        woman3.offer("is a famous English writer, film producer, screenwriter and author of Harry Potter");
        woman3.offer("was born in 1965");
        Iterator itr = woman3.iterator();
        while (itr.hasNext()) {
            System.out.println(woman3.poll());
        }
        System.out.println("Number of elements in woman3's collection:  " + woman3.size());

        System.out.println("---------------------------------------------"
                + "\n" + "Set Interface: ");
        //HashSet, порядок элементов покажется хаотичным. Он будет зависеть от значения хэш-функции для каждого элемента
        // Мы два раза добавляем значения в набор, однако в результате увидим его только один раз
        Set woman4 = new HashSet();
        woman4.add("Agatha Christie");
        woman4.add("Agatha Christie");
        woman4.add("is a famous English write and playwright, the author of famous detectives");
        woman4.add("Murder on the Orient Express, Hercule Poirot, Miss Marple");
        woman4.add("was born in 1890");
        woman4.add("was born in 1890");
        for (Object o: woman4){
            System.out.println(o);
        }
        System.out.println("Number of elements in woman4's collection:  " + woman4.size());

        System.out.println("---------------------------------------------"
                + "\n" + "Map Interface: ");
        // HashMap: структура данных в виде словаря, в котором каждый объект имеет уникальный ключ и некоторое значение
        // не гарантирует никакого порядка элементов при обходе
        // При повторном добавлении элемента с тем же ключом, мы теряем первое значение
        Map woman5 = new HashMap();
        woman5.put(1, " is an English writer and poet");
        woman5.put(2, " was born in 1818");
        woman5.put(7, " Emily Jane Bronte");
        woman5.put(9, " author of Wuthering Heights");
        System.out.println(woman5.get(7));
        Set set = woman5.entrySet();
        for (Object o: set){
            System.out.println(o);
        }
        System.out.println("Number of elements in woman5's collection:  " + woman5.size());

        System.out.println("---------------------------------------------"
                + "\n" + "Map Interface too: ");
        //LinkedHashMap по методам работы схож с HashMap. Отличие в том,
        // что в LinkedHashMap позиции элементов связаны между собой.
        Map woman6 = new LinkedHashMap();
        woman6.put(" Леся Українка", 1);
        woman6.put(" відома українська письменниця ", 2);
        woman6.put(" народилась в 1871 році ", 3);
        woman6.put(" Лісова пісня, На крилах пісень, Думи і мрії, Давня казка ", 4);
        System.out.println(woman6);
        System.out.println("Number of elements in woman6's collection:  " + woman6.size());


            Woman woman = new Woman("Mariya", "Ukrainian", "QA", "Green", "Brown", 2, 41);
            Man man = new Man("Ivan", "Ukrainian", "Java developer", "Blue", 2, 44, 2300, 340);

            System.out.println("---------------------------------------------");
            woman.study("Java");
            man.study("Java");
            woman.talk("English and Ukrainian");
            man.talk("French and Ukrainian");
            woman.move(4);
            man.move(6);
            woman.run(10);
            man.run(9);
            woman.mood("Good, perfect, super!!!");
            woman.hobby("Gym, sewing, improving English, learning to code");
            man.hobby("Football, learning to code");
            System.out.println();
            man.earnMoney();
            man.buyHouse();
            man.marryAWoman("Mariya");
        }
    }