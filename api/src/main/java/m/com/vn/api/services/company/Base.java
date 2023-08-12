package m.com.vn.api.services.company;

public abstract class Base {
    public String toSearchString(String code, String name) {
        return String.format("%s|%s", code, name);
    }
}
