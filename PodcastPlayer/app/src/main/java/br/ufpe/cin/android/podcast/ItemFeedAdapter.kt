package br.ufpe.cin.android.podcast

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.itemlista.view.*

// Custom Adapter para Item Feed
// Baseado no PessoaAdapter visto em sala
class ItemFeedAdapter (private val items: List<ItemFeed>, private val c: Context) : RecyclerView.Adapter<ItemFeedAdapter.ViewHolder>() {

    override fun getItemCount(): Int = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(c).inflate(R.layout.itemlista, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.item_title?.text = item.title
        holder.item_date?.text = item.pubDate

    }

    class ViewHolder (item: View) : RecyclerView.ViewHolder(item), View.OnClickListener {
        val item_title = item.item_title
        val item_date = item.item_date

        init {
            item.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            TODO("not implemented") //necessary due to abstract inheritance
        }
    }
}