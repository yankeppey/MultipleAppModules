package me.abunka.multipleappmodules.feature1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_a.*
import javax.inject.Inject

class FragmentA: DaggerFragment() {
    companion object {
        fun newInstance() = FragmentA()
    }

    @Inject
    lateinit var navigation: Feature1Navigation

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_a, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        goToB.setOnClickListener { startActivity(ActivityB.getIntent(requireContext())) }
        goToF.setOnClickListener { navigation.goToF(requireActivity()) }
    }
}

