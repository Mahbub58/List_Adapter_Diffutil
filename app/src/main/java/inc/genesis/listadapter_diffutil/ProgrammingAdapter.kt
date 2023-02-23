package inc.genesis.listadapter_diffutil

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil.ItemCallback
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ProgrammingAdapter : androidx.recyclerview.widget.ListAdapter<ProgrammingItem, ProgrammingAdapter.ProgrammingViewHolder>(DiffUtil()) {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgrammingViewHolder {
        val view=LayoutInflater.from(parent.context). inflate(R.layout.item_view,parent,false)
        return ProgrammingViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProgrammingViewHolder,position : Int){
        val item=getItem(position)
        holder.bind(item)
    }



    class ProgrammingViewHolder(view:View) : RecyclerView.ViewHolder(view){

        val initial=view.findViewById<TextView>(R.id.initial)
        val name=view.findViewById<TextView>(R.id.name)

        fun bind(item: ProgrammingItem){
             initial.text=item.initial
            name.text=item.name
        }
    }



    class DiffUtil : androidx.recyclerview.widget.DiffUtil.ItemCallback<ProgrammingItem>() {
        override fun areItemsTheSame(oldItem: ProgrammingItem, newItem: ProgrammingItem): Boolean {
            return oldItem.id==newItem.id
        }

        override fun areContentsTheSame(
            oldItem: ProgrammingItem,
            newItem: ProgrammingItem
        ): Boolean {
           return oldItem==newItem
        }

    }

}