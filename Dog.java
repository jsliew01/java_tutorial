public class Dog {
    private String name;
    private int age;
    private String sound;


    public Dog (String name, int age, String sound){
        this.name = name;
        this.age = age;
        this.sound = sound;
    }
    public void bark (){
        System.out.println(sound);
    }

    public String getName() {
        return name;
    }
}
