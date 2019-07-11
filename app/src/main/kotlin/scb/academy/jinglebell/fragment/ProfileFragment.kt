package scb.academy.jinglebell.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_profile.*
import android.content.Intent
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.fragment_profile.view.*
import scb.academy.jinglebell.R


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val _view = inflater.inflate(scb.academy.jinglebell.R.layout.fragment_profile, container, false)


        _view.submitButton.setOnClickListener {
//            val name = nameEditText.text.toString()
//            val intent = Intent(context, UserGreetingFragment::class.java)
//            intent.putExtra("name", name)
//            startActivity(intent)

            val fm = activity!!.supportFragmentManager
            val transaction = fm.beginTransaction()
            transaction.replace(scb.academy.jinglebell.R.id.profile, UserGreetingFragment()).commit()
        }

        return _view
    }


}
