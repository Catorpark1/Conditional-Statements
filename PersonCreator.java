public class PersonCreator {
    public static void main(String[] args) {
        Person Person01 = new Person("James Peterson",34,180, 73.5);
        Person Person02 = new Person("Bob Thornley", 25,  171, 68.2);
        System.out.println(Person01.getName() + ", " + Person01.getAge() + ", " + Person01.getHeight() + ", " + Person01.getWeight());
        System.out.println(Person02.getName() + ", " + Person02.getAge() + ", " + Person02.getHeight() + ", " + Person02.getWeight());
        Person01.growOlder();
        Person02.growOlder();
        System.out.println(Person01.getName() + ", " + Person01.getAge() + ", " + Person01.getHeight() + ", " + Person01.getWeight());
        System.out.println(Person02.getName() + ", " + Person02.getAge() + ", " + Person02.getHeight() + ", " + Person02.getWeight());
    }
}



