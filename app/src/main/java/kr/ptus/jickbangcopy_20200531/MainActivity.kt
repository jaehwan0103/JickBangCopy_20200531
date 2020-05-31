package kr.ptus.jickbangcopy_20200531

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ptus.jickbangcopy_20200531.data.roomdata

class MainActivity : BaseActivity() {

    val rooms = ArrayList<roomdata>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvent()
        setValues()
    }

    override fun setupEvent() {



    }

    override fun setValues() {

        rooms.add(roomdata(8000,"마포구 서교동",1,"마포 서교동의 방입니다."))
        rooms.add(roomdata(23000,"마포구 서교동",3,"마포 서교동의 방입니다."))
        rooms.add(roomdata(14000,"마포구 서교동",5,"마포 서교동의 방입니다."))
        rooms.add(roomdata(16000,"마포구 서교동",4,"마포 서교동의 방입니다."))
        rooms.add(roomdata(6000,"마포구 성산동",0,"마포 성산동의 방입니다."))
        rooms.add(roomdata(45000,"마포구 성산동",1,"마포 성산동의 방입니다."))
        rooms.add(roomdata(23000,"마포구 성산동",0,"마포 성산동의 방입니다."))
        rooms.add(roomdata(12000,"마포구 망원동",-1,"마포 망원동의 방입니다."))
        rooms.add(roomdata(8000,"마포구 망원동",-1,"마포 망원동의 방입니다."))
        rooms.add(roomdata(6000,"마포구 망원동",2,"마포 망원동의 방입니다."))




    }


}
