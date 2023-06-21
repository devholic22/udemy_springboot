package udemy.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {} // 이 두 개의 인수가 있는 Person 생성자가 자동으로 생성됨
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
        return new Person("AAA", 20);
        // person.getAge 등의 메서드도 제공..
    }

    @Bean
    public Address address() {
        return new Address("Baker Street", "London");
    }
}
