package oops.java;

public class Cat {
    public String name;
    public int age;
    public Gender gender;
    public int weight;
    public String color;

    public void breath(){
        System.out.println("Inhale");
        System.out.println("Exhale");
    }

    public void eat(String food){
        System.out.println("Eat "+food);
    }

    public void sleep(int hrs){
        System.out.println("I sleep for "+ hrs);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
