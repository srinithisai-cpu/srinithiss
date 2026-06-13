public class Day8enumm {
    enum LANGUAGE {
        EN("English"),
        GR("German"),
        JP("Japanese"),
        TA("Tamil");

        String description;

        LANGUAGE(String description) {
            this.description = description;
        }
    }

    static void main() {
        System.out.println(LANGUAGE.EN.description);
    }
}