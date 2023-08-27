package patterns.singleton;

public class Sun {
    private static Sun sun;

    private Sun() {
    }

    public static Sun getSun() {
        if (sun == null) {
            sun = new Sun();
        }
        return sun;
    }
}
