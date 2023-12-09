package uz.g20.server.model;

public abstract class IDcreator {
    protected double id;
    private static double id_count;

    public IDcreator() {
        id_count ++;
        id = id_count;
    }

    public double getId() {
        return id;
    }
}
