package com.example.alexanderyakovenko.listmaker

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by alexanderyakovenko on 3/25/18.
 */
class ListSelectionRecyclerViewAdapter(val lists: ArrayList<TaskList>): RecyclerView.Adapter<ListSelectionViewHolder>() {

    // 3
    val listTitles = arrayListOf("Shopping list", "Chores", "Android Tutorials")

    // create in folder layout - LayoutResourceFile
    // Root element android.support.constraint.ConstraintLayout change to LinearLayout
    // create list_selection_view_holder.xml

    override fun getItemCount(): Int {
        return lists.size //listTitles.size
    }

    override fun onBindViewHolder(holder: ListSelectionViewHolder?, position: Int) {
        // 6
        if (holder != null) {
            holder.listPosition.text = (position +1).toString()
            // replace for ListdataManager and TaskList
            //holder.listTitle.text = listTitles[position]
            holder.listTitle.text = lists.get(position).name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ListSelectionViewHolder {
        // 4
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.list_selection_view_holder, parent,false)
        return ListSelectionViewHolder(view)
    }


    // add for TaskList and ListDataManager
    fun addList(list: TaskList) {
        lists.add(list)
        notifyDataSetChanged()
    }
}