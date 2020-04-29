package io.antinolabs.library.chitchat

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_create_user.*
import java.util.*

class CreateUserActivity : AppCompatActivity() {

    var userAvatar = "profileDefault"
    var avatarColor = "[0.5,0.5,0.5,1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)

    }

    fun createUserBtnClicked(view: View) {

    }

    fun generateAvatarBackgroundColour(view: View) {
        val random = Random()
        val r = random.nextInt(255)
        val g = random.nextInt(255)
        val b = random.nextInt(255)
        avatar_imageView_create_user.setBackgroundColor(Color.rgb(r,g,b))
        val savedR = r.toDouble() / 255;
        val savedG = g.toDouble() / 255;
        val savedB = b.toDouble() / 255;
        avatarColor = "[$savedR,$savedG,$savedB,1]"
    }

    fun changeUserAvatar(view: View) {
        val random = Random()
        val color = random.nextInt(2)
        val avatar = random.nextInt(28)
        if (color == 0)
            userAvatar = "light$avatar"
        else
            userAvatar = "dark$avatar"
        val resourceId = resources.getIdentifier(userAvatar,"drawable",packageName)
        avatar_imageView_create_user.setImageResource(resourceId)
    }
}
