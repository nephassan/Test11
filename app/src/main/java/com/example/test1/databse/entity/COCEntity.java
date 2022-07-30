package com.example.test1.databse.entity;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity

public class COCEntity
{
    @PrimaryKey(autoGenerate = true)
    private   long id;
    private String Category;
    private String Code;
    private String Typecode;
    private String Description;


    public long getId() {
        return id;
    }

    public String getCode() {
        return Code;
    }

    public String getTypecode() {
        return Typecode;
    }

    public String getDescription() {
        return Description;
    }

    public String getCategory() {
        return Category;
    }

    public COCEntity(long id, String Category, String Code, String Typecode, String Description)
    {
        this.id = id;
        this.Category = Category;
        this.Code = Code;
        this.Typecode = Typecode;
        this.Description = Description;
    }

}