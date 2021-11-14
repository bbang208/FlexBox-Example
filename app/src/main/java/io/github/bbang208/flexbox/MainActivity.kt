package io.github.bbang208.flexbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.google.android.flexbox.FlexDirection
import com.google.android.flexbox.FlexWrap
import com.google.android.flexbox.FlexboxLayoutManager
import com.google.android.flexbox.JustifyContent

class MainActivity : AppCompatActivity() {

    private val list = arrayListOf<String>("123", "123123123", "12354124134123213", "123", "1123123", "12", "1123123", "12", "213123", "askjlfhsdkjlfhdskljfhslkjfdshajfklsdhalfkhdsa", "2134asfdoih", "ashkdj", "saffhasduifh324213432asdhsja", "a", "c", "a", "b", "ashkdj", "saffhasduifh324213432asdhsja", "aaaaa", "c", "abbbb", "b")

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: TestAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        adapter = TestAdapter(list)

        FlexboxLayoutManager(this).apply {
            flexWrap = FlexWrap.WRAP
            flexDirection = FlexDirection.ROW
            justifyContent = JustifyContent.CENTER
        }.let {
            recyclerView.layoutManager = it
            recyclerView.adapter = adapter
        }

    }
}