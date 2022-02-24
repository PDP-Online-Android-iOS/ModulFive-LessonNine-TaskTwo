package dev.ogabek.kotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.model.Story

class StoryAdapter(private val stories: List<Story>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TYPE_CREATE_STORY_VIEW = 0
    private val TYPE_SIMPLE_STORY_VIEW = 1

    override fun getItemViewType(position: Int): Int {
        val story: Story = stories[position]
        return if (story.isCreateStory) {
            TYPE_CREATE_STORY_VIEW
        } else {
            TYPE_SIMPLE_STORY_VIEW
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == TYPE_CREATE_STORY_VIEW) {
            val view: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_create_story_view, parent, false)
            CreateStoryViewHolder(view)
        } else {
            val view: View =
                LayoutInflater.from(parent.context).inflate(R.layout.item_story_view, parent, false)
            StoryViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val story: Story = stories[position]
        if (holder is StoryViewHolder) {
            holder.iv_story_photo.setImageResource(story.photo)
            holder.iv_story_profile.setImageResource(story.profile)
            holder.tv_story_full_name.text = story.fullName
        }
    }

    override fun getItemCount(): Int {
        return stories.size
    }

    private class StoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iv_story_photo: ShapeableImageView = view.findViewById(R.id.iv_story_photo)
        var iv_story_profile: ShapeableImageView = view.findViewById(R.id.iv_story_profile)
        var tv_story_full_name: TextView = view.findViewById(R.id.tv_story_full_name)

    }

    private class CreateStoryViewHolder(view: View) : RecyclerView.ViewHolder(view)

}