package entities;

import entities.Cat;
import entities.Dog;
import entities.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {


        // создаем пустой спринговый контекст, который будет искать свои бины по аннотациям в указанном пакете, ТАМ ГДЕ НАШИ КЛАССЫ
        ApplicationContext context = new AnnotationConfigApplicationContext("entities");


     /*   Обращаясь к объекту контекста - мы просим его дать нам бин (объект), и указываем, какого класса объект нам нужен
        (тут, кстати, можно указывать
        не только классы, но и интерфейсы). После чего нам спринг возвращает объект этого класса, который мы уже и сохраняем в переменную.*/

        Cat cat = context.getBean(Cat.class);

       /* Далее мы просим спринг достать нам бин, который называется "dog". Когда спринг будет создавать объект класса Dog - то он даст ему стандартное имя (если явно не указано имя создаваемого бина), которое является названием
        класса объекта, только с маленькой буквы. Поэтому, поскольку класс у нас называется Dog, то имя такого бина будет "dog"*/
        Dog dog = (Dog) context.getBean("dog");

    /*    Ну и в третьем случае мы получаем бин по классу и по имени. Просто может быть такая ситуация, что в контексте окажется
        несколько бинов какого-то одного класса, и для того, чтобы указать какой именно бин нам нужен - указываем его имя.*/
        Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

        /*@Component - это  анотацие создаем БИНЫ по которой Спринг ищет их */

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());

    }
}
