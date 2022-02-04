public class Dog {

    String dogName;

    public Dog(String name){
        dogName = name;
    }
    public String getDogName(){
        return dogName;
    }

    public void setDogName(String n){
        dogName = n;
    }

    public void bark(){
        System.out.println("woof");
    }
}
