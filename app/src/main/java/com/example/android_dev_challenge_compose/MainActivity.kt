package com.example.android_dev_challenge_compose

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_dev_challenge_compose.model.PuppyData
import com.example.android_dev_challenge_compose.ui.theme.AndroiddevchallengecomposeTheme
import com.example.android_dev_challenge_compose.uitel.PuppyCard
import com.example.android_dev_challenge_compose.viewmodel.PuppyViewModel

class MainActivity : AppCompatActivity() {

    private val puppyViewModel: PuppyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroiddevchallengecomposeTheme {

                val puppyLists = puppyViewModel.puppysList.value
                SetPuppyList(puppyList = puppyLists!!, c = this)

            }
        }
    }
}


@Composable
fun SetPuppyList(puppyList: List<PuppyData>, c: Context) {

    LazyColumn{

        itemsIndexed(items = puppyList) { index, itemPuppy ->

            PuppyCard(puppData = itemPuppy, onClick = {

                Toast.makeText(c, itemPuppy.puppyName, Toast.LENGTH_SHORT).show()
            })
        }
    }

}

@Preview
@Composable
fun DefaultPreview() {

    //val puppyLists =

}