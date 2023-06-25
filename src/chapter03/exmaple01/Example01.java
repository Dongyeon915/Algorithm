package chapter03.exmaple01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Example01 {

    public static void main(String[] args) {
        Random random = new Random();
        String[] names = {"Kim", "Lee", "Choi"};
        String[] emails = {"@naver.com", "@gmail.com", "@daum.net"};
        User[] users = new User[400];
        for (int i = 0; i < users.length; i++) {
            int emailValue = random.nextInt(3);
            int ageValue = random.nextInt(100) + 1;
            String name = names[emailValue] + "-" + i;
            users[i] = new User(i, name, ageValue, name + emails[emailValue]);
            System.out.println(users[i]);
        }
        System.out.println("[Sort]");

      //  comparator는 새로운 정렬기준
        Arrays.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return 0;
            }
        });

        Arrays.sort(users , (o1, o2) -> {
           return -1 * Integer.compare(o1.getAge(), o2.getAge());
        });

        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }

        System.out.println("[Comparable]");




        // 19이상  35세 미만 몇명!
        int num = 0;
        int equalsEamil = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() >= 19 && users[i].getAge() < 35){
                ++num;
            }
            if (users[i].getEmail().contains("@gmail.com")) {
//              변경
                String newEmail = users[i].getEmail().replace("@gmail.com", "@gmail.co.kr");
                users[i].setEmail(newEmail);
                ++equalsEamil;
            }
        }

        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }

        System.out.println("19이상  35세 미만은" + num + "명");
        System.out.println("gamil.com 은" + equalsEamil + "명");


        // @gmail.com 몇명!
        long emailEquals = Arrays.stream(users).filter(user -> {
            return user.getEmail().contains("@gmail.co.kr") ? true : false;
        }).count();
        System.out.println("g메일유저는" + emailEquals);



        long ageResult = Arrays.stream(users).filter(user -> {
            return user.getAge() >= 19 && user.getAge() < 35 ? true : false;
        }).count();
        System.out.println(ageResult);




    }
}
