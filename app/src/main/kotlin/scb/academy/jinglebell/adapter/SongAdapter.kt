package scb.academy.jinglebell.adapter

import android.app.PendingIntent.getActivity
import android.content.Intent
import android.content.Intent.getIntent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import scb.academy.jinglebell.activity.SongInfoActivity
import scb.academy.jinglebell.extension.setImageUrl
import scb.academy.jinglebell.vo.Song
import androidx.core.content.ContextCompat.startActivity
import scb.academy.jinglebell.R
import scb.academy.jinglebell.activity.MainActivity
import scb.academy.jinglebell.fragment.SongListFragment
import java.security.AccessController.getContext


class SongAdapter(
    private var _songs: List<Song> = listOf(),
    private val onClick: (Song) -> Unit = {}
) : RecyclerView.Adapter<SongItemViewHolder>() {

    val songs: List<Song>
        get() = _songs

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = SongItemViewHolder(parent)

    override fun onBindViewHolder(holder: SongItemViewHolder, position: Int) {
        holder.bind(_songs[position], onClick)
    }

    override fun getItemCount(): Int {
        return if (songs.count() == 0) {
            0
        } else {
            songs.count() + 1
        }
    }

    fun submitList(list: List<Song>) {
        _songs = list
        notifyDataSetChanged()
    }

}

class SongItemViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(scb.academy.jinglebell.R.layout.item_song, parent, false)
) {


    private val ivSongArtwork: ImageView = itemView.findViewById(scb.academy.jinglebell.R.id.iv_song_artwork)
    private val tvSongName: TextView = itemView.findViewById(scb.academy.jinglebell.R.id.tv_song_name)
    private val tvSongArtist: TextView = itemView.findViewById(scb.academy.jinglebell.R.id.tv_song_artist)
    private val tvSongPrice: TextView = itemView.findViewById(scb.academy.jinglebell.R.id.tv_song_price)

    fun bind(song: Song, onClick: (Song) -> Unit = {}) {
        tvSongName.text = song.name
        tvSongArtist.text = song.artistName
        tvSongPrice.text = "${song.price} ${song.priceCurrency}"
        ivSongArtwork.setImageUrl(song.artworkUrl)

        itemView.setOnClickListener {
            onClick(song)
            Log.i("song",song.name)
            val songInfo = SongInfoActivity()
            val intent = Intent(itemView.context, SongInfoActivity::class.java)
            intent.putExtra("song", song)
            startActivity(itemView.context, intent, intent.extras)
//            SongInfoActivity.startActivity(itemView.context, song)
        }
    }



}
