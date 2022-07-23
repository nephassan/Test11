package com.example.test1.databse.entity;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(indices = {@Index(value = {"no"},
        unique = true)})
public class ContactEntity {

    @PrimaryKey(autoGenerate = true)
    private   long id;


    private String no;
    private String name;
   ;

    public long getId() {
        return id;
    }



    public String getNo() {
        return no;
    }



    public String getName() {
        return name;
    }




    public ContactEntity(long id, String no, String name) {
        this.id = id;
        this.no = no;
        this.name = name;
    }


}