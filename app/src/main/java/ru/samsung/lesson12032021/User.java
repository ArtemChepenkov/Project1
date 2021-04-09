package ru.samsung.lesson12032021;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private long id;
    private String name;
    private int days;
    private String date1;
    static int ID = 1;
    private String expirationDate;

    public User(long id, String name, int days) {
        SimpleDateFormat formater = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();
        String date1 = formater.format(date);
        this.id = id;
        this.name = name;
        this.days = days;
        this.date1 = date1;
        Date date2 = new Date();
        expirationDate = formater.format(date2.getTime()+days*86400000);

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return days;
    }

    public void setYear(int days) {
        this.days = days;
    }


    @Override
    public String toString() {
        return this.name + "\n" +"Добавлено: " +this.date1+ "\n" +"Истечёт "+this.expirationDate;
    }
}
