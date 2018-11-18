package guru.springframework.config;

import guru.springframework.examplebeans.FakeData;
import guru.springframework.examplebeans.FakeDatasource;
import guru.springframework.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.xml.bind.annotation.XmlEnumValue;
import java.util.List;

@Configuration
public class PropertyConfig {


    @Value("${guru.username}")
    String user;
    @Value("${guru.password}")
    String password;
    @Value("${guru.dburl}")
    String url;

    @Value("${guru.jms.username}")
    String jmsUsername;
    @Value("${guru.jms.password}")
    String jmsPassword;
    @Value("${guru.jms.url}")
    String jmsUrl;
    @Value("${list_animals}")
    String[] animals;
    @Value("${price_money}")
    String priceMoney;
    @Value("${response}")
    String response;





    @Bean
    FakeDatasource fakeDatasource(){

        FakeDatasource fakeDatasource = new FakeDatasource();
        fakeDatasource.setUser(user);
        fakeDatasource.setPassword(password);
        fakeDatasource.setDbUrl(url);

        return fakeDatasource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){

        FakeJmsBroker jmsBroker = new FakeJmsBroker();

        jmsBroker.setUserName(jmsUsername);
        jmsBroker.setPassword(jmsPassword);
        jmsBroker.setUrl(jmsUrl);
        jmsBroker.setAnimals(animals);
        jmsBroker.setPrice(Float.valueOf(priceMoney));
        jmsBroker.setResponse(Boolean.valueOf(response));
        return jmsBroker;
    }



}
