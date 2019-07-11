package scb.academy.jinglebell.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_user_greeting.view.*
import android.util.Log


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

//        val name = getIntent("").getStringExtra("name")

        val _view = inflater.inflate(scb.academy.jinglebell.R.layout.fragment_user_greeting, container, false)
        var userName = ""
        val bundle = this.arguments
        if (bundle != null) {
            userName = bundle.getString("name", "")
            Log.i("jj",userName)
        }
        _view.nameText.text = userName

        return _view
    }


}
