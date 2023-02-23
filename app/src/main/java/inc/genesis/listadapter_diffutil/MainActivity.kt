package inc.genesis.listadapter_diffutil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView =findViewById<RecyclerView>(R.id.recycler_view)
        val adapter=ProgrammingAdapter()

        val p1=ProgrammingItem(1,"J","Java")
        val p2=ProgrammingItem(2,"K","Kotlin")
        val p3=ProgrammingItem(3,"P","Python")



        adapter.submitList(listOf(p1,p2,p3))


        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter=adapter


        Handler(Looper.getMainLooper()).postDelayed({
            val p3=ProgrammingItem(3,"P","Python")
            val p4=ProgrammingItem(4,"C","C#")
            val p5=ProgrammingItem(5,"J","Javascript")
           adapter.submitList(listOf(p3,p4,p5))
        },3000)

    }
}