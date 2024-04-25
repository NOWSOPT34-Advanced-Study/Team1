package com.simhwa.team1

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.simhwa.data.local.datastore.LocalUserDataStore
import com.simhwa.data.local.model.UserInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val dataStore: LocalUserDataStore,
) : ViewModel() {
    val userInfo = dataStore.userInfo

    fun setUserInfo(user: UserInfo) = viewModelScope.launch {
        dataStore.setUserInfo(user)
    }
}
