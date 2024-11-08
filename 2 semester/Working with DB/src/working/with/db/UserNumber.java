/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package working.with.db;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maksim
 */
public class UserNumber {
    private int id;
    private String number;
    private List<Contact> contacts = new ArrayList<>();

    public UserNumber(int id, String number) {
        this.id = id;
        this.number = number;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number;
    }
}
