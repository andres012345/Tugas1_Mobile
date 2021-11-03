<<<<<<< HEAD
=======
/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

>>>>>>> 3e6ed54f915e61fbcbc37fd02aeece3ea90041e6
package com.example.android.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
<<<<<<< HEAD
import androidx.navigation.findNavController
=======
>>>>>>> 3e6ed54f915e61fbcbc37fd02aeece3ea90041e6
import com.example.android.navigation.databinding.FragmentGameOverBinding

class GameOverFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentGameOverBinding = DataBindingUtil.inflate(
<<<<<<< HEAD
            inflater, R.layout.fragment_game_over, container, false)

        binding.tryAgainButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_gameOverFragment_to_gameFragment)
        }
=======
                inflater, R.layout.fragment_game_over, container, false)
>>>>>>> 3e6ed54f915e61fbcbc37fd02aeece3ea90041e6
        return binding.root
    }
}
