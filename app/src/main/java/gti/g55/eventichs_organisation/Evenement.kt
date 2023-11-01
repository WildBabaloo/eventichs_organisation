package gti.g55.eventichs_organisation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Evenement.newInstance] factory method to
 * create an instance of this fragment.
 */
class Evenement : Fragment() {
    // TODO: Rename and change types of parameters
    //lateinit var btnVersAcceuil:Button
    lateinit var btnVersProfil:Button
    lateinit var btnVersCréerEvénement:Button
    lateinit var btnVersDétailévénement:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_evenement, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnVersProfil=view.findViewById(R.id.buttonVersProfil)
        btnVersCréerEvénement=view.findViewById(R.id.bouttonVersCréer)
        btnVersDétailévénement=view.findViewById(R.id.bouttonVersDétail)


        btnVersProfil.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_evenement_to_ecranProfil)
        }
        btnVersCréerEvénement.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_evenement_to_creerEvenement)
        }
        btnVersDétailévénement.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_evenement_to_evenement_detail)
        }


    }
}