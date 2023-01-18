package llc.amplitudo.amplitudo_akademija

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import llc.amplitudo.amplitudo_akademija.databinding.FragmentGetStartedBinding


class GetStartedFragment : Fragment() {

    private var _binding: FragmentGetStartedBinding? = null
    private val binding: FragmentGetStartedBinding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       _binding = FragmentGetStartedBinding.inflate(inflater,container,false)
        return  binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        clearBinding()
    }
    private fun clearBinding(){
        _binding = null
    }

}