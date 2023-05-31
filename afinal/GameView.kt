package com.example.afinal

import android.content.Intent
import android.content.pm.ActivityInfo
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.project.BST

class GameView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_view)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()

        //inisialisasi xml
        val btn_left = findViewById<Button>(R.id.btn_left)
        val btn_right = findViewById<Button>(R.id.btn_right)
        val tv_main = findViewById<TextView>(R.id.tv_main)
        var tv_timer = findViewById<TextView>(R.id.tv_timer)
        val gv = findViewById<ConstraintLayout>(R.id.game_view)

        //variabel timer
        var timer = 15

        //jalannya timer dan pengecekan
        object : CountDownTimer(150000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                timer--
                //tv_timer.setText("Time remaining: " + millisUntilFinished / 1000)
                if (timer>=0){
                tv_timer.setText("Time remaining: " + timer)
                }else{
                    btn_right.setText("MAIN MENU")
                    btn_left.setText("TRY AGAIN")
                    tv_main.setText("You too much think and dead because of it")
                    gv.background = resources.getDrawable(R.drawable.die_screen)
                }

            }

            override fun onFinish() {
                tv_timer.setText("0")
            }
        }.start()

        //Inisialisasi Tree
        val bst = BST()
        var util: MutableList<String> = mutableListOf()
        var text: MutableList<String> = mutableListOf()
        var choice : MutableList<String?> = mutableListOf()
        var nextValue : MutableList<Int?> = mutableListOf()




//      1. Game Root / Awal cerita / #65
        util.add("car_crash_bmw")
        util.add("car_crash_skid")
        text.add("One day, you want to go hiking")
        text.add("But on the way, your car got stuck in deep woods")
        text.add("What would you do?")
        choice.add("Wait in car")
        choice.add("Find some help")
        nextValue.add(33)
        nextValue.add(97)
        bst.insert(65, util, text, choice, nextValue)
        util.removeAll(util)
        text.removeAll(text)
        choice.removeAll(choice)
        nextValue.removeAll(nextValue)




