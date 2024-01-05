package com.example.trivia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.trivia.databinding.FragmentGameLostBinding

class GameLostFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentGameLostBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_game_lost,container,false)
        binding.button3.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_gameLostFragment_to_gameFragment)
        }
        return binding.root
    }
}