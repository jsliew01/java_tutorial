class SimpleJava {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rocky", 23, "woof!");
        int numberA = 5;
        int numberB = 9;
        int numberC = numberA + numberB;
        System.out.println(numberC);
        System.out.println(dog1.name);
        dog1.bark();
        Dog dog2 = new Dog("Kenny", 29, "haha!");
        dog2.bark();
        dog2.bark();
        dog2.bark();
        dog1.bark();
    }
}

