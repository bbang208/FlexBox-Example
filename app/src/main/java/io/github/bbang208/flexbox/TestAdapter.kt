package io.github.bbang208.flexbox

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TestAdapter(private val list: ArrayList<String>) : RecyclerView.Adapter<TestAdapter.TestViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return TestViewHolder(view)
    }

    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        holder.textViewHolder.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class TestViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewHolder: TextView = itemView.findViewById(R.id.itemTextView)
    }
}
