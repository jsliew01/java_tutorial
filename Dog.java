public class Dog {
    String name;
    int age;
    String sound;
    public Dog (String name, int age, String sound){
        this.name = name;
        this.age = age;
        this.sound = sound;
    }
    public void bark (){
        System.out.println(sound);
    }
}
