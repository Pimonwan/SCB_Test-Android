package scb.academy.jinglebell.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_profile.view.*




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
            val name = _view.nameEditText.text.toString()
            val fm = activity!!.supportFragmentManager

            val fragment = Fragment()
            val bundle = Bundle()
            bundle.putString("name", name)
            fragment.arguments = bundle

            val transaction = fm.beginTransaction()
            transaction.replace(scb.academy.jinglebell.R.id.profile, UserGreetingFragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }

        return _view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}
