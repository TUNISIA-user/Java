package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RestController
    class HelloController {
        @GetMapping("/")
        public String hello() {
            return "Hello from Spring Boot!";
        }
    }
}







~//#Streams API


import java.util.*;
import java.util.stream.*;
import java.io.*;

public class StreamExample {

    // كلاس يمثل المستخدم
    static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() { return name; }
        public int getAge() { return age; }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

    public static void main(String[] args) {

        // مثال على List من النصوص
        List<String> names = Arrays.asList("Ali", "Ahmed", "Sara", "Alaa");

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Names starting with A: " + filteredNames);

        // مثال على map و forEach
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("Numbers multiplied by 2:");
        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);

        // sum
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum = " + sum);

        // List من كائنات User
        List<User> users = Arrays.asList(
                new User("Ali", 20),
                new User("Mona", 25),
                new User("Sam", 17),
                new User("Zain", 18)
        );

        // فلترة البالغين (العمر 18 أو أكثر)
        List<User> adults = users.stream()
                .filter(user -> user.getAge() >= 18)
                .collect(Collectors.toList());

        System.out.println("Adult users:");
        adults.forEach(System.out::println);

        // ترتيب حسب العمر
        System.out.println("Users sorted by age:");
        users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .forEach(System.out::println);

        // عدّ المستخدمين
        long count = users.stream().count();
        System.out.println("Total users: " + count);
    }
}
