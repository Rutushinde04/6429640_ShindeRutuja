public class PatternMatchingSwitchDemo {
    public static void checkObjectType(Object obj) {
        String result = switch (obj) {
            case Integer i -> "Integer with value " + i;
            case String s -> "String: \"" + s + "\"";
            case Double d -> "Double: " + d;
            case null -> "Null value";
            default -> "Unknown type: " + obj.getClass().getName();
        };
        System.out.println(result);
    }

    public static void main(String[] args) {
        checkObjectType(100);
        checkObjectType("Hello");
        checkObjectType(3.14);
        checkObjectType(true);
        checkObjectType(null);
    }
}
