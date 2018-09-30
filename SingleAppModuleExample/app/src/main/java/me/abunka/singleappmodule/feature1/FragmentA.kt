package me.abunka.singleappmodule.feature1

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_a.*
import me.abunka.singleappmodule.R
import me.abunka.singleappmodule.feature2.ActivityF

class FragmentA: Fragment() {
    companion object {
        fun newInstance() = FragmentA()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_a, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        goToB.setOnClickListener { startActivity(ActivityB.getIntent(requireContext())) }
        goToF.setOnClickListener { startActivity(ActivityF.getIntent(requireContext())) }
    }
}