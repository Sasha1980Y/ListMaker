package com.example.alexanderyakovenko.listmaker

import android.support.v7.widget.RecyclerView
import android.view.TextureView
import android.view.View
import android.widget.TextView

/**
 * Created by alexanderyakovenko on 3/25/18.
 */
class ListSelectionViewHolder(itemView: View?): RecyclerView.ViewHolder(itemView) {
    // 5
    val listPosition = itemView?.findViewById<TextView>(R.id.itemNumber) as TextView
    val listTitle = itemView?.findViewById<TextView>(R.id.itemString) as TextView
}