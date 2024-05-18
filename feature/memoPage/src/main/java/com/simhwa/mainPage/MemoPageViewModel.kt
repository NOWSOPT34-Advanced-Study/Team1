package com.simhwa.mainPage

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.simhwa.data.mainpage.model.User
import com.simhwa.data.mainpage.repository.MainPageRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MemoPageViewModel @Inject constructor(private val repository: MainPageRepository) :
    ViewModel() {
    private var _userInfo: MutableLiveData<User> = MutableLiveData(User("", "", ""))
    val userInfo: LiveData<User> get() = _userInfo

    fun getUserInfo() {
        viewModelScope.launch {
            repository.mainPageUSer()
                .onSuccess {
                    _userInfo.value = it
                }.onFailure {

                }
        }
    }
}