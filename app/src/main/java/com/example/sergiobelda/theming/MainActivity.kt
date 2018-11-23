package com.example.sergiobelda.theming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.shape.RoundedCornerTreatment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MaterialShapeDrawable().apply {
            val treatment = RoundedCornerTreatment(24.0f)
            shapeAppearanceModel.setAllCorners(treatment)
        }
    }
}
