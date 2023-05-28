package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {
//    lateinit var computer: Computer
//    @Inject
//    lateinit var keyboard: Keyboard
    val keyboard = DaggerNewComponent.create().getKeyBoard()

}