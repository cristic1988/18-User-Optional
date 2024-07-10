package app;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class HandleData {

    UserRepository provider = new UserRepository();

    public Integer findUserById() {
        int id = provider.getData().get(0).getId();
        List<Optional<Integer>> optList = Arrays.asList(
                Optional.of(id));
        List<Integer> list1 = optList.stream()
                .flatMap(opt ->
                        opt.isPresent() ? Stream.of(opt.get()) : Stream.empty())
                .toList();
        System.out.println(provider.getData().get(0).getName() + list1);

        return id;
    }
    public String findUserByEmail(){
        String email = provider.getData().get(2).getEmail();
        List<Optional<String>> optList = Arrays.asList(
                Optional.of(email));
        List<String> list1 = optList.stream()
                .flatMap(opt ->
                        opt.isPresent() ? Stream.of(opt.get()) : Stream.empty())
                .toList();
        System.out.println(provider.getData().get(2).getName() + list1);

        return email;
    }

    public String findAllUsers () {
        String users = provider.getData().toString();
        List<Optional<String>> optList = Arrays.asList(
                Optional.of(users));
        List<String> list1 = optList.stream()
                .flatMap(opt ->
                        opt.isPresent() ? Stream.of(opt.get()) : Stream.empty())
                .toList();
        System.out.println(list1);

        return users;
    }



}

