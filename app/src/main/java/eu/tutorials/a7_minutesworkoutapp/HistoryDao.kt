package eu.tutorials.a7_minutesworkoutapp

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

//create a dao interface with insert method
@Dao
interface HistoryDao {

    @Insert
    fun insert(historyEntity: HistoryEntity)

    @Query("SELECT * FROM history_table")
    fun fetchAllDates(): Flow<List<HistoryEntity>>
}