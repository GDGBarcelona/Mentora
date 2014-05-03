package org.gdg.bcn.mentora.core;

public class ExampleClass {
    public String makeHash(String s) throws makeHashNullString {
        if (s==null) throw new makeHashNullString();
        if (s.equals("a")) return "ASDF";
        return "";
    }

    public class makeHashNullString extends Exception {}
}
