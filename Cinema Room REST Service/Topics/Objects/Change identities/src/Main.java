class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        // write your code here
        Person p = new Person();
        p.name = p1.name;
        p.age = p1.age;
        p1.name = p2.name;
        p1.age = p2.age;
        p2.name = p.name;
        p2.age = p.age;

    }
}