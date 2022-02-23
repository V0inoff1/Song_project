public class Singer extends Person {
    public int rating;

    public Singer (String name,int age,int rating) {//
        super (name, age);// Вызов конструктора из класса Person
        this.rating=rating;
    }

    public void sing (String verse) {
        System.out.println("Я пою" + verse);// при дабавлении новых методов в класс сингер, данные методы будут доступна только  да данного класса + данные из скопированного класса.
        // в класс Person наш метод не записывается и не изменяет его!! verse - это то, куда будет записываться песня в классе main

    }
    @Override// используем для удобства написания кода. Данный код проверяет, что мы меняем свойства метода, а не создаем новый ( например я опечатался в наименовании метода,
    // но ява думает , что я создаю нолвый. Оверрайд подчеркнет ошибку и не даст коду скомпелироваться.
    public void Birthday () {
        age++;
        System.out.println(" С ДР кароч!");
    }

    @Override
    public String toString () {
        return "[" + rating + "]" + name + "(" + age + ")";
    }
}
