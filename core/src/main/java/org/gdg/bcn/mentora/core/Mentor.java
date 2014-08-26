package org.gdg.bcn.mentora.core;

class Mentor {
    private final String name;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
