package de.sixbots.mydaggerapplication

import javax.inject.Inject

class MainPresenter @Inject constructor() {
    fun isOdd(num: Int): Boolean {
        return num % 2 == 0;
    }
}