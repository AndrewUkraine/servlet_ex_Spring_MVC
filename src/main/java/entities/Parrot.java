package entities;

import org.springframework.stereotype.Component;

/*Если нам надо явно указать спрингу что бин для этого класса должен иметь какое-то определенное имя - это имя можно
        указать в скобках после аннотации. Например, чтобы спринг дал нужное нам имя "parrot-kesha"
        бину попугайчика, по которому мы в main-е потом этого попугайчика будем получать - надо сделать примерно так:*/

@Component ("parrot-kesha")
public class Parrot {

    private String name = "Кеша";;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
