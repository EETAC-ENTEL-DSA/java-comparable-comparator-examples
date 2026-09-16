import edu.upc.eetac.dsa.model.User;

import java.util.Arrays;
import java.util.Comparator;

import static edu.upc.eetac.dsa.utils.Utils.print;
import static edu.upc.eetac.dsa.utils.Utils.sort;

public class UserSortingExample {

    static Comparator<User> CMP_USER_1 = new  Comparator<User>() {

        @Override
        public int compare(User o1, User o2) {
            return o1.getSurname().compareTo(o2.getSurname());
        }
    };

    static Comparator<User> CMP_USER_2=
            (o1, o2) -> o1.getSurname().compareTo(o2.getSurname());


    static Comparator<User> CMP_USER_3=
            (o1, o2) -> Double.compare(o1.getRating(), o2.getRating());

    static Comparator<User> CMP_USER_4 =
            Comparator.comparingDouble(User::getRating);

    static Comparator<User> CMP_USER_5_REVERSED =
            Comparator.comparingDouble(User::getRating).reversed();

    public static void main(String[] args) {
        User[] users = {
                new User(200, "Kermit", "Frog", 4.8),
                new User(2, "Miss Piggy", "Pig", 4.5),
                new User(100, "Gonzo", "Whatever", 3),
                new User(1, "Fozzie", "Bear", 2.2),
                new User(3, "Animal", "Monster", 2.9)
        };


        System.out.println("ID");
        Arrays.sort(users);
        print(users);

        System.out.println("SURNAME");
        Arrays.sort(users, CMP_USER_1);
        print(users);

        System.out.println("SURNAME");
        Arrays.sort(users, CMP_USER_2);
        print(users);

        System.out.println("RATING");
        Arrays.sort(users, CMP_USER_3);
        print(users);

        System.out.println("RATING");
        Arrays.sort(users, CMP_USER_4);
        print(users);

        System.out.println("RATING-REVERSED");
        Arrays.sort(users, CMP_USER_5_REVERSED);
        print(users);

    }

}
