import java.util.StringJoiner;

public class Main2 {
    public static void main(String[] args) {
        String name1 = "Aleksey";
        String name2 = "Vasiliy";
        String name3 = "Georgiy";

        String list = String.join("," , name1,name2,name3);

        System.out.println(list);
    }
}
