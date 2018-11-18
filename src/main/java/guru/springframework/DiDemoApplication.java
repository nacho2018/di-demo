package guru.springframework;

import guru.springframework.controllers.MyController;
import guru.springframework.examplebeans.FakeData;
import guru.springframework.examplebeans.FakeDatasource;
import guru.springframework.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController controller = (MyController)ctx.getBean("myController");

/*        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
*/
        FakeDatasource fakeDatasource = (FakeDatasource) ctx.getBean(FakeDatasource.class);
        System.out.println(fakeDatasource.getUser() + " " +
                fakeDatasource.getPassword() + " " + fakeDatasource.getDbUrl());

        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getUserName() + " " + fakeJmsBroker.getPassword() +
                " " + fakeJmsBroker.getUrl() + " " + fakeJmsBroker.getListAnimals() +
                " " + fakeJmsBroker.getPrice() + " " + fakeJmsBroker.isResponse());


    }
}
