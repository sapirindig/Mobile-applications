import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DogsAdapter(private val dogsList: List<String>) : RecyclerView.Adapter<DogsAdapter.DogViewHolder>() {

    class DogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dogName: TextView = itemView.findViewById(R.id.dogNameTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_dog, parent, false)
        return DogViewHolder(view)
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        holder.dogName.text = dogsList[position]
    }

    override fun getItemCount(): Int {
        return dogsList.size
    }
}
