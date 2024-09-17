public class Main3 {
    public static void main(String[] args) {
        String name = "Maksim";
        int birthYear = 1986;
        String template = "{\"name\" : \"%s\",\"birthdayYear\" : \"%d\"}";
        System.out.printf(template,name,birthYear);
    }
}
