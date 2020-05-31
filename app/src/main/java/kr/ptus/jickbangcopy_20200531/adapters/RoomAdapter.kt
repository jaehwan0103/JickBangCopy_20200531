package kr.ptus.jickbangcopy_20200531.adapters

import android.content.Context
import android.content.LocusId
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.view.*
import kr.ptus.jickbangcopy_20200531.R
import kr.ptus.jickbangcopy_20200531.data.roomdata

class RoomAdapter (context: Context, resId: Int, list : List<roomdata>) : ArrayAdapter<roomdata>(context,resId,list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null){
            tempRow= inf.inflate(R.layout.roomlist,null)
        }

        val row = tempRow!!

        return row

    }

}