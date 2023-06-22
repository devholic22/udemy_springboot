package udemy.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {} // 이 두 개의 인수가 있는 Person 생성자가 자동으로 생성됨
record Address (String firstLine, String city) {}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Hyunjoon";
    }

    @Bean
    public int age() {
        return 24;
    }

    @Bean
    public Person person() {
        return new Person("AAA", 20, new Address("Main Street", "Utrecht"));
        // person.getAge 등의 메서드도 제공..
    }

    @Bean
    public Person person2MethodCall() {
        // 직접 메서드 호출해서 사용
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        // name, age, address2 (메서드 이름이 address 여도 빈 이름이 address2)
        // 파라미터 값을 토대로 자동으로 사용하도록 함
        return new Person(name, age, address2);
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
        return new Person(name, age, address);
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("Baker Street", "London");
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3() {
        return new Address("Motinagar", "Hyderabad");
    }
}