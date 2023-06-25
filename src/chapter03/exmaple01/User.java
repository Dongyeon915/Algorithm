package chapter03.exmaple01;

public class User implements Comparable<User> {
    private int userId;
    private String name;
    private int age;
    private String email;

    public User(int userId, String name, int age, String email) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
            "userId=" + userId +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", email='" + email + '\'' +
            '}';
    }

//   클래스 comparable를 기준으로 정렬해준다.
    @Override
    public int compareTo(User o) {
        if (this.age == o.getAge()) {
            return -1 * Integer.compare(this.userId, o.userId);
        }
        return Integer.compare(this.age, o.age);
    }
}
