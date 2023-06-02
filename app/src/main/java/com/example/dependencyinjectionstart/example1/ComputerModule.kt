package com.example.dependencyinjectionstart.example1

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {
    @Provides
    fun provideKeyboard(): Keyboard{
        return Keyboard()
    }
    @Provides
    fun provideMouse(): Mouse{
        return Mouse()
    }
    @Provides
    fun provideMonitor(): Monitor{
        return Monitor()
    }
    @Provides
    fun provideProcessor(): Processor{
        return Processor()
    }
    @Provides
    fun provideMemory(): Memory{
        return Memory()
    }
    @Provides
    fun provideStorage(): Storage{
        return Storage()
    }
    @Provides
    fun provideSystemTower(
        processor: Processor,
        memory: Memory,
        storage: Storage
    ): SystemTower {
        return SystemTower(processor, memory, storage)
    }

    @Provides
    fun provideComputer(
        systemTower: SystemTower,
        monitor: Monitor,
        keyboard: Keyboard,
        mouse: Mouse
    ): Computer {
        return Computer(systemTower, monitor, keyboard, mouse)
    }
}