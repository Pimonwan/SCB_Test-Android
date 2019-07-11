package scb.academy.jinglebell.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.content.Intent.getIntent
import kotlinx.android.synthetic.main.fragment_user_greeting.*
import kotlinx.android.synthetic.main.fragment_user_greeting.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class UserGreetingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val name = getIntent("").getStringExtra("name")

        val _view = inflater.inflate(scb.academy.jinglebell.R.layout.fragment_user_greeting, container, false)

        _view.nameText.text = name

        return _view
    }


}
