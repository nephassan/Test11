package com.example.test1.databse;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.test1.Const;
import com.example.test1.databse.dao.ContactDao;
import com.example.test1.databse.entity.COCEntity;
import com.example.test1.databse.entity.ContactEntity;

@Database(version = 7,entities = {ContactEntity.class, COCEntity.class})

public abstract  class Appdb extends RoomDatabase
{
    private static Appdb db;

    public abstract ContactDao getContactDao();

    public static synchronized Appdb getDb_instance(Context context)
    {
        if(db==null)
        {
            db = Room.databaseBuilder(context.getApplicationContext(),
                            Appdb.class, Const.DB_name)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }

        return db;
    }

}
