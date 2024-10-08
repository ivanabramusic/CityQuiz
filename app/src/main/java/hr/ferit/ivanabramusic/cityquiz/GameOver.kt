package hr.ferit.ivanabramusic.cityquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction


class GameOver : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_game_over, container, false)
        val finalScore = view.findViewById<TextView>(R.id.textView2)
        finalScore.text = arguments?.getString("SCORE")

        val saveButton = view.findViewById<Button>(R.id.button3)
        saveButton.setOnClickListener() {

            val playerName = view.findViewById<EditText>(R.id.inputName)
            val secondFragment = FrontPage()

            if (playerName.text.toString() == "") {
            val toast = Toast.makeText(activity, "Enter your name!", Toast.LENGTH_SHORT)
            toast.show()
            }
            else {
                Toast.makeText(activity, "Score saved.", Toast.LENGTH_SHORT).show()


                val fragmentTransaction: FragmentTransaction? =
                    activity?.supportFragmentManager?.beginTransaction()
                fragmentTransaction?.replace(R.id.fragmentContainerView, secondFragment)
                fragmentTransaction?.commit()

    }
}
        return view
    }


}