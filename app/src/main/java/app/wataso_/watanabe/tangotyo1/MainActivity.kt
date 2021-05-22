package app.wataso_.watanabe.tangotyo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.UserDictionary.Words.addWord
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val apple = Word(R.drawable.apple_icon, "りんご")
        val banana = Word(R.drawable.banana_icon, "バナナ")
        val orange = Word(R.drawable.orange_icon, "オレンジ")
        val strawberry = Word(R.drawable.strawberry_icon, "いちご")

        addWord(apple)
        addWord(banana)
        addWord(orange)
        addWord(strawberry)


    }

    private fun addWord(word: Word) {


//それぞれの単語を画面に追加する

        val nameTextView = TextView(this)
        nameTextView.text = word.name

        //Linearlayoutインスタンスを生成する
        val layout = LinearLayout(this)

        layout.orientation = LinearLayout.HORIZONTAL

        //ImageViewのインスタンスを生成
        val imageView = ImageView(this)

        //appleが持っているリソースIDを使って、画像をImageViewに設定する
        imageView.setImageResource(word.resId)

        layout.addView(imageView)
        layout.addView(nameTextView)

        //全体の枠に、小さな枠を入れる
        container.addView(layout)


        //container.addView(nameTextView)
        imageView.layoutParams = LinearLayout.LayoutParams(500, 450)

    }
}