//      FULL KANAN!
//      Path 97 (kanan)
        util.add("a97_forest_path_bmw")
        util.add("a97_animal_sound")
        text.add("You choice to find some help")
        text.add("You go deep into the woods")
        text.add("Suddenly, you hear some scary sound")
        text.add("What would you do?")
        choice.add("Run  left")
        choice.add("Run right")
        nextValue.add(81)
        nextValue.add(113)
        bst.insert(97, util, text, choice,nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path DIE 81 (kiri)
        util.add("a81_tiger")
        util.add("dead")
        text.add("You died, some hungry tiger suddenly appeared before you")
        text.add("He jump straight into your body, as he seen a weak and meaty body of yours.")
        choice.add(null)
        nextValue.add(null)
        bst.insert(81, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 113 (kanan)
        util.add("a113")
        util.add("silent")
        text.add("You saw some strange symbol hinting to go right")
        text.add("It maybe a good sign, or a bad sign..")
        choice.add("Go opposite way")
        choice.add("Follow the symbol")
        nextValue.add(105)
        nextValue.add(121)
        bst.insert(113, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 105 (kiri)
        util.add("a105")
        util.add("silent")
        text.add("You ran to the opposite way from the symbol")
        text.add("You see some light from afar")
        text.add("It seems some local villagers may want to meet you..")
        choice.add("Ran away!!")
        choice.add("Meet the villagers")
        nextValue.add(101)
        nextValue.add(109)
        bst.insert(105, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 121 (kanan)
        util.add("a121")
        util.add("search")
        text.add("It seems that symbol made by the last survivor.")
        text.add("(This person) left you a flashlight and a map")
        text.add("The notes tells where to get the map and some clues to get it")
        choice.add("Follow the notes")
        choice.add("Ignore the notes")
        nextValue.add(117)
        nextValue.add(125)
        bst.insert(121, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 117 (kiri)
        util.add("a117")
        util.add("a17_foot_step")
        text.add("The notes tells you the map located in the Canibal house'")
        text.add("You are in front the door of the canibal house")
        choice.add("Kill the canibal")
        choice.add("Come inside sneakily")
        nextValue.add(115)
        nextValue.add(119)
        bst.insert(117, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 125 (kanan)
        util.add("a125")
        util.add("a17_foot_step")
        text.add("You keep walking entering the fog")
        text.add("After some time, you see some silhouete..")
        text.add("It looks like some people standing")
        choice.add("Approach them")
        choice.add("Go back")
        nextValue.add(123)
        nextValue.add(127)
        bst.insert(125, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 123 (kiri)
        util.add("a127_123")
        util.add("a123_127_zombie_eat")
        text.add("WHOA! It a DAMN.. ZOMBIE.. APOCALYPSE..")
        text.add("They surrounded you and have a banquet on you")
        text.add("Only your bones remained..")
        choice.add(null)
        nextValue.add(null)
        bst.insert(123, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 127 (kanan)
        util.add("a127_123")
        util.add("a123_127_zombie_eat")
        text.add("You tride to run")
        text.add("But a rock tripped your feet and they quickly eat every part of you")
        text.add("You Died..")
        choice.add(null)
        choice.add(null)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 115 (kiri)
        util.add("a115")
        util.add("search")
        text.add("You collected your thoughts and planned to kill the canibal!")
        text.add("The notes tells you the canibal set his own traps around his own house..")
        text.add("You make use of that and killed the canibal!")
        text.add("The only thing left is to search for the map..")
        choice.add("Search Bedroom")
        choice.add("Search the canibal corpse")
        nextValue.add(114)
        nextValue.add(116)
        bst.insert(115, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 119 (kanan)
        util.add("a119")
        util.add("runnning_2")
        text.add("After doing some long consideration, you choose to sneak inside his house..")
        text.add("But you immediately trigerred the canibal traps!")
        text.add("The canibal knows you are inside his house and chases you!")
        text.add("After running through a corridor, you see two doors")
        choice.add("Go in the kitchen")
        choice.add("Hide in the Bedroom")
        nextValue.add(118)
        nextValue.add(120)
        bst.insert(119, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 114 (kiri)
        util.add("die_screen")
        util.add("a114_shotgun")
        text.add("You tried to search the canibal bedroom.")
        text.add("Unfortunately.. while searching the map")
        text.add("Your foot slipped and triggerred his last trap..")
        text.add("Causing you to be shot by a rifle in your face..")
        text.add("You Died..")
        choice.add(null)
        nextValue.add(null)
        bst.insert(114, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 116 (kanan)
        util.add("a23")
        util.add("silent")
        text.add("You decided to search for the corpse first")
        text.add("And the map was hidden in his inner most pocket")
        text.add("You found the map and with the notes.., you managed to survive in the forest")
        text.add("You searched around the house and found a galon of gas")
        text.add("You flee from the forest in the morning")
        choice.add(null)
        nextValue.add(null)
        bst.insert(116, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 118 (kiri)
        util.add("a118")
        util.add("sad_end")
        text.add("You go in the kitchen to find a weapon")
        text.add("You found a kitchen knife")
        text.add("You used it to stab the canibal, But..")
        text.add("It turns out to be a replica knife")
        text.add("The canibal caught you..")
        text.add("You Died..")
        choice.add(null)
        nextValue.add(null)
        bst.insert(118, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 120 (kanan)
        util.add("die_screen")
        util.add("a120_explosion")
        text.add("You choose to hide inside his bedroom")
        text.add("Unfortunately, your foot steps on the wrong plank and triggered a trap")
        text.add("You Died..")
        choice.add(null)
        nextValue.add(null)
        bst.insert(120, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 101 (kiri)
        util.add("a101")
        util.add("a101_animal_trap")
        text.add("You are getting scared and decided to run away")
        text.add("But your feet get caught in an animal trap")
        text.add("The villagers think you are a wild animal and hunted you..")
        text.add("You Died..")
        choice.add(null)
        nextValue.add(null)
        bst.insert(101, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 109 (kanan)
        util.add("a109")
        util.add("a17_foot_step")
        text.add("You muster up your courage and meet the villagers")
        text.add("Gambling if they are good people or not..")
        text.add("The villagers seems nice and get you a place to stay the night.")
        text.add("But for some reason.. they seem kind of suspicious..")
        choice.add("Leave at night")
        choice.add("Stay the night")
        nextValue.add(107)
        nextValue.add(111)
        bst.insert(109, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 107 (kiri)
        util.add("a107_dikejar")
        util.add("running_2")
        text.add("The more you think about it, the more suspicious it becomes..")
        text.add("You decided to leave the village at night.")
        text.add("Before you go, you bring a rifle full of ammo hidden in the house you're at")
        text.add("It seems the villager noticed you're gone and started looking for you")
        text.add("The nice facade they put up had long gone and they showed their hostility to you..")
        choice.add("Kill them")
        choice.add("Hide in the abbandoned house")
        nextValue.add(106)
        nextValue.add(108)
        bst.insert(107, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 111 (kanan)
        util.add("a41_111_cult")
        util.add("sad_end")
        text.add("You gather your thoughts and decided that it just your negative thinking while eating a dinner they provided")
        text.add("Unknowingly to you, the villagers had made you ate a brainwashing pill in your dinner soup")
        text.add("When you wake up in the morning, you forget who you are.")
        text.add("Turns out, the villagers of that village was a believer of a heretical cult")
        text.add("And one of them, is you..")
        choice.add(null)
        nextValue.add(null)
        bst.insert(111, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 106 (kiri)
        util.add("a106_crazyman")
        util.add("sad_end")
        text.add("You started to get tired of all of this', 'You decided to go back and kill everybody")
        text.add("After you shot them al with your rifle and burned down their village, you started to regret what you're doing")
        text.add("You don't know a way out and started to lose your mind while wandering in the woods alone")
        text.add("You Died of hunger..")
        choice.add(null)
        nextValue.add(null)
        bst.insert(106, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 108 (kanan)
        util.add("a108")
        util.add("a108_man_scream")
        text.add("The villagers surrounding the house you\\'re at right now.")
        text.add("They started chanting some kind of spell and burned the house down.")
        text.add("Looks like they wanted to make you a sacrifice")
        text.add("You tried to escape but they caught you and slain you on the spot")
        text.add("You Died..")
        choice.add(null)
        nextValue.add(null)
        bst.insert(108, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      FULL KIRI!
//      Path 33 (kiri)
        util.add("a33")
        util.add("a33")
        text.add("When waiting in car, you saw a faint light from afar")
        text.add("A man came closer to you and seeing your condition, he suggest you to come with him to his house..")
        choice.add("Go with him")
        choice.add("Run away to the woods")
        nextValue.add(17)
        nextValue.add(49)
        bst.insert(33, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 17 (kiri)
        util.add("a17_stalker_bmw")
        util.add("a17_foot_step")
        text.add("His house decorated with many hunting equipment")
        text.add("He also offered you dinner and a place to stay")
        text.add("He looks like a good guy, but strangely, he sees you with a hungry eye")
        choice.add("Spend the night")
        choice.add("Leave at night")
        nextValue.add(9)
        nextValue.add(25)
        bst.insert(17, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 9 (kiri)
        util.add("a9_png")
        util.add("a9_eaten")
        text.add("You are so tired after eating full course dinner in his house")
        text.add("You are getting ready to sleep after such a long and tiring day")
        text.add("After some time, you started to feel a little pain from your hand")
        text.add("You wake up being chained to the butcher table")
        text.add("Turns out that man was a canibal and he is ready to butcher you")
        text.add("You Died..")
        choice.add(null)
        nextValue.add(null)
        bst.insert(9, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 25 (kanan)
        util.add("a25_run")
        util.add("u_never_run_2")
        text.add("Your guts tells you this man is dangerous and leave the house at night")
        text.add("And its proved to be true.. That man chased after you with a shotgun in his hand")
        choice.add("Hide in a bush")
        choice.add("Jump to the river")
        nextValue.add(21)
        nextValue.add(29)
        bst.insert(25, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 21 (kiri)
        util.add("a21_jungle_bush.jpg")
        util.add("a121_bush")
        text.add("You hide in nearby bush")
        text.add("In your panic, you see a sharp branch")
        choice.add("Attach him")
        choice.add("Stay silent")
        nextValue.add(19)
        nextValue.add(23)
        bst.insert(21, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 19 (kiri)
        util.add("a19_shotted_serial")
        util.add("a114_shotgun")
        text.add("You gamble your way out and attack him with the brach you found")
        text.add("But you missed and he managed to shot you")
        text.add("You Died..")
        choice.add(null)
        nextValue.add(null)
        bst.insert(19, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 23 (kanan)
        util.add("a23")
        util.add("a121_bush")
        text.add("You decided this was not the right time to act brave and stay hidden in the bush")
        text.add("After a long time, the Canibal finally gave up on you.. you sleep in the bush until morning and continue to search for help")
        choice.add(null)
        nextValue.add(null)
        bst.insert(23, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 29 (kanan)
        util.add("a29_sungai")
        util.add("a29_jump_to_water")
        text.add("You run away from him until you found a river")
        text.add("Cornered by the Canibal, you jumped to the river and luckily stranded by the side of a city")
        choice.add("Tell the cops")
        choice.add("Forget everything")
        nextValue.add(27)
        nextValue.add(31)
        bst.insert(29, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 27 (kiri)
        util.add("a27_wall")
        util.add("a27_scream_group")
        text.add("You search for the police and told them all that happened")
        text.add("But the police only laugh and shrugged your story.")
        text.add("You desperately told them that your story was true, but the police started to doubt your sanity")
        text.add("You're assigned to local mental hospital")
        choice.add(null)
        nextValue.add(null)
        bst.insert(27, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 31 (kanan)
        util.add("a31_traumatise")
        util.add("silent")
        text.add("After recuperating in the hospital for sometime, you are having a severe trauma about dark woods and forest")
        text.add("But you decided that life must go on and decided to forget about everything.")
        choice.add(null)
        nextValue.add(null)
        bst.insert(31, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 49 (kanan)
        util.add("a49")
        util.add("running_2")
        text.add("You are scared and run away deeper to the woods")
        text.add("Suddenly you stumbled upon a ruin.")
        choice.add("Explore")
        choice.add("Enter the ruin")
        nextValue.add(41)
        nextValue.add(57)
        bst.insert(49, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 41 (kiri)
        util.add("a41_111_cult")
        util.add("sad_end")
        text.add("While exploring the ruin, you realized that it looks more like temple than a ruin. All of a sudden, the cult followers surrounded you")
        text.add("They brought you inside the temple and brainwashed you there until you become a loyal followers just like them.")
        choice.add(null)
        nextValue.add(null)
        bst.insert(41, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 57 (kanan)
        util.add("a57")
        util.add("a57_monster_growl")
        text.add("You decide to hide in the ruins for some time")
        text.add("Unfortunately, you triggered the curse that casted on the ruins")
        text.add("The curse turns you into a monster!")
        text.add("You hear many footsteps behind you")
        text.add("Those people was the followers of a hidden cult, and this ruin is their temple.")
        choice.add("Talk to them")
        choice.add("Hide and run")
        nextValue.add(53)
        nextValue.add(61)
        bst.insert(57, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 53 (kiri)
        util.add("a53")
        util.add("a114_shotgun")
        text.add("You are hoping those people would know how to break the curse and decided to talk to them.")
        text.add("But those people get scared of you and hunted you on the spot!")
        text.add("You Died..")
        choice.add(null)
        nextValue.add(null)
        bst.insert(53, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

//      Path 61 (kanan)
        util.add("a61_big_foot")
        util.add("a61_monster_sound")
        text.add("You run away and accepted your fate as a monster")
        choice.add(null)
        nextValue.add(null)
        bst.insert(61, util, text, choice, nextValue)
        util.clear()
        text.clear()
        choice.clear()
        nextValue.clear()

        var nowNode = bst.root!!
        tv_main.setText("One day, you want to go hiking\nBut on the way, your car got stuck in deep woods\nWhat would you do?")
        btn_right.setText(nowNode!!.choice[1])
        btn_left.setText(nowNode!!.choice[0])


        println("Timer di luar :"+timer)

        btn_right.setOnClickListener {
            println(timer)

            if (timer<=0){
                val eIntent = Intent(this@GameView,MainActivity::class.java)
                eIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(eIntent)
            }
            else if(nowNode.right != null){
                nowNode = nowNode.right!!
                timer =15
            }else{
                val eIntent = Intent(this@GameView,MainActivity::class.java)
                eIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(eIntent)
            }


            var temp_text = ""

            for(textData in nowNode.text){
                temp_text += textData + "\n"
//                Timer().schedule(1000) {
                tv_main.setText(temp_text)
//                }
            }
            if(nowNode.choice.size > 1){
                btn_right.setText(nowNode!!.choice[1])
                btn_left.setText(nowNode!!.choice[0])
                var imageRes = resources.getDrawable(this.resources.getIdentifier(nowNode.utility[0], "drawable", this.packageName), null)
                gv.background = imageRes

                val uriPath = "android.resource://$packageName/raw/${nowNode.utility[1]}"
                val uri: Uri = Uri.parse(uriPath)
                var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, uri)
                try {
                    mediaPlayer?.start()
                } catch (e: Exception) {

                }
            }else{
                btn_right.setText("MAIN MENU")
                btn_left.setText("TRY AGAIN")
//                var imageRes = resources.getDrawable(this.resources.getIdentifier(nowNode.utility[0], "drawable", this.packageName), null)
//                gv.background = imageRes
//                val uriPath = "android.resource://$packageName/raw/${nowNode.utility[1]}"
//                val uri: Uri = Uri.parse(uriPath)
//                var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, uri)
//                try {
//                    mediaPlayer?.start()
//                } catch (e: Exception) {
//
//                }
            }
            timer = 15
        }

        btn_left.setOnClickListener {

            println(timer)

            if (timer<=0){
                nowNode = bst.root!!
            }else if(nowNode.left != null) {
                nowNode = nowNode.left!!

            }else{
                nowNode = bst.root!!
            }


            var temp_text = ""
            for(textData in nowNode.text){
                temp_text += textData + "\n"
//                Timer().schedule(1000) {
                tv_main.setText(temp_text)
//                }
            }

            if(nowNode.choice.size > 1){
                btn_right.setText(nowNode!!.choice[1])
                btn_left.setText(nowNode!!.choice[0])
                var imageRes = resources.getDrawable(this.resources.getIdentifier(nowNode.utility[0], "drawable", this.packageName), null)
                gv.background = imageRes
                val uriPath = "android.resource://$packageName/raw/${nowNode.utility[1]}"
                val uri: Uri = Uri.parse(uriPath)
                var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, uri)
                try {
                    mediaPlayer?.start()
                } catch (e: Exception) {

                }
            }else{
                btn_right.setText("MAIN MENU")
                btn_left.setText("TRY AGAIN")
//                var imageRes = resources.getDrawable(this.resources.getIdentifier(nowNode.utility[0], "drawable", this.packageName), null)
//                gv.background = imageRes
//                val uriPath = "android.resource://$packageName/raw/${nowNode.utility[1]}"
//                val uri: Uri = Uri.parse(uriPath)
//                var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, uri)
//                try {
//                    mediaPlayer?.start()
//                } catch (e: Exception) {
//
//                }
            }
            timer=15

        }

    }
}