package Builder;

public class Main {
    public static void main(String[] args) {
        Useer user = Useer.builder()
                .firstName("Dasha")
                .lastName("Minieieva")
                .occupation("UCU")
                .occupation("UCU again")
                .build();
        System.out.println(user.toString());
    }

}
