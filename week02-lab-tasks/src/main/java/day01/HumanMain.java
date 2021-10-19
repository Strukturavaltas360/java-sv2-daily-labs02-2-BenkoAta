package day01;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human("Hunyadi Mátyás", 35);
        System.out.println(human.getName() + ": " + human.getAge());
    }
}
