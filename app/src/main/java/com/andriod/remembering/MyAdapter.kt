package com.andriod.remembering

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.andriod.remembering.databinding.ItemEntityBinding

class MyAdapter() : RecyclerView.Adapter<MyAdapter.MyVH>() {
    var entities: List<MyEntity> = ArrayList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    inner class MyVH(private val binding: ItemEntityBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(entity: MyEntity) {
            binding.valueTextView.text = entity.value
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyVH {
        return MyVH(ItemEntityBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: MyVH, position: Int) {
        holder.bind(entities[position])
    }

    override fun getItemCount(): Int = entities.size
}