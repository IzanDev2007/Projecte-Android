package ad.cfp.workoutapp.ui.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ad.cfp.workoutapp.R
import ad.cfp.workoutapp.ui.home.model.CardItem

class CardAdapter(private val cardItemList: List<CardItem>) : RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return CardViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val cardItem = cardItemList[position]
        holder.textTitle.text = cardItem.title
        holder.textDescription.text = cardItem.description
        holder.imageView.setImageResource(cardItem.imageResId)
    }

    override fun getItemCount(): Int = cardItemList.size

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textTitle: TextView = itemView.findViewById(R.id.textTitle)
        val textDescription: TextView = itemView.findViewById(R.id.textDescription)
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }
}
