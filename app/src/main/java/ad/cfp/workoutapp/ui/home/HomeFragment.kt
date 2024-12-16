package ad.cfp.workoutapp.ui.home

import ad.cfp.workoutapp.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import ad.cfp.workoutapp.databinding.FragmentHomeBinding
import ad.cfp.workoutapp.ui.home.adapter.CardAdapter
import ad.cfp.workoutapp.ui.home.model.CardItem

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Configuración del RecyclerView
        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Crear una lista de elementos de ejemplo para mostrar
        val cardItemList = listOf(
            CardItem("ABS Principiant", "Descripción 1", R.drawable.cabina),
            CardItem("PIT PRINCIPIANT", "Descripción 1", R.drawable.chestbegg),
        )

        // Configurar el adaptador
        val adapter = CardAdapter(cardItemList)
        recyclerView.adapter = adapter

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
