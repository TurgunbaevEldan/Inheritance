public class Main {
    public static void main(String[] args) {
//        Human human = new Human("Eldan",18);
//        human.humanMethode();
//        System.out.println(human);

        /**БУЛ ТАПШЫРМАДА PERSON ДЕГЕН КЛАСС ТУЗОСУЗДОР.

         ПОЛЕЛЕРИН ЖАНА МЕТОДТОРУН СУРОТТО КОРСОТУЛГОНДОЙ

         КЫЛЫП  ТУЗОСУЗДОР.


         АЛ КЛАССТЫ 3 БАШКА КЛАСС МУРАСТАШЫ  КЕРЕК.

         АЛ 3 КЛАССТЫН ОЗДОРУНУН УНИКАЛДУУ ПОЛЕЛЕРИ ЖАНА

         МЕТОДТОРУ БАР СУРОТТОГУДОЙ.



         КОНСТРУКТОР ТУЗОСУЗДОР ЖАНА ОЗДОРУНУН УНИКАЛДУУ МЕТОДТОРУН ДА ТУЗОСУЗДОР.



         МЕЙН МЕТОДКО 3 КЛАССТЫН ОБЪЕКТИЛЕРИН ТУЗОСУЗДОР, ПОЛЕЛЕРИНЕ КОНСТРУКТОР МЕНЕН МААНИ БЕРИП,

         КОНСОЛГО TOSTRING() МЕТОДУН КОЛДОНУП МААЛЫМАТТАРЫН  ЧЫГАРЫНЫЗДАР.*/



        Singer singer = new Singer("Aisuluu","I love you","Perfect");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGitar();
        System.out.println(singer.getName()+" "+singer.getDesignation()+" "+singer.getGroupName());

        System.out.println("----------------------------------------");

        Programmer programmer = new Programmer("Eldan","Senior","Apple");
        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println(programmer.getName()+" "+programmer.getDesignation()+" "+programmer.getCompanyName());

        System.out.println("-----------------------------------------");

        Dancer dancer = new Dancer("Kanykey","Key pop","BTS");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println(dancer.getName()+" "+dancer.getDesignation()+" "+dancer.getBandName());
    }
}