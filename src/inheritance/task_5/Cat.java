package inheritance.task_5;

public class Cat {
    private String name;
   private int age;

    public Cat(String name, int age) {
        this.name = name;
        setAge(age);
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
    }

}
