import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val recyclerView: RecyclerView = findViewById(R.id.dogsRecyclerView)
        val dogsList = listOf("Dog 1", "Dog 2", "Dog 3", "Dog 4", "Dog 5", "Dog 6", "Dog 7", "Dog 8", "Dog 9")

        // Set up RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = DogsAdapter(dogsList)
    }
}
