public class tester {
    public static void main(String[] args){
        Dog dog=new Dog();
        dog.age=4;
        dog.name="lucky";
        dog.print();
        System.out.println();

        Circle circle=new Circle();
        circle.radius=5.0;
        circle.print_size();
        System.out.println();

        Book book=new Book();
        book.title="the hobbit";
        book.pages=350;
        book.printInfo();
        System.out.println();

        BankAccount bankAccount=new BankAccount();
        bankAccount.balance=100;
        bankAccount.owner="itamar";
        bankAccount.balance=bankAccount.deposit(bankAccount.balance);
        bankAccount.print();
        bankAccount.balance=bankAccount.withdraw(bankAccount.balance);
        bankAccount.print();

        Light light=new Light();
        light.isOn=true;
        light.isOn=light.turnOFF(light.isOn);
        light.print();
        light.isOn=light.turnON(light.isOn);
        light.print();

        Classroom classroom=new Classroom();
        classroom.students=new String[]{"itamar","linoy","tolleen"};
        classroom.printStudent();

        Counter counter = new Counter();
        counter.count=5;
        counter.count= counter.increase(counter.count);
        counter.printCount();
        counter.count= counter.decrease(counter.count);
        counter.printCount();
    }
}