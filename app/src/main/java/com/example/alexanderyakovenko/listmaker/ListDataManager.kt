package com.example.alexanderyakovenko.listmaker

import android.content.Context
import android.preference.PreferenceManager
import java.util.prefs.PreferenceChangeEvent

/**
 * Created by alexanderyakovenko on 3/25/18.
 */

// + TaskList

class ListDataManager(val context: Context) {

    fun saveList(list: TaskList) {
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context).edit()
        sharedPreferences.putStringSet(list.name, list.tasks.toHashSet())
        sharedPreferences.apply()
    }

    fun readLists(): ArrayList<TaskList> {
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
        val sharedPreferenceContents = sharedPreferences.all
        val taskLists = ArrayList<TaskList>()
        for (preferenceItem in sharedPreferenceContents) {
            val itemsHashSet = preferenceItem.value as HashSet<String>
            val list = TaskList(preferenceItem.key, ArrayList(itemsHashSet))
            taskLists.add(list)
        }
        return taskLists
    }


}