package dev.ogabek.kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.adapter.FeedAdapter
import dev.ogabek.kotlin.model.Feed
import dev.ogabek.kotlin.model.Post
import dev.ogabek.kotlin.model.Story

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = FeedAdapter(this, allFeeds())
    }

    private fun allFeeds(): ArrayList<Feed> {
        val stories: ArrayList<Story> = ArrayList<Story>()
        stories.add(Story())
        stories.add(Story(R.drawable.aziz, "Azizbek", R.drawable.aziz))
        stories.add(Story(R.drawable.bogibek, "Bogibek Matyaqubov", R.drawable.bogibek))
        stories.add(Story(R.drawable.elmurod, "Elmurod Nazirov", R.drawable.elmurod))
        stories.add(Story(R.drawable.jabbor, "Jabbor", R.drawable.jabbor))
        stories.add(Story(R.drawable.jonibek, "Jonibek Xolmonov", R.drawable.jonibek))
        stories.add(Story(R.drawable.ogabekdev, "Ogabek Matyakubov", R.drawable.ogabekdev))
        stories.add(Story(R.drawable.shakhriyor, "Shakhriyor", R.drawable.shakhriyor))
        stories.add(Story(R.drawable.yahyo, "Yahyo Mahmudiy", R.drawable.yahyo))
        val feeds: ArrayList<Feed> = ArrayList<Feed>()

        //Head
        feeds.add(Feed())

        //Story
        feeds.add(Feed(stories))

        //Post
        feeds.add(Feed(Post(R.drawable.aziz, "Azizbek", R.drawable.post_1, false)))
        feeds.add(Feed(Post(R.drawable.bogibek, "Bogibek Matyaqubov", R.drawable.post_2, false)))
        feeds.add(Feed(Post(R.drawable.elmurod, "Elmurod Nazirov", R.drawable.post_3, false)))
        feeds.add(Feed(Post(R.drawable.jabbor, "Jabbor", R.drawable.jabbor, true)))
        feeds.add(Feed(Post(R.drawable.jonibek, "Jonibek Xolmonov", R.drawable.post_1, false)))
        feeds.add(Feed(Post(R.drawable.ogabekdev, "Ogabek Matyakubov", R.drawable.ogabekdev, true)))
        feeds.add(Feed(Post(R.drawable.shakhriyor, "Shakhriyor", R.drawable.post_3, false)))
        feeds.add(Feed(Post(R.drawable.yahyo, "Yahyo Mahmudiy", R.drawable.post_4, false)))
        feeds.add(Feed(Post(R.drawable.aziz, "Azizbek", R.drawable.aziz, true)))
        feeds.add(Feed(Post(R.drawable.bogibek, "Bogibek Matyaqubov", R.drawable.post_2, false)))
        feeds.add(Feed(Post(R.drawable.elmurod, "Elmurod Nazirov", R.drawable.elmurod, true)))
        feeds.add(Feed(Post(R.drawable.jabbor, "Jabbor", R.drawable.post_4, false)))
        feeds.add(Feed(Post(R.drawable.jonibek, "Jonibek Xolmonov", R.drawable.post_1, false)))
        feeds.add(Feed(Post(R.drawable.ogabekdev, "Ogabek Matyakubov", R.drawable.post_2, false)))
        feeds.add(Feed(Post(R.drawable.shakhriyor, "Shakhriyor", R.drawable.post_3, false)))
        feeds.add(Feed(Post(R.drawable.yahyo, "Yahyo Mahmudiy", R.drawable.yahyo, true)))
        feeds.add(Feed(Post(R.drawable.aziz, "Azizbek", R.drawable.post_1, false)))
        feeds.add(Feed(Post(R.drawable.bogibek, "Bogibek Matyaqubov", R.drawable.post_2, false)))
        feeds.add(Feed(Post(R.drawable.elmurod, "Elmurod Nazirov", R.drawable.elmurod, true)))
        feeds.add(Feed(Post(R.drawable.jabbor, "Jabbor", R.drawable.post_4, false)))
        feeds.add(Feed(Post(R.drawable.jonibek, "Jonibek Xolmonov", R.drawable.post_1, false)))
        feeds.add(Feed(Post(R.drawable.ogabekdev, "Ogabek Matyakubov", R.drawable.post_2, false)))
        feeds.add(Feed(Post(R.drawable.shakhriyor, "Shakhriyor", R.drawable.shakhriyor, true)))
        feeds.add(Feed(Post(R.drawable.yahyo, "Yahyo Mahmudiy", R.drawable.post_4, false)))
        return feeds
    }
}