package com.example.newroomcoroutines.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.newroomcoroutines.database.Subscriber

@Dao
interface SubscriberDAO {
    @Insert
    suspend fun insertSubscriber(subscriber: Subscriber)

    @Update
    suspend fun updateSubscriber(subscriber: Subscriber)

    @Delete
    suspend fun deleteSubscriber(subscriber: Subscriber)

    @Query("DELETE FROM subscriber_data")
    suspend fun deleteAll()

    @Query("SELECT * FROM subscriber_data")
    fun getAllSubscribers(): LiveData<List<Subscriber>>
}
