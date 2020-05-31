package kr.ptus.jickbangcopy_20200531

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun setupEvent()
    abstract fun setValues()

}