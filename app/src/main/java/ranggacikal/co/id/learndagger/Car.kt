package ranggacikal.co.id.learndagger

import android.nfc.Tag
import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    private val wheels: Wheels,
    private val engine: Engine
) {

    fun drive(){
        Log.d(TAG, "drive: Ngeeennggg")
    }

    companion object {
        private const val TAG = "Car"
    }
}