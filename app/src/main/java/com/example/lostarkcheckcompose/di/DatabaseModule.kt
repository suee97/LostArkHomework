package com.example.lostarkcheckcompose.di

import android.content.Context
import androidx.room.Room
import com.example.lostarkcheckcompose.data.ProfileDatabase
import com.example.lostarkcheckcompose.utils.Constants.TABLE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

object DatabaseModule {

    @Module
    @InstallIn(SingletonComponent::class)
    object DatabaseModule {

        @Singleton
        @Provides
        fun provideDatabase(
            @ApplicationContext context: Context
        ) = Room.databaseBuilder(
            context,
            ProfileDatabase::class.java,
            TABLE_NAME
        ).build()

        @Singleton
        @Provides
        fun provideDao(database: ProfileDatabase) = database.ProfileDao()
    }

}