public class Box <T>{
    private T generic;

    public Box(T generic) {
        this.generic = generic;
    }

    public T getGeneric() {
        return generic;
    }
}
