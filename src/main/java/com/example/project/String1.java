package com.example.project;

public class String1 {
    private char[] str;
    private int size;

    public String1() {
        size = 0;
        str = new char[80];
    }

    public void append(char c) {
        str[size++] = c;
    }

    public char remove() {
        if (size == 0) {
            throw new IllegalStateException("String is empty");
        }
        return str[--size];
    }

    public char getChar(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return str[i];
    }

    public int length() {
        return size;
    }

    public void makeEmpty() {
        size = 0;
    }

    public void concat(String1 s) {
        for (int i = 0; i < s.length(); i++) {
            append(s.getChar(i));
        }
    }

    public boolean equal(String1 s) {
        if (this.length() != s.length()) {
            return false;
        }
        for (int i = 0; i < this.length(); i++) {
            if (this.getChar(i) != s.getChar(i)) {
                return false;
            }
        }
        return true;
    }

    public void reverse() {
        for (int i = 0; i < this.length() / 2; i++) {
            char temp = str[i];
            str[i] = str[size - i - 1];
            str[size - i - 1] = temp;
        }
    }
}
