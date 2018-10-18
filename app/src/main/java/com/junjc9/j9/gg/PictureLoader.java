package com.junjc9.j9.gg

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Handler
import android.os.Message
import android.widget.ImageView
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL

class PictureLoader {
    private var loadImg: ImageView? = null
    private var imgUrl: String? = null
    private var picByte: ByteArray? = null
    internal var handler: Handler = object : Handler() {
        override fun handleMessage(msg: Message) {
            super.handleMessage(msg)
            if (msg.what == 0x123) {
                if (picByte != null) {
                    val bitmap = BitmapFactory.decodeByteArray(picByte, 0, picByte!!.size)
                    loadImg!!.setImageBitmap(bitmap)
                }
            }
        }
    }
    internal var runnable: Runnable = Runnable {
        try {
            val url = URL(imgUrl)
            val conn = url.openConnection() as HttpURLConnection
            conn.requestMethod = "GET"
            conn.readTimeout = 10000
            if (conn.responseCode == 200) {
                val `in` = conn.inputStream
                val out = ByteArrayOutputStream()
                val bytes = ByteArray(1024)
                var length = -1
                while ((length = `in`.read(bytes)) != -1) {
                    out.write(bytes, 0, length)
                }
                picByte = out.toByteArray()
                `in`.close()
                out.close()
                handler.sendEmptyMessage(0x123)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    fun load(loadImg: ImageView, imgUrl: String) {
        this.loadImg = loadImg
        this.imgUrl = imgUrl
        Thread(runnable).start()
    }
}