public class Cat {

    String catName;

    public Cat(String name){
        catName = name;
    }

    public String getCatName(){
        return catName;
    }

    public void setCatName(String n){
        catName = n;
    }

    public String toString(){
        return "Cat : " + getCatName();
    }
}
