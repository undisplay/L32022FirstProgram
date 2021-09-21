package core;

import java.util.Vector;

public class Materials {
    private int materialsID;
    private String ide;
    private String jdk;
    private Vector<String> books;

    public Materials(int materialsID,String ide, String jdk, Vector<String> books){
        this.ide = ide;
        this.jdk = jdk;
        this.books = books;
    }

    public Materials(){

    }

    public int getMaterialsID() {
        return materialsID;
    }

    public Vector<String> getBooks() {
        return books;
    }

    public String getIde() {
        return ide;
    }

    public String getJdk() {
        return jdk;
    }

    public void setMaterialsID(int materialsID) {
        this.materialsID = materialsID;
    }

    public void setBooks(Vector<String> books) {
        this.books = books;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public void setJdk(String jdk) {
        this.jdk = jdk;
    }

    public Vector<String> addBook(String book){
        this.books.add(book);
        return this.books;
    }

    @Override
    public String toString() {
        return "Materials{" +
                "materialsID=" + materialsID +
                ", ide='" + ide + '\'' +
                ", jdk='" + jdk + '\'' +
                ", books=" + books +
                '}';
    }
}
