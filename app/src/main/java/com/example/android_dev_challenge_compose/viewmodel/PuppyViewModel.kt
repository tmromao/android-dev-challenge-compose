package com.example.android_dev_challenge_compose.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android_dev_challenge_compose.R
import com.example.android_dev_challenge_compose.model.PuppyData

class PuppyViewModel() : ViewModel() {

    val puppysList: MutableLiveData<List<PuppyData>> by lazy {

        MutableLiveData<List<PuppyData>>()
    }

    private var puppyList: ArrayList<PuppyData>

    init {
        puppyList = ArrayList()
        getPuppyList()
    }

    private fun getPuppyList() {
        fetchList()
        puppysList.value = puppyList
    }

    private fun fetchList() {
        /****/
        puppyList.add(PuppyData(R.drawable.yellow_dog,"Yellow","bear bla bla bla"))
       // puppyList.add(PuppyData(R.drawable.finns,"Finns","finns bla bla bla"))
     //   puppyList.add(PuppyData(R.drawable.kais,"Kais","kais bla bla bla"))
      //  puppyList.add(PuppyData(R.drawable.pngegg,"PngEgg","PngEgg bla bla bla"))
        // puppyList.add(PuppyData(R.drawable.puppys,"Puppys","PngEgg bla bla bla"))



    }

}