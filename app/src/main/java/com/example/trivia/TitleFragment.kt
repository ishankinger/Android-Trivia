package com.example.trivia

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.trivia.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater, R.layout.fragment_title, container, false)

        binding.button.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_titleFragment_to_gameFragment)
        }

        setHasOptionsMenu(true)
        return binding.root
    }

    @Deprecated("Deprecated in Java")
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.overflow_menu, menu)
    }

    @Deprecated("Deprecated in Java")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(
            item,
            requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }
}



//                       *****EXPLAINED CODE*****

//package com.example.trivia
//
//import android.os.Bundle
//import android.view.*
//import androidx.fragment.app.Fragment
//import androidx.databinding.DataBindingUtil
//import androidx.navigation.Navigation
//import androidx.navigation.findNavController
//import androidx.navigation.ui.NavigationUI
//import com.example.trivia.databinding.FragmentTitleBinding
//
//class TitleFragment : Fragment() {
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // we can't use setContentView as used in main activity
//        // so we have to manually inflate our layout files as done below-
//        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater, R.layout.fragment_title, container, false)
//
//        // now in this fragment to jump to next pointing fragment we will use button with help of onClickListener
//        binding.button.setOnClickListener {
//            // navigation provides a findNavController method which takes the view and do the action work
//            Navigation.findNavController(it).navigate(R.id.action_titleFragment_to_gameFragment)
//        }
//        // other way to write clickListener using navigation
//        // The complete onClickListener with Navigation using createNavigateOnClickListener
//        // binding.playButton.setOnClickListener(
//        // Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment))
//
//        // tell android that we are going to associate our overflow menu with title fragment
//        setHasOptionsMenu(true)
//
//        // this give the layout thus important to write
//        return binding.root
//    }
//
//    // this piece of code for getting overflow menu on right corner of title fragment
//    @Deprecated("Deprecated in Java")
//    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//        super.onCreateOptionsMenu(menu, inflater)
//        inflater.inflate(R.menu.overflow_menu, menu)
//    }
//
//    @Deprecated("Deprecated in Java")
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return NavigationUI.onNavDestinationSelected(
//            item,
//            requireView().findNavController())
//                || super.onOptionsItemSelected(item)
//    }
//}


