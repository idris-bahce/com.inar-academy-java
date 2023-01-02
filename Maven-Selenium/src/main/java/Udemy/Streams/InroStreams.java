package Udemy.Streams;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InroStreams {
    @Test
    public void regular() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ayşe");
        names.add("Fatma");
        names.add("Ahmet");
        names.add("Hayriye");
        names.add("Mehmet");
        names.add("Selim");
        names.add("Ali");
        names.add("Amir");

        int count = 0;
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).startsWith("A")) {
                count++;
            }
        }
        System.out.println(count);
    }

    @Test
    public void lambda() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ayşe");
        names.add("Fatma");
        names.add("Ahmet");
        names.add("Hayriye");
        names.add("Mehmet");
        names.add("Selim");
        names.add("Ali");
        names.add("Amir");

        long number = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(number);

//        long num = Stream.of("ayşe","fatma","ahmet","hayriye","mehmet","selim","ali","amir").filter(s->
//        {
//          s.startsWith("a");
//          return false;
//        }).count();
//        System.out.println(num);
        names.stream().filter(s -> s.length() > 5).forEach(s -> System.out.println(s));
    }

    @Test
    public void streamMap() {
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("kamil");
        names1.add("yahya");
        names1.add("hilmi");

        Stream.of("ayşe", "fatma", "ahmet", "hayriye", "mehmet", "selim", "ali", "amir").filter(s -> s.endsWith("t")).
                map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
        List<String> names2 = Arrays.asList("ayşe", "fatma", "ahmet", "hayriye", "mehmet", "selim", "ali", "amir");
        names2.stream().filter(s -> s.startsWith("a")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

        //merging arraylists
        Stream<String> newStream = Stream.concat(names1.stream(),names2.stream());
        //newStream.sorted().forEach(s-> System.out.println(s));
        boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("ahmet"));
        Assert.assertTrue(flag);
    }
    @Test
    public void streamCollect(){
        List<String> ls = Stream.of("ayşe", "fatma", "ahmet", "hayriye").filter(s->s.endsWith("e")).map(s->s.toUpperCase())
                .collect(Collectors.toList());


        //Assignment:
        List<Integer> numbers = Arrays.asList(1,3,2,7,5,9,9,7,1);
        List<Integer> numList = numbers.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(numList.get(2));

    }
}

