package me.abunka.singleappmodule.feature2

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_d.*
import me.abunka.singleappmodule.R

class FragmentD: Fragment() {
    companion object {
        fun newInstance() = FragmentD()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_d, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        goToE.setOnClickListener { startActivity(ActivityE.getIntent(requireContext())) }
    }

}

