/**
 * The Module class is a child of parent KeyableMap.
 * 
 * @author Dominic Lim
 * @version: CS2030S AY20/21 Semester 1, Lab 5
 */
public class Module extends KeyableMap<Assessment> {
    private final String code;

    public Module(String code) {
        super(code);
        this.code = code;
    }

    public String getKey() {
        return this.code;
    }

    @Override
    public Module put(Assessment result) {
        super.put(result);
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.code, super.toString());
    }
}
