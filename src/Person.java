public class Person extends Object{
    public String name;
    public int age;


    public Person (String name,int age){
        this.name = name;
        this.age = age;
    }


    public void setAge (int age) {
        if (age <0 || age>200){
            return;
        }
        this.age=age;
    }



    public int getAge (){
        return age;
    }

    public void Birthday () {
        age++;
        System.out.println(" С ДР!");
    }

public boolean isTooYoung () {
    if (age<18) {
     return true;
    } else {
    return  false;
        }
    }
}
