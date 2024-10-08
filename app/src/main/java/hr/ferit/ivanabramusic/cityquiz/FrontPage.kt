package hr.ferit.ivanabramusic.cityquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction


class FrontPage : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_front_page, container, false)

        view.findViewById<Button>(R.id.frontPageButtonPlay).setOnClickListener()
        {
            val secondFragment = MainGame()
            val fragmentTransaction: FragmentTransaction? =
                activity?.supportFragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.fragmentContainerView, secondFragment)
            fragmentTransaction?.commit()
        }

        view.findViewById<Button>(R.id.frontPageButtonHigh).setOnClickListener()
        {
            val secondFragment = Highscores()
            val fragmentTransaction: FragmentTransaction? = activity?.supportFragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.fragmentContainerView, secondFragment)
            fragmentTransaction?.commit()

        }

        return view
    }


}