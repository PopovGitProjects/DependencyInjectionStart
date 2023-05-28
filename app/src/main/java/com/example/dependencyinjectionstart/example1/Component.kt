package com.example.dependencyinjectionstart.example1

class Component {
    private fun getComponent(): Computer {
        return Computer(
            SystemTower(Processor(), Memory(), Storage()),
            Monitor(),
            Keyboard(),
            Mouse()
        )
    }
//    fun inject(activity: Activity){
////        activity.computer = getComponent()
//        activity.keyboard = Keyboard()
//    }
}