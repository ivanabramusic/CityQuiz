package hr.ferit.ivanabramusic.cityquiz

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction


class MainGame : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main_game, container, false)
        val score = view.findViewById<TextView>(R.id.textView47)
        view.findViewById<Button>(R.id.button).setOnClickListener()
        {
            val city = view.findViewById<TextView>(R.id.city)
            if(city.text.toString().lowercase() == "sarajevo")
            {
                if(view.findViewById<TextView>(R.id.textView7).text.toString()!="Sarajevo")
                {
                    view.findViewById<TextView>(R.id.textView7).setText("Sarajevo")
                    var oldScoreString :String = score.text.toString()
                    var oldScoreInt :Int = oldScoreString.toInt()
                    oldScoreInt+=1
                    score.text = oldScoreInt.toString()

                }
            }
            else if(city.text.toString().lowercase() == "banja luka")
            {
                if(view.findViewById<TextView>(R.id.textView28).text.toString()!="Banja Luka")
                {
                    view.findViewById<TextView>(R.id.textView28).setText("Banja Luka")
                    var oldScoreString :String = score.text.toString()
                    var oldScoreInt :Int = oldScoreString.toInt()
                    oldScoreInt+=1
                    score.text = oldScoreInt.toString()
                }
            }
            else if(city.text.toString().lowercase() == "tuzla")
            {
                if(view.findViewById<TextView>(R.id.textView29).text.toString()!="Tuzla")
                {
                    view.findViewById<TextView>(R.id.textView29).setText("Tuzla")
                    var oldScoreString :String = score.text.toString()
                    var oldScoreInt :Int = oldScoreString.toInt()
                    oldScoreInt+=1
                    score.text = oldScoreInt.toString()
                }
            }
            else if(city.text.toString().lowercase() == "zenica")
            {
                if(view.findViewById<TextView>(R.id.textView30).text.toString()!="Zenica")
                {
                    view.findViewById<TextView>(R.id.textView30).setText("Zenica")
                    var oldScoreString :String = score.text.toString()
                    var oldScoreInt :Int = oldScoreString.toInt()
                    oldScoreInt+=1
                    score.text = oldScoreInt.toString()
                }
            }
            else if(city.text.toString().lowercase() == "bijeljina")
            {
                if(view.findViewById<TextView>(R.id.textView31).text.toString()!="Bijeljina")
                {
                    view.findViewById<TextView>(R.id.textView31).setText("Bijeljina")
                    var oldScoreString :String = score.text.toString()
                    var oldScoreInt :Int = oldScoreString.toInt()
                    oldScoreInt+=1
                    score.text = oldScoreInt.toString()
                }
            }
            else if(city.text.toString().lowercase() == "mostar")
            {
                if(view.findViewById<TextView>(R.id.textView32).text.toString()!="Mostar")
                {
                    view.findViewById<TextView>(R.id.textView32).setText("Mostar")
                    var oldScoreString :String = score.text.toString()
                    var oldScoreInt :Int = oldScoreString.toInt()
                    oldScoreInt+=1
                    score.text = oldScoreInt.toString()
                }
            }
            else if(city.text.toString().lowercase() == "prijedor")
            {
                if(view.findViewById<TextView>(R.id.textView33).text.toString()!="Prijedor")
                {
                    view.findViewById<TextView>(R.id.textView33).setText("Prijedor")
                    var oldScoreString :String = score.text.toString()
                    var oldScoreInt :Int = oldScoreString.toInt()
                    oldScoreInt+=1
                    score.text = oldScoreInt.toString()
                }
            }
            else if(city.text.toString().lowercase() == "brčko")
            {
                if(view.findViewById<TextView>(R.id.textView34).text.toString()!="Brčko")
                {
                    view.findViewById<TextView>(R.id.textView34).setText("Brčko")
                    var oldScoreString :String = score.text.toString()
                    var oldScoreInt :Int = oldScoreString.toInt()
                    oldScoreInt+=1
                    score.text = oldScoreInt.toString()
                }
            }
            else if(city.text.toString().lowercase() == "doboj")
            {
                if(view.findViewById<TextView>(R.id.textView35).text.toString()!="Doboj")
                {
                    view.findViewById<TextView>(R.id.textView35).setText("Doboj")
                    var oldScoreString :String = score.text.toString()
                    var oldScoreInt :Int = oldScoreString.toInt()
                    oldScoreInt+=1
                    score.text = oldScoreInt.toString()
                }
            }
            else if(city.text.toString().lowercase() == "cazin")
            {
                if(view.findViewById<TextView>(R.id.textView36).text.toString()!="Cazin")
                {
                    view.findViewById<TextView>(R.id.textView36).setText("Cazin")
                    var oldScoreString :String = score.text.toString()
                    var oldScoreInt :Int = oldScoreString.toInt()
                    oldScoreInt+=1
                    score.text = oldScoreInt.toString()
                }
            }
            else if(city.text.toString().lowercase() == "zvornik")
            {
                if(view.findViewById<TextView>(R.id.textView37).text.toString()!="Zvornik")
                {
                    view.findViewById<TextView>(R.id.textView37).setText("Zvornik")
                    var oldScoreString :String = score.text.toString()
                    var oldScoreInt :Int = oldScoreString.toInt()
                    oldScoreInt+=1
                    score.text = oldScoreInt.toString()
                }
            }
            else if(city.text.toString().lowercase() == "živinice")
            {
                if(view.findViewById<TextView>(R.id.textView38).text.toString()!="Živinice")
                {
                    view.findViewById<TextView>(R.id.textView38).setText("Živinice")
                    var oldScoreString :String = score.text.toString()
                    var oldScoreInt :Int = oldScoreString.toInt()
                    oldScoreInt+=1
                    score.text = oldScoreInt.toString()
                }
            }
            else if(city.text.toString().lowercase() == "bihać")
            {
                if(view.findViewById<TextView>(R.id.textView39).text.toString()!="Bihać")
                {
                    view.findViewById<TextView>(R.id.textView39).setText("Bihać")
                    var oldScoreString :String = score.text.toString()
                    var oldScoreInt :Int = oldScoreString.toInt()
                    oldScoreInt+=1
                    score.text = oldScoreInt.toString()
                }
            }
            else if(city.text.toString().lowercase() == "travnik")
            {
                if(view.findViewById<TextView>(R.id.textView40).text.toString()!="Travnik")
                {
                    view.findViewById<TextView>(R.id.textView40).setText("Travnik")
                    var oldScoreString :String = score.text.toString()
                    var oldScoreInt :Int = oldScoreString.toInt()
                    oldScoreInt+=1
                    score.text = oldScoreInt.toString()
                }
            }
            else if(city.text.toString().lowercase() == "bosanska gradiška")
            {
                if(view.findViewById<TextView>(R.id.textView41).text.toString()!="Bosanska Gradiška")
                {
                    view.findViewById<TextView>(R.id.textView41).setText("Bosanska Gradiška")
                    var oldScoreString :String = score.text.toString()
                    var oldScoreInt :Int = oldScoreString.toInt()
                    oldScoreInt+=1
                    score.text = oldScoreInt.toString()
                }
            }
            else if(city.text.toString().lowercase() == "sanski most")
            {
                if(view.findViewById<TextView>(R.id.textView42).text.toString()!="Sanski Most")
                {
                    view.findViewById<TextView>(R.id.textView42).setText("Sanski Most")
                    var oldScoreString :String = score.text.toString()
                    var oldScoreInt :Int = oldScoreString.toInt()
                    oldScoreInt+=1
                    score.text = oldScoreInt.toString()
                }
            }
            else if(city.text.toString().lowercase() == "lukavac")
            {
                if(view.findViewById<TextView>(R.id.textView43).text.toString()!="Lukavac")
                {
                    view.findViewById<TextView>(R.id.textView43).setText("Lukavac")
                    var oldScoreString :String = score.text.toString()
                    var oldScoreInt :Int = oldScoreString.toInt()
                    oldScoreInt+=1
                    score.text = oldScoreInt.toString()
                }
            }
            else if(city.text.toString().lowercase() == "tešanj")
            {
                if(view.findViewById<TextView>(R.id.textView44).text.toString()!="Tešanj")
                {
                    view.findViewById<TextView>(R.id.textView44).setText("Tešanj")
                    var oldScoreString :String = score.text.toString()
                    var oldScoreInt :Int = oldScoreString.toInt()
                    oldScoreInt+=1
                    score.text = oldScoreInt.toString()
                }
            }
            else if(city.text.toString().lowercase() == "velika kladuša")
            {
                if(view.findViewById<TextView>(R.id.textView45).text.toString()!="Velika Kladuša")
                {
                    view.findViewById<TextView>(R.id.textView45).setText("Velika Kladuša")
                    var oldScoreString :String = score.text.toString()
                    var oldScoreInt :Int = oldScoreString.toInt()
                    oldScoreInt+=1
                    score.text = oldScoreInt.toString()
                }
            }
            else if(city.text.toString().lowercase() == "srebrenik")
            {
                if(view.findViewById<TextView>(R.id.textView46).text.toString()!="Srebrenik")
                {
                    view.findViewById<TextView>(R.id.textView46).setText("Srebrenik")
                    var oldScoreString :String = score.text.toString()
                    var oldScoreInt :Int = oldScoreString.toInt()
                    oldScoreInt+=1
                    score.text = oldScoreInt.toString()
                }
            }

            city.text = ""

            if(score.text.toString() == "20")
            {
                val secondFragment = GameOver()
                val bundle = Bundle()
                bundle.putString("SCORE", score.text.toString())
                secondFragment.arguments = bundle

                val fragmentTransaction: FragmentTransaction? =
                    activity?.supportFragmentManager?.beginTransaction()
                fragmentTransaction?.replace(R.id.fragmentContainerView, secondFragment)
                fragmentTransaction?.commit()

            }
        }

        view.findViewById<Button>(R.id.button2).setOnClickListener()
        {
            val secondFragment = GameOver()
            val bundle = Bundle()
            bundle.putString("SCORE", score.text.toString())
            secondFragment.arguments = bundle

            val fragmentTransaction: FragmentTransaction? =
                activity?.supportFragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.fragmentContainerView, secondFragment)
            fragmentTransaction?.commit()
        }



        return view
    }


}