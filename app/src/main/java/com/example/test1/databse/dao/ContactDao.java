package com.example.test1.databse.dao;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.test1.databse.entity.ContactEntity;


import java.util.List;

@Dao
public interface ContactDao {

    @Query(" Select count(*)  from contactentity")
    public int get_count();


    @Query(" Select * from contactentity order by id")
    public List<ContactEntity> get_all_datas();



    @Query(" Delete from contactentity")
    public int del_all();



//    @Query(" Delete from contactentity where fno=:vno")
//    public int del_specific(String fno,String vno);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public Long insert_contact(ContactEntity tbl);


//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    public Long insert_contact_all(List<ContactEntity> tbl);



//    @Query(" =:qur")
//    public int exe_qur(String qur);

  /*  @Query(" Select sum(qty) from cart ")
    public LiveData<Integer> get_total_qty();




    @Query(" Select *  from cart where stkid=:stockid")
    public  CartEntity get_qty_of_stockid(String stockid);

    @Update
    void update(CartEntity tbl);


    @Query(" Update cart set qty=:qty where id=:id")
    public  int update_qty(long id,int qty);

    @Query(" Delete from cart where  id=:id")
    public int del_item(long id);

    @Query(" Update cart set rate=:rate ,offer_price=:offer_price,buy_qty=:buy_qty,free_qty=:free_qty,free_percent=:free_percent,offer_end_date=:offer_end_date  where stkid=:stkid")
    public int update_new_rate_and_offers(String stkid,float rate,float offer_price,int buy_qty,int free_qty,float free_percent,String offer_end_date);

    @Query(" Update cart set qty=:qty  where stkid=:stkid")
    public int update_avb_qty(String stkid,int qty);
    */


}