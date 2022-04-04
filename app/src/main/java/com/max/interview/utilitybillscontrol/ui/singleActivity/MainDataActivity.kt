package com.max.interview.utilitybillscontrol.ui.singleActivity

import android.os.Bundle
import android.view.LayoutInflater
import com.max.interview.utilitybillscontrol.core.BaseActivity
import com.max.interview.utilitybillscontrol.databinding.ActivityDataMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainDataActivity : BaseActivity<ActivityDataMainBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityDataMainBinding =
        ActivityDataMainBinding::inflate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


}