package com.max.interview.utilitybillscontrol.ui.screens.selectBill

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.max.interview.utilitybillscontrol.R
import com.max.interview.utilitybillscontrol.core.BaseFragment
import com.max.interview.utilitybillscontrol.databinding.FragmentBillBinding


class BillFragment : BaseFragment<FragmentBillBinding>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun initBinding(inflater: LayoutInflater, container: ViewGroup?) = FragmentBillBinding.inflate(layoutInflater)

